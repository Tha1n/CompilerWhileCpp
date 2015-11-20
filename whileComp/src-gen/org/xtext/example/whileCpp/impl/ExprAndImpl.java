/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.whileCpp.ExprAnd;
import org.xtext.example.whileCpp.ExprOr;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprAndImpl#getExprOr <em>Expr Or</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprAndImpl#getExprAnd <em>Expr And</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprAndImpl#getExprAndAtt <em>Expr And Att</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprAndImpl extends MinimalEObjectImpl.Container implements ExprAnd
{
  /**
   * The cached value of the '{@link #getExprOr() <em>Expr Or</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprOr()
   * @generated
   * @ordered
   */
  protected ExprOr exprOr;

  /**
   * The default value of the '{@link #getExprAnd() <em>Expr And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprAnd()
   * @generated
   * @ordered
   */
  protected static final String EXPR_AND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExprAnd() <em>Expr And</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprAnd()
   * @generated
   * @ordered
   */
  protected String exprAnd = EXPR_AND_EDEFAULT;

  /**
   * The cached value of the '{@link #getExprAndAtt() <em>Expr And Att</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprAndAtt()
   * @generated
   * @ordered
   */
  protected ExprAnd exprAndAtt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprAndImpl()
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
    return WhileCppPackage.Literals.EXPR_AND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr getExprOr()
  {
    return exprOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprOr(ExprOr newExprOr, NotificationChain msgs)
  {
    ExprOr oldExprOr = exprOr;
    exprOr = newExprOr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_AND__EXPR_OR, oldExprOr, newExprOr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprOr(ExprOr newExprOr)
  {
    if (newExprOr != exprOr)
    {
      NotificationChain msgs = null;
      if (exprOr != null)
        msgs = ((InternalEObject)exprOr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_AND__EXPR_OR, null, msgs);
      if (newExprOr != null)
        msgs = ((InternalEObject)newExprOr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_AND__EXPR_OR, null, msgs);
      msgs = basicSetExprOr(newExprOr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_AND__EXPR_OR, newExprOr, newExprOr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExprAnd()
  {
    return exprAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprAnd(String newExprAnd)
  {
    String oldExprAnd = exprAnd;
    exprAnd = newExprAnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_AND__EXPR_AND, oldExprAnd, exprAnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd getExprAndAtt()
  {
    return exprAndAtt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprAndAtt(ExprAnd newExprAndAtt, NotificationChain msgs)
  {
    ExprAnd oldExprAndAtt = exprAndAtt;
    exprAndAtt = newExprAndAtt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_AND__EXPR_AND_ATT, oldExprAndAtt, newExprAndAtt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprAndAtt(ExprAnd newExprAndAtt)
  {
    if (newExprAndAtt != exprAndAtt)
    {
      NotificationChain msgs = null;
      if (exprAndAtt != null)
        msgs = ((InternalEObject)exprAndAtt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_AND__EXPR_AND_ATT, null, msgs);
      if (newExprAndAtt != null)
        msgs = ((InternalEObject)newExprAndAtt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_AND__EXPR_AND_ATT, null, msgs);
      msgs = basicSetExprAndAtt(newExprAndAtt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_AND__EXPR_AND_ATT, newExprAndAtt, newExprAndAtt));
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
      case WhileCppPackage.EXPR_AND__EXPR_OR:
        return basicSetExprOr(null, msgs);
      case WhileCppPackage.EXPR_AND__EXPR_AND_ATT:
        return basicSetExprAndAtt(null, msgs);
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
      case WhileCppPackage.EXPR_AND__EXPR_OR:
        return getExprOr();
      case WhileCppPackage.EXPR_AND__EXPR_AND:
        return getExprAnd();
      case WhileCppPackage.EXPR_AND__EXPR_AND_ATT:
        return getExprAndAtt();
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
      case WhileCppPackage.EXPR_AND__EXPR_OR:
        setExprOr((ExprOr)newValue);
        return;
      case WhileCppPackage.EXPR_AND__EXPR_AND:
        setExprAnd((String)newValue);
        return;
      case WhileCppPackage.EXPR_AND__EXPR_AND_ATT:
        setExprAndAtt((ExprAnd)newValue);
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
      case WhileCppPackage.EXPR_AND__EXPR_OR:
        setExprOr((ExprOr)null);
        return;
      case WhileCppPackage.EXPR_AND__EXPR_AND:
        setExprAnd(EXPR_AND_EDEFAULT);
        return;
      case WhileCppPackage.EXPR_AND__EXPR_AND_ATT:
        setExprAndAtt((ExprAnd)null);
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
      case WhileCppPackage.EXPR_AND__EXPR_OR:
        return exprOr != null;
      case WhileCppPackage.EXPR_AND__EXPR_AND:
        return EXPR_AND_EDEFAULT == null ? exprAnd != null : !EXPR_AND_EDEFAULT.equals(exprAnd);
      case WhileCppPackage.EXPR_AND__EXPR_AND_ATT:
        return exprAndAtt != null;
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
    result.append(" (exprAnd: ");
    result.append(exprAnd);
    result.append(')');
    return result.toString();
  }

} //ExprAndImpl
