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
import org.xtext.example.whileCpp.ExprAnd;
import org.xtext.example.whileCpp.ExprSimple;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprImpl#getExprSimp <em>Expr Simp</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprImpl#getExprAnd <em>Expr And</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The cached value of the '{@link #getExprSimp() <em>Expr Simp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprSimp()
   * @generated
   * @ordered
   */
  protected ExprSimple exprSimp;

  /**
   * The cached value of the '{@link #getExprAnd() <em>Expr And</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprAnd()
   * @generated
   * @ordered
   */
  protected ExprAnd exprAnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return WhileCppPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExprSimp()
  {
    return exprSimp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprSimp(ExprSimple newExprSimp, NotificationChain msgs)
  {
    ExprSimple oldExprSimp = exprSimp;
    exprSimp = newExprSimp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR__EXPR_SIMP, oldExprSimp, newExprSimp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprSimp(ExprSimple newExprSimp)
  {
    if (newExprSimp != exprSimp)
    {
      NotificationChain msgs = null;
      if (exprSimp != null)
        msgs = ((InternalEObject)exprSimp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR__EXPR_SIMP, null, msgs);
      if (newExprSimp != null)
        msgs = ((InternalEObject)newExprSimp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR__EXPR_SIMP, null, msgs);
      msgs = basicSetExprSimp(newExprSimp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR__EXPR_SIMP, newExprSimp, newExprSimp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd getExprAnd()
  {
    return exprAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprAnd(ExprAnd newExprAnd, NotificationChain msgs)
  {
    ExprAnd oldExprAnd = exprAnd;
    exprAnd = newExprAnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR__EXPR_AND, oldExprAnd, newExprAnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprAnd(ExprAnd newExprAnd)
  {
    if (newExprAnd != exprAnd)
    {
      NotificationChain msgs = null;
      if (exprAnd != null)
        msgs = ((InternalEObject)exprAnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR__EXPR_AND, null, msgs);
      if (newExprAnd != null)
        msgs = ((InternalEObject)newExprAnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR__EXPR_AND, null, msgs);
      msgs = basicSetExprAnd(newExprAnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR__EXPR_AND, newExprAnd, newExprAnd));
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
      case WhileCppPackage.EXPR__EXPR_SIMP:
        return basicSetExprSimp(null, msgs);
      case WhileCppPackage.EXPR__EXPR_AND:
        return basicSetExprAnd(null, msgs);
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
      case WhileCppPackage.EXPR__EXPR_SIMP:
        return getExprSimp();
      case WhileCppPackage.EXPR__EXPR_AND:
        return getExprAnd();
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
      case WhileCppPackage.EXPR__EXPR_SIMP:
        setExprSimp((ExprSimple)newValue);
        return;
      case WhileCppPackage.EXPR__EXPR_AND:
        setExprAnd((ExprAnd)newValue);
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
      case WhileCppPackage.EXPR__EXPR_SIMP:
        setExprSimp((ExprSimple)null);
        return;
      case WhileCppPackage.EXPR__EXPR_AND:
        setExprAnd((ExprAnd)null);
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
      case WhileCppPackage.EXPR__EXPR_SIMP:
        return exprSimp != null;
      case WhileCppPackage.EXPR__EXPR_AND:
        return exprAnd != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
