/**
 */
package org.xtext.example.whileCpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getVari <em>Vari</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getSymb <em>Symb</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getExprCons <em>Expr Cons</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getExprHead <em>Expr Head</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getExprHeadAtt <em>Expr Head Att</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getExprTail <em>Expr Tail</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getExprTailAtt <em>Expr Tail Att</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getNomSymb <em>Nom Symb</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.ExprSimple#getSymbAtt <em>Symb Att</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple()
 * @model
 * @generated
 */
public interface ExprSimple extends EObject
{
  /**
   * Returns the value of the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nil</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nil</em>' attribute.
   * @see #setNil(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_Nil()
   * @model
   * @generated
   */
  String getNil();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getNil <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' attribute.
   * @see #getNil()
   * @generated
   */
  void setNil(String value);

  /**
   * Returns the value of the '<em><b>Vari</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vari</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vari</em>' attribute.
   * @see #setVari(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_Vari()
   * @model
   * @generated
   */
  String getVari();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getVari <em>Vari</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vari</em>' attribute.
   * @see #getVari()
   * @generated
   */
  void setVari(String value);

  /**
   * Returns the value of the '<em><b>Symb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symb</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symb</em>' attribute.
   * @see #setSymb(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_Symb()
   * @model
   * @generated
   */
  String getSymb();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getSymb <em>Symb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symb</em>' attribute.
   * @see #getSymb()
   * @generated
   */
  void setSymb(String value);

  /**
   * Returns the value of the '<em><b>Expr Cons</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Cons</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Cons</em>' containment reference.
   * @see #setExprCons(Cons)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_ExprCons()
   * @model containment="true"
   * @generated
   */
  Cons getExprCons();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getExprCons <em>Expr Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Cons</em>' containment reference.
   * @see #getExprCons()
   * @generated
   */
  void setExprCons(Cons value);

  /**
   * Returns the value of the '<em><b>Expr Head</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Head</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Head</em>' attribute.
   * @see #setExprHead(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_ExprHead()
   * @model
   * @generated
   */
  String getExprHead();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getExprHead <em>Expr Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Head</em>' attribute.
   * @see #getExprHead()
   * @generated
   */
  void setExprHead(String value);

  /**
   * Returns the value of the '<em><b>Expr Head Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Head Att</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Head Att</em>' containment reference.
   * @see #setExprHeadAtt(Expr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_ExprHeadAtt()
   * @model containment="true"
   * @generated
   */
  Expr getExprHeadAtt();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getExprHeadAtt <em>Expr Head Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Head Att</em>' containment reference.
   * @see #getExprHeadAtt()
   * @generated
   */
  void setExprHeadAtt(Expr value);

  /**
   * Returns the value of the '<em><b>Expr Tail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Tail</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Tail</em>' attribute.
   * @see #setExprTail(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_ExprTail()
   * @model
   * @generated
   */
  String getExprTail();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getExprTail <em>Expr Tail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Tail</em>' attribute.
   * @see #getExprTail()
   * @generated
   */
  void setExprTail(String value);

  /**
   * Returns the value of the '<em><b>Expr Tail Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Tail Att</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Tail Att</em>' containment reference.
   * @see #setExprTailAtt(Expr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_ExprTailAtt()
   * @model containment="true"
   * @generated
   */
  Expr getExprTailAtt();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getExprTailAtt <em>Expr Tail Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Tail Att</em>' containment reference.
   * @see #getExprTailAtt()
   * @generated
   */
  void setExprTailAtt(Expr value);

  /**
   * Returns the value of the '<em><b>Nom Symb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom Symb</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom Symb</em>' attribute.
   * @see #setNomSymb(String)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_NomSymb()
   * @model
   * @generated
   */
  String getNomSymb();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getNomSymb <em>Nom Symb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom Symb</em>' attribute.
   * @see #getNomSymb()
   * @generated
   */
  void setNomSymb(String value);

  /**
   * Returns the value of the '<em><b>Symb Att</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symb Att</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symb Att</em>' containment reference.
   * @see #setSymbAtt(Expr)
   * @see org.xtext.example.whileCpp.WhileCppPackage#getExprSimple_SymbAtt()
   * @model containment="true"
   * @generated
   */
  Expr getSymbAtt();

  /**
   * Sets the value of the '{@link org.xtext.example.whileCpp.ExprSimple#getSymbAtt <em>Symb Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symb Att</em>' containment reference.
   * @see #getSymbAtt()
   * @generated
   */
  void setSymbAtt(Expr value);

} // ExprSimple
