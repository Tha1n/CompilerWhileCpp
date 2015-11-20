/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.Commands#getCommande <em>Commande</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getCommands()
 * @model
 * @generated
 */
public interface Commands extends EObject
{
  /**
   * Returns the value of the '<em><b>Commande</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.whileCpp.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commande</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commande</em>' containment reference list.
   * @see org.xtext.example.whileCpp.WhileCppPackage#getCommands_Commande()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommande();

} // Commands
