/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydocker.myDocker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydocker.myDocker.HealthArgs;
import org.xtext.example.mydocker.myDocker.Healthcheck;
import org.xtext.example.mydocker.myDocker.MyDockerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcheck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydocker.myDocker.impl.HealthcheckImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcheckImpl extends CommandImpl implements Healthcheck
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected HealthArgs args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HealthcheckImpl()
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
    return MyDockerPackage.Literals.HEALTHCHECK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HealthArgs getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(HealthArgs newArgs, NotificationChain msgs)
  {
    HealthArgs oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDockerPackage.HEALTHCHECK__ARGS, oldArgs, newArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArgs(HealthArgs newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDockerPackage.HEALTHCHECK__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDockerPackage.HEALTHCHECK__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDockerPackage.HEALTHCHECK__ARGS, newArgs, newArgs));
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
      case MyDockerPackage.HEALTHCHECK__ARGS:
        return basicSetArgs(null, msgs);
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
      case MyDockerPackage.HEALTHCHECK__ARGS:
        return getArgs();
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
      case MyDockerPackage.HEALTHCHECK__ARGS:
        setArgs((HealthArgs)newValue);
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
      case MyDockerPackage.HEALTHCHECK__ARGS:
        setArgs((HealthArgs)null);
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
      case MyDockerPackage.HEALTHCHECK__ARGS:
        return args != null;
    }
    return super.eIsSet(featureID);
  }

} //HealthcheckImpl