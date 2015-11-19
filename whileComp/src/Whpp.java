import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.codegen.ecore.Generator;
import org.xtext.example.generator.PrettyPrinterGenerator;
import org.xtext.example.generator.WhileCppGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

public class Whpp {
	
	private static PrettyPrinterGenerator generator;
	//A map which contains the defined indentation
	private static Map<String, Integer> indentMap;
	//undefined: <=0 else > 0 
	private static Integer pageWidth;
	//"":stdout else the output file
	private static String outFile;
	//input program to String
	private static String inputProg;

	public static void main(String[] parameters) {
		
		generator = new PrettyPrinterGenerator();
		indentMap = new HashMap<String, Integer>();
		pageWidth = -1;
		outFile = "";
		inputProg = "";
		
		
		CommandLine commandLine;
		//default identation
        Option option_All = OptionBuilder.withArgName(Resources.OPT_ALL).hasArg().withDescription("").create(Resources.OPT_ALL);
        //if struct identation
        Option option_If = OptionBuilder.withArgName(Resources.OPT_IF).hasArg().withDescription("").create(Resources.OPT_IF);
        //if struct identation
        Option option_For = OptionBuilder.withArgName(Resources.OPT_FOR).hasArg().withDescription("").create(Resources.OPT_FOR);
        //if struct identation
        Option option_While = OptionBuilder.withArgName(Resources.OPT_WHILE).hasArg().withDescription("").create(Resources.OPT_WHILE);
        //if struct identation
        Option option_Foreach = OptionBuilder.withArgName(Resources.OPT_FOREACH).hasArg().withDescription("").create(Resources.OPT_FOREACH);
        //output file
        Option option_Out = OptionBuilder.withArgName(Resources.OPT_OUT).hasArg().withDescription("").create(Resources.OPT_OUT);
        //input file
        Option option_In = OptionBuilder.withArgName(Resources.OPT_IN).hasArg().withDescription("").create(Resources.OPT_IN);
        //width
        Option option_Page = OptionBuilder.withArgName(Resources.OPT_PAGE).hasArg().withDescription("").create(Resources.OPT_PAGE);
        //help
        Option option_Help = OptionBuilder.withDescription("").create("help");
        
        //Add options
        Options options = new Options();
        CommandLineParser parser = new GnuParser();

        options.addOption(option_All);
        options.addOption(option_If);
        options.addOption(option_For);
        options.addOption(option_While);
        options.addOption(option_Foreach);
        options.addOption(option_Out);
        options.addOption(option_In);
        options.addOption(option_Page);
        options.addOption(option_Help);

        try
        {
        	//Parse options
            commandLine = parser.parse(options, parameters);

            if (commandLine.hasOption(Resources.OPT_ALL))
            {
            	Integer indentAll = new Integer(commandLine.getOptionValue(Resources.OPT_ALL));
            	if(indentAll < 0) indentAll = 0;
            	System.out.println("Indent All: " + indentAll);
                indentMap.put(Resources.MAP_ALL, indentAll);
            }

            if (commandLine.hasOption(Resources.OPT_IF))
            {
            	Integer indentIf = new Integer(commandLine.getOptionValue(Resources.OPT_IF));
                if(indentIf < 0) indentIf = 0;                
            	System.out.println("Indent If: " + indentIf);
                indentMap.put(Resources.MAP_IF, indentIf);
            }

            if (commandLine.hasOption(Resources.OPT_FOR))
            {
            	Integer indentFor = new Integer(commandLine.getOptionValue(Resources.OPT_FOR));
            	if(indentFor < 0) indentFor = 0;
            	System.out.println("Indent For: " + indentFor);
                indentMap.put(Resources.MAP_FOR, indentFor);
            }

            if (commandLine.hasOption(Resources.OPT_WHILE))
            {
            	Integer indentWhile = new Integer(commandLine.getOptionValue(Resources.OPT_WHILE));
            	if(indentWhile < 0) indentWhile = 0;
            	System.out.println("Indent While: " + indentWhile);
                indentMap.put(Resources.MAP_WHILE, indentWhile);
            }

            if (commandLine.hasOption(Resources.OPT_FOREACH))
            {
            	Integer indentForeach = new Integer(commandLine.getOptionValue(Resources.OPT_FOREACH));
            	if(indentForeach < 0) indentForeach = 0;
            	System.out.println("Indent Foreach: " + indentForeach);
                indentMap.put(Resources.MAP_FOREACH, indentForeach);
            }
            
            if (commandLine.hasOption(Resources.OPT_OUT))
            {
            	outFile = commandLine.getOptionValue(Resources.OPT_OUT);
            }

            if (commandLine.hasOption(Resources.OPT_IN))
            {
            	try {
            		FileReader fileReader = new FileReader(commandLine.getOptionValue(Resources.OPT_IN));

                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String content = "";
                    String line;
                    while((line = bufferedReader.readLine()) != null) {
                        content += line + "\n";
                    }
                    inputProg = content;
                    System.out.print(inputProg);
                    bufferedReader.close();
                    
            	}
            	catch (Exception e)
            	{
                    System.out.print("ERROR: THE FILE " + commandLine.getOptionValue(Resources.OPT_IN) + " DOESN'T EXISTS");
            		inputProg = "";
            	}
            }
            
            if (commandLine.hasOption(Resources.OPT_PAGE))
            {
            	pageWidth = new Integer(commandLine.getOptionValue(Resources.OPT_PAGE));
            }
            
            if (commandLine.hasOption("help"))
            {
            	try {
            		FileReader fileReader = new FileReader("../documentation/man.md");

                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String content = "";
                    String line;
                    while((line = bufferedReader.readLine()) != null) {
                        content += line + "\n";
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
        
        callPrettyPrinter();

	}
	
	private static void callPrettyPrinter()
	{		
		generator.generate(inputProg, outFile, indentMap, pageWidth);
	}

}
