/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydocker.myDocker.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydocker.myDocker.ExposeArg;
import org.xtext.example.mydocker.myDocker.ExposeArgs;
import org.xtext.example.mydocker.myDocker.MyDockerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expose Args</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydocker.myDocker.impl.ExposeArgsImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExposeArgsImpl extends MinimalEObjectImpl.Container implements ExposeArgs
{
  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<ExposeArg> ports;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExposeArgsImpl()
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
    return MyDockerPackage.Literals.EXPOSE_ARGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExposeArg> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<ExposeArg>(ExposeArg.class, this, MyDockerPackage.EXPOSE_ARGS__PORTS);
    }
    return ports;
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
      case MyDockerPackage.EXPOSE_ARGS__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
      case MyDockerPackage.EXPOSE_ARGS__PORTS:
        return getPorts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDockerPackage.EXPOSE_ARGS__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends ExposeArg>)newValue);
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
      case MyDockerPackage.EXPOSE_ARGS__PORTS:
        getPorts().clear();
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
      case MyDockerPackage.EXPOSE_ARGS__PORTS:
        return ports != null && !ports.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExposeArgsImpl
