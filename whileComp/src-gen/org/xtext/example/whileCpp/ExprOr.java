/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.ExprOr#getExprNot <em>Expr Not</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprOr#getExprOr <em>Expr Or</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprOr#getExprOrAtt <em>Expr Or Att</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getExprOr()
 * @model
 * @generated
 */
public interface ExprOr extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Not</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Not</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Not</em>' containment reference.
   * @see #setExprNot(ExprNot)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprOr_ExprNot()
   * @model containment="true"
   * @generated
   */
  ExprNot getExprNot();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprOr#getExprNot <em>Expr Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Not</em>' containment reference.
   * @see #getExprNot()
   * @generated
   */
  void setExprNot(ExprNot value);

  /**
   * Returns the value of the '<em><b>Expr Or</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Or</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Or</em>' attribute.
   * @see #setExprOr(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprOr_ExprOr()
   * @model
   * @generated
   */
  String getExprOr();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprOr#getExprOr <em>Expr Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Or</em>' attribute.
   * @see #getExprOr()
   * @generated
   */
  void setExprOr(String value);

  /**
   * Returns the value of the '<em><b>Expr Or Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Or Att</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Or Att</em>' containment reference.
   * @see #setExprOrAtt(ExprOr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprOr_ExprOrAtt()
   * @model containment="true"
   * @generated
   */
  ExprOr getExprOrAtt();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprOr#getExprOrAtt <em>Expr Or Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Or Att</em>' containment reference.
   * @see #getExprOrAtt()
   * @generated
   */
  void setExprOrAtt(ExprOr value);

} // ExprOr
