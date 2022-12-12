/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.Database;
import fr.ubo.fast.DatabaseType;
import fr.ubo.fast.FastPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Database</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.DatabaseImpl#getDbms <em>Dbms</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.DatabaseImpl#getPort <em>Port</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.DatabaseImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.DatabaseImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.DatabaseImpl#getDataDirectory <em>Data Directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends DataSourceImpl implements Database
{
	/**
	 * The default value of the '{@link #getDbms() <em>Dbms</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDbms()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseType DBMS_EDEFAULT = DatabaseType.TIME_SCALE_DB;

	/**
	 * The cached value of the '{@link #getDbms() <em>Dbms</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDbms()
	 * @generated
	 * @ordered
	 */
	protected DatabaseType dbms = DBMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 5432;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataDirectory() <em>Data Directory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDirectory() <em>Data Directory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataDirectory()
	 * @generated
	 * @ordered
	 */
	protected String dataDirectory = DATA_DIRECTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FastPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType getDbms()
	{
		return dbms;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbms(DatabaseType newDbms)
	{
		DatabaseType oldDbms = dbms;
		dbms = newDbms == null ? DBMS_EDEFAULT : newDbms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.DATABASE__DBMS, oldDbms, dbms));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort()
	{
		return port;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort)
	{
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.DATABASE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername)
	{
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.DATABASE__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword)
	{
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.DATABASE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataDirectory()
	{
		return dataDirectory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDirectory(String newDataDirectory)
	{
		String oldDataDirectory = dataDirectory;
		dataDirectory = newDataDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.DATABASE__DATA_DIRECTORY, oldDataDirectory,
					dataDirectory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case FastPackage.DATABASE__DBMS:
			return getDbms();
		case FastPackage.DATABASE__PORT:
			return getPort();
		case FastPackage.DATABASE__USERNAME:
			return getUsername();
		case FastPackage.DATABASE__PASSWORD:
			return getPassword();
		case FastPackage.DATABASE__DATA_DIRECTORY:
			return getDataDirectory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FastPackage.DATABASE__DBMS:
			setDbms((DatabaseType) newValue);
			return;
		case FastPackage.DATABASE__PORT:
			setPort((Integer) newValue);
			return;
		case FastPackage.DATABASE__USERNAME:
			setUsername((String) newValue);
			return;
		case FastPackage.DATABASE__PASSWORD:
			setPassword((String) newValue);
			return;
		case FastPackage.DATABASE__DATA_DIRECTORY:
			setDataDirectory((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case FastPackage.DATABASE__DBMS:
			setDbms(DBMS_EDEFAULT);
			return;
		case FastPackage.DATABASE__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case FastPackage.DATABASE__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case FastPackage.DATABASE__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case FastPackage.DATABASE__DATA_DIRECTORY:
			setDataDirectory(DATA_DIRECTORY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case FastPackage.DATABASE__DBMS:
			return dbms != DBMS_EDEFAULT;
		case FastPackage.DATABASE__PORT:
			return port != PORT_EDEFAULT;
		case FastPackage.DATABASE__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		case FastPackage.DATABASE__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case FastPackage.DATABASE__DATA_DIRECTORY:
			return DATA_DIRECTORY_EDEFAULT == null ? dataDirectory != null : !DATA_DIRECTORY_EDEFAULT.equals(dataDirectory);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dbms: ");
		result.append(dbms);
		result.append(", port: ");
		result.append(port);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", dataDirectory: ");
		result.append(dataDirectory);
		result.append(')');
		return result.toString();
	}

} // DatabaseImpl
