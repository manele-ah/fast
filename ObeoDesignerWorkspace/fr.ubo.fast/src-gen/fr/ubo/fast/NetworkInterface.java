/**
 */
package fr.ubo.fast;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Network
 * Interface</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.NetworkInterface#getIpAddress <em>Ip Address</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getNetworkInterface()
 * @model
 * @generated
 */
public interface NetworkInterface extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Address</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see fr.ubo.fast.FastPackage#getNetworkInterface_IpAddress()
	 * @model required="true"
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.NetworkInterface#getIpAddress
	 * <em>Ip Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

} // NetworkInterface
