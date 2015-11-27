/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.Expr#getExprSimp <em>Expr Simp</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.Expr#getExprAnd <em>Expr And</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Simp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Simp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Simp</em>' containment reference.
   * @see #setExprSimp(ExprSimple)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExpr_ExprSimp()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExprSimp();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Expr#getExprSimp <em>Expr Simp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Simp</em>' containment reference.
   * @see #getExprSimp()
   * @generated
   */
  void setExprSimp(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Expr And</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr And</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr And</em>' containment reference.
   * @see #setExprAnd(ExprAnd)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExpr_ExprAnd()
   * @model containment="true"
   * @generated
   */
  ExprAnd getExprAnd();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Expr#getExprAnd <em>Expr And</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr And</em>' containment reference.
   * @see #getExprAnd()
   * @generated
   */
  void setExprAnd(ExprAnd value);

} // Expr
