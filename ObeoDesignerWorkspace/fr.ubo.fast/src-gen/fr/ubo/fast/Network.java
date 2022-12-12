/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Network</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.Network#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.ubo.fast.Network#getMask <em>Mask</em>}</li>
 *   <li>{@link fr.ubo.fast.Network#getGateway <em>Gateway</em>}</li>
 *   <li>{@link fr.ubo.fast.Network#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link fr.ubo.fast.Network#getNetworkInterfaces <em>Network Interfaces</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see fr.ubo.fast.FastPackage#getNetwork_Prefix()
	 * @model required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Network#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(String)
	 * @see fr.ubo.fast.FastPackage#getNetwork_Mask()
	 * @model required="true"
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Network#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Gateway</em>' attribute.
	 * @see #setGateway(String)
	 * @see fr.ubo.fast.FastPackage#getNetwork_Gateway()
	 * @model required="true"
	 * @generated
	 */
	String getGateway();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Network#getGateway <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' attribute.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see fr.ubo.fast.FastPackage#getNetwork_DomainName()
	 * @model required="true"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Network#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Network Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.NetworkInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Interfaces</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Interfaces</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getNetwork_NetworkInterfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NetworkInterface> getNetworkInterfaces();

} // Network
