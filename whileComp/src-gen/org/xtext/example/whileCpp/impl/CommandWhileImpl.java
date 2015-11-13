/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.whileCpp.CommandWhile;
import org.xtext.example.whileCpp.Commands;
import org.xtext.example.whileCpp.Expr;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandWhileImpl#getW <em>W</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandWhileImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandWhileImpl#getCmds <em>Cmds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandWhileImpl extends MinimalEObjectImpl.Container implements CommandWhile
{
  /**
   * The default value of the '{@link #getW() <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected static final String W_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getW() <em>W</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW()
   * @generated
   * @ordered
   */
  protected String w = W_EDEFAULT;

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
   * The cached value of the '{@link #getCmds() <em>Cmds</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmds()
   * @generated
   * @ordered
   */
  protected Commands cmds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandWhileImpl()
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
    return WhileCppPackage.Literals.COMMAND_WHILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getW()
  {
    return w;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW(String newW)
  {
    String oldW = w;
    w = newW;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_WHILE__W, oldW, w));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_WHILE__EXPR, oldExpr, newExpr);
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
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_WHILE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_WHILE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_WHILE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCmds()
  {
    return cmds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmds(Commands newCmds, NotificationChain msgs)
  {
    Commands oldCmds = cmds;
    cmds = newCmds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_WHILE__CMDS, oldCmds, newCmds);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmds(Commands newCmds)
  {
    if (newCmds != cmds)
    {
      NotificationChain msgs = null;
      if (cmds != null)
        msgs = ((InternalEObject)cmds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_WHILE__CMDS, null, msgs);
      if (newCmds != null)
        msgs = ((InternalEObject)newCmds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_WHILE__CMDS, null, msgs);
      msgs = basicSetCmds(newCmds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_WHILE__CMDS, newCmds, newCmds));
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
      case WhileCppPackage.COMMAND_WHILE__EXPR:
        return basicSetExpr(null, msgs);
      case WhileCppPackage.COMMAND_WHILE__CMDS:
        return basicSetCmds(null, msgs);
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
      case WhileCppPackage.COMMAND_WHILE__W:
        return getW();
      case WhileCppPackage.COMMAND_WHILE__EXPR:
        return getExpr();
      case WhileCppPackage.COMMAND_WHILE__CMDS:
        return getCmds();
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
      case WhileCppPackage.COMMAND_WHILE__W:
        setW((String)newValue);
        return;
      case WhileCppPackage.COMMAND_WHILE__EXPR:
        setExpr((Expr)newValue);
        return;
      case WhileCppPackage.COMMAND_WHILE__CMDS:
        setCmds((Commands)newValue);
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
      case WhileCppPackage.COMMAND_WHILE__W:
        setW(W_EDEFAULT);
        return;
      case WhileCppPackage.COMMAND_WHILE__EXPR:
        setExpr((Expr)null);
        return;
      case WhileCppPackage.COMMAND_WHILE__CMDS:
        setCmds((Commands)null);
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
      case WhileCppPackage.COMMAND_WHILE__W:
        return W_EDEFAULT == null ? w != null : !W_EDEFAULT.equals(w);
      case WhileCppPackage.COMMAND_WHILE__EXPR:
        return expr != null;
      case WhileCppPackage.COMMAND_WHILE__CMDS:
        return cmds != null;
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
    result.append(" (w: ");
    result.append(w);
    result.append(')');
    return result.toString();
  }

} //CommandWhileImpl
