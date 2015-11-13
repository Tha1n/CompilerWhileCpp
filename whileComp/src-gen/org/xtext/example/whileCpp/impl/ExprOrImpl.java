/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.whileCpp.ExprNot;
import org.xtext.example.whileCpp.ExprOr;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprOrImpl#getExprNot <em>Expr Not</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprOrImpl#getExprOr <em>Expr Or</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprOrImpl#getExprOrAtt <em>Expr Or Att</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprOrImpl extends MinimalEObjectImpl.Container implements ExprOr
{
  /**
   * The cached value of the '{@link #getExprNot() <em>Expr Not</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprNot()
   * @generated
   * @ordered
   */
  protected ExprNot exprNot;

  /**
   * The default value of the '{@link #getExprOr() <em>Expr Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprOr()
   * @generated
   * @ordered
   */
  protected static final String EXPR_OR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExprOr() <em>Expr Or</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprOr()
   * @generated
   * @ordered
   */
  protected String exprOr = EXPR_OR_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprOrAtt() <em>Expr Or Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprOrAtt()
   * @generated
   * @ordered
   */
  protected ExprOr exprOrAtt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprOrImpl()
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
    return WhileCppPackage.Literals.EXPR_OR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNot getExprNot()
  {
    return exprNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprNot(ExprNot newExprNot, NotificationChain msgs)
  {
    ExprNot oldExprNot = exprNot;
    exprNot = newExprNot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_OR__EXPR_NOT, oldExprNot, newExprNot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprNot(ExprNot newExprNot)
  {
    if (newExprNot != exprNot)
    {
      NotificationChain msgs = null;
      if (exprNot != null)
        msgs = ((InternalEObject)exprNot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_OR__EXPR_NOT, null, msgs);
      if (newExprNot != null)
        msgs = ((InternalEObject)newExprNot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_OR__EXPR_NOT, null, msgs);
      msgs = basicSetExprNot(newExprNot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_OR__EXPR_NOT, newExprNot, newExprNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExprOr()
  {
    return exprOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprOr(String newExprOr)
  {
    String oldExprOr = exprOr;
    exprOr = newExprOr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_OR__EXPR_OR, oldExprOr, exprOr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr getExprOrAtt()
  {
    return exprOrAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprOrAtt(ExprOr newExprOrAtt, NotificationChain msgs)
  {
    ExprOr oldExprOrAtt = exprOrAtt;
    exprOrAtt = newExprOrAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_OR__EXPR_OR_ATT, oldExprOrAtt, newExprOrAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprOrAtt(ExprOr newExprOrAtt)
  {
    if (newExprOrAtt != exprOrAtt)
    {
      NotificationChain msgs = null;
      if (exprOrAtt != null)
        msgs = ((InternalEObject)exprOrAtt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_OR__EXPR_OR_ATT, null, msgs);
      if (newExprOrAtt != null)
        msgs = ((InternalEObject)newExprOrAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_OR__EXPR_OR_ATT, null, msgs);
      msgs = basicSetExprOrAtt(newExprOrAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_OR__EXPR_OR_ATT, newExprOrAtt, newExprOrAtt));
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
      case WhileCppPackage.EXPR_OR__EXPR_NOT:
        return basicSetExprNot(null, msgs);
      case WhileCppPackage.EXPR_OR__EXPR_OR_ATT:
        return basicSetExprOrAtt(null, msgs);
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
      case WhileCppPackage.EXPR_OR__EXPR_NOT:
        return getExprNot();
      case WhileCppPackage.EXPR_OR__EXPR_OR:
        return getExprOr();
      case WhileCppPackage.EXPR_OR__EXPR_OR_ATT:
        return getExprOrAtt();
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
      case WhileCppPackage.EXPR_OR__EXPR_NOT:
        setExprNot((ExprNot)newValue);
        return;
      case WhileCppPackage.EXPR_OR__EXPR_OR:
        setExprOr((String)newValue);
        return;
      case WhileCppPackage.EXPR_OR__EXPR_OR_ATT:
        setExprOrAtt((ExprOr)newValue);
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
      case WhileCppPackage.EXPR_OR__EXPR_NOT:
        setExprNot((ExprNot)null);
        return;
      case WhileCppPackage.EXPR_OR__EXPR_OR:
        setExprOr(EXPR_OR_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_OR__EXPR_OR_ATT:
        setExprOrAtt((ExprOr)null);
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
      case WhileCppPackage.EXPR_OR__EXPR_NOT:
        return exprNot != null;
      case WhileCppPackage.EXPR_OR__EXPR_OR:
        return EXPR_OR_EDEFAULT == null ? exprOr != null : !EXPR_OR_EDEFAULT.equals(exprOr);
      case WhileCppPackage.EXPR_OR__EXPR_OR_ATT:
        return exprOrAtt != null;
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
    result.append(" (exprOr: ");
    result.append(exprOr);
    result.append(')');
    return result.toString();
  }

} //ExprOrImpl
