/**
 */
package fr.ubo.fast;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Database</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.Database#getDbms <em>Dbms</em>}</li>
 *   <li>{@link fr.ubo.fast.Database#getPort <em>Port</em>}</li>
 *   <li>{@link fr.ubo.fast.Database#getUsername <em>Username</em>}</li>
 *   <li>{@link fr.ubo.fast.Database#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.ubo.fast.Database#getDataDirectory <em>Data Directory</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends DataSource
{
	/**
	 * Returns the value of the '<em><b>Dbms</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.ubo.fast.DatabaseType}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Dbms</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbms</em>' attribute.
	 * @see fr.ubo.fast.DatabaseType
	 * @see #setDbms(DatabaseType)
	 * @see fr.ubo.fast.FastPackage#getDatabase_Dbms()
	 * @model required="true"
	 * @generated
	 */
	DatabaseType getDbms();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Database#getDbms <em>Dbms</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbms</em>' attribute.
	 * @see fr.ubo.fast.DatabaseType
	 * @see #getDbms()
	 * @generated
	 */
	void setDbms(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"5432"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see fr.ubo.fast.FastPackage#getDatabase_Port()
	 * @model default="5432" required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Database#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see fr.ubo.fast.FastPackage#getDatabase_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Database#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see fr.ubo.fast.FastPackage#getDatabase_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Database#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Data Directory</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Directory</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data Directory</em>' attribute.
	 * @see #setDataDirectory(String)
	 * @see fr.ubo.fast.FastPackage#getDatabase_DataDirectory()
	 * @model required="true"
	 * @generated
	 */
	String getDataDirectory();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Database#getDataDirectory <em>Data Directory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Directory</em>' attribute.
	 * @see #getDataDirectory()
	 * @generated
	 */
	void setDataDirectory(String value);

} // Database
