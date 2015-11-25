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
import java.time.LocalDateTime
import java.time.Period
import java.text.SimpleDateFormat
import java.util.Date

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
		val prog1 = parser.parse("function t: read X % 	Y:=nil ; while X do nop ; Y := X ; od % write Y")
		val prog2 = parser.parse('''function t:
read X
%
 Y := nil ;
 while X do
  nop ;
  Y := X ;
 od
%
write Y''')
        val fsaProg1 = new InMemoryFileSystemAccess()
        val fsaProg2 = new InMemoryFileSystemAccess()
        genToTest.doGenerate(prog1.eResource, fsaProg1)
        genToTest.doGenerate(prog2.eResource, fsaProg2)
        println(fsaProg1.allFiles.get("DEFAULT_OUTPUTPP.wh").toString)
        println(fsaProg2.allFiles.get("DEFAULT_OUTPUTPP.wh").toString)
        assertTrue(fsaProg1.allFiles.get("DEFAULT_OUTPUTPP.wh").toString == fsaProg2.allFiles.get("DEFAULT_OUTPUTPP.wh").toString)
        
	}
	
	
	@Test
	def void testWhppCarre() {
		var out = "out.wh"
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
	genToTest.generate("out.wh", "out2.wh", map, 0)
	
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

	val br2 = new BufferedReader(new FileReader("out2.wh"));
	var everything2 = "";
try {
    val sb2 = new StringBuilder();
    var line2 = br2.readLine();

    while (line2 != null) {
        sb2.append(line2);
        sb2.append(System.lineSeparator());
        line2 = br2.readLine();
    }
    everything2 = sb2.toString();
} finally {
	
    br2.close();
}
	assertEquals(everything, everything2)
}

	/**
	 * Fonction de test: whpp-1(f) = whpp-1(whpp(f))
	 */
	@Test
	def void PretPrUglyPrint()
	{
		val inFile = "good0"
		val outPFile = "PrePr0"
		val outUFile = "UglPr0"
		val outUBisFile = "UglBisPr0"
		
		for(var i = 1; i < 5; i++){
			
		//écriture
		var map = new HashMap<String, Integer>()
		map.put("All" ,2)
		genUToTest.generate(ConcatFName(inFile,i), ConcatFName(outUFile,i))//UglyPrint des fichiers whpp-1(f)
		
		genToTest.generate(ConcatFName(inFile,i), ConcatFName(outPFile,i), map, 0)//PrettyPrint temporaire des fichiers whpp(f)
		genUToTest.generate(ConcatFName(outPFile,i), ConcatFName(outUBisFile,i))//UglyPrint des pretty whpp-1(whpp(f))
		
		//lecture
		val brU = new BufferedReader(new FileReader(ConcatFName(outUFile,i)));
		val brUBis = new BufferedReader(new FileReader(ConcatFName(outUBisFile,i)));
		try {
		    var lineU = brU.readLine();
		    var lineUBis = brUBis.readLine();
		
		    while ((lineU != null) && (lineUBis != null)) {
		    	
		    	assertEquals(lineU, lineUBis)

			    lineU = brU.readLine();
			    lineUBis = brUBis.readLine();
		    }
			} finally {
			    brU.close();
			    brUBis.close();
			}
		}
	}

	/**
	 * Fonction de test: whpp(f) = whpp(whpp-1(f))
	 */
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
	
	
	@Test
	def void testL1() {
		for(var i = 0; i < 10; i=i+1)
		{
		var out = "out.wh"
		try{
  			val fstream = new FileWriter(out)
  			val buff = new BufferedWriter(fstream)
  			for(var j = 0; j < i+1; j+=1) {
buff.write('''function p:
read X
%
	nop	;
	while X do 
		n
		op ;
		Y := X ; 
	od;
%
write Y

''')

}
  			buff.close()
  		}catch (Exception e){
  			println("Can't write " + out + " - Error: " + e.getMessage())
  		}
	var map = new HashMap<String, Integer>()
	map.put("All" ,2)
	
	val lStartTime = new Date().getTime();
	genToTest.generate("test.wh", "out.wh", map, 0)
	val lEndTime = new Date().getTime();
	val difference = lEndTime - lStartTime;
	println("L" + i + " : " + difference)
	}
	}
	
	
	//une commande élémentaire
	@Test
	def void incorrectWh()
	{
		//écriture
		var out = "test.wh"
		try{
  			val fstream = new FileWriter(out)
  			val buff = new BufferedWriter(fstream)
  			buff.write('''function Pm:
read x
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
} finally {
	
    br.close();
}
	assertEquals(everything, "");
	}
	

}