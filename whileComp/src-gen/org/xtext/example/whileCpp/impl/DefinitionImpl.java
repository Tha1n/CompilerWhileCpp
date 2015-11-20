/**
 */
package org.xtext.example.whileCpp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.whileCpp.Commands;
import org.xtext.example.whileCpp.Definition;
import org.xtext.example.whileCpp.Input;
import org.xtext.example.whileCpp.Output;
import org.xtext.example.whileCpp.WhileCppPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.whileCpp.impl.DefinitionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.DefinitionImpl#getCommandes <em>Commandes</em>}</li>
 *   <li>{@link org.xtext.example.whileCpp.impl.DefinitionImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected Input inputs;

  /**
   * The cached value of the '{@link #getCommandes() <em>Commandes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandes()
   * @generated
   * @ordered
   */
  protected Commands commandes;

  /**
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected Output outputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
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
    return WhileCppPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getInputs()
  {
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputs(Input newInputs, NotificationChain msgs)
  {
    Input oldInputs = inputs;
    inputs = newInputs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.DEFINITION__INPUTS, oldInputs, newInputs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputs(Input newInputs)
  {
    if (newInputs != inputs)
    {
      NotificationChain msgs = null;
      if (inputs != null)
        msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.DEFINITION__INPUTS, null, msgs);
      if (newInputs != null)
        msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.DEFINITION__INPUTS, null, msgs);
      msgs = basicSetInputs(newInputs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.DEFINITION__INPUTS, newInputs, newInputs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCommandes()
  {
    return commandes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommandes(Commands newCommandes, NotificationChain msgs)
  {
    Commands oldCommandes = commandes;
    commandes = newCommandes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.DEFINITION__COMMANDES, oldCommandes, newCommandes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommandes(Commands newCommandes)
  {
    if (newCommandes != commandes)
    {
      NotificationChain msgs = null;
      if (commandes != null)
        msgs = ((InternalEObject)commandes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.DEFINITION__COMMANDES, null, msgs);
      if (newCommandes != null)
        msgs = ((InternalEObject)newCommandes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.DEFINITION__COMMANDES, null, msgs);
      msgs = basicSetCommandes(newCommandes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.DEFINITION__COMMANDES, newCommandes, newCommandes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output getOutputs()
  {
    return outputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputs(Output newOutputs, NotificationChain msgs)
  {
    Output oldOutputs = outputs;
    outputs = newOutputs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileCppPackage.DEFINITION__OUTPUTS, oldOutputs, newOutputs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputs(Output newOutputs)
  {
    if (newOutputs != outputs)
    {
      NotificationChain msgs = null;
      if (outputs != null)
        msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.DEFINITION__OUTPUTS, null, msgs);
      if (newOutputs != null)
        msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileCppPackage.DEFINITION__OUTPUTS, null, msgs);
      msgs = basicSetOutputs(newOutputs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileCppPackage.DEFINITION__OUTPUTS, newOutputs, newOutputs));
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
      case WhileCppPackage.DEFINITION__INPUTS:
        return basicSetInputs(null, msgs);
      case WhileCppPackage.DEFINITION__COMMANDES:
        return basicSetCommandes(null, msgs);
      case WhileCppPackage.DEFINITION__OUTPUTS:
        return basicSetOutputs(null, msgs);
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
      case WhileCppPackage.DEFINITION__INPUTS:
        return getInputs();
      case WhileCppPackage.DEFINITION__COMMANDES:
        return getCommandes();
      case WhileCppPackage.DEFINITION__OUTPUTS:
        return getOutputs();
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
      case WhileCppPackage.DEFINITION__INPUTS:
        setInputs((Input)newValue);
        return;
      case WhileCppPackage.DEFINITION__COMMANDES:
        setCommandes((Commands)newValue);
        return;
      case WhileCppPackage.DEFINITION__OUTPUTS:
        setOutputs((Output)newValue);
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
      case WhileCppPackage.DEFINITION__INPUTS:
        setInputs((Input)null);
        return;
      case WhileCppPackage.DEFINITION__COMMANDES:
        setCommandes((Commands)null);
        return;
      case WhileCppPackage.DEFINITION__OUTPUTS:
        setOutputs((Output)null);
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
      case WhileCppPackage.DEFINITION__INPUTS:
        return inputs != null;
      case WhileCppPackage.DEFINITION__COMMANDES:
        return commandes != null;
      case WhileCppPackage.DEFINITION__OUTPUTS:
        return outputs != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
