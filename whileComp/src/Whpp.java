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
        Option option_All = OptionBuilder.withArgName("all").hasArg().withDescription("").create("all");
        //if struct identation
        Option option_If = OptionBuilder.withArgName("if").hasArg().withDescription("").create("if");
        //if struct identation
        Option option_For = OptionBuilder.withArgName("for").hasArg().withDescription("").create("for");
        //if struct identation
        Option option_While = OptionBuilder.withArgName("while").hasArg().withDescription("").create("while");
        //if struct identation
        Option option_Foreach = OptionBuilder.withArgName("foreach").hasArg().withDescription("").create("foreach");
        //output file
        Option option_Out = OptionBuilder.withArgName("o").hasArg().withDescription("").create("o");
        //input file
        Option option_In = OptionBuilder.withArgName("i").hasArg().withDescription("").create("i");
        //width
        Option option_Page = OptionBuilder.withArgName("page").hasArg().withDescription("").create("page");
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

            if (commandLine.hasOption("all"))
            {
            	Integer indentAll = new Integer(commandLine.getOptionValue("all"));
            	if(indentAll < 0) indentAll = 0;
            	System.out.println("Indent All: " + indentAll);
                indentMap.put("All", indentAll);
            }

            if (commandLine.hasOption("if"))
            {
            	Integer indentIf = new Integer(commandLine.getOptionValue("if"));
                if(indentIf < 0) indentIf = 0;                
            	System.out.println("Indent If: " + indentIf);
                indentMap.put("If", indentIf);
            }

            if (commandLine.hasOption("for"))
            {
            	Integer indentFor = new Integer(commandLine.getOptionValue("for"));
            	if(indentFor < 0) indentFor = 0;
            	System.out.println("Indent For: " + indentFor);
                indentMap.put("For", indentFor);
            }

            if (commandLine.hasOption("while"))
            {
            	Integer indentWhile = new Integer(commandLine.getOptionValue("while"));
            	if(indentWhile < 0) indentWhile = 0;
            	System.out.println("Indent While: " + indentWhile);
                indentMap.put("While", indentWhile);
            }

            if (commandLine.hasOption("foreach"))
            {
            	Integer indentForeach = new Integer(commandLine.getOptionValue("foreach"));
            	if(indentForeach < 0) indentForeach = 0;
            	System.out.println("Indent Foreach: " + indentForeach);
                indentMap.put("Foreach", indentForeach);
            }
            
            if (commandLine.hasOption("o"))
            {
            	outFile = commandLine.getOptionValue("o");
            }

            if (commandLine.hasOption("i"))
            {
            	try {
            		FileReader fileReader = new FileReader(commandLine.getOptionValue("i"));

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
                    System.out.print("ERROR: THE FILE " + commandLine.getOptionValue("i") + " DOESN'T EXISTS");
            		inputProg = "";
            	}
            }
            
            if (commandLine.hasOption("page"))
            {
            	pageWidth = new Integer(commandLine.getOptionValue("page"));
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
