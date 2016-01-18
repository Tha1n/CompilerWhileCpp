package org.xtext.example.generator

import SymboleTable.FunDictionary
import java.util.ArrayList
import SymboleTable.Quadruplet
import java.util.HashMap
import SymboleTable.CodeOp
import SymboleTable.Label
import SymboleTable.Logger

class CppGenerator {
	
	private var _previousFunctions = new ArrayList<String>(); 
	private var _previousVar = new ArrayList<String>();
	private ArrayList<Label> m_labelList;
	private var _cptRes = 0;
	
	def public String generateCPP(FunDictionary funcs, HashMap<String, String> funNameTranslation, ArrayList<Label> labelList, ArrayList<String> errors)
	{
		if(errors.size != 0)
		{
			for(var i = 0; i < errors.size; i += 1)
			{
				println(errors.get(i))
			}
			return ""
		}
		m_labelList = labelList
		val funcList = funcs.functions
		var cpp = '''#include "BinTree.h"
#include <iostream>
#include <vector>

		'''
		for(var i = 0; i < funcList.size; i++)
		{
			val funName = funcList.get(i).m_name
			val func = funcList.get(i)
			if(_previousFunctions.contains(funName))
			{
				cpp = '''Error:''' + funName + ''' previously declared!
				'''
			}
			else
			{
				_previousFunctions.add(funName)
				cpp = cpp + '''std::vector<BinTree> ''' + funNameTranslation.get(funName) + '''(std::vector<BinTree> args)
{
	//Read
	''' + 
	writeReadVar(func.readVarList)
	+ '''
	//Instructions
	''' + compileInstructions(func.m_quadList) +
	'''
	
	//write
	''' + writeWriteVar(func.writeVarList) + '''
}

'''
			}
		}
		
		cpp = addMain(cpp, funcs, funNameTranslation)
		Logger.PRINT(cpp)
		cpp
	}
	
	def public String writeReadVar(HashMap<String, String> readVar)
	{
		var result = ""
		var cpt = 0
		
    	var iterator = readVar.entrySet.iterator
		
		while(iterator.hasNext)
		{
			val pair = iterator.next
			_previousVar.add(pair.value)
			result = result + "BinTree " + pair.value + " = args.size() < " + cpt + "? BinTree() : args.at(" + cpt + ");\n"
			cpt += 1
		}
	
		result
	}
	
	
	def public String writeWriteVar(ArrayList<String> writeVar)
	{
		var result = '''std::vector<BinTree> retour;
		'''
		
    	var iterator = writeVar.iterator
		
		while(iterator.hasNext)
		{
			val variable = iterator.next
			if(!_previousVar.contains(variable))
			{
				_previousVar.add(variable)
				result += "BinTree " + variable + ";\n";
			}
			result += "retour.push_back(" + variable + ");\n"
		}
		
		result += "return retour;\n"
		
		result
	}
	
	def public String writeEntryArg(HashMap<String, String> readVar)
	{
		var result = '''
	std::vector<BinTree> entry;
		'''
		
		for(var i = 1; i <= readVar.size; i+=1)
		{
			result += "argc > " + i + "? entry.push_back(BinTree(argv[" + i + "])) : entry.push_back(BinTree());\n"
		}
	
		result
	}
	
	def public String addMain(String cpp, FunDictionary funcs, HashMap<String, String> funNameTranslation) {
		
		var result = cpp 
		var entryFunc = funcs.functions.last
		
		result += '''
		
		int main(int argc, char *argv[]) {
			''' + writeEntryArg(entryFunc.readVarList)
			+ '''
			
			std::vector<BinTree> result = ''' + 
			funNameTranslation.get(entryFunc.m_name)
			+ '''(entry);
	for(auto bT : result)
		std::cout << bT << std::endl;
	return 0;
}
		'''
		result
	}
	
	def String compileInstructions(ArrayList<Quadruplet> quadruplets)
	{
		var cpp = ""
		for(var i = 0; i < quadruplets.size; i+=1)
		{
			val quadruplet = quadruplets.get(i)
			switch quadruplet.op.op {
				case CodeOp.OP_NOP : {
					cpp +=  '''//<NOP, _, _, _>
				'''
				}
				case CodeOp.OP_WHILE : {
					cpp +=  '''//<WHILE ''' + quadruplet.op.optLabel1 + ''', ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
while (BinTree::isTrue(''' + quadruplet.arg1 + ''')) {
	''' + compileInstructions(getLabel(quadruplet.op.optLabel1).code) +  '''
}
				'''
				}
				case CodeOp.OP_IF : {
					cpp +=  '''//<IF ''' + quadruplet.op.optLabel1 + ''' ''' + quadruplet.op.optLabel2 + ''', ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
if (BinTree::isTrue(''' + quadruplet.arg1 + ''')) {
	''' + compileInstructions(getLabel(quadruplet.op.optLabel1).code) +  '''
} else {
	''' + compileInstructions(getLabel(quadruplet.op.optLabel2).code) +  '''
}
				'''
				}
				case CodeOp.OP_FOREACH : {
						cpp +=  '''//<FOREACH ''' + quadruplet.op.optLabel1 + ''', ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
for (auto const ''' + quadruplet.arg1 + ''': ''' + quadruplet.arg2 + ''') {
	''' + compileInstructions(getLabel(quadruplet.op.optLabel1).code) +  '''
}
				'''
				}
				case CodeOp.OP_AFF : {
					var toAff = quadruplet.result
					if(_previousVar.contains(toAff) == false)
					{
						_previousVar.add(toAff)
						toAff = "BinTree " + toAff;
					}
					var result = quadruplet.arg1
					if(result == "nil" || _previousVar.contains(result) == false)
					{
						if(result == "nil")
							result = quadruplet.result
						_previousVar.add(result)
						result = "BinTree " + result;
						cpp +=  '''//<AFF, ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + result + ''';

				'''
					}
					else
					{
						cpp +=  '''//<AFF, ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + toAff + ''' = ''' + quadruplet.arg1 + ''';

				'''
					}
				}
				case CodeOp.OP_CONS : {
					var toAff = quadruplet.result
					if(_previousVar.contains(toAff) == false)
					{
						_previousVar.add(toAff)
						toAff = "BinTree " + toAff;
					}
					cpp +=  '''//<CONS, ''' + quadruplet.result + ''', ''' +  quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + toAff + ''' = BinTree::cons(''' + 
					quadruplet.arg1 + ''', ''' + quadruplet.arg2 +''');
				'''
				}
				case CodeOp.OP_HD : {
					var toAff = quadruplet.result
					if(_previousVar.contains(toAff) == false)
					{
						_previousVar.add(toAff)
						toAff = "BinTree " + toAff;
					}
					cpp +=  '''//<HD, ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + toAff + ''' = BinTree::hd(''' + 
					quadruplet.arg1 +''');
				'''
				}
				case CodeOp.OP_TL : {
					var toAff = quadruplet.result
					if(_previousVar.contains(toAff) == false)
					{
						_previousVar.add(toAff)
						toAff = "BinTree " + toAff;
					}
					cpp +=  '''//<TL, ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + toAff + ''' = BinTree::tl(''' + 
					quadruplet.arg1 +''');
				'''
				}
				case CodeOp.OP_CALL : {
					var toAff = quadruplet.result
					var variables = toAff.split(",")
					var toGive = quadruplet.arg2.split(",")
					cpp +=  '''//<CALL, ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
std::vector<BinTree> t''' + _cptRes + ''';
'''
					for(var v = 0; v < toGive.size; v+=1)
					{
						cpp += "t" + _cptRes + ".push_back(" + toGive.get(v) + ");\n"
					}
					cpp += '''
std::vector<BinTree> r''' + _cptRes + " = " + quadruplet.arg1 + "(t" + _cptRes + ");\n"
					for(var v = 0; v < variables.size; v+=1)
					{
						val variableToWrite = variables.get(v)
						_previousVar.add(variableToWrite)
						cpp += "BinTree " + variableToWrite + " = r" + _cptRes + ".at(" + v +");\n"
					}
					_cptRes++
				}
				default: {
					
				}
			}
			
		}
	
	    cpp
	}
	
	
	def public Label getLabel(String name)
	{
		for(var i = 0; i < m_labelList.size; i += 1)
		{
			if(m_labelList.get(i).name == name)
			  return m_labelList.get(i)
			
		}
	}
	
}