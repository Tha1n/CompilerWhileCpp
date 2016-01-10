package org.xtext.example.generator

import SymboleTable.FunDictionary
import java.util.ArrayList
import SymboleTable.Quadruplet
import java.util.HashMap
import SymboleTable.CodeOp
import SymboleTable.Label

class CppGenerator {
	
	private var _previousFunctions = new ArrayList<String>(); 
	private ArrayList<Label> m_labelList;
	
	def public String generateCPP(FunDictionary funcs, HashMap<String, String> funNameTranslation, ArrayList<Label> labelList)
	{
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
				//TODO error
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
		print(cpp)
		cpp
	}
	
	def public String writeReadVar(HashMap<String, String> readVar)
	{
		var result = "BinTree "
		var cpt = 0
		
    	var iterator = readVar.entrySet.iterator
		
		while(iterator.hasNext)
		{
			val pair = iterator.next
			result = result + pair.value + " = args.at(" + cpt + ")"
			cpt += 1
			if(iterator.hasNext)
				result += ", "
			else
				result += ";\n"
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
			result += "retour.push_back(" + variable + ");\n"
		}
		
		result += "return retour;\n"
		
		result
	}
	
	def public String writeEntryArg(HashMap<String, String> readVar)
	{
		var result = '''if(argc < ''' + (readVar.size+1) + ''') {
	std::cout << "Not enough arg\n";
	return -1;
}
	std::vector<BinTree> entry;
		'''
		
		for(var i = 1; i <= readVar.size; i+=1)
		{
			result += "	entry.push_back(BinTree(argv[" + i + "]));\n"
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
					cpp +=  '''//<AFF, ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + quadruplet.result + ''' = ''' + quadruplet.arg1 + ''';
				'''
				}
				case CodeOp.OP_CONS : {
					cpp +=  '''//<AFF, ''' + quadruplet.result + ''', ''' +  quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + quadruplet.result + ''' = BinTree::cons(''' + 
					quadruplet.arg1 + ''', ''' + quadruplet.arg2 +''');
				'''
				}
				case CodeOp.OP_HD : {
					cpp +=  '''//<HD, ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + quadruplet.result + ''' = BinTree::hd(''' + 
					quadruplet.arg1 +''');
				'''
				}
				case CodeOp.OP_TL : {
					cpp +=  '''//<TL, ''' + quadruplet.result + ''', ''' + quadruplet.arg1.toString + ''',''' + quadruplet.arg2.toString + '''>
''' + quadruplet.result + ''' = BinTree::tl(''' + 
					quadruplet.arg1 +''');
				'''
				}
				default: {
					
				}
			}
			
		}
	
	    cpp
	}
	
	
	def public Label getLabel(String name)
	{
		//TODO iterator
		for(var i = 0; i < m_labelList.size; i += 1)
		{
			if(m_labelList.get(i).name == name)
			  return m_labelList.get(i)
			
		}
	}
	
}