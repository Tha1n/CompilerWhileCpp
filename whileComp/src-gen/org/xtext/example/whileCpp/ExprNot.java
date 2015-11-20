/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.ExprNot#getNot <em>Not</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprNot#getExprEq <em>Expr Eq</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getExprNot()
 * @model
 * @generated
 */
public interface ExprNot extends EObject
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprNot_Not()
   * @model
   * @generated
   */
  String getNot();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprNot#getNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #getNot()
   * @generated
   */
  void setNot(String value);

  /**
   * Returns the value of the '<em><b>Expr Eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Eq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Eq</em>' containment reference.
   * @see #setExprEq(ExprEq)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprNot_ExprEq()
   * @model containment="true"
   * @generated
   */
  ExprEq getExprEq();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprNot#getExprEq <em>Expr Eq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Eq</em>' containment reference.
   * @see #getExprEq()
   * @generated
   */
  void setExprEq(ExprEq value);

} // ExprNot
