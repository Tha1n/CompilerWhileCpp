package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.mydsl.MyDslInjectorProvider
import org.xtext.example.mydsl.generator.MyDslGenerator
import org.xtext.example.mydsl.myDsl.Function
import org.xtext.example.mydsl.myDsl.Model

import static org.junit.Assert.*

@InjectWith(MyDslInjectorProvider)
@RunWith(XtextRunner)
class PrettyPrinterTest {

	@Inject
	ParseHelper<Model> parser
	@Inject 
	MyDslGenerator genToTest

	@Test
	def void testNameOfAFunction() {
		var prog = parser.parse("function p: read X % 	Y:=nil ; while X do nop ; Y := X od % write Y")
		val function = prog.programme.fonctions.get(0) as Function
		assertTrue(function.nom == "p")
	}
	
	@Test 
	def void testMyDslGen()
	{
		val prog1 = parser.parse("function p: read X % 	Y:=nil ; while X do nop ; Y := X od % write Y")
		val prog2 = parser.parse('''function p:
read X
%
	Y:=nil ;
	while X do 
		nop ;
		Y := X
	od
%
write Y''')
        val fsaProg1 = new InMemoryFileSystemAccess()
        val fsaProg2 = new InMemoryFileSystemAccess()
        genToTest.doGenerate(prog1.eResource, fsaProg1)
        genToTest.doGenerate(prog2.eResource, fsaProg2)
        println(fsaProg1.allFiles.get("DEFAULT_OUTPUTPP.wh").toString)
        assertTrue(fsaProg1.allFiles.get("DEFAULT_OUTPUTPP.wh").toString == fsaProg2.allFiles.get("DEFAULT_OUTPUTPP.wh").toString)
        
	}
}