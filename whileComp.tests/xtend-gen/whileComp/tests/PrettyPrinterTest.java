package whileComp.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.WhileCppInjectorProvider;
import org.xtext.example.generator.PrettyPrinterGenerator;
import org.xtext.example.generator.UglyPrinterGenerator;
import org.xtext.example.whileCpp.Function;
import org.xtext.example.whileCpp.Program;

@InjectWith(WhileCppInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class PrettyPrinterTest {
  @Inject
  private ParseHelper<Program> parser;
  
  @Inject
  private PrettyPrinterGenerator genToTest;
  
  @Inject
  private UglyPrinterGenerator genUToTest;
  
  public String ConcatFName(final String FileName, final int NumFile) {
    String _string = Integer.valueOf(NumFile).toString();
    String _plus = (FileName + _string);
    return (_plus + ".wh");
  }
  
  @Test
  public void testNameOfAFunction() {
    try {
      Program prog = this.parser.parse("function p: read X % \tY:=nil ; while X do nop ; Y := X od % write Y");
      EList<Function> _fonctions = prog.getFonctions();
      Function _get = _fonctions.get(0);
      final Function function = ((Function) _get);
      String _nom = function.getNom();
      boolean _equals = Objects.equal(_nom, "p");
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyDslGen() {
    try {
      final Program prog1 = this.parser.parse("function p: read X % \tY:=nil ; while X do nop ; Y := X od % write Y");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("function p:");
      _builder.newLine();
      _builder.append("read X");
      _builder.newLine();
      _builder.append("%");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Y:=nil ;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("while X do ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("nop ;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Y := X");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("od");
      _builder.newLine();
      _builder.append("%");
      _builder.newLine();
      _builder.append("write Y");
      final Program prog2 = this.parser.parse(_builder);
      final InMemoryFileSystemAccess fsaProg1 = new InMemoryFileSystemAccess();
      final InMemoryFileSystemAccess fsaProg2 = new InMemoryFileSystemAccess();
      Resource _eResource = prog1.eResource();
      this.genToTest.doGenerate(_eResource, fsaProg1);
      Resource _eResource_1 = prog2.eResource();
      this.genToTest.doGenerate(_eResource_1, fsaProg2);
      Map<String, Object> _allFiles = fsaProg1.getAllFiles();
      Object _get = _allFiles.get("DEFAULT_OUTPUTPP.wh");
      String _string = _get.toString();
      InputOutput.<String>println(_string);
      Map<String, Object> _allFiles_1 = fsaProg1.getAllFiles();
      Object _get_1 = _allFiles_1.get("DEFAULT_OUTPUTPP.wh");
      String _string_1 = _get_1.toString();
      Map<String, Object> _allFiles_2 = fsaProg2.getAllFiles();
      Object _get_2 = _allFiles_2.get("DEFAULT_OUTPUTPP.wh");
      String _string_2 = _get_2.toString();
      boolean _equals = Objects.equal(_string_1, _string_2);
      Assert.assertTrue(_equals);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void indentDefault() {
    try {
      String out = "test.wh";
      try {
        final FileWriter fstream = new FileWriter(out);
        final BufferedWriter buff = new BufferedWriter(fstream);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("function p:");
        _builder.newLine();
        _builder.append("read X");
        _builder.newLine();
        _builder.append("%");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("nop\t;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("while X do ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("n");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("op ;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("Y := X");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("od;");
        _builder.newLine();
        _builder.append("%");
        _builder.newLine();
        _builder.append("write Y");
        _builder.newLine();
        buff.write(_builder.toString());
        buff.close();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          String _message = e.getMessage();
          String _plus = ((("Can\'t write " + out) + " - Error: ") + _message);
          InputOutput.<String>println(_plus);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      map.put("All", Integer.valueOf(2));
      this.genToTest.generate("test.wh", "out.wh", map, Integer.valueOf(0));
      FileReader _fileReader = new FileReader("out.wh");
      final BufferedReader br = new BufferedReader(_fileReader);
      String everything = "";
      try {
        final StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while ((!Objects.equal(line, null))) {
          {
            sb.append(line);
            String _lineSeparator = System.lineSeparator();
            sb.append(_lineSeparator);
            String _readLine = br.readLine();
            line = _readLine;
          }
        }
        String _string = sb.toString();
        everything = _string;
        InputOutput.<String>println(everything);
      } finally {
        br.close();
      }
      int varCount = 0;
      final Pattern p = Pattern.compile("(\t)*(while)");
      final Matcher m = p.matcher(everything);
      while (m.find()) {
        {
          int i = 0;
          String _group = m.group();
          int _length = _group.length();
          boolean _lessThan = (i < _length);
          boolean _while = _lessThan;
          while (_while) {
            String _group_1 = m.group();
            char _charAt = _group_1.charAt(i);
            boolean _equals = (_charAt == 0x09);
            if (_equals) {
              varCount = (varCount + 1);
            }
            int _i = i;
            i = (_i + 1);
            String _group_2 = m.group();
            int _length_1 = _group_2.length();
            boolean _lessThan_1 = (i < _length_1);
            _while = _lessThan_1;
          }
        }
      }
      Assert.assertEquals(varCount, 4);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWhppCarre() {
    try {
      String out = "out.wh";
      try {
        final FileWriter fstream = new FileWriter(out);
        final BufferedWriter buff = new BufferedWriter(fstream);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("function p:");
        _builder.newLine();
        _builder.append("read X");
        _builder.newLine();
        _builder.append("%");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("nop\t;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("while X do ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("n");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("op ;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("Y := X");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("od;");
        _builder.newLine();
        _builder.append("%");
        _builder.newLine();
        _builder.append("write Y");
        _builder.newLine();
        buff.write(_builder.toString());
        buff.close();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          String _message = e.getMessage();
          String _plus = ((("Can\'t write " + out) + " - Error: ") + _message);
          InputOutput.<String>println(_plus);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      map.put("All", Integer.valueOf(2));
      this.genToTest.generate("test.wh", "out.wh", map, Integer.valueOf(0));
      this.genToTest.generate("out.wh", "out2.wh", map, Integer.valueOf(0));
      FileReader _fileReader = new FileReader("out.wh");
      final BufferedReader br = new BufferedReader(_fileReader);
      String everything = "";
      try {
        final StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while ((!Objects.equal(line, null))) {
          {
            sb.append(line);
            String _lineSeparator = System.lineSeparator();
            sb.append(_lineSeparator);
            String _readLine = br.readLine();
            line = _readLine;
          }
        }
        String _string = sb.toString();
        everything = _string;
        InputOutput.<String>println(everything);
      } finally {
        br.close();
      }
      FileReader _fileReader_1 = new FileReader("out2.wh");
      final BufferedReader br2 = new BufferedReader(_fileReader_1);
      String everything2 = "";
      try {
        final StringBuilder sb2 = new StringBuilder();
        String line2 = br2.readLine();
        while ((!Objects.equal(line2, null))) {
          {
            sb2.append(line2);
            String _lineSeparator = System.lineSeparator();
            sb2.append(_lineSeparator);
            String _readLine = br2.readLine();
            line2 = _readLine;
          }
        }
        String _string_1 = sb2.toString();
        everything2 = _string_1;
      } finally {
        br2.close();
      }
      Assert.assertEquals(everything, everything2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void UglPrPrettyPrint() {
    try {
      final String inFile = "good0";
      final String outPFile = "PrePr0";
      final String outPBisFile = "PreBisPr0";
      final String outUFile = "UglPr0";
      for (int i = 1; (i < 5); i++) {
        {
          HashMap<String, Integer> map = new HashMap<String, Integer>();
          map.put("All", Integer.valueOf(2));
          String _ConcatFName = this.ConcatFName(inFile, i);
          String _ConcatFName_1 = this.ConcatFName(outPFile, i);
          this.genToTest.generate(_ConcatFName, _ConcatFName_1, map, Integer.valueOf(0));
          String _ConcatFName_2 = this.ConcatFName(inFile, i);
          String _ConcatFName_3 = this.ConcatFName(outUFile, i);
          this.genUToTest.generate(_ConcatFName_2, _ConcatFName_3);
          String _ConcatFName_4 = this.ConcatFName(outUFile, i);
          String _ConcatFName_5 = this.ConcatFName(outPBisFile, i);
          this.genToTest.generate(_ConcatFName_4, _ConcatFName_5, map, Integer.valueOf(0));
          String _ConcatFName_6 = this.ConcatFName(outPFile, i);
          FileReader _fileReader = new FileReader(_ConcatFName_6);
          final BufferedReader brP = new BufferedReader(_fileReader);
          String _ConcatFName_7 = this.ConcatFName(outPBisFile, i);
          FileReader _fileReader_1 = new FileReader(_ConcatFName_7);
          final BufferedReader brPBis = new BufferedReader(_fileReader_1);
          try {
            String lineP = brP.readLine();
            String linePBis = brPBis.readLine();
            while (((!Objects.equal(lineP, null)) && (!Objects.equal(linePBis, null)))) {
              {
                Assert.assertEquals(lineP, linePBis);
                String _readLine = brP.readLine();
                lineP = _readLine;
                String _readLine_1 = brPBis.readLine();
                linePBis = _readLine_1;
              }
            }
          } finally {
            brP.close();
            brPBis.close();
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
