import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.xtext.example.generator.CppGenerator;
import org.xtext.example.generator.ThreeAddGenerator;

import SymboleTable.FunDictionary;

public class Whc {

	//Table des codes 3A
	private static FunDictionary tab3A;
	//Generator While -> 3 Adresses
	private static ThreeAddGenerator gen3A;
	//Generator 3A -> C++
	private static CppGenerator genCpp;
	//"":stdout else the output file
	private static String outFile;
	//input program to String
	private static String inputFile;

	public static void main(String[] parameters) {

		outFile = "";
		inputFile = "";
		gen3A = new ThreeAddGenerator();
		genCpp = new CppGenerator();

		CommandLine commandLine;
		//output file
		Option option_Out =
				OptionBuilder.withArgName(Resources.OPT_OUT).hasArg().withDescription("").create(Resources.OPT_OUT);
		
		//help
		Option option_Help =
				OptionBuilder.withArgName(Resources.OPT_HELP).create(Resources.OPT_HELP);

		//Add options
		Options options = new Options();
		CommandLineParser parser = new GnuParser();

		options.addOption(option_Out);
		options.addOption(option_Help);

		try
		{
			//Parse options
			commandLine = parser.parse(options, parameters);

			//Fichier d'aide demandé
			if (commandLine.hasOption("help")) {
				try {
					FileReader fileReader = new FileReader("../documentation/manwhc.md");

					BufferedReader bufferedReader = new BufferedReader(fileReader);
					String line;
					while((line = bufferedReader.readLine()) != null) {
						System.out.println(line);
					}
					bufferedReader.close();

				}
				catch (Exception e)
				{
					System.out.println("Go to the documentation folder to see the documentation");
				}
			}
			else {
				//Nom du fichier de sortie
				if (commandLine.hasOption(Resources.OPT_OUT)) {
					outFile = commandLine.getOptionValue(Resources.OPT_OUT);
				}

				//Nom du fichier en entrée
				//Si un nom de fichier est présent (sinon inputProg = "" et ça ne compilera au final pas)
				if (commandLine.getArgs().length > 0)
					inputFile = commandLine.getArgs()[0];
			}
		}
		catch (ParseException exception)
		{
			System.out.print("Parse error: ");
			System.out.println(exception.getMessage());
		}

		callCppCompiler();
	}

	private static void callCppCompiler() {
		File whf = new File(inputFile);
		
		if(inputFile != null && !inputFile.isEmpty() && whf.exists()) {
			//Génération du code 3A
			gen3A.generate(inputFile, tab3A);
			
			//Génération du code CPP à partir du code 3A
			genCpp.generateCPP(gen3A.dico(), gen3A.funNameTranslation(), gen3A.labelList());
			
			//Compilation du code CPP
			//TODO Compilation du code CPP
		}
	}
}