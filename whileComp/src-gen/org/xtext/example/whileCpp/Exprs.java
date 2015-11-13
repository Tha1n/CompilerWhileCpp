/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.Exprs#getExpGen <em>Exp Gen</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getExprs()
 * @model
 * @generated
 */
public interface Exprs extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp Gen</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.whileCpp.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Gen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Gen</em>' containment reference list.
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprs_ExpGen()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getExpGen();

} // Exprs
