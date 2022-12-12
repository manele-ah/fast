/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Platform</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.Platform#getComputersPlatform <em>Computers Platform</em>}</li>
 *   <li>{@link fr.ubo.fast.Platform#getNetworksPlatform <em>Networks Platform</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends EObject
{
	/**
	 * Returns the value of the '<em><b>Computers Platform</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.Computer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computers Platform</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computers Platform</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getPlatform_ComputersPlatform()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Computer> getComputersPlatform();

	/**
	 * Returns the value of the '<em><b>Networks Platform</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks Platform</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks Platform</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getPlatform_NetworksPlatform()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Network> getNetworksPlatform();

} // Platform
