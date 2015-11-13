/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import org.xtext.example.whileCpp.WhileCppFactory;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileCppPackageImpl extends EPackageImpl implements WhileCppPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandWhileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandIfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandForEachEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprSimpleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprNotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEqEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.whileCpp.WhileCppPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WhileCppPackageImpl()
  {
    super(eNS_URI, WhileCppFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link WhileCppPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WhileCppPackage init()
  {
    if (isInited) return (WhileCppPackage)EPackage.Registry.INSTANCE.getEPackage(WhileCppPackage.eNS_URI);

    // Obtain or create and register package
    WhileCppPackageImpl theWhileCppPackage = (WhileCppPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WhileCppPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WhileCppPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theWhileCppPackage.createPackageContents();

    // Initialize created meta-data
    theWhileCppPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWhileCppPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WhileCppPackage.eNS_URI, theWhileCppPackage);
    return theWhileCppPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Fonctions()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Nom()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Definition()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Inputs()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Commandes()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinition_Outputs()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_VarIn()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput()
  {
    return outputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_VarOut()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVars()
  {
    return varsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVars_VarGen()
  {
    return (EAttribute)varsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommands()
  {
    return commandsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommands_Commande()
  {
    return (EReference)commandsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_Nop()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Vars()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Exprs()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_CmdWhile()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_CmdIf()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_CmdForEach()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommandWhile()
  {
    return commandWhileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommandWhile_W()
  {
    return (EAttribute)commandWhileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandWhile_Expr()
  {
    return (EReference)commandWhileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandWhile_Cmds()
  {
    return (EReference)commandWhileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommandIf()
  {
    return commandIfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandIf_Cond()
  {
    return (EReference)commandIfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandIf_CmdsThen()
  {
    return (EReference)commandIfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandIf_CmdsElse()
  {
    return (EReference)commandIfEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommandForEach()
  {
    return commandForEachEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandForEach_Elem()
  {
    return (EReference)commandForEachEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandForEach_Ensemb()
  {
    return (EReference)commandForEachEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandForEach_Cmds()
  {
    return (EReference)commandForEachEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprs()
  {
    return exprsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprs_ExpGen()
  {
    return (EReference)exprsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_ExprSimp()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpr_ExprAnd()
  {
    return (EReference)exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprSimple()
  {
    return exprSimpleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprSimple_Nil()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprSimple_Vari()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprSimple_Symb()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprSimple_ExprCons()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprSimple_ExprConsAtt()
  {
    return (EReference)exprSimpleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprSimple_ExprList()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprSimple_ExprListAtt()
  {
    return (EReference)exprSimpleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprSimple_ExprHead()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprSimple_ExprHeadAtt()
  {
    return (EReference)exprSimpleEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprSimple_ExprTail()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprSimple_ExprTailAtt()
  {
    return (EReference)exprSimpleEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprSimple_NomSymb()
  {
    return (EAttribute)exprSimpleEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprSimple_SymbAtt()
  {
    return (EReference)exprSimpleEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprAnd()
  {
    return exprAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAnd_ExprOr()
  {
    return (EReference)exprAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprAnd_ExprAnd()
  {
    return (EAttribute)exprAndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprAnd_ExprAndAtt()
  {
    return (EReference)exprAndEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprOr()
  {
    return exprOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprOr_ExprNot()
  {
    return (EReference)exprOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprOr_ExprOr()
  {
    return (EAttribute)exprOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprOr_ExprOrAtt()
  {
    return (EReference)exprOrEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprNot()
  {
    return exprNotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprNot_Not()
  {
    return (EAttribute)exprNotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprNot_ExprEq()
  {
    return (EReference)exprNotEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprEq()
  {
    return exprEqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprEq_Expr()
  {
    return (EReference)exprEqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprEq_ExprSim1()
  {
    return (EReference)exprEqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprEq_ExprSim2()
  {
    return (EReference)exprEqEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileCppFactory getWhileCppFactory()
  {
    return (WhileCppFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__FONCTIONS);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NOM);
    createEReference(functionEClass, FUNCTION__DEFINITION);

    definitionEClass = createEClass(DEFINITION);
    createEReference(definitionEClass, DEFINITION__INPUTS);
    createEReference(definitionEClass, DEFINITION__COMMANDES);
    createEReference(definitionEClass, DEFINITION__OUTPUTS);

    inputEClass = createEClass(INPUT);
    createEAttribute(inputEClass, INPUT__VAR_IN);

    outputEClass = createEClass(OUTPUT);
    createEAttribute(outputEClass, OUTPUT__VAR_OUT);

    varsEClass = createEClass(VARS);
    createEAttribute(varsEClass, VARS__VAR_GEN);

    commandsEClass = createEClass(COMMANDS);
    createEReference(commandsEClass, COMMANDS__COMMANDE);

    commandEClass = createEClass(COMMAND);
    createEAttribute(commandEClass, COMMAND__NOP);
    createEReference(commandEClass, COMMAND__VARS);
    createEReference(commandEClass, COMMAND__EXPRS);
    createEReference(commandEClass, COMMAND__CMD_WHILE);
    createEReference(commandEClass, COMMAND__CMD_IF);
    createEReference(commandEClass, COMMAND__CMD_FOR_EACH);

    commandWhileEClass = createEClass(COMMAND_WHILE);
    createEAttribute(commandWhileEClass, COMMAND_WHILE__W);
    createEReference(commandWhileEClass, COMMAND_WHILE__EXPR);
    createEReference(commandWhileEClass, COMMAND_WHILE__CMDS);

    commandIfEClass = createEClass(COMMAND_IF);
    createEReference(commandIfEClass, COMMAND_IF__COND);
    createEReference(commandIfEClass, COMMAND_IF__CMDS_THEN);
    createEReference(commandIfEClass, COMMAND_IF__CMDS_ELSE);

    commandForEachEClass = createEClass(COMMAND_FOR_EACH);
    createEReference(commandForEachEClass, COMMAND_FOR_EACH__ELEM);
    createEReference(commandForEachEClass, COMMAND_FOR_EACH__ENSEMB);
    createEReference(commandForEachEClass, COMMAND_FOR_EACH__CMDS);

    exprsEClass = createEClass(EXPRS);
    createEReference(exprsEClass, EXPRS__EXP_GEN);

    exprEClass = createEClass(EXPR);
    createEReference(exprEClass, EXPR__EXPR_SIMP);
    createEReference(exprEClass, EXPR__EXPR_AND);

    exprSimpleEClass = createEClass(EXPR_SIMPLE);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__NIL);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__VARI);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__SYMB);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__EXPR_CONS);
    createEReference(exprSimpleEClass, EXPR_SIMPLE__EXPR_CONS_ATT);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__EXPR_LIST);
    createEReference(exprSimpleEClass, EXPR_SIMPLE__EXPR_LIST_ATT);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__EXPR_HEAD);
    createEReference(exprSimpleEClass, EXPR_SIMPLE__EXPR_HEAD_ATT);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__EXPR_TAIL);
    createEReference(exprSimpleEClass, EXPR_SIMPLE__EXPR_TAIL_ATT);
    createEAttribute(exprSimpleEClass, EXPR_SIMPLE__NOM_SYMB);
    createEReference(exprSimpleEClass, EXPR_SIMPLE__SYMB_ATT);

    exprAndEClass = createEClass(EXPR_AND);
    createEReference(exprAndEClass, EXPR_AND__EXPR_OR);
    createEAttribute(exprAndEClass, EXPR_AND__EXPR_AND);
    createEReference(exprAndEClass, EXPR_AND__EXPR_AND_ATT);

    exprOrEClass = createEClass(EXPR_OR);
    createEReference(exprOrEClass, EXPR_OR__EXPR_NOT);
    createEAttribute(exprOrEClass, EXPR_OR__EXPR_OR);
    createEReference(exprOrEClass, EXPR_OR__EXPR_OR_ATT);

    exprNotEClass = createEClass(EXPR_NOT);
    createEAttribute(exprNotEClass, EXPR_NOT__NOT);
    createEReference(exprNotEClass, EXPR_NOT__EXPR_EQ);

    exprEqEClass = createEClass(EXPR_EQ);
    createEReference(exprEqEClass, EXPR_EQ__EXPR);
    createEReference(exprEqEClass, EXPR_EQ__EXPR_SIM1);
    createEReference(exprEqEClass, EXPR_EQ__EXPR_SIM2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Fonctions(), this.getFunction(), null, "fonctions", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_Definition(), this.getDefinition(), null, "definition", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinition_Inputs(), this.getInput(), null, "inputs", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinition_Commandes(), this.getCommands(), null, "commandes", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinition_Outputs(), this.getOutput(), null, "outputs", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInput_VarIn(), ecorePackage.getEString(), "varIn", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutput_VarOut(), ecorePackage.getEString(), "varOut", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varsEClass, Vars.class, "Vars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVars_VarGen(), ecorePackage.getEString(), "varGen", null, 0, -1, Vars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandsEClass, Commands.class, "Commands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommands_Commande(), this.getCommand(), null, "commande", null, 0, -1, Commands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommand_Nop(), ecorePackage.getEString(), "nop", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Vars(), this.getVars(), null, "vars", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Exprs(), this.getExprs(), null, "exprs", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_CmdWhile(), this.getCommandWhile(), null, "cmdWhile", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_CmdIf(), this.getCommandIf(), null, "cmdIf", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_CmdForEach(), this.getCommandForEach(), null, "cmdForEach", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandWhileEClass, CommandWhile.class, "CommandWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommandWhile_W(), ecorePackage.getEString(), "w", null, 0, 1, CommandWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommandWhile_Expr(), this.getExpr(), null, "expr", null, 0, 1, CommandWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommandWhile_Cmds(), this.getCommands(), null, "cmds", null, 0, 1, CommandWhile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandIfEClass, CommandIf.class, "CommandIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommandIf_Cond(), this.getExpr(), null, "cond", null, 0, 1, CommandIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommandIf_CmdsThen(), this.getCommands(), null, "cmdsThen", null, 0, 1, CommandIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommandIf_CmdsElse(), this.getCommands(), null, "cmdsElse", null, 0, 1, CommandIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandForEachEClass, CommandForEach.class, "CommandForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommandForEach_Elem(), this.getExpr(), null, "elem", null, 0, 1, CommandForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommandForEach_Ensemb(), this.getExpr(), null, "ensemb", null, 0, 1, CommandForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommandForEach_Cmds(), this.getCommands(), null, "cmds", null, 0, 1, CommandForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprsEClass, Exprs.class, "Exprs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprs_ExpGen(), this.getExpr(), null, "expGen", null, 0, -1, Exprs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpr_ExprSimp(), this.getExprSimple(), null, "exprSimp", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpr_ExprAnd(), this.getExprAnd(), null, "exprAnd", null, 0, 1, Expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprSimpleEClass, ExprSimple.class, "ExprSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprSimple_Nil(), ecorePackage.getEString(), "nil", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprSimple_Vari(), ecorePackage.getEString(), "vari", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprSimple_Symb(), ecorePackage.getEString(), "symb", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprSimple_ExprCons(), ecorePackage.getEString(), "exprCons", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprSimple_ExprConsAtt(), this.getExpr(), null, "exprConsAtt", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprSimple_ExprList(), ecorePackage.getEString(), "exprList", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprSimple_ExprListAtt(), this.getExpr(), null, "exprListAtt", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprSimple_ExprHead(), ecorePackage.getEString(), "exprHead", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprSimple_ExprHeadAtt(), this.getExpr(), null, "exprHeadAtt", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprSimple_ExprTail(), ecorePackage.getEString(), "exprTail", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprSimple_ExprTailAtt(), this.getExpr(), null, "exprTailAtt", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprSimple_NomSymb(), ecorePackage.getEString(), "nomSymb", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprSimple_SymbAtt(), this.getExpr(), null, "symbAtt", null, 0, 1, ExprSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprAndEClass, ExprAnd.class, "ExprAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprAnd_ExprOr(), this.getExprOr(), null, "exprOr", null, 0, 1, ExprAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprAnd_ExprAnd(), ecorePackage.getEString(), "exprAnd", null, 0, 1, ExprAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprAnd_ExprAndAtt(), this.getExprAnd(), null, "exprAndAtt", null, 0, 1, ExprAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprOrEClass, ExprOr.class, "ExprOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprOr_ExprNot(), this.getExprNot(), null, "exprNot", null, 0, 1, ExprOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprOr_ExprOr(), ecorePackage.getEString(), "exprOr", null, 0, 1, ExprOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprOr_ExprOrAtt(), this.getExprOr(), null, "exprOrAtt", null, 0, 1, ExprOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprNotEClass, ExprNot.class, "ExprNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprNot_Not(), ecorePackage.getEString(), "not", null, 0, 1, ExprNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprNot_ExprEq(), this.getExprEq(), null, "exprEq", null, 0, 1, ExprNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEqEClass, ExprEq.class, "ExprEq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprEq_Expr(), this.getExpr(), null, "expr", null, 0, 1, ExprEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprEq_ExprSim1(), this.getExprSimple(), null, "exprSim1", null, 0, 1, ExprEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprEq_ExprSim2(), this.getExprSimple(), null, "exprSim2", null, 0, 1, ExprEq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WhileCppPackageImpl
