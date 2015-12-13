package org.xtext.example.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.WhileCppStandaloneSetup;
import org.xtext.example.whileCpp.Command;
import org.xtext.example.whileCpp.CommandForEach;
import org.xtext.example.whileCpp.CommandIf;
import org.xtext.example.whileCpp.CommandWhile;
import org.xtext.example.whileCpp.Commands;
import org.xtext.example.whileCpp.Definition;
import org.xtext.example.whileCpp.Expr;
import org.xtext.example.whileCpp.ExprAnd;
import org.xtext.example.whileCpp.ExprEq;
import org.xtext.example.whileCpp.ExprNot;
import org.xtext.example.whileCpp.ExprOr;
import org.xtext.example.whileCpp.ExprSimple;
import org.xtext.example.whileCpp.Exprs;
import org.xtext.example.whileCpp.Function;
import org.xtext.example.whileCpp.Input;
import org.xtext.example.whileCpp.Output;
import org.xtext.example.whileCpp.Program;
import org.xtext.example.whileCpp.Vars;

@SuppressWarnings("all")
public class UglyPrinterGenerator implements IGenerator {
  public void generate(final String in, final String outputFile) {
    WhileCppStandaloneSetup _whileCppStandaloneSetup = new WhileCppStandaloneSetup();
    final Injector injector = _whileCppStandaloneSetup.createInjectorAndDoEMFRegistration();
    final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
    final URI uri = URI.createURI(in);
    final Resource xtextResource = resourceSet.getResource(uri, true);
    EcoreUtil.resolveAll(xtextResource);
    String out = outputFile;
    boolean _equals = out.equals("");
    if (_equals) {
      out = "sth.wh";
    }
    try {
      final FileWriter fstream = new FileWriter(out);
      final BufferedWriter buff = new BufferedWriter(fstream);
      TreeIterator<EObject> _allContents = xtextResource.getAllContents();
      Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
      Iterable<Program> _filter = Iterables.<Program>filter(_iterable, Program.class);
      for (final Program p : _filter) {
        CharSequence _compile = this.compile(p);
        String _string = _compile.toString();
        buff.write(_string);
      }
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
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Program> _filter = Iterables.<Program>filter(_iterable, Program.class);
    for (final Program p : _filter) {
      CharSequence _compile = this.compile(p);
      fsa.generateFile("UP.wh", _compile);
    }
  }
  
  public CharSequence compile(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Function> _fonctions = p.getFonctions();
      for(final Function f : _fonctions) {
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Function f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function ");
    String _nom = f.getNom();
    _builder.append(_nom, "");
    _builder.append(":");
    Definition _definition = f.getDefinition();
    CharSequence _compile = this.compile(_definition);
    _builder.append(_compile, "");
    _builder.append(" ");
    return _builder;
  }
  
  public CharSequence compile(final Definition d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("read ");
    Input _inputs = d.getInputs();
    CharSequence _compile = this.compile(_inputs);
    _builder.append(_compile, "");
    _builder.append("%");
    Commands _commandes = d.getCommandes();
    CharSequence _compile_1 = this.compile(_commandes);
    _builder.append(_compile_1, "");
    _builder.append("%write ");
    Output _outputs = d.getOutputs();
    CharSequence _compile_2 = this.compile(_outputs);
    _builder.append(_compile_2, "");
    return _builder;
  }
  
  public CharSequence compile(final Input i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<String> _varIn = i.getVarIn();
      for(final String in : _varIn) {
        _builder.append(in, "");
        {
          EList<String> _varIn_1 = i.getVarIn();
          int _indexOf = _varIn_1.indexOf(in);
          EList<String> _varIn_2 = i.getVarIn();
          int _size = _varIn_2.size();
          int _minus = (_size - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(", ");
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Commands c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Command> _commande = c.getCommande();
      for(final Command cm : _commande) {
        CharSequence _compile = this.compile(cm);
        _builder.append(_compile, "");
        {
          EList<Command> _commande_1 = c.getCommande();
          int _indexOf = _commande_1.indexOf(cm);
          EList<Command> _commande_2 = c.getCommande();
          int _size = _commande_2.size();
          int _minus = (_size - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Output o) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<String> _varOut = o.getVarOut();
      for(final String in : _varOut) {
        _builder.append(in, "");
        {
          EList<String> _varOut_1 = o.getVarOut();
          int _indexOf = _varOut_1.indexOf(in);
          EList<String> _varOut_2 = o.getVarOut();
          int _size = _varOut_2.size();
          int _minus = (_size - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(", ");
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Command c) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      String _nop = c.getNop();
      boolean _notEquals = (!Objects.equal(_nop, null));
      if (_notEquals) {
        _matched=true;
        _switchResult = "nop ;";
      }
    }
    if (!_matched) {
      CommandIf _cmdIf = c.getCmdIf();
      boolean _notEquals_1 = (!Objects.equal(_cmdIf, null));
      if (_notEquals_1) {
        _matched=true;
        CommandIf _cmdIf_1 = c.getCmdIf();
        _switchResult = this.compile(_cmdIf_1);
      }
    }
    if (!_matched) {
      CommandForEach _cmdForEach = c.getCmdForEach();
      boolean _notEquals_2 = (!Objects.equal(_cmdForEach, null));
      if (_notEquals_2) {
        _matched=true;
        CommandForEach _cmdForEach_1 = c.getCmdForEach();
        _switchResult = this.compile(_cmdForEach_1);
      }
    }
    if (!_matched) {
      boolean _and = false;
      Vars _vars = c.getVars();
      boolean _notEquals_3 = (!Objects.equal(_vars, null));
      if (!_notEquals_3) {
        _and = false;
      } else {
        Exprs _exprs = c.getExprs();
        boolean _notEquals_4 = (!Objects.equal(_exprs, null));
        _and = _notEquals_4;
      }
      if (_and) {
        _matched=true;
        Vars _vars_1 = c.getVars();
        CharSequence _compile = this.compile(_vars_1);
        String _plus = (_compile + " := ");
        Exprs _exprs_1 = c.getExprs();
        CharSequence _compile_1 = this.compile(_exprs_1);
        String _plus_1 = (_plus + _compile_1);
        _switchResult = (_plus_1 + " ;");
      }
    }
    if (!_matched) {
      CommandWhile _cmdWhile = c.getCmdWhile();
      boolean _notEquals_5 = (!Objects.equal(_cmdWhile, null));
      if (_notEquals_5) {
        _matched=true;
        CommandWhile _cmdWhile_1 = c.getCmdWhile();
        _switchResult = this.compile(_cmdWhile_1);
      }
    }
    if (!_matched) {
      Class<? extends Command> _class = c.getClass();
      _switchResult = _class.getName();
    }
    _builder.append(_switchResult, "");
    return _builder;
  }
  
  public CharSequence compile(final CommandWhile c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _w = c.getW();
      boolean _notEquals = (!Objects.equal(_w, null));
      if (_notEquals) {
        _builder.append("while ");
      } else {
        _builder.append("for ");
      }
    }
    Expr _expr = c.getExpr();
    CharSequence _compile = this.compile(_expr);
    _builder.append(_compile, "");
    _builder.append(" do ");
    Commands _cmds = c.getCmds();
    Object _compile_1 = this.compile(_cmds);
    _builder.append(_compile_1, "");
    _builder.append(" od");
    return _builder;
  }
  
  public CharSequence compile(final CommandIf c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ");
    Expr _cond = c.getCond();
    CharSequence _compile = this.compile(_cond);
    _builder.append(_compile, "");
    _builder.append(" then ");
    Commands _cmdsThen = c.getCmdsThen();
    Object _compile_1 = this.compile(_cmdsThen);
    _builder.append(_compile_1, "");
    {
      Commands _cmdsElse = c.getCmdsElse();
      boolean _notEquals = (!Objects.equal(_cmdsElse, null));
      if (_notEquals) {
        _builder.append(" else ");
        Commands _cmdsElse_1 = c.getCmdsElse();
        Object _compile_2 = this.compile(_cmdsElse_1);
        _builder.append(_compile_2, "");
      }
    }
    _builder.append(" fi");
    return _builder;
  }
  
  public CharSequence compile(final CommandForEach c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("foreach ");
    Expr _elem = c.getElem();
    CharSequence _compile = this.compile(_elem);
    _builder.append(_compile, "");
    _builder.append(" in ");
    Expr _ensemb = c.getEnsemb();
    CharSequence _compile_1 = this.compile(_ensemb);
    _builder.append(_compile_1, "");
    _builder.append(" do ");
    Commands _cmds = c.getCmds();
    Object _compile_2 = this.compile(_cmds);
    _builder.append(_compile_2, "");
    _builder.append(" od");
    return _builder;
  }
  
  public CharSequence compile(final Vars v) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<String> _varGen = v.getVarGen();
      for(final String in : _varGen) {
        _builder.append(in, "");
        {
          EList<String> _varGen_1 = v.getVarGen();
          int _indexOf = _varGen_1.indexOf(in);
          EList<String> _varGen_2 = v.getVarGen();
          int _size = _varGen_2.size();
          int _minus = (_size - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(", ");
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Exprs e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Expr> _expGen = e.getExpGen();
      for(final Expr in : _expGen) {
        CharSequence _compile = this.compile(in);
        _builder.append(_compile, "");
        {
          EList<Expr> _expGen_1 = e.getExpGen();
          int _indexOf = _expGen_1.indexOf(in);
          EList<Expr> _expGen_2 = e.getExpGen();
          int _size = _expGen_2.size();
          int _minus = (_size - 1);
          boolean _notEquals = (_indexOf != _minus);
          if (_notEquals) {
            _builder.append(", ");
          } else {
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Expr ex) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      ExprSimple _exprSimp = ex.getExprSimp();
      boolean _notEquals = (!Objects.equal(_exprSimp, null));
      if (_notEquals) {
        _matched=true;
        ExprSimple _exprSimp_1 = ex.getExprSimp();
        _switchResult = this.compile(_exprSimp_1);
      }
    }
    if (!_matched) {
      ExprAnd _exprAnd = ex.getExprAnd();
      boolean _notEquals_1 = (!Objects.equal(_exprAnd, null));
      if (_notEquals_1) {
        _matched=true;
        ExprAnd _exprAnd_1 = ex.getExprAnd();
        _switchResult = this.compile(_exprAnd_1);
      }
    }
    _builder.append(_switchResult, "");
    return _builder;
  }
  
  public CharSequence compile(final ExprSimple ex) {
    StringConcatenation _builder = new StringConcatenation();
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      String _nil = ex.getNil();
      boolean _notEquals = (!Objects.equal(_nil, null));
      if (_notEquals) {
        _matched=true;
        _switchResult = "nil";
      }
    }
    if (!_matched) {
      String _vari = ex.getVari();
      boolean _notEquals_1 = (!Objects.equal(_vari, null));
      if (_notEquals_1) {
        _matched=true;
        _switchResult = ex.getVari();
      }
    }
    if (!_matched) {
      String _symb = ex.getSymb();
      boolean _notEquals_2 = (!Objects.equal(_symb, null));
      if (_notEquals_2) {
        _matched=true;
        _switchResult = ex.getSymb();
      }
    }
    if (!_matched) {
      String _exprCons = ex.getExprCons();
      boolean _notEquals_3 = (!Objects.equal(_exprCons, null));
      if (_notEquals_3) {
        _matched=true;
        Expr _exprConsAtt1 = ex.getExprConsAtt1();
        Object _compile = this.compile(_exprConsAtt1);
        String _plus = ("(cons " + _compile);
        Expr _exprConsAtt2 = ex.getExprConsAtt2();
        Object _compile_1 = this.compile(_exprConsAtt2);
        String _plus_1 = (_plus + _compile_1);
        _switchResult = (_plus_1 + ")");
      }
    }
    if (!_matched) {
      String _exprList = ex.getExprList();
      boolean _notEquals_4 = (!Objects.equal(_exprList, null));
      if (_notEquals_4) {
        _matched=true;
        Expr _exprListAtt1 = ex.getExprListAtt1();
        Object _compile_2 = this.compile(_exprListAtt1);
        String _plus_2 = ("(list " + _compile_2);
        Expr _exprListAtt2 = ex.getExprListAtt2();
        Object _compile_3 = this.compile(_exprListAtt2);
        String _plus_3 = (_plus_2 + _compile_3);
        _switchResult = (_plus_3 + ")");
      }
    }
    if (!_matched) {
      String _exprHead = ex.getExprHead();
      boolean _notEquals_5 = (!Objects.equal(_exprHead, null));
      if (_notEquals_5) {
        _matched=true;
        Expr _exprHeadAtt = ex.getExprHeadAtt();
        Object _compile_4 = this.compile(_exprHeadAtt);
        String _plus_4 = ("(hd " + _compile_4);
        _switchResult = (_plus_4 + ")");
      }
    }
    if (!_matched) {
      String _exprTail = ex.getExprTail();
      boolean _notEquals_6 = (!Objects.equal(_exprTail, null));
      if (_notEquals_6) {
        _matched=true;
        Expr _exprTailAtt = ex.getExprTailAtt();
        Object _compile_5 = this.compile(_exprTailAtt);
        String _plus_5 = ("(tl " + _compile_5);
        _switchResult = (_plus_5 + ")");
      }
    }
    if (!_matched) {
      String _nomSymb = ex.getNomSymb();
      boolean _notEquals_7 = (!Objects.equal(_nomSymb, null));
      if (_notEquals_7) {
        _matched=true;
        String _nomSymb_1 = ex.getNomSymb();
        String _plus_6 = ("(" + _nomSymb_1);
        Expr _symbAtt = ex.getSymbAtt();
        Object _compile_6 = this.compile(_symbAtt);
        String _plus_7 = (_plus_6 + _compile_6);
        _switchResult = (_plus_7 + ")");
      }
    }
    _builder.append(_switchResult, "");
    return _builder;
  }
  
  public CharSequence compile(final ExprAnd ex) {
    StringConcatenation _builder = new StringConcatenation();
    ExprOr _exprOr = ex.getExprOr();
    CharSequence _compile = this.compile(_exprOr);
    _builder.append(_compile, "");
    {
      String _exprAnd = ex.getExprAnd();
      boolean _notEquals = (!Objects.equal(_exprAnd, null));
      if (_notEquals) {
        ExprAnd _exprAndAtt = ex.getExprAndAtt();
        Object _compile_1 = this.compile(_exprAndAtt);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExprOr ex) {
    StringConcatenation _builder = new StringConcatenation();
    ExprNot _exprNot = ex.getExprNot();
    CharSequence _compile = this.compile(_exprNot);
    _builder.append(_compile, "");
    {
      String _exprOr = ex.getExprOr();
      boolean _notEquals = (!Objects.equal(_exprOr, null));
      if (_notEquals) {
        ExprOr _exprOrAtt = ex.getExprOrAtt();
        Object _compile_1 = this.compile(_exprOrAtt);
        _builder.append(_compile_1, "");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ExprNot ex) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _not = ex.getNot();
      boolean _notEquals = (!Objects.equal(_not, null));
      if (_notEquals) {
        _builder.append("not ");
      }
    }
    ExprEq _exprEq = ex.getExprEq();
    CharSequence _compile = this.compile(_exprEq);
    _builder.append(_compile, "");
    return _builder;
  }
  
  public CharSequence compile(final ExprEq ex) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Expr _expr = ex.getExpr();
      boolean _notEquals = (!Objects.equal(_expr, null));
      if (_notEquals) {
        _builder.append("(");
        Expr _expr_1 = ex.getExpr();
        Object _compile = this.compile(_expr_1);
        _builder.append(_compile, "");
        _builder.append(")");
      } else {
        ExprSimple _exprSim1 = ex.getExprSim1();
        CharSequence _compile_1 = this.compile(_exprSim1);
        _builder.append(_compile_1, "");
        _builder.append(" =? ");
        ExprSimple _exprSim2 = ex.getExprSim2();
        CharSequence _compile_2 = this.compile(_exprSim2);
        _builder.append(_compile_2, "");
      }
    }
    return _builder;
  }
}
