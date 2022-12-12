/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Web
 * Server</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.WebServer#getPort <em>Port</em>}</li>
 *   <li>{@link fr.ubo.fast.WebServer#getProxy <em>Proxy</em>}</li>
 *   <li>{@link fr.ubo.fast.WebServer#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getWebServer()
 * @model
 * @generated
 */
public interface WebServer extends Service
{
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see fr.ubo.fast.FastPackage#getWebServer_Port()
	 * @model default="8080" required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.WebServer#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' reference list.
	 * The list contents are of type {@link fr.ubo.fast.DataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' reference list.
	 * @see fr.ubo.fast.FastPackage#getWebServer_Proxy()
	 * @model
	 * @generated
	 */
	EList<DataSource> getProxy();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"GeoServer"</code>.
	 * The literals are from the enumeration {@link fr.ubo.fast.WebServerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.ubo.fast.WebServerType
	 * @see #setType(WebServerType)
	 * @see fr.ubo.fast.FastPackage#getWebServer_Type()
	 * @model default="GeoServer" required="true"
	 * @generated
	 */
	WebServerType getType();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.WebServer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.ubo.fast.WebServerType
	 * @see #getType()
	 * @generated
	 */
	void setType(WebServerType value);

} // WebServer
