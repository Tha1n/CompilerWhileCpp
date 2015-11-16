/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.Command#getNop <em>Nop</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.Command#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.Command#getExprs <em>Exprs</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.Command#getCmdWhile <em>Cmd While</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.Command#getCmdIf <em>Cmd If</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.Command#getCmdForEach <em>Cmd For Each</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Nop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nop</em>' attribute.
   * @see #setNop(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommand_Nop()
   * @model
   * @generated
   */
  String getNop();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Command#getNop <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nop</em>' attribute.
   * @see #getNop()
   * @generated
   */
  void setNop(String value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(Vars)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommand_Vars()
   * @model containment="true"
   * @generated
   */
  Vars getVars();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Command#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(Vars value);

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference.
   * @see #setExprs(Exprs)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommand_Exprs()
   * @model containment="true"
   * @generated
   */
  Exprs getExprs();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Command#getExprs <em>Exprs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exprs</em>' containment reference.
   * @see #getExprs()
   * @generated
   */
  void setExprs(Exprs value);

  /**
   * Returns the value of the '<em><b>Cmd While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd While</em>' containment reference.
   * @see #setCmdWhile(CommandWhile)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommand_CmdWhile()
   * @model containment="true"
   * @generated
   */
  CommandWhile getCmdWhile();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Command#getCmdWhile <em>Cmd While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd While</em>' containment reference.
   * @see #getCmdWhile()
   * @generated
   */
  void setCmdWhile(CommandWhile value);

  /**
   * Returns the value of the '<em><b>Cmd If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd If</em>' containment reference.
   * @see #setCmdIf(CommandIf)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommand_CmdIf()
   * @model containment="true"
   * @generated
   */
  CommandIf getCmdIf();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Command#getCmdIf <em>Cmd If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd If</em>' containment reference.
   * @see #getCmdIf()
   * @generated
   */
  void setCmdIf(CommandIf value);

  /**
   * Returns the value of the '<em><b>Cmd For Each</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd For Each</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd For Each</em>' containment reference.
   * @see #setCmdForEach(CommandForEach)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommand_CmdForEach()
   * @model containment="true"
   * @generated
   */
  CommandForEach getCmdForEach();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Command#getCmdForEach <em>Cmd For Each</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd For Each</em>' containment reference.
   * @see #getCmdForEach()
   * @generated
   */
  void setCmdForEach(CommandForEach value);

} // Command
