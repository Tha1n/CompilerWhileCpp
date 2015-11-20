/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.whileCpp.CommandForEach;
import org.xtext.example.whileCpp.Commands;
import org.xtext.example.whileCpp.Expr;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandForEachImpl#getElem <em>Elem</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandForEachImpl#getEnsemb <em>Ensemb</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.CommandForEachImpl#getCmds <em>Cmds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandForEachImpl extends MinimalEObjectImpl.Container implements CommandForEach
{
  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected Expr elem;

  /**
   * The cached value of the '{@link #getEnsemb() <em>Ensemb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnsemb()
   * @generated
   * @ordered
   */
  protected Expr ensemb;

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
  protected CommandForEachImpl()
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
    return WhileCppPackage.Literals.COMMAND_FOR_EACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getElem()
  {
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElem(Expr newElem, NotificationChain msgs)
  {
    Expr oldElem = elem;
    elem = newElem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_FOR_EACH__ELEM, oldElem, newElem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElem(Expr newElem)
  {
    if (newElem != elem)
    {
      NotificationChain msgs = null;
      if (elem != null)
        msgs = ((InternalEObject)elem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_FOR_EACH__ELEM, null, msgs);
      if (newElem != null)
        msgs = ((InternalEObject)newElem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_FOR_EACH__ELEM, null, msgs);
      msgs = basicSetElem(newElem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_FOR_EACH__ELEM, newElem, newElem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getEnsemb()
  {
    return ensemb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnsemb(Expr newEnsemb, NotificationChain msgs)
  {
    Expr oldEnsemb = ensemb;
    ensemb = newEnsemb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_FOR_EACH__ENSEMB, oldEnsemb, newEnsemb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnsemb(Expr newEnsemb)
  {
    if (newEnsemb != ensemb)
    {
      NotificationChain msgs = null;
      if (ensemb != null)
        msgs = ((InternalEObject)ensemb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_FOR_EACH__ENSEMB, null, msgs);
      if (newEnsemb != null)
        msgs = ((InternalEObject)newEnsemb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_FOR_EACH__ENSEMB, null, msgs);
      msgs = basicSetEnsemb(newEnsemb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_FOR_EACH__ENSEMB, newEnsemb, newEnsemb));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_FOR_EACH__CMDS, oldCmds, newCmds);
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
        msgs = ((InternalEObject)cmds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_FOR_EACH__CMDS, null, msgs);
      if (newCmds != null)
        msgs = ((InternalEObject)newCmds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.COMMAND_FOR_EACH__CMDS, null, msgs);
      msgs = basicSetCmds(newCmds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.COMMAND_FOR_EACH__CMDS, newCmds, newCmds));
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
      case WhileCppPackage.COMMAND_FOR_EACH__ELEM:
        return basicSetElem(null, msgs);
      case WhileCppPackage.COMMAND_FOR_EACH__ENSEMB:
        return basicSetEnsemb(null, msgs);
      case WhileCppPackage.COMMAND_FOR_EACH__CMDS:
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
      case WhileCppPackage.COMMAND_FOR_EACH__ELEM:
        return getElem();
      case WhileCppPackage.COMMAND_FOR_EACH__ENSEMB:
        return getEnsemb();
      case WhileCppPackage.COMMAND_FOR_EACH__CMDS:
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
      case WhileCppPackage.COMMAND_FOR_EACH__ELEM:
        setElem((Expr)newValue);
        return;
      case WhileCppPackage.COMMAND_FOR_EACH__ENSEMB:
        setEnsemb((Expr)newValue);
        return;
      case WhileCppPackage.COMMAND_FOR_EACH__CMDS:
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
      case WhileCppPackage.COMMAND_FOR_EACH__ELEM:
        setElem((Expr)null);
        return;
      case WhileCppPackage.COMMAND_FOR_EACH__ENSEMB:
        setEnsemb((Expr)null);
        return;
      case WhileCppPackage.COMMAND_FOR_EACH__CMDS:
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
      case WhileCppPackage.COMMAND_FOR_EACH__ELEM:
        return elem != null;
      case WhileCppPackage.COMMAND_FOR_EACH__ENSEMB:
        return ensemb != null;
      case WhileCppPackage.COMMAND_FOR_EACH__CMDS:
        return cmds != null;
    }
    return super.eIsSet(featureID);
  }

} //CommandForEachImpl
