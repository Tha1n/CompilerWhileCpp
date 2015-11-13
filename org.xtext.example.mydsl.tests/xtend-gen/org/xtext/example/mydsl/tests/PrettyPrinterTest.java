package org.xtext.example.mydsl.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Map;
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
import org.xtext.example.mydsl.MyDslInjectorProvider;
import org.xtext.example.mydsl.generator.MyDslGenerator;
import org.xtext.example.mydsl.myDsl.Function;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Program;

@InjectWith(MyDslInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class PrettyPrinterTest {
  @Inject
  private ParseHelper<Model> parser;
  
  @Inject
  private MyDslGenerator genToTest;
  
  @Test
  public void testNameOfAFunction() {
    try {
      Model prog = this.parser.parse("function p: read X % \tY:=nil ; while X do nop ; Y := X od % write Y");
      Program _programme = prog.getProgramme();
      EList<Function> _fonctions = _programme.getFonctions();
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
      final Model prog1 = this.parser.parse("function p: read X % \tY:=nil ; while X do nop ; Y := X od % write Y");
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
      final Model prog2 = this.parser.parse(_builder);
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
}
