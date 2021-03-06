package whileComp.tests

import com.google.inject.Inject
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.WhileCppInjectorProvider
import org.xtext.example.generator.PrettyPrinterGenerator
import org.xtext.example.whileCpp.Program

import static org.junit.Assert.*

@InjectWith(WhileCppInjectorProvider)
@RunWith(XtextRunner)
class SymbolTableTest  {

	@Inject
	ParseHelper<Program> parser
	@Inject 
	PrettyPrinterGenerator genToTest
	
	def String ConcatFName(String FileName, int NumFile) {
		return (FileName + NumFile.toString() + ".wh")
	}

	@Test 
	def void testIncorrect()
	{
		val prog = parser.parse('''function p:
read incorrect%
%
	Y:=nil ;
	while X do 
		nop ;
		Y := X
	od
%
write Y''')
        val fsaProg = new InMemoryFileSystemAccess()
        try
        {
	        genToTest.doGenerate(prog.eResource, fsaProg)
        }
        catch(Exception e)
        {
        }
        
        val dico = genToTest.functionsNames
        assertTrue(dico.isEmpty)
        
	}
	
	
	@Test 
	def void correct1FunSomeVar()
	{
		val prog = parser.parse('''function p:
read X
%
	Y:=nil ;
	while X do 
		nop ;
		Y := X
	od
%
write Y''')
        val fsaProg = new InMemoryFileSystemAccess()
        try
        {
	        genToTest.doGenerate(prog.eResource, fsaProg)
        }
        catch(Exception e)
        {
        }
        val dicoFun = genToTest.functionsNames
        val dicoVar = genToTest.getVariables(0)
        assertTrue(dicoFun.contains("p"))
        assertTrue(dicoVar.contains("X"))
        assertTrue(dicoVar.contains("Y"))
	}


	@Test 
	def void correct2FunSomeVar()
	{
		val prog = parser.parse('''function p:
read X
%
	Y:=nil ;
	while X do 
		nop ;
		Y := X
	od
%
write Y

function p:
read X, P
%
	Y:=nil ;
	while X do 
		nop ;
		Y := X
	od
%
write Y''')
        val fsaProg = new InMemoryFileSystemAccess()
        try
        {
	        genToTest.doGenerate(prog.eResource, fsaProg)
        }
        catch(Exception e)
        {
        }
        
        val dico = genToTest.functionsNames
        assertTrue(dico.length == 2)
	}
	
	@Test 
	def void incorrect2SameFun()
	{
		val prog = parser.parse('''function p:
read X
%
	Y:=nil ;
	while X do 
		nop ;
		Y := X
	od
%
write Y

function p:
read X
%
	Y:=nil ;
	while X do 
		nop ;
		Y := X
	od
%
write Y''')
        val fsaProg = new InMemoryFileSystemAccess()
        try
        {
	        genToTest.doGenerate(prog.eResource, fsaProg)
        }
        catch(Exception e)
        {
        }
        val dico = genToTest.functionsNames
        assertTrue(dico.isEmpty)
	}
	
	@Test 
	def void correct1FunMultipleVar()
	{
		val prog = parser.parse('''function p:
read X
%
	Y:=nil ;
	if X then
		Z:=nil ;
		if Z then
			M:=nil
		fi
	fi ;
	if X then
		Z:=nil
	fi
%
write Y

''')
        val fsaProg = new InMemoryFileSystemAccess()
        try
        {
	        genToTest.doGenerate(prog.eResource, fsaProg)
        }
        catch(Exception e)
        {
        }
        val dicoVar = genToTest.getVariables(0)
        
        assertTrue(dicoVar.contains("X"))
        assertTrue(dicoVar.contains("Y"))
        assertTrue(dicoVar.contains("Z"))
        assertTrue(dicoVar.contains("M"))
	}
}