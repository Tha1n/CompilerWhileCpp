import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.codegen.ecore.Generator;
import org.xtext.example.generator.WhileCppGenerator;

public class Whpp {
	
	private static WhileCppGenerator generator;

	public static void main(String[] parameters) {
		
		generator = new WhileCppGenerator();
		
		
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

        try
        {
        	//Parse options
            commandLine = parser.parse(options, parameters);

            if (commandLine.hasOption("all"))
            {
                System.out.print("Option All is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("all"));
            }

            if (commandLine.hasOption("if"))
            {
                System.out.print("Option If is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("if"));
            }

            if (commandLine.hasOption("for"))
            {
                System.out.print("Option For is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("for"));
            }

            if (commandLine.hasOption("while"))
            {
                System.out.print("Option While is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("while"));
            }

            if (commandLine.hasOption("foreach"))
            {
                System.out.print("Option Foreach is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("foreach"));
            }
            
            if (commandLine.hasOption("o"))
            {
                System.out.print("Option Out is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("o"));
            }

            if (commandLine.hasOption("i"))
            {
                System.out.print("Option In is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("i"));
            }
            
            if (commandLine.hasOption("page"))
            {
                System.out.print("Option Page is present.  The value is: ");
                System.out.println(commandLine.getOptionValue("page"));
            }
        }
        catch (ParseException exception)
        {
            System.out.print("Parse error: ");
            System.out.println(exception.getMessage());
        }

	}

}
