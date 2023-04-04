/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydocker.myDocker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Onbuild</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydocker.myDocker.Onbuild#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydocker.myDocker.MyDockerPackage#getOnbuild()
 * @model
 * @generated
 */
public interface Onbuild extends Command
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute.
   * @see #setArgs(String)
   * @see org.xtext.example.mydocker.myDocker.MyDockerPackage#getOnbuild_Args()
   * @model
   * @generated
   */
  String getArgs();

  /**
   * Sets the value of the '{@link org.xtext.example.mydocker.myDocker.Onbuild#getArgs <em>Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' attribute.
   * @see #getArgs()
   * @generated
   */
  void setArgs(String value);

} // Onbuild
