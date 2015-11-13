/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.whileCpp.WhileCppFactory
 * @model kind="package"
 * @generated
 */
public interface WhileCppPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "whileCpp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/WhileCpp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "whileCpp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WhileCppPackage eINSTANCE = org.xtext.example.whileCpp.impl.WhileCppPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.ProgramImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Fonctions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__FONCTIONS = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.FunctionImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 1;

  /**
   * The feature id for the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NOM = 0;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.DefinitionImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__INPUTS = 0;

  /**
   * The feature id for the '<em><b>Commandes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__COMMANDES = 1;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__OUTPUTS = 2;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.InputImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getInput()
   * @generated
   */
  int INPUT = 3;

  /**
   * The feature id for the '<em><b>Var In</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__VAR_IN = 0;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.OutputImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 4;

  /**
   * The feature id for the '<em><b>Var Out</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__VAR_OUT = 0;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.VarsImpl <em>Vars</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.VarsImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getVars()
   * @generated
   */
  int VARS = 5;

  /**
   * The feature id for the '<em><b>Var Gen</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS__VAR_GEN = 0;

  /**
   * The number of structural features of the '<em>Vars</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.CommandsImpl <em>Commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.CommandsImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommands()
   * @generated
   */
  int COMMANDS = 6;

  /**
   * The feature id for the '<em><b>Commande</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__COMMANDE = 0;

  /**
   * The number of structural features of the '<em>Commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.CommandImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 7;

  /**
   * The feature id for the '<em><b>Nop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NOP = 0;

  /**
   * The feature id for the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__VARS = 1;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__EXPRS = 2;

  /**
   * The feature id for the '<em><b>Cmd While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__CMD_WHILE = 3;

  /**
   * The feature id for the '<em><b>Cmd If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__CMD_IF = 4;

  /**
   * The feature id for the '<em><b>Cmd For Each</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__CMD_FOR_EACH = 5;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.CommandWhileImpl <em>Command While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.CommandWhileImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommandWhile()
   * @generated
   */
  int COMMAND_WHILE = 8;

  /**
   * The feature id for the '<em><b>W</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_WHILE__W = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_WHILE__EXPR = 1;

  /**
   * The feature id for the '<em><b>Cmds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_WHILE__CMDS = 2;

  /**
   * The number of structural features of the '<em>Command While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_WHILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.CommandIfImpl <em>Command If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.CommandIfImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommandIf()
   * @generated
   */
  int COMMAND_IF = 9;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_IF__COND = 0;

  /**
   * The feature id for the '<em><b>Cmds Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_IF__CMDS_THEN = 1;

  /**
   * The feature id for the '<em><b>Cmds Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_IF__CMDS_ELSE = 2;

  /**
   * The number of structural features of the '<em>Command If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_IF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.CommandForEachImpl <em>Command For Each</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.CommandForEachImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommandForEach()
   * @generated
   */
  int COMMAND_FOR_EACH = 10;

  /**
   * The feature id for the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FOR_EACH__ELEM = 0;

  /**
   * The feature id for the '<em><b>Ensemb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FOR_EACH__ENSEMB = 1;

  /**
   * The feature id for the '<em><b>Cmds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FOR_EACH__CMDS = 2;

  /**
   * The number of structural features of the '<em>Command For Each</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FOR_EACH_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.ExprsImpl <em>Exprs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.ExprsImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprs()
   * @generated
   */
  int EXPRS = 11;

  /**
   * The feature id for the '<em><b>Exp Gen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS__EXP_GEN = 0;

  /**
   * The number of structural features of the '<em>Exprs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.ExprImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 12;

  /**
   * The feature id for the '<em><b>Expr Simp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPR_SIMP = 0;

  /**
   * The feature id for the '<em><b>Expr And</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPR_AND = 1;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.ExprSimpleImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprSimple()
   * @generated
   */
  int EXPR_SIMPLE = 13;

  /**
   * The feature id for the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__NIL = 0;

  /**
   * The feature id for the '<em><b>Vari</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__VARI = 1;

  /**
   * The feature id for the '<em><b>Symb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__SYMB = 2;

  /**
   * The feature id for the '<em><b>Expr Cons</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR_CONS = 3;

  /**
   * The feature id for the '<em><b>Expr Cons Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR_CONS_ATT = 4;

  /**
   * The feature id for the '<em><b>Expr List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR_LIST = 5;

  /**
   * The feature id for the '<em><b>Expr List Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR_LIST_ATT = 6;

  /**
   * The feature id for the '<em><b>Expr Head</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR_HEAD = 7;

  /**
   * The feature id for the '<em><b>Expr Head Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR_HEAD_ATT = 8;

  /**
   * The feature id for the '<em><b>Expr Tail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR_TAIL = 9;

  /**
   * The feature id for the '<em><b>Expr Tail Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__EXPR_TAIL_ATT = 10;

  /**
   * The feature id for the '<em><b>Nom Symb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__NOM_SYMB = 11;

  /**
   * The feature id for the '<em><b>Symb Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE__SYMB_ATT = 12;

  /**
   * The number of structural features of the '<em>Expr Simple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SIMPLE_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.ExprAndImpl <em>Expr And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.ExprAndImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprAnd()
   * @generated
   */
  int EXPR_AND = 14;

  /**
   * The feature id for the '<em><b>Expr Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__EXPR_OR = 0;

  /**
   * The feature id for the '<em><b>Expr And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__EXPR_AND = 1;

  /**
   * The feature id for the '<em><b>Expr And Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND__EXPR_AND_ATT = 2;

  /**
   * The number of structural features of the '<em>Expr And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_AND_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.ExprOrImpl <em>Expr Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.ExprOrImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprOr()
   * @generated
   */
  int EXPR_OR = 15;

  /**
   * The feature id for the '<em><b>Expr Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__EXPR_NOT = 0;

  /**
   * The feature id for the '<em><b>Expr Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__EXPR_OR = 1;

  /**
   * The feature id for the '<em><b>Expr Or Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR__EXPR_OR_ATT = 2;

  /**
   * The number of structural features of the '<em>Expr Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_OR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.ExprNotImpl <em>Expr Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.ExprNotImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprNot()
   * @generated
   */
  int EXPR_NOT = 16;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT__NOT = 0;

  /**
   * The feature id for the '<em><b>Expr Eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT__EXPR_EQ = 1;

  /**
   * The number of structural features of the '<em>Expr Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_NOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.whileCpp.impl.ExprEqImpl <em>Expr Eq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.whileCpp.impl.ExprEqImpl
   * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprEq()
   * @generated
   */
  int EXPR_EQ = 17;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXPR = 0;

  /**
   * The feature id for the '<em><b>Expr Sim1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXPR_SIM1 = 1;

  /**
   * The feature id for the '<em><b>Expr Sim2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ__EXPR_SIM2 = 2;

  /**
   * The number of structural features of the '<em>Expr Eq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_EQ_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.example.whileCpp.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.whileCpp.Program#getFonctions <em>Fonctions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fonctions</em>'.
   * @see org.xtext.example.whileCpp.Program#getFonctions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Fonctions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.example.whileCpp.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.Function#getNom <em>Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nom</em>'.
   * @see org.xtext.example.whileCpp.Function#getNom()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Nom();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Function#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see org.xtext.example.whileCpp.Function#getDefinition()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Definition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.xtext.example.whileCpp.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Definition#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inputs</em>'.
   * @see org.xtext.example.whileCpp.Definition#getInputs()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Inputs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Definition#getCommandes <em>Commandes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Commandes</em>'.
   * @see org.xtext.example.whileCpp.Definition#getCommandes()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Commandes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Definition#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Outputs</em>'.
   * @see org.xtext.example.whileCpp.Definition#getOutputs()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Outputs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see org.xtext.example.whileCpp.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.whileCpp.Input#getVarIn <em>Var In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Var In</em>'.
   * @see org.xtext.example.whileCpp.Input#getVarIn()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_VarIn();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see org.xtext.example.whileCpp.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.whileCpp.Output#getVarOut <em>Var Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Var Out</em>'.
   * @see org.xtext.example.whileCpp.Output#getVarOut()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_VarOut();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Vars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vars</em>'.
   * @see org.xtext.example.whileCpp.Vars
   * @generated
   */
  EClass getVars();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.whileCpp.Vars#getVarGen <em>Var Gen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Var Gen</em>'.
   * @see org.xtext.example.whileCpp.Vars#getVarGen()
   * @see #getVars()
   * @generated
   */
  EAttribute getVars_VarGen();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Commands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commands</em>'.
   * @see org.xtext.example.whileCpp.Commands
   * @generated
   */
  EClass getCommands();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.whileCpp.Commands#getCommande <em>Commande</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commande</em>'.
   * @see org.xtext.example.whileCpp.Commands#getCommande()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_Commande();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.example.whileCpp.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.Command#getNop <em>Nop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nop</em>'.
   * @see org.xtext.example.whileCpp.Command#getNop()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Nop();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Command#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vars</em>'.
   * @see org.xtext.example.whileCpp.Command#getVars()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Vars();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Command#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exprs</em>'.
   * @see org.xtext.example.whileCpp.Command#getExprs()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Exprs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Command#getCmdWhile <em>Cmd While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd While</em>'.
   * @see org.xtext.example.whileCpp.Command#getCmdWhile()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_CmdWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Command#getCmdIf <em>Cmd If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd If</em>'.
   * @see org.xtext.example.whileCpp.Command#getCmdIf()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_CmdIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Command#getCmdForEach <em>Cmd For Each</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd For Each</em>'.
   * @see org.xtext.example.whileCpp.Command#getCmdForEach()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_CmdForEach();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.CommandWhile <em>Command While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command While</em>'.
   * @see org.xtext.example.whileCpp.CommandWhile
   * @generated
   */
  EClass getCommandWhile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.CommandWhile#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>W</em>'.
   * @see org.xtext.example.whileCpp.CommandWhile#getW()
   * @see #getCommandWhile()
   * @generated
   */
  EAttribute getCommandWhile_W();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.CommandWhile#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.whileCpp.CommandWhile#getExpr()
   * @see #getCommandWhile()
   * @generated
   */
  EReference getCommandWhile_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.CommandWhile#getCmds <em>Cmds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmds</em>'.
   * @see org.xtext.example.whileCpp.CommandWhile#getCmds()
   * @see #getCommandWhile()
   * @generated
   */
  EReference getCommandWhile_Cmds();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.CommandIf <em>Command If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command If</em>'.
   * @see org.xtext.example.whileCpp.CommandIf
   * @generated
   */
  EClass getCommandIf();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.CommandIf#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.xtext.example.whileCpp.CommandIf#getCond()
   * @see #getCommandIf()
   * @generated
   */
  EReference getCommandIf_Cond();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.CommandIf#getCmdsThen <em>Cmds Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmds Then</em>'.
   * @see org.xtext.example.whileCpp.CommandIf#getCmdsThen()
   * @see #getCommandIf()
   * @generated
   */
  EReference getCommandIf_CmdsThen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.CommandIf#getCmdsElse <em>Cmds Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmds Else</em>'.
   * @see org.xtext.example.whileCpp.CommandIf#getCmdsElse()
   * @see #getCommandIf()
   * @generated
   */
  EReference getCommandIf_CmdsElse();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.CommandForEach <em>Command For Each</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command For Each</em>'.
   * @see org.xtext.example.whileCpp.CommandForEach
   * @generated
   */
  EClass getCommandForEach();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.CommandForEach#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem</em>'.
   * @see org.xtext.example.whileCpp.CommandForEach#getElem()
   * @see #getCommandForEach()
   * @generated
   */
  EReference getCommandForEach_Elem();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.CommandForEach#getEnsemb <em>Ensemb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ensemb</em>'.
   * @see org.xtext.example.whileCpp.CommandForEach#getEnsemb()
   * @see #getCommandForEach()
   * @generated
   */
  EReference getCommandForEach_Ensemb();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.CommandForEach#getCmds <em>Cmds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmds</em>'.
   * @see org.xtext.example.whileCpp.CommandForEach#getCmds()
   * @see #getCommandForEach()
   * @generated
   */
  EReference getCommandForEach_Cmds();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Exprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exprs</em>'.
   * @see org.xtext.example.whileCpp.Exprs
   * @generated
   */
  EClass getExprs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.whileCpp.Exprs#getExpGen <em>Exp Gen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Gen</em>'.
   * @see org.xtext.example.whileCpp.Exprs#getExpGen()
   * @see #getExprs()
   * @generated
   */
  EReference getExprs_ExpGen();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.xtext.example.whileCpp.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Expr#getExprSimp <em>Expr Simp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Simp</em>'.
   * @see org.xtext.example.whileCpp.Expr#getExprSimp()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExprSimp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.Expr#getExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr And</em>'.
   * @see org.xtext.example.whileCpp.Expr#getExprAnd()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExprAnd();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.ExprSimple <em>Expr Simple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Simple</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple
   * @generated
   */
  EClass getExprSimple();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprSimple#getNil <em>Nil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nil</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getNil()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Nil();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprSimple#getVari <em>Vari</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vari</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getVari()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Vari();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprSimple#getSymb <em>Symb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symb</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getSymb()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_Symb();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprSimple#getExprCons <em>Expr Cons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr Cons</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getExprCons()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_ExprCons();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprSimple#getExprConsAtt <em>Expr Cons Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Cons Att</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getExprConsAtt()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_ExprConsAtt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprSimple#getExprList <em>Expr List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr List</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getExprList()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_ExprList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprSimple#getExprListAtt <em>Expr List Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr List Att</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getExprListAtt()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_ExprListAtt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprSimple#getExprHead <em>Expr Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr Head</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getExprHead()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_ExprHead();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprSimple#getExprHeadAtt <em>Expr Head Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Head Att</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getExprHeadAtt()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_ExprHeadAtt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprSimple#getExprTail <em>Expr Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr Tail</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getExprTail()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_ExprTail();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprSimple#getExprTailAtt <em>Expr Tail Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Tail Att</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getExprTailAtt()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_ExprTailAtt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprSimple#getNomSymb <em>Nom Symb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nom Symb</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getNomSymb()
   * @see #getExprSimple()
   * @generated
   */
  EAttribute getExprSimple_NomSymb();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprSimple#getSymbAtt <em>Symb Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Symb Att</em>'.
   * @see org.xtext.example.whileCpp.ExprSimple#getSymbAtt()
   * @see #getExprSimple()
   * @generated
   */
  EReference getExprSimple_SymbAtt();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr And</em>'.
   * @see org.xtext.example.whileCpp.ExprAnd
   * @generated
   */
  EClass getExprAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprAnd#getExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Or</em>'.
   * @see org.xtext.example.whileCpp.ExprAnd#getExprOr()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_ExprOr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprAnd#getExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr And</em>'.
   * @see org.xtext.example.whileCpp.ExprAnd#getExprAnd()
   * @see #getExprAnd()
   * @generated
   */
  EAttribute getExprAnd_ExprAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprAnd#getExprAndAtt <em>Expr And Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr And Att</em>'.
   * @see org.xtext.example.whileCpp.ExprAnd#getExprAndAtt()
   * @see #getExprAnd()
   * @generated
   */
  EReference getExprAnd_ExprAndAtt();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Or</em>'.
   * @see org.xtext.example.whileCpp.ExprOr
   * @generated
   */
  EClass getExprOr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprOr#getExprNot <em>Expr Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Not</em>'.
   * @see org.xtext.example.whileCpp.ExprOr#getExprNot()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_ExprNot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprOr#getExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr Or</em>'.
   * @see org.xtext.example.whileCpp.ExprOr#getExprOr()
   * @see #getExprOr()
   * @generated
   */
  EAttribute getExprOr_ExprOr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprOr#getExprOrAtt <em>Expr Or Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Or Att</em>'.
   * @see org.xtext.example.whileCpp.ExprOr#getExprOrAtt()
   * @see #getExprOr()
   * @generated
   */
  EReference getExprOr_ExprOrAtt();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.ExprNot <em>Expr Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Not</em>'.
   * @see org.xtext.example.whileCpp.ExprNot
   * @generated
   */
  EClass getExprNot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.whileCpp.ExprNot#getNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.xtext.example.whileCpp.ExprNot#getNot()
   * @see #getExprNot()
   * @generated
   */
  EAttribute getExprNot_Not();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprNot#getExprEq <em>Expr Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Eq</em>'.
   * @see org.xtext.example.whileCpp.ExprNot#getExprEq()
   * @see #getExprNot()
   * @generated
   */
  EReference getExprNot_ExprEq();

  /**
   * Returns the meta object for class '{@link org.xtext.example.whileCpp.ExprEq <em>Expr Eq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Eq</em>'.
   * @see org.xtext.example.whileCpp.ExprEq
   * @generated
   */
  EClass getExprEq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprEq#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.whileCpp.ExprEq#getExpr()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprEq#getExprSim1 <em>Expr Sim1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Sim1</em>'.
   * @see org.xtext.example.whileCpp.ExprEq#getExprSim1()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_ExprSim1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.whileCpp.ExprEq#getExprSim2 <em>Expr Sim2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Sim2</em>'.
   * @see org.xtext.example.whileCpp.ExprEq#getExprSim2()
   * @see #getExprEq()
   * @generated
   */
  EReference getExprEq_ExprSim2();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WhileCppFactory getWhileCppFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.ProgramImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Fonctions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__FONCTIONS = eINSTANCE.getProgram_Fonctions();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.FunctionImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NOM = eINSTANCE.getFunction_Nom();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__DEFINITION = eINSTANCE.getFunction_Definition();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.DefinitionImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__INPUTS = eINSTANCE.getDefinition_Inputs();

    /**
     * The meta object literal for the '<em><b>Commandes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__COMMANDES = eINSTANCE.getDefinition_Commandes();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__OUTPUTS = eINSTANCE.getDefinition_Outputs();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.InputImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Var In</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__VAR_IN = eINSTANCE.getInput_VarIn();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.OutputImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Var Out</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__VAR_OUT = eINSTANCE.getOutput_VarOut();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.VarsImpl <em>Vars</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.VarsImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getVars()
     * @generated
     */
    EClass VARS = eINSTANCE.getVars();

    /**
     * The meta object literal for the '<em><b>Var Gen</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARS__VAR_GEN = eINSTANCE.getVars_VarGen();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.CommandsImpl <em>Commands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.CommandsImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommands()
     * @generated
     */
    EClass COMMANDS = eINSTANCE.getCommands();

    /**
     * The meta object literal for the '<em><b>Commande</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__COMMANDE = eINSTANCE.getCommands_Commande();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.CommandImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Nop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__NOP = eINSTANCE.getCommand_Nop();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__VARS = eINSTANCE.getCommand_Vars();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__EXPRS = eINSTANCE.getCommand_Exprs();

    /**
     * The meta object literal for the '<em><b>Cmd While</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__CMD_WHILE = eINSTANCE.getCommand_CmdWhile();

    /**
     * The meta object literal for the '<em><b>Cmd If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__CMD_IF = eINSTANCE.getCommand_CmdIf();

    /**
     * The meta object literal for the '<em><b>Cmd For Each</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__CMD_FOR_EACH = eINSTANCE.getCommand_CmdForEach();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.CommandWhileImpl <em>Command While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.CommandWhileImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommandWhile()
     * @generated
     */
    EClass COMMAND_WHILE = eINSTANCE.getCommandWhile();

    /**
     * The meta object literal for the '<em><b>W</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_WHILE__W = eINSTANCE.getCommandWhile_W();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_WHILE__EXPR = eINSTANCE.getCommandWhile_Expr();

    /**
     * The meta object literal for the '<em><b>Cmds</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_WHILE__CMDS = eINSTANCE.getCommandWhile_Cmds();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.CommandIfImpl <em>Command If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.CommandIfImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommandIf()
     * @generated
     */
    EClass COMMAND_IF = eINSTANCE.getCommandIf();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_IF__COND = eINSTANCE.getCommandIf_Cond();

    /**
     * The meta object literal for the '<em><b>Cmds Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_IF__CMDS_THEN = eINSTANCE.getCommandIf_CmdsThen();

    /**
     * The meta object literal for the '<em><b>Cmds Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_IF__CMDS_ELSE = eINSTANCE.getCommandIf_CmdsElse();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.CommandForEachImpl <em>Command For Each</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.CommandForEachImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getCommandForEach()
     * @generated
     */
    EClass COMMAND_FOR_EACH = eINSTANCE.getCommandForEach();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_FOR_EACH__ELEM = eINSTANCE.getCommandForEach_Elem();

    /**
     * The meta object literal for the '<em><b>Ensemb</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_FOR_EACH__ENSEMB = eINSTANCE.getCommandForEach_Ensemb();

    /**
     * The meta object literal for the '<em><b>Cmds</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_FOR_EACH__CMDS = eINSTANCE.getCommandForEach_Cmds();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.ExprsImpl <em>Exprs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.ExprsImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprs()
     * @generated
     */
    EClass EXPRS = eINSTANCE.getExprs();

    /**
     * The meta object literal for the '<em><b>Exp Gen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRS__EXP_GEN = eINSTANCE.getExprs_ExpGen();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.ExprImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Expr Simp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPR_SIMP = eINSTANCE.getExpr_ExprSimp();

    /**
     * The meta object literal for the '<em><b>Expr And</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPR_AND = eINSTANCE.getExpr_ExprAnd();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl <em>Expr Simple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.ExprSimpleImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprSimple()
     * @generated
     */
    EClass EXPR_SIMPLE = eINSTANCE.getExprSimple();

    /**
     * The meta object literal for the '<em><b>Nil</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__NIL = eINSTANCE.getExprSimple_Nil();

    /**
     * The meta object literal for the '<em><b>Vari</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__VARI = eINSTANCE.getExprSimple_Vari();

    /**
     * The meta object literal for the '<em><b>Symb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__SYMB = eINSTANCE.getExprSimple_Symb();

    /**
     * The meta object literal for the '<em><b>Expr Cons</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__EXPR_CONS = eINSTANCE.getExprSimple_ExprCons();

    /**
     * The meta object literal for the '<em><b>Expr Cons Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__EXPR_CONS_ATT = eINSTANCE.getExprSimple_ExprConsAtt();

    /**
     * The meta object literal for the '<em><b>Expr List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__EXPR_LIST = eINSTANCE.getExprSimple_ExprList();

    /**
     * The meta object literal for the '<em><b>Expr List Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__EXPR_LIST_ATT = eINSTANCE.getExprSimple_ExprListAtt();

    /**
     * The meta object literal for the '<em><b>Expr Head</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__EXPR_HEAD = eINSTANCE.getExprSimple_ExprHead();

    /**
     * The meta object literal for the '<em><b>Expr Head Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__EXPR_HEAD_ATT = eINSTANCE.getExprSimple_ExprHeadAtt();

    /**
     * The meta object literal for the '<em><b>Expr Tail</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__EXPR_TAIL = eINSTANCE.getExprSimple_ExprTail();

    /**
     * The meta object literal for the '<em><b>Expr Tail Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__EXPR_TAIL_ATT = eINSTANCE.getExprSimple_ExprTailAtt();

    /**
     * The meta object literal for the '<em><b>Nom Symb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_SIMPLE__NOM_SYMB = eINSTANCE.getExprSimple_NomSymb();

    /**
     * The meta object literal for the '<em><b>Symb Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_SIMPLE__SYMB_ATT = eINSTANCE.getExprSimple_SymbAtt();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.ExprAndImpl <em>Expr And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.ExprAndImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprAnd()
     * @generated
     */
    EClass EXPR_AND = eINSTANCE.getExprAnd();

    /**
     * The meta object literal for the '<em><b>Expr Or</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AND__EXPR_OR = eINSTANCE.getExprAnd_ExprOr();

    /**
     * The meta object literal for the '<em><b>Expr And</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_AND__EXPR_AND = eINSTANCE.getExprAnd_ExprAnd();

    /**
     * The meta object literal for the '<em><b>Expr And Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_AND__EXPR_AND_ATT = eINSTANCE.getExprAnd_ExprAndAtt();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.ExprOrImpl <em>Expr Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.ExprOrImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprOr()
     * @generated
     */
    EClass EXPR_OR = eINSTANCE.getExprOr();

    /**
     * The meta object literal for the '<em><b>Expr Not</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_OR__EXPR_NOT = eINSTANCE.getExprOr_ExprNot();

    /**
     * The meta object literal for the '<em><b>Expr Or</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_OR__EXPR_OR = eINSTANCE.getExprOr_ExprOr();

    /**
     * The meta object literal for the '<em><b>Expr Or Att</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_OR__EXPR_OR_ATT = eINSTANCE.getExprOr_ExprOrAtt();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.ExprNotImpl <em>Expr Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.ExprNotImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprNot()
     * @generated
     */
    EClass EXPR_NOT = eINSTANCE.getExprNot();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_NOT__NOT = eINSTANCE.getExprNot_Not();

    /**
     * The meta object literal for the '<em><b>Expr Eq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_NOT__EXPR_EQ = eINSTANCE.getExprNot_ExprEq();

    /**
     * The meta object literal for the '{@link org.xtext.example.whileCpp.impl.ExprEqImpl <em>Expr Eq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.whileCpp.impl.ExprEqImpl
     * @see org.xtext.example.whileCpp.impl.WhileCppPackageImpl#getExprEq()
     * @generated
     */
    EClass EXPR_EQ = eINSTANCE.getExprEq();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXPR = eINSTANCE.getExprEq_Expr();

    /**
     * The meta object literal for the '<em><b>Expr Sim1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXPR_SIM1 = eINSTANCE.getExprEq_ExprSim1();

    /**
     * The meta object literal for the '<em><b>Expr Sim2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_EQ__EXPR_SIM2 = eINSTANCE.getExprEq_ExprSim2();

  }

} //WhileCppPackage
