/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.Vars#getVarGen <em>Var Gen</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getVars()
 * @model
 * @generated
 */
public interface Vars extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Gen</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Gen</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Gen</em>' attribute list.
   * @see org.xtext.example.whileCpp.WhileCppPackage#getVars_VarGen()
   * @model unique="false"
   * @generated
   */
  EList<String> getVarGen();

} // Vars
