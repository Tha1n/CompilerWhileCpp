import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

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
import SymboleTable.Quadruplet;

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
	private static String inputProg;

	public static void main(String[] parameters) {

		System.out.println("Main");
		outFile = "";
		inputProg = "";

		CommandLine commandLine;
		//output file
		Option option_Out = OptionBuilder.withArgName(Resources.OPT_OUT).hasArg().withDescription("").create(Resources.OPT_OUT);
		//input file
		Option option_In = OptionBuilder.withDescription("").create(Resources.OPT_IN);
		//help
		Option option_Help = OptionBuilder.withArgName(Resources.OPT_HELP).create(Resources.OPT_HELP);

		//Add options
		Options options = new Options();
		CommandLineParser parser = new GnuParser();

		options.addOption(option_Out);
		options.addOption(option_In);
		options.addOption(option_Help);

		try
		{
			//Parse options
			commandLine = parser.parse(options, parameters);

			if (commandLine.hasOption(Resources.OPT_OUT))
			{
				outFile = commandLine.getOptionValue(Resources.OPT_OUT);
			}

			if (commandLine.hasOption(Resources.OPT_IN))
			{
				inputProg = commandLine.getOptionValue(Resources.OPT_IN);
			}

			if (commandLine.hasOption("help"))
			{
				try {
					FileReader fileReader = new FileReader("../documentation/WHILETOCPP.md");

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
		}
		catch (ParseException exception)
		{
			System.out.print("Parse error: ");
			System.out.println(exception.getMessage());
		}

		callCppCompiler();
	}

	private static void callCppCompiler() {
		if(inputProg != null && !inputProg.isEmpty())
		    gen3A.generate(inputProg, tab3A);
	}

}
