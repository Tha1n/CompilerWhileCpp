/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.whileCpp.Command;
import org.xtext.example.whileCpp.CommandForEach;
import org.xtext.example.whileCpp.CommandIf;
import org.xtext.example.whileCpp.CommandWhile;
import org.xtext.example.whileCpp.Exprs;
import org.xtext.example.whileCpp.Vars;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandImpl#getNop <em>Nop</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandImpl#getExprs <em>Exprs</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandImpl#getCmdWhile <em>Cmd While</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandImpl#getCmdIf <em>Cmd If</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandImpl#getCmdForEach <em>Cmd For Each</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
{
  /**
   * The default value of the '{@link #getNop() <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNop()
   * @generated
   * @ordered
   */
  protected static final String NOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNop() <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNop()
   * @generated
   * @ordered
   */
  protected String nop = NOP_EDEFAULT;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected Vars vars;

  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected Exprs exprs;

  /**
   * The cached value of the '{@link #getCmdWhile() <em>Cmd While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdWhile()
   * @generated
   * @ordered
   */
  protected CommandWhile cmdWhile;

  /**
   * The cached value of the '{@link #getCmdIf() <em>Cmd If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdIf()
   * @generated
   * @ordered
   */
  protected CommandIf cmdIf;

  /**
   * The cached value of the '{@link #getCmdForEach() <em>Cmd For Each</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdForEach()
   * @generated
   * @ordered
   */
  protected CommandForEach cmdForEach;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
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
    return WhileCppPackage.Literals.COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNop()
  {
    return nop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNop(String newNop)
  {
    String oldNop = nop;
    nop = newNop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__NOP, oldNop, nop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vars getVars()
  {
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVars(Vars newVars, NotificationChain msgs)
  {
    Vars oldVars = vars;
    vars = newVars;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__VARS, oldVars, newVars);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVars(Vars newVars)
  {
    if (newVars != vars)
    {
      NotificationChain msgs = null;
      if (vars != null)
        msgs = ((InternalEObject)vars).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__VARS, null, msgs);
      if (newVars != null)
        msgs = ((InternalEObject)newVars).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__VARS, null, msgs);
      msgs = basicSetVars(newVars, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__VARS, newVars, newVars));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprs getExprs()
  {
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprs(Exprs newExprs, NotificationChain msgs)
  {
    Exprs oldExprs = exprs;
    exprs = newExprs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__EXPRS, oldExprs, newExprs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprs(Exprs newExprs)
  {
    if (newExprs != exprs)
    {
      NotificationChain msgs = null;
      if (exprs != null)
        msgs = ((InternalEObject)exprs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__EXPRS, null, msgs);
      if (newExprs != null)
        msgs = ((InternalEObject)newExprs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__EXPRS, null, msgs);
      msgs = basicSetExprs(newExprs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__EXPRS, newExprs, newExprs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandWhile getCmdWhile()
  {
    return cmdWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmdWhile(CommandWhile newCmdWhile, NotificationChain msgs)
  {
    CommandWhile oldCmdWhile = cmdWhile;
    cmdWhile = newCmdWhile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__CMD_WHILE, oldCmdWhile, newCmdWhile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmdWhile(CommandWhile newCmdWhile)
  {
    if (newCmdWhile != cmdWhile)
    {
      NotificationChain msgs = null;
      if (cmdWhile != null)
        msgs = ((InternalEObject)cmdWhile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__CMD_WHILE, null, msgs);
      if (newCmdWhile != null)
        msgs = ((InternalEObject)newCmdWhile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__CMD_WHILE, null, msgs);
      msgs = basicSetCmdWhile(newCmdWhile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__CMD_WHILE, newCmdWhile, newCmdWhile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandIf getCmdIf()
  {
    return cmdIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmdIf(CommandIf newCmdIf, NotificationChain msgs)
  {
    CommandIf oldCmdIf = cmdIf;
    cmdIf = newCmdIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__CMD_IF, oldCmdIf, newCmdIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmdIf(CommandIf newCmdIf)
  {
    if (newCmdIf != cmdIf)
    {
      NotificationChain msgs = null;
      if (cmdIf != null)
        msgs = ((InternalEObject)cmdIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__CMD_IF, null, msgs);
      if (newCmdIf != null)
        msgs = ((InternalEObject)newCmdIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__CMD_IF, null, msgs);
      msgs = basicSetCmdIf(newCmdIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__CMD_IF, newCmdIf, newCmdIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandForEach getCmdForEach()
  {
    return cmdForEach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmdForEach(CommandForEach newCmdForEach, NotificationChain msgs)
  {
    CommandForEach oldCmdForEach = cmdForEach;
    cmdForEach = newCmdForEach;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__CMD_FOR_EACH, oldCmdForEach, newCmdForEach);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmdForEach(CommandForEach newCmdForEach)
  {
    if (newCmdForEach != cmdForEach)
    {
      NotificationChain msgs = null;
      if (cmdForEach != null)
        msgs = ((InternalEObject)cmdForEach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__CMD_FOR_EACH, null, msgs);
      if (newCmdForEach != null)
        msgs = ((InternalEObject)newCmdForEach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND__CMD_FOR_EACH, null, msgs);
      msgs = basicSetCmdForEach(newCmdForEach, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND__CMD_FOR_EACH, newCmdForEach, newCmdForEach));
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
      case WhileCppPackage.COMMAND__VARS:
        return basicSetVars(null, msgs);
      case WhileCppPackage.COMMAND__EXPRS:
        return basicSetExprs(null, msgs);
      case WhileCppPackage.COMMAND__CMD_WHILE:
        return basicSetCmdWhile(null, msgs);
      case WhileCppPackage.COMMAND__CMD_IF:
        return basicSetCmdIf(null, msgs);
      case WhileCppPackage.COMMAND__CMD_FOR_EACH:
        return basicSetCmdForEach(null, msgs);
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
      case WhileCppPackage.COMMAND__NOP:
        return getNop();
      case WhileCppPackage.COMMAND__VARS:
        return getVars();
      case WhileCppPackage.COMMAND__EXPRS:
        return getExprs();
      case WhileCppPackage.COMMAND__CMD_WHILE:
        return getCmdWhile();
      case WhileCppPackage.COMMAND__CMD_IF:
        return getCmdIf();
      case WhileCppPackage.COMMAND__CMD_FOR_EACH:
        return getCmdForEach();
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
      case WhileCppPackage.COMMAND__NOP:
        setNop((String)newValue);
        return;
      case WhileCppPackage.COMMAND__VARS:
        setVars((Vars)newValue);
        return;
      case WhileCppPackage.COMMAND__EXPRS:
        setExprs((Exprs)newValue);
        return;
      case WhileCppPackage.COMMAND__CMD_WHILE:
        setCmdWhile((CommandWhile)newValue);
        return;
      case WhileCppPackage.COMMAND__CMD_IF:
        setCmdIf((CommandIf)newValue);
        return;
      case WhileCppPackage.COMMAND__CMD_FOR_EACH:
        setCmdForEach((CommandForEach)newValue);
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
      case WhileCppPackage.COMMAND__NOP:
        setNop(NOP_EDEFAULT);
        return;
      case WhileCppPackage.COMMAND__VARS:
        setVars((Vars)null);
        return;
      case WhileCppPackage.COMMAND__EXPRS:
        setExprs((Exprs)null);
        return;
      case WhileCppPackage.COMMAND__CMD_WHILE:
        setCmdWhile((CommandWhile)null);
        return;
      case WhileCppPackage.COMMAND__CMD_IF:
        setCmdIf((CommandIf)null);
        return;
      case WhileCppPackage.COMMAND__CMD_FOR_EACH:
        setCmdForEach((CommandForEach)null);
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
      case WhileCppPackage.COMMAND__NOP:
        return NOP_EDEFAULT == null ? nop != null : !NOP_EDEFAULT.equals(nop);
      case WhileCppPackage.COMMAND__VARS:
        return vars != null;
      case WhileCppPackage.COMMAND__EXPRS:
        return exprs != null;
      case WhileCppPackage.COMMAND__CMD_WHILE:
        return cmdWhile != null;
      case WhileCppPackage.COMMAND__CMD_IF:
        return cmdIf != null;
      case WhileCppPackage.COMMAND__CMD_FOR_EACH:
        return cmdForEach != null;
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
    result.append(" (nop: ");
    result.append(nop);
    result.append(')');
    return result.toString();
  }

} //CommandImpl
