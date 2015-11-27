/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.ExprAnd#getExprOr <em>Expr Or</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprAnd#getExprAnd <em>Expr And</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprAnd#getExprAndAtt <em>Expr And Att</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getExprAnd()
 * @model
 * @generated
 */
public interface ExprAnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Or</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Or</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Or</em>' containment reference.
   * @see #setExprOr(ExprOr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprAnd_ExprOr()
   * @model containment="true"
   * @generated
   */
  ExprOr getExprOr();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprAnd#getExprOr <em>Expr Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Or</em>' containment reference.
   * @see #getExprOr()
   * @generated
   */
  void setExprOr(ExprOr value);

  /**
   * Returns the value of the '<em><b>Expr And</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr And</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr And</em>' attribute.
   * @see #setExprAnd(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprAnd_ExprAnd()
   * @model
   * @generated
   */
  String getExprAnd();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprAnd#getExprAnd <em>Expr And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr And</em>' attribute.
   * @see #getExprAnd()
   * @generated
   */
  void setExprAnd(String value);

  /**
   * Returns the value of the '<em><b>Expr And Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr And Att</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr And Att</em>' containment reference.
   * @see #setExprAndAtt(ExprAnd)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprAnd_ExprAndAtt()
   * @model containment="true"
   * @generated
   */
  ExprAnd getExprAndAtt();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprAnd#getExprAndAtt <em>Expr And Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr And Att</em>' containment reference.
   * @see #getExprAndAtt()
   * @generated
   */
  void setExprAndAtt(ExprAnd value);

} // ExprAnd
