/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getExprConsAtt <em>Expr Cons Att</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getExprList <em>Expr List</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprSimpleImpl#getExprListAtt <em>Expr List Att</em>}</li>
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
   * The default value of the '{@link #getExprCons() <em>Expr Cons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprCons()
   * @generated
   * @ordered
   */
  protected static final String EXPR_CONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExprCons() <em>Expr Cons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprCons()
   * @generated
   * @ordered
   */
  protected String exprCons = EXPR_CONS_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprConsAtt() <em>Expr Cons Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprConsAtt()
   * @generated
   * @ordered
   */
  protected Expr exprConsAtt;

  /**
   * The default value of the '{@link #getExprList() <em>Expr List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprList()
   * @generated
   * @ordered
   */
  protected static final String EXPR_LIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExprList() <em>Expr List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprList()
   * @generated
   * @ordered
   */
  protected String exprList = EXPR_LIST_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprListAtt() <em>Expr List Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprListAtt()
   * @generated
   * @ordered
   */
  protected Expr exprListAtt;

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
   * The cached value of the '{@link #getSymbAtt() <em>Symb Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbAtt()
   * @generated
   * @ordered
   */
  protected Expr symbAtt;

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
  public String getExprCons()
  {
    return exprCons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprCons(String newExprCons)
  {
    String oldExprCons = exprCons;
    exprCons = newExprCons;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_CONS, oldExprCons, exprCons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExprConsAtt()
  {
    return exprConsAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprConsAtt(Expr newExprConsAtt, NotificationChain msgs)
  {
    Expr oldExprConsAtt = exprConsAtt;
    exprConsAtt = newExprConsAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT, oldExprConsAtt, newExprConsAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprConsAtt(Expr newExprConsAtt)
  {
    if (newExprConsAtt != exprConsAtt)
    {
      NotificationChain msgs = null;
      if (exprConsAtt != null)
        msgs = ((InternalEObject)exprConsAtt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT, null, msgs);
      if (newExprConsAtt != null)
        msgs = ((InternalEObject)newExprConsAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT, null, msgs);
      msgs = basicSetExprConsAtt(newExprConsAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT, newExprConsAtt, newExprConsAtt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExprList()
  {
    return exprList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprList(String newExprList)
  {
    String oldExprList = exprList;
    exprList = newExprList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_LIST, oldExprList, exprList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExprListAtt()
  {
    return exprListAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprListAtt(Expr newExprListAtt, NotificationChain msgs)
  {
    Expr oldExprListAtt = exprListAtt;
    exprListAtt = newExprListAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT, oldExprListAtt, newExprListAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprListAtt(Expr newExprListAtt)
  {
    if (newExprListAtt != exprListAtt)
    {
      NotificationChain msgs = null;
      if (exprListAtt != null)
        msgs = ((InternalEObject)exprListAtt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT, null, msgs);
      if (newExprListAtt != null)
        msgs = ((InternalEObject)newExprListAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT, null, msgs);
      msgs = basicSetExprListAtt(newExprListAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT, newExprListAtt, newExprListAtt));
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
  public Expr getSymbAtt()
  {
    return symbAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSymbAtt(Expr newSymbAtt, NotificationChain msgs)
  {
    Expr oldSymbAtt = symbAtt;
    symbAtt = newSymbAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__SYMB_ATT, oldSymbAtt, newSymbAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbAtt(Expr newSymbAtt)
  {
    if (newSymbAtt != symbAtt)
    {
      NotificationChain msgs = null;
      if (symbAtt != null)
        msgs = ((InternalEObject)symbAtt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__SYMB_ATT, null, msgs);
      if (newSymbAtt != null)
        msgs = ((InternalEObject)newSymbAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_SIMPLE__SYMB_ATT, null, msgs);
      msgs = basicSetSymbAtt(newSymbAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_SIMPLE__SYMB_ATT, newSymbAtt, newSymbAtt));
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
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT:
        return basicSetExprConsAtt(null, msgs);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT:
        return basicSetExprListAtt(null, msgs);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_HEAD_ATT:
        return basicSetExprHeadAtt(null, msgs);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_TAIL_ATT:
        return basicSetExprTailAtt(null, msgs);
      case WhileCppPackage.EXPR_SIMPLE__SYMB_ATT:
        return basicSetSymbAtt(null, msgs);
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
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT:
        return getExprConsAtt();
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST:
        return getExprList();
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT:
        return getExprListAtt();
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
        setExprCons((String)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT:
        setExprConsAtt((Expr)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST:
        setExprList((String)newValue);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT:
        setExprListAtt((Expr)newValue);
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
        setSymbAtt((Expr)newValue);
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
        setExprCons(EXPR_CONS_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT:
        setExprConsAtt((Expr)null);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST:
        setExprList(EXPR_LIST_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT:
        setExprListAtt((Expr)null);
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
        setSymbAtt((Expr)null);
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
        return EXPR_CONS_EDEFAULT == null ? exprCons != null : !EXPR_CONS_EDEFAULT.equals(exprCons);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_CONS_ATT:
        return exprConsAtt != null;
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST:
        return EXPR_LIST_EDEFAULT == null ? exprList != null : !EXPR_LIST_EDEFAULT.equals(exprList);
      case WhileCppPackage.EXPR_SIMPLE__EXPR_LIST_ATT:
        return exprListAtt != null;
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
        return symbAtt != null;
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
    result.append(", exprCons: ");
    result.append(exprCons);
    result.append(", exprList: ");
    result.append(exprList);
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
