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
	
	def public void generateCPP(FunDictionary funcs, HashMap<String, String> funNameTranslation, ArrayList<Label> labelList)
	{
		m_labelList = labelList
		val funcList = funcs.functions
		var cpp = '''import "BinTree.h"
		
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
				cpp = cpp + '''List<BinTree> ''' + funNameTranslation.get(funName) + '''(List<BinTree> args)
{
	//TODO 1. get read
	
	//TODO 2. compile instructions
	''' + compileInstructions(func.m_quadList) +
	'''
	
	//TODO 3. write output
}

'''
			}
		}
		
		cpp = cpp + addMain(cpp, funcs, funNameTranslation)
		print(cpp)
	}
	
	def public String addMain(String cpp, FunDictionary funcs, HashMap<String, String> funNameTranslation) {
		
		var result = cpp 
		result += '''
		
		int main() {
			//TODO get arguments
				''' + 
			funNameTranslation.get(funcs.functions.last.m_name)
			+ '''(//TODO arg);
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
					cpp +=  '''//NOP
				'''
				}
				case CodeOp.OP_WHILE : {
					cpp +=  '''while (BinTree::isTrue(''' + quadruplet.arg1 + ''')) {
	''' + compileInstructions(getLabel(quadruplet.op.optLabel1).code) +  '''
}
				'''
				}
				case CodeOp.OP_IF : {
					cpp +=  '''if (BinTree::isTrue(''' + quadruplet.arg1 + ''')) {
	''' + compileInstructions(getLabel(quadruplet.op.optLabel1).code) +  '''
} else {
	''' + compileInstructions(getLabel(quadruplet.op.optLabel2).code) +  '''
}
				'''
				}
				case CodeOp.OP_FOREACH : {
					cpp +=  '''for (auto const ''' + quadruplet.arg1 + ''': ''' + quadruplet.arg2 + ''') {
	''' + compileInstructions(getLabel(quadruplet.op.optLabel1).code) +  '''
}
				'''
				}
				case CodeOp.OP_AFF : {
					cpp +=  quadruplet.result + ''' = ''' + quadruplet.arg1 + ''';
				'''
				}
				case CodeOp.OP_CONS : {
					cpp +=  quadruplet.result + ''' = BinTree::cons(''' + 
					quadruplet.arg1 + ''', ''' + quadruplet.arg2 +''');
				'''
				}
				case CodeOp.OP_HD : {
					cpp +=  quadruplet.result + ''' = BinTree::hd(''' + 
					quadruplet.arg1 +''');
				'''
				}
				case CodeOp.OP_TL : {
					cpp +=  quadruplet.result + ''' = BinTree::tl(''' + 
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