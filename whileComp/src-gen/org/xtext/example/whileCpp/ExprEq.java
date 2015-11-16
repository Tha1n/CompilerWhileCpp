/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.ExprEq#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprEq#getExprSim1 <em>Expr Sim1</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprEq#getExprSim2 <em>Expr Sim2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getExprEq()
 * @model
 * @generated
 */
public interface ExprEq extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprEq_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprEq#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Expr Sim1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Sim1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Sim1</em>' containment reference.
   * @see #setExprSim1(ExprSimple)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprEq_ExprSim1()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExprSim1();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprEq#getExprSim1 <em>Expr Sim1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Sim1</em>' containment reference.
   * @see #getExprSim1()
   * @generated
   */
  void setExprSim1(ExprSimple value);

  /**
   * Returns the value of the '<em><b>Expr Sim2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Sim2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Sim2</em>' containment reference.
   * @see #setExprSim2(ExprSimple)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprEq_ExprSim2()
   * @model containment="true"
   * @generated
   */
  ExprSimple getExprSim2();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprEq#getExprSim2 <em>Expr Sim2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Sim2</em>' containment reference.
   * @see #getExprSim2()
   * @generated
   */
  void setExprSim2(ExprSimple value);

} // ExprEq
