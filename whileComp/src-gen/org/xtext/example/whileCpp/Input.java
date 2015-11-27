/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.Input#getVarIn <em>Var In</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject
{
  /**
   * Returns the value of the '<em><b>Var In</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var In</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var In</em>' attribute list.
   * @see org.xtext.example.whileCpp.WhileCppPackage#getInput_VarIn()
   * @model unique="false"
   * @generated
   */
  EList<String> getVarIn();

} // Input
