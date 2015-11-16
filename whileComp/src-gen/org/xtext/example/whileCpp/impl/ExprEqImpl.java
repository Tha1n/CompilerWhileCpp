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
import org.xtext.example.whileCpp.ExprEq;
import org.xtext.example.whileCpp.ExprSimple;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprEqImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprEqImpl#getExprSim1 <em>Expr Sim1</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.ExprEqImpl#getExprSim2 <em>Expr Sim2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprEqImpl extends MinimalEObjectImpl.Container implements ExprEq
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expr expr;

  /**
   * The cached value of the '{@link #getExprSim1() <em>Expr Sim1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprSim1()
   * @generated
   * @ordered
   */
  protected ExprSimple exprSim1;

  /**
   * The cached value of the '{@link #getExprSim2() <em>Expr Sim2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprSim2()
   * @generated
   * @ordered
   */
  protected ExprSimple exprSim2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprEqImpl()
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
    return WhileCppPackage.Literals.EXPR_EQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expr newExpr, NotificationChain msgs)
  {
    Expr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_EQ__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_EQ__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_EQ__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_EQ__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExprSim1()
  {
    return exprSim1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprSim1(ExprSimple newExprSim1, NotificationChain msgs)
  {
    ExprSimple oldExprSim1 = exprSim1;
    exprSim1 = newExprSim1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_EQ__EXPR_SIM1, oldExprSim1, newExprSim1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprSim1(ExprSimple newExprSim1)
  {
    if (newExprSim1 != exprSim1)
    {
      NotificationChain msgs = null;
      if (exprSim1 != null)
        msgs = ((InternalEObject)exprSim1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_EQ__EXPR_SIM1, null, msgs);
      if (newExprSim1 != null)
        msgs = ((InternalEObject)newExprSim1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_EQ__EXPR_SIM1, null, msgs);
      msgs = basicSetExprSim1(newExprSim1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_EQ__EXPR_SIM1, newExprSim1, newExprSim1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple getExprSim2()
  {
    return exprSim2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprSim2(ExprSimple newExprSim2, NotificationChain msgs)
  {
    ExprSimple oldExprSim2 = exprSim2;
    exprSim2 = newExprSim2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_EQ__EXPR_SIM2, oldExprSim2, newExprSim2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprSim2(ExprSimple newExprSim2)
  {
    if (newExprSim2 != exprSim2)
    {
      NotificationChain msgs = null;
      if (exprSim2 != null)
        msgs = ((InternalEObject)exprSim2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_EQ__EXPR_SIM2, null, msgs);
      if (newExprSim2 != null)
        msgs = ((InternalEObject)newExprSim2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.EXPR_EQ__EXPR_SIM2, null, msgs);
      msgs = basicSetExprSim2(newExprSim2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.EXPR_EQ__EXPR_SIM2, newExprSim2, newExprSim2));
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
      case WhileCppPackage.EXPR_EQ__EXPR:
        return basicSetExpr(null, msgs);
      case WhileCppPackage.EXPR_EQ__EXPR_SIM1:
        return basicSetExprSim1(null, msgs);
      case WhileCppPackage.EXPR_EQ__EXPR_SIM2:
        return basicSetExprSim2(null, msgs);
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
      case WhileCppPackage.EXPR_EQ__EXPR:
        return getExpr();
      case WhileCppPackage.EXPR_EQ__EXPR_SIM1:
        return getExprSim1();
      case WhileCppPackage.EXPR_EQ__EXPR_SIM2:
        return getExprSim2();
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
      case WhileCppPackage.EXPR_EQ__EXPR:
        setExpr((Expr)newValue);
        return;
      case WhileCppPackage.EXPR_EQ__EXPR_SIM1:
        setExprSim1((ExprSimple)newValue);
        return;
      case WhileCppPackage.EXPR_EQ__EXPR_SIM2:
        setExprSim2((ExprSimple)newValue);
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
      case WhileCppPackage.EXPR_EQ__EXPR:
        setExpr((Expr)null);
        return;
      case WhileCppPackage.EXPR_EQ__EXPR_SIM1:
        setExprSim1((ExprSimple)null);
        return;
      case WhileCppPackage.EXPR_EQ__EXPR_SIM2:
        setExprSim2((ExprSimple)null);
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
      case WhileCppPackage.EXPR_EQ__EXPR:
        return expr != null;
      case WhileCppPackage.EXPR_EQ__EXPR_SIM1:
        return exprSim1 != null;
      case WhileCppPackage.EXPR_EQ__EXPR_SIM2:
        return exprSim2 != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprEqImpl
