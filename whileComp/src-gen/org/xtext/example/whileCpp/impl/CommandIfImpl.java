/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.whileCpp.CommandIf;
import org.xtext.example.whileCpp.Commands;
import org.xtext.example.whileCpp.Expr;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandIfImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandIfImpl#getCmdsThen <em>Cmds Then</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandIfImpl#getCmdsElse <em>Cmds Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandIfImpl extends MinimalEObjectImpl.Container implements CommandIf
{
  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected Expr cond;

  /**
   * The cached value of the '{@link #getCmdsThen() <em>Cmds Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdsThen()
   * @generated
   * @ordered
   */
  protected Commands cmdsThen;

  /**
   * The cached value of the '{@link #getCmdsElse() <em>Cmds Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdsElse()
   * @generated
   * @ordered
   */
  protected Commands cmdsElse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandIfImpl()
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
    return WhileCppPackage.Literals.COMMAND_IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(Expr newCond, NotificationChain msgs)
  {
    Expr oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_IF__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(Expr newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_IF__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_IF__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_IF__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCmdsThen()
  {
    return cmdsThen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmdsThen(Commands newCmdsThen, NotificationChain msgs)
  {
    Commands oldCmdsThen = cmdsThen;
    cmdsThen = newCmdsThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_IF__CMDS_THEN, oldCmdsThen, newCmdsThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmdsThen(Commands newCmdsThen)
  {
    if (newCmdsThen != cmdsThen)
    {
      NotificationChain msgs = null;
      if (cmdsThen != null)
        msgs = ((InternalEObject)cmdsThen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_IF__CMDS_THEN, null, msgs);
      if (newCmdsThen != null)
        msgs = ((InternalEObject)newCmdsThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_IF__CMDS_THEN, null, msgs);
      msgs = basicSetCmdsThen(newCmdsThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_IF__CMDS_THEN, newCmdsThen, newCmdsThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCmdsElse()
  {
    return cmdsElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmdsElse(Commands newCmdsElse, NotificationChain msgs)
  {
    Commands oldCmdsElse = cmdsElse;
    cmdsElse = newCmdsElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_IF__CMDS_ELSE, oldCmdsElse, newCmdsElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmdsElse(Commands newCmdsElse)
  {
    if (newCmdsElse != cmdsElse)
    {
      NotificationChain msgs = null;
      if (cmdsElse != null)
        msgs = ((InternalEObject)cmdsElse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_IF__CMDS_ELSE, null, msgs);
      if (newCmdsElse != null)
        msgs = ((InternalEObject)newCmdsElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_IF__CMDS_ELSE, null, msgs);
      msgs = basicSetCmdsElse(newCmdsElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_IF__CMDS_ELSE, newCmdsElse, newCmdsElse));
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
      case WhileCppPackage.COMMAND_IF__COND:
        return basicSetCond(null, msgs);
      case WhileCppPackage.COMMAND_IF__CMDS_THEN:
        return basicSetCmdsThen(null, msgs);
      case WhileCppPackage.COMMAND_IF__CMDS_ELSE:
        return basicSetCmdsElse(null, msgs);
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
      case WhileCppPackage.COMMAND_IF__COND:
        return getCond();
      case WhileCppPackage.COMMAND_IF__CMDS_THEN:
        return getCmdsThen();
      case WhileCppPackage.COMMAND_IF__CMDS_ELSE:
        return getCmdsElse();
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
      case WhileCppPackage.COMMAND_IF__COND:
        setCond((Expr)newValue);
        return;
      case WhileCppPackage.COMMAND_IF__CMDS_THEN:
        setCmdsThen((Commands)newValue);
        return;
      case WhileCppPackage.COMMAND_IF__CMDS_ELSE:
        setCmdsElse((Commands)newValue);
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
      case WhileCppPackage.COMMAND_IF__COND:
        setCond((Expr)null);
        return;
      case WhileCppPackage.COMMAND_IF__CMDS_THEN:
        setCmdsThen((Commands)null);
        return;
      case WhileCppPackage.COMMAND_IF__CMDS_ELSE:
        setCmdsElse((Commands)null);
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
      case WhileCppPackage.COMMAND_IF__COND:
        return cond != null;
      case WhileCppPackage.COMMAND_IF__CMDS_THEN:
        return cmdsThen != null;
      case WhileCppPackage.COMMAND_IF__CMDS_ELSE:
        return cmdsElse != null;
    }
    return super.eIsSet(featureID);
  }

} //CommandIfImpl
