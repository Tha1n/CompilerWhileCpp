package whileComp.tests

import com.google.inject.Inject
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.WhileCppInjectorProvider
import org.xtext.example.generator.WhileCppGenerator
import org.xtext.example.whileCpp.Function
import org.xtext.example.whileCpp.Program

import static org.junit.Assert.*

@InjectWith(WhileCppInjectorProvider)
@RunWith(XtextRunner)
class PrettyPrinterTest {

	@Inject
	ParseHelper<Program> parser
	@Inject 
	WhileCppGenerator genToTest

	@Test
	def void testNameOfAFunction() {
		var prog = parser.parse("function p: read X % 	Y:=nil ; while X do nop ; Y := X od % write Y")
		val function = prog.fonctions.get(0) as Function
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
	
	/*
	 * TODO:
	 * 1. Une ligne = une commande
	 * 2. Une en-tête de commande composée
	 * 3. Une fin de commande composée
	 * 4. Un %
	 * 5. Une fonction, read, write
	 * 
	 * 6. Identation de 2 par défaut
	 * 7. Pas d'identation devant read, write %
	 * 8. Identation égale pour début et fin de commande
	 * 
	 * 9. ; sur la meme ligne que la commande
	 * 
	 * 10. espace devant/derriere := =?
	 * 11. apres function, read, write, if, while, for, cons, hd, tl, :
	 * 12. avant les ; do, then, etc.
	 * 13. entre les parametres.
	 * 14. pas apres ( et avant )
	 */
}