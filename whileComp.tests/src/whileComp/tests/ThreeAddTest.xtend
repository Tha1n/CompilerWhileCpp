package whileComp.tests

import static org.junit.Assert.*
import org.xtext.example.generator.ThreeAddGenerator
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.xtext.example.WhileCppInjectorProvider
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.xtext.example.whileCpp.Program
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.junit.Test

@InjectWith(WhileCppInjectorProvider)
@RunWith(XtextRunner)
class ThreeAddTest {
	
	@Inject
	ParseHelper<Program> parser
	@Inject 
	ThreeAddGenerator genToTest
	
	@Test 
	def void CorrectWithLabel()
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
        val listQuad = genToTest.functions.get(0).m_quadList
        var containsEqNil = false;
        var whileContainsNop = false;
        for(var i = 0; i < listQuad.size; i += 1)
        {
        	val quad = listQuad.get(i)
        	if(quad.op.op == 2) {
        		if(quad.arg1 == "nil") containsEqNil = true;
        	}
        }

        val labels = genToTest.getLabelList
	    for(var i = 0; i < labels.size; i += 1)
        {
	     	val label = labels.get(i)
       		val quadList = label.code
       		for(var j = 0; j < quadList.size; j += 1)
       		{
       			val quadruplet = quadList.get(i)
       			if(quadruplet.op.op == 0)
       				whileContainsNop = true
       		}
       	}
        assertTrue(containsEqNil && whileContainsNop)
	}
	
	@Test 
	def void correctHdTl()
	{
		val prog = parser.parse('''function p:
read X
%
	Y:= (hd (tl X))
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
        val listQuad = genToTest.functions.get(0).m_quadList
        var containsHD = false;
        var containsTL = false;
        for(var i = 0; i < listQuad.size; i += 1)
        {
        	val quad = listQuad.get(i)
        	if(quad.op.op == 6) {
        		containsHD = true
        	}
        	else if(quad.op.op == 7) {
        		containsTL = true
        	}
        }
        assertTrue(containsHD && containsTL)
	}
	
}