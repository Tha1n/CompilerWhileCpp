/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.CommandForEach#getElem <em>Elem</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.CommandForEach#getEnsemb <em>Ensemb</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.CommandForEach#getCmds <em>Cmds</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandForEach()
 * @model
 * @generated
 */
public interface CommandForEach extends EObject
{
  /**
   * Returns the value of the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' containment reference.
   * @see #setElem(Expr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandForEach_Elem()
   * @model containment="true"
   * @generated
   */
  Expr getElem();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandForEach#getElem <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' containment reference.
   * @see #getElem()
   * @generated
   */
  void setElem(Expr value);

  /**
   * Returns the value of the '<em><b>Ensemb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ensemb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ensemb</em>' containment reference.
   * @see #setEnsemb(Expr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandForEach_Ensemb()
   * @model containment="true"
   * @generated
   */
  Expr getEnsemb();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandForEach#getEnsemb <em>Ensemb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ensemb</em>' containment reference.
   * @see #getEnsemb()
   * @generated
   */
  void setEnsemb(Expr value);

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
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommandForEach_Cmds()
   * @model containment="true"
   * @generated
   */
  Commands getCmds();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.CommandForEach#getCmds <em>Cmds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmds</em>' containment reference.
   * @see #getCmds()
   * @generated
   */
  void setCmds(Commands value);

} // CommandForEach
