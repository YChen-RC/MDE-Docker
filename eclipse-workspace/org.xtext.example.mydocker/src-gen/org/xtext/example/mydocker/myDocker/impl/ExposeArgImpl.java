/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydocker.myDocker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydocker.myDocker.ExposeArg;
import org.xtext.example.mydocker.myDocker.MyDockerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expose Arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydocker.myDocker.impl.ExposeArgImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.example.mydocker.myDocker.impl.ExposeArgImpl#getPort_protocol <em>Port protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExposeArgImpl extends MinimalEObjectImpl.Container implements ExposeArg
{
  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final int PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected int port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getPort_protocol() <em>Port protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort_protocol()
   * @generated
   * @ordered
   */
  protected static final String PORT_PROTOCOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPort_protocol() <em>Port protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort_protocol()
   * @generated
   * @ordered
   */
  protected String port_protocol = PORT_PROTOCOL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExposeArgImpl()
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
    return MyDockerPackage.Literals.EXPOSE_ARG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPort(int newPort)
  {
    int oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDockerPackage.EXPOSE_ARG__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPort_protocol()
  {
    return port_protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPort_protocol(String newPort_protocol)
  {
    String oldPort_protocol = port_protocol;
    port_protocol = newPort_protocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDockerPackage.EXPOSE_ARG__PORT_PROTOCOL, oldPort_protocol, port_protocol));
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
      case MyDockerPackage.EXPOSE_ARG__PORT:
        return getPort();
      case MyDockerPackage.EXPOSE_ARG__PORT_PROTOCOL:
        return getPort_protocol();
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
      case MyDockerPackage.EXPOSE_ARG__PORT:
        setPort((Integer)newValue);
        return;
      case MyDockerPackage.EXPOSE_ARG__PORT_PROTOCOL:
        setPort_protocol((String)newValue);
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
      case MyDockerPackage.EXPOSE_ARG__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case MyDockerPackage.EXPOSE_ARG__PORT_PROTOCOL:
        setPort_protocol(PORT_PROTOCOL_EDEFAULT);
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
      case MyDockerPackage.EXPOSE_ARG__PORT:
        return port != PORT_EDEFAULT;
      case MyDockerPackage.EXPOSE_ARG__PORT_PROTOCOL:
        return PORT_PROTOCOL_EDEFAULT == null ? port_protocol != null : !PORT_PROTOCOL_EDEFAULT.equals(port_protocol);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (port: ");
    result.append(port);
    result.append(", port_protocol: ");
    result.append(port_protocol);
    result.append(')');
    return result.toString();
  }

} //ExposeArgImpl
