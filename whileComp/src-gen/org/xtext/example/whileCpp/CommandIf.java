/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.CommandIf#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.CommandIf#getCmdsThen <em>Cmds Then</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.CommandIf#getCmdsElse <em>Cmds Else</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandIf()
 * @model
 * @generated
 */
public interface CommandIf extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandIf_Cond()
   * @model containment="true"
   * @generated
   */
  Expr getCond();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandIf#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expr value);

  /**
   * Returns the value of the '<em><b>Cmds Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmds Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmds Then</em>' containment reference.
   * @see #setCmdsThen(Commands)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandIf_CmdsThen()
   * @model containment="true"
   * @generated
   */
  Commands getCmdsThen();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandIf#getCmdsThen <em>Cmds Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmds Then</em>' containment reference.
   * @see #getCmdsThen()
   * @generated
   */
  void setCmdsThen(Commands value);

  /**
   * Returns the value of the '<em><b>Cmds Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmds Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmds Else</em>' containment reference.
   * @see #setCmdsElse(Commands)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandIf_CmdsElse()
   * @model containment="true"
   * @generated
   */
  Commands getCmdsElse();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandIf#getCmdsElse <em>Cmds Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmds Else</em>' containment reference.
   * @see #getCmdsElse()
   * @generated
   */
  void setCmdsElse(Commands value);

} // CommandIf
