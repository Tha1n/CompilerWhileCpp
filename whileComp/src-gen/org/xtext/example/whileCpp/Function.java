/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.Function#getNom <em>Nom</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.Function#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getFunction_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Function#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(Definition)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getFunction_Definition()
   * @model containment="true"
   * @generated
   */
  Definition getDefinition();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.Function#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(Definition value);

} // Function
