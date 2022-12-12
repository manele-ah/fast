/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Container</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.Container#getContainerServices <em>Container Services</em>}</li>
 *   <li>{@link fr.ubo.fast.Container#getContainerNetworkInterface <em>Container Network Interface</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Container Services</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Services</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Services</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getContainer_ContainerServices()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Service> getContainerServices();

	/**
	 * Returns the value of the '<em><b>Container Network Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Network Interface</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Network Interface</em>' reference.
	 * @see #setContainerNetworkInterface(NetworkInterface)
	 * @see fr.ubo.fast.FastPackage#getContainer_ContainerNetworkInterface()
	 * @model required="true"
	 * @generated
	 */
	NetworkInterface getContainerNetworkInterface();

	/**
	 * Sets the value of the
	 * '{@link fr.ubo.fast.Container#getContainerNetworkInterface <em>Container
	 * Network Interface</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Container Network Interface</em>'
	 *              reference.
	 * @see #getContainerNetworkInterface()
	 * @generated
	 */
	void setContainerNetworkInterface(NetworkInterface value);

} // Container
