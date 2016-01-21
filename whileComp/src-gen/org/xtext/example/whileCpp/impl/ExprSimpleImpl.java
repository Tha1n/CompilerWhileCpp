/**
 */
package org.xtext.example.whileCpp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.whileCpp.Cons;
import org.xtext.example.whileCpp.Expr;
import org.xtext.example.whileCpp.ExprSimple;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getVari <em>Vari</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getSymb <em>Symb</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getExprCons <em>Expr Cons</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getExprHead <em>Expr Head</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getExprHeadAtt <em>Expr Head Att</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getExprTail <em>Expr Tail</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getExprTailAtt <em>Expr Tail Att</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getNomSymb <em>Nom Symb</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getSymbAtt <em>Symb Att</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprSimpleImpl extends MinimalEObjectImpl.Container implements ExprSimple
{
  /**
   * The default value of the '{@link #getNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNil()
   * @generated
   * @ordered
   */
  protected static final String NIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNil()
   * @generated
   * @ordered
   */
  protected String nil = NIL_EDEFAULT;

  /**
   * The default value of the '{@link #getVari() <em>Vari</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVari()
   * @generated
   * @ordered
   */
  protected static final String VARI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVari() <em>Vari</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVari()
   * @generated
   * @ordered
   */
  protected String vari = VARI_EDEFAULT;

  /**
   * The default value of the '{@link #getSymb() <em>Symb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymb()
   * @generated
   * @ordered
   */
  protected static final String SYMB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSymb() <em>Symb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymb()
   * @generated
   * @ordered
   */
  protected String symb = SYMB_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprCons() <em>Expr Cons</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprCons()
   * @generated
   * @ordered
   */
  protected Cons exprCons;

  /**
   * The default value of the '{@link #getExprHead() <em>Expr Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprHead()
   * @generated
   * @ordered
   */
  protected static final String EXPR_HEAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExprHead() <em>Expr Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprHead()
   * @generated
   * @ordered
   */
  protected String exprHead = EXPR_HEAD_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprHeadAtt() <em>Expr Head Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprHeadAtt()
   * @generated
   * @ordered
   */
  protected Expr exprHeadAtt;

  /**
   * The default value of the '{@link #getExprTail() <em>Expr Tail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprTail()
   * @generated
   * @ordered
   */
  protected static final String EXPR_TAIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExprTail() <em>Expr Tail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprTail()
   * @generated
   * @ordered
   */
  protected String exprTail = EXPR_TAIL_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprTailAtt() <em>Expr Tail Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprTailAtt()
   * @generated
   * @ordered
   */
  protected Expr exprTailAtt;

  /**
   * The default value of the '{@link #getNomSymb() <em>Nom Symb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomSymb()
   * @generated
   * @ordered
   */
  protected static final String NOM_SYMB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomSymb() <em>Nom Symb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomSymb()
   * @generated
   * @ordered
   */
  protected String nomSymb = NOM_SYMB_EDEFAULT;

  /**
   * The cached value of the '{@link #getSymbAtt() <em>Symb Att</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbAtt()
   * @generated
   * @ordered
   */
  protected EList<Expr> symbAtt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprSimpleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WhileCppPackage.Literals.EXPR_SIMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNil()
  {
    return nil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNil(String newNil)
  {
    String oldNil = nil;
    nil = newNil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__NIL, oldNil, nil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVari()
  {
    return vari;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVari(String newVari)
  {
    String oldVari = vari;
    vari = newVari;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__VARI, oldVari, vari));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSymb()
  {
    return symb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymb(String newSymb)
  {
    String oldSymb = symb;
    symb = newSymb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__SYMB, oldSymb, symb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cons getExprCons()
  {
    return exprCons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprCons(Cons newExprCons, NotificationChain msgs)
  {
    Cons oldExprCons = exprCons;
    exprCons = newExprCons;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_CONS, oldExprCons, newExprCons);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprCons(Cons newExprCons)
  {
    if (newExprCons != exprCons)
    {
      NotificationChain msgs = null;
      if (exprCons != null)
        msgs = ((InternalEObject)exprCons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_CONS, null, msgs);
      if (newExprCons != null)
        msgs = ((InternalEObject)newExprCons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_CONS, null, msgs);
      msgs = basicSetExprCons(newExprCons, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_CONS, newExprCons, newExprCons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExprHead()
  {
    return exprHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprHead(String newExprHead)
  {
    String oldExprHead = exprHead;
    exprHead = newExprHead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD, oldExprHead, exprHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExprHeadAtt()
  {
    return exprHeadAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprHeadAtt(Expr newExprHeadAtt, NotificationChain msgs)
  {
    Expr oldExprHeadAtt = exprHeadAtt;
    exprHeadAtt = newExprHeadAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT, oldExprHeadAtt, newExprHeadAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprHeadAtt(Expr newExprHeadAtt)
  {
    if (newExprHeadAtt != exprHeadAtt)
    {
      NotificationChain msgs = null;
      if (exprHeadAtt != null)
        msgs = ((InternalEObject)exprHeadAtt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT, null, msgs);
      if (newExprHeadAtt != null)
        msgs = ((InternalEObject)newExprHeadAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT, null, msgs);
      msgs = basicSetExprHeadAtt(newExprHeadAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT, newExprHeadAtt, newExprHeadAtt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExprTail()
  {
    return exprTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprTail(String newExprTail)
  {
    String oldExprTail = exprTail;
    exprTail = newExprTail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL, oldExprTail, exprTail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExprTailAtt()
  {
    return exprTailAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprTailAtt(Expr newExprTailAtt, NotificationChain msgs)
  {
    Expr oldExprTailAtt = exprTailAtt;
    exprTailAtt = newExprTailAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT, oldExprTailAtt, newExprTailAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprTailAtt(Expr newExprTailAtt)
  {
    if (newExprTailAtt != exprTailAtt)
    {
      NotificationChain msgs = null;
      if (exprTailAtt != null)
        msgs = ((InternalEObject)exprTailAtt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT, null, msgs);
      if (newExprTailAtt != null)
        msgs = ((InternalEObject)newExprTailAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT, null, msgs);
      msgs = basicSetExprTailAtt(newExprTailAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT, newExprTailAtt, newExprTailAtt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomSymb()
  {
    return nomSymb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomSymb(String newNomSymb)
  {
    String oldNomSymb = nomSymb;
    nomSymb = newNomSymb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__NOM_SYMB, oldNomSymb, nomSymb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expr> getSymbAtt()
  {
    if (symbAtt == null)
    {
      symbAtt = new EObjectContainmentEList<Expr>(Expr.class, this, WhileCppPackage.EXPR_SIMPLE__SYMB_ATT);
    }
    return symbAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS:
        return basicSetExprCons(null, msgs);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT:
        return basicSetExprHeadAtt(null, msgs);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT:
        return basicSetExprTailAtt(null, msgs);
      case WhileCppPackage.EXPR_SIMPLE__SYMB_ATT:
        return ((InternalEList<?>)getSymbAtt()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WhileCppPackage.EXPR_SIMPLE__NIL:
        return getNil();
      case WhileCppPackage.EXPR_SIMPLE__VARI:
        return getVari();
      case WhileCppPackage.EXPR_SIMPLE__SYMB:
        return getSymb();
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS:
        return getExprCons();
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD:
        return getExprHead();
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT:
        return getExprHeadAtt();
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL:
        return getExprTail();
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT:
        return getExprTailAtt();
      case WhileCppPackage.EXPR_SIMPLE__NOM_SYMB:
        return getNomSymb();
      case WhileCppPackage.EXPR_SIMPLE__SYMB_ATT:
        return getSymbAtt();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WhileCppPackage.EXPR_SIMPLE__NIL:
        setNil((String)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__VARI:
        setVari((String)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__SYMB:
        setSymb((String)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS:
        setExprCons((Cons)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD:
        setExprHead((String)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT:
        setExprHeadAtt((Expr)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL:
        setExprTail((String)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT:
        setExprTailAtt((Expr)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__NOM_SYMB:
        setNomSymb((String)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__SYMB_ATT:
        getSymbAtt().clear();
        getSymbAtt().addAll((Collection<? extends Expr>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WhileCppPackage.EXPR_SIMPLE__NIL:
        setNil(NIL_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_SIMPLE__VARI:
        setVari(VARI_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_SIMPLE__SYMB:
        setSymb(SYMB_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS:
        setExprCons((Cons)null);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD:
        setExprHead(EXPR_HEAD_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT:
        setExprHeadAtt((Expr)null);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL:
        setExprTail(EXPR_TAIL_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT:
        setExprTailAtt((Expr)null);
        return;
      case WhileCppPackage.EXPR_SIMPLE__NOM_SYMB:
        setNomSymb(NOM_SYMB_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_SIMPLE__SYMB_ATT:
        getSymbAtt().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WhileCppPackage.EXPR_SIMPLE__NIL:
        return NIL_EDEFAULT == null ? nil != null : !NIL_EDEFAULT.equals(nil);
      case WhileCppPackage.EXPR_SIMPLE__VARI:
        return VARI_EDEFAULT == null ? vari != null : !VARI_EDEFAULT.equals(vari);
      case WhileCppPackage.EXPR_SIMPLE__SYMB:
        return SYMB_EDEFAULT == null ? symb != null : !SYMB_EDEFAULT.equals(symb);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS:
        return exprCons != null;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD:
        return EXPR_HEAD_EDEFAULT == null ? exprHead != null : !EXPR_HEAD_EDEFAULT.equals(exprHead);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT:
        return exprHeadAtt != null;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL:
        return EXPR_TAIL_EDEFAULT == null ? exprTail != null : !EXPR_TAIL_EDEFAULT.equals(exprTail);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT:
        return exprTailAtt != null;
      case WhileCppPackage.EXPR_SIMPLE__NOM_SYMB:
        return NOM_SYMB_EDEFAULT == null ? nomSymb != null : !NOM_SYMB_EDEFAULT.equals(nomSymb);
      case WhileCppPackage.EXPR_SIMPLE__SYMB_ATT:
        return symbAtt != null && !symbAtt.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nil: ");
    result.append(nil);
    result.append(", vari: ");
    result.append(vari);
    result.append(", symb: ");
    result.append(symb);
    result.append(", exprHead: ");
    result.append(exprHead);
    result.append(", exprTail: ");
    result.append(exprTail);
    result.append(", nomSymb: ");
    result.append(nomSymb);
    result.append(')');
    return result.toString();
  }

} //ExprSimpleImpl
