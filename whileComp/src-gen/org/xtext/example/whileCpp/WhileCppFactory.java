/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.whileCpp.WhileCppPackage
 * @generated
 */
public interface WhileCppFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WhileCppFactory eINSTANCE = org.xtext.example.whileCpp.impl.WhileCppFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output</em>'.
   * @generated
   */
  Output createOutput();

  /**
   * Returns a new object of class '<em>Vars</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vars</em>'.
   * @generated
   */
  Vars createVars();

  /**
   * Returns a new object of class '<em>Commands</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commands</em>'.
   * @generated
   */
  Commands createCommands();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Command While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command While</em>'.
   * @generated
   */
  CommandWhile createCommandWhile();

  /**
   * Returns a new object of class '<em>Command If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command If</em>'.
   * @generated
   */
  CommandIf createCommandIf();

  /**
   * Returns a new object of class '<em>Command For Each</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command For Each</em>'.
   * @generated
   */
  CommandForEach createCommandForEach();

  /**
   * Returns a new object of class '<em>Exprs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exprs</em>'.
   * @generated
   */
  Exprs createExprs();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Expr Simple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Simple</em>'.
   * @generated
   */
  ExprSimple createExprSimple();

  /**
   * Returns a new object of class '<em>Expr And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr And</em>'.
   * @generated
   */
  ExprAnd createExprAnd();

  /**
   * Returns a new object of class '<em>Expr Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Or</em>'.
   * @generated
   */
  ExprOr createExprOr();

  /**
   * Returns a new object of class '<em>Expr Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Not</em>'.
   * @generated
   */
  ExprNot createExprNot();

  /**
   * Returns a new object of class '<em>Expr Eq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Eq</em>'.
   * @generated
   */
  ExprEq createExprEq();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WhileCppPackage getWhileCppPackage();

} //WhileCppFactory
