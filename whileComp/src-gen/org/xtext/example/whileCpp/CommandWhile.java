/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.CommandWhile#getW <em>W</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.CommandWhile#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.CommandWhile#getCmds <em>Cmds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandWhile()
 * @model
 * @generated
 */
public interface CommandWhile extends EObject
{
  /**
   * Returns the value of the '<em><b>W</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' attribute.
   * @see #setW(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandWhile_W()
   * @model
   * @generated
   */
  String getW();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandWhile#getW <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W</em>' attribute.
   * @see #getW()
   * @generated
   */
  void setW(String value);

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
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandWhile_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandWhile#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

  /**
   * Returns the value of the '<em><b>Cmds</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmds</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmds</em>' containment reference.
   * @see #setCmds(Commands)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandWhile_Cmds()
   * @model containment="true"
   * @generated
   */
  Commands getCmds();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandWhile#getCmds <em>Cmds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmds</em>' containment reference.
   * @see #getCmds()
   * @generated
   */
  void setCmds(Commands value);

} // CommandWhile
