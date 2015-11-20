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
import org.xtext.example.generator.PrettyPrinterGenerator
import org.xtext.example.generator.UglyPrinterGenerator
import java.io.FileWriter
import java.io.BufferedWriter
import java.util.HashMap
import java.io.BufferedReader
import java.io.FileReader
import java.util.regex.*

@InjectWith(WhileCppInjectorProvider)
@RunWith(XtextRunner)
class PrettyPrinterTest {

	@Inject
	ParseHelper<Program> parser
	@Inject 
	PrettyPrinterGenerator genToTest
	@Inject
	UglyPrinterGenerator genUToTest
	
	def String ConcatFName(String FileName, int NumFile) {
		return (FileName + NumFile.toString() + ".wh")
	}

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
	
	//une commande élémentaire
	@Test
	def void indentDefault()
	{
		//écriture
		var out = "test.wh"
		try{
  			val fstream = new FileWriter(out)
  			val buff = new BufferedWriter(fstream)
  			buff.write('''function p:
read X
%
	nop	;
	while X do 
		n
		op ;
		Y := X
	od;
%
write Y
''')
  			buff.close()
  		}catch (Exception e){
  			println("Can't write " + out + " - Error: " + e.getMessage())
  		}
	var map = new HashMap<String, Integer>()
	map.put("All" ,2)	
	genToTest.generate("test.wh", "out.wh", map, 0)
	
	//lecture
	val br = new BufferedReader(new FileReader("out.wh"));
	var everything = "";
try {
    val sb = new StringBuilder();
    var line = br.readLine();

    while (line != null) {
        sb.append(line);
        sb.append(System.lineSeparator());
        line = br.readLine();
    }
    everything = sb.toString();
    println(everything)
} finally {
	
    br.close();
}
	var varCount = 0
	val p = Pattern.compile("(\t)*(while)");
	val m = p.matcher(everything);
	while(m.find())
		for(var i = 0; i < m.group.length; i+=1)
			if(m.group.charAt(i) == 0x09) //Tab
			 varCount=varCount+1
			 
	assertEquals(varCount, 4)	
	}

	@Test
	def void UglPrPrettyPrint()
	{
		val inFile = "good0"
		val outPFile = "PrePr0"
		val outPBisFile = "PreBisPr0"
		val outUFile = "UglPr0"
		
		for(var i = 1; i < 5; i++){
			
		//écriture
		var map = new HashMap<String, Integer>()
		map.put("All" ,2)
		genToTest.generate(ConcatFName(inFile,i), ConcatFName(outPFile,i), map, 0)//PrettyPrint des fichiers
		
		genUToTest.generate(ConcatFName(inFile,i), ConcatFName(outUFile,i))//UglyPrint temporaire des fichiers
		genToTest.generate(ConcatFName(outUFile,i), ConcatFName(outPBisFile,i), map, 0)//PrettyPrint des Ugly
		
		//lecture
		val brP = new BufferedReader(new FileReader(ConcatFName(outPFile,i)));
		val brPBis = new BufferedReader(new FileReader(ConcatFName(outPBisFile,i)));
		try {
		    var lineP = brP.readLine();
		    var linePBis = brPBis.readLine();
		
		    while ((lineP != null) && (linePBis != null)) {
		    	
		    	assertEquals(lineP, linePBis)

			    lineP = brP.readLine();
			    linePBis = brPBis.readLine();
		    }
			} finally {
			    brP.close();
			    brPBis.close();
			}
		}
	}
	/*
	 * TODO:

	 * 
	 * 6. Identation de 2 par défaut
	 * 7. Pas d'identation devant read, write %

	 * 10. espace devant/derriere := =?
	 * 11. apres function, read, write, if, while, for, cons, hd, tl, :
	 * 12. avant les ; do, then, etc.
	 * 13. entre les parametres.
	 * 14. pas apres ( et avant )
	 */
}