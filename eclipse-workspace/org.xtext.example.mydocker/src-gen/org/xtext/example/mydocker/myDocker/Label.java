/**
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydocker.myDocker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydocker.myDocker.Label#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydocker.myDocker.MyDockerPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends Command
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(NameVals)
   * @see org.xtext.example.mydocker.myDocker.MyDockerPackage#getLabel_Args()
   * @model containment="true"
   * @generated
   */
  NameVals getArgs();

  /**
   * Sets the value of the '{@link org.xtext.example.mydocker.myDocker.Label#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(NameVals value);

} // Label
