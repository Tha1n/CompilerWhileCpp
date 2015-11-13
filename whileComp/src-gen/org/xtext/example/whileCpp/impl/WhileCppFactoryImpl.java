/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.whileCpp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileCppFactoryImpl extends EFactoryImpl implements WhileCppFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WhileCppFactory init()
  {
    try
    {
      WhileCppFactory theWhileCppFactory = (WhileCppFactory)EPackage.Registry.INSTANCE.getEFactory(WhileCppPackage.eNS_URI);
      if (theWhileCppFactory != null)
      {
        return theWhileCppFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WhileCppFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileCppFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WhileCppPackage.PROGRAM: return createProgram();
      case WhileCppPackage.FUNCTION: return createFunction();
      case WhileCppPackage.DEFINITION: return createDefinition();
      case WhileCppPackage.INPUT: return createInput();
      case WhileCppPackage.OUTPUT: return createOutput();
      case WhileCppPackage.VARS: return createVars();
      case WhileCppPackage.COMMANDS: return createCommands();
      case WhileCppPackage.COMMAND: return createCommand();
      case WhileCppPackage.COMMAND_WHILE: return createCommandWhile();
      case WhileCppPackage.COMMAND_IF: return createCommandIf();
      case WhileCppPackage.COMMAND_FOR_EACH: return createCommandForEach();
      case WhileCppPackage.EXPRS: return createExprs();
      case WhileCppPackage.EXPR: return createExpr();
      case WhileCppPackage.EXPR_SIMPLE: return createExprSimple();
      case WhileCppPackage.EXPR_AND: return createExprAnd();
      case WhileCppPackage.EXPR_OR: return createExprOr();
      case WhileCppPackage.EXPR_NOT: return createExprNot();
      case WhileCppPackage.EXPR_EQ: return createExprEq();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vars createVars()
  {
    VarsImpl vars = new VarsImpl();
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands createCommands()
  {
    CommandsImpl commands = new CommandsImpl();
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandWhile createCommandWhile()
  {
    CommandWhileImpl commandWhile = new CommandWhileImpl();
    return commandWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandIf createCommandIf()
  {
    CommandIfImpl commandIf = new CommandIfImpl();
    return commandIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandForEach createCommandForEach()
  {
    CommandForEachImpl commandForEach = new CommandForEachImpl();
    return commandForEach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprs createExprs()
  {
    ExprsImpl exprs = new ExprsImpl();
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple createExprSimple()
  {
    ExprSimpleImpl exprSimple = new ExprSimpleImpl();
    return exprSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd createExprAnd()
  {
    ExprAndImpl exprAnd = new ExprAndImpl();
    return exprAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr createExprOr()
  {
    ExprOrImpl exprOr = new ExprOrImpl();
    return exprOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNot createExprNot()
  {
    ExprNotImpl exprNot = new ExprNotImpl();
    return exprNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEq createExprEq()
  {
    ExprEqImpl exprEq = new ExprEqImpl();
    return exprEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileCppPackage getWhileCppPackage()
  {
    return (WhileCppPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WhileCppPackage getPackage()
  {
    return WhileCppPackage.eINSTANCE;
  }

} //WhileCppFactoryImpl
