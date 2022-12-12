/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.DataSource;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.WebServer;
import fr.ubo.fast.WebServerType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Web
 * Server</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.WebServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.WebServerImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.WebServerImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebServerImpl extends ServiceImpl implements WebServer
{
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 8080;

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
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSource> proxy;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final WebServerType TYPE_EDEFAULT = WebServerType.GEO_SERVER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected WebServerType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WebServerImpl()
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
		return FastPackage.Literals.WEB_SERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.WEB_SERVER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSource> getProxy()
	{
		if (proxy == null)
		{
			proxy = new EObjectResolvingEList<DataSource>(DataSource.class, this, FastPackage.WEB_SERVER__PROXY);
		}
		return proxy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WebServerType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(WebServerType newType)
	{
		WebServerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.WEB_SERVER__TYPE, oldType, type));
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
		case FastPackage.WEB_SERVER__PORT:
			return getPort();
		case FastPackage.WEB_SERVER__PROXY:
			return getProxy();
		case FastPackage.WEB_SERVER__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FastPackage.WEB_SERVER__PORT:
			setPort((Integer) newValue);
			return;
		case FastPackage.WEB_SERVER__PROXY:
			getProxy().clear();
			getProxy().addAll((Collection<? extends DataSource>) newValue);
			return;
		case FastPackage.WEB_SERVER__TYPE:
			setType((WebServerType) newValue);
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
		case FastPackage.WEB_SERVER__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case FastPackage.WEB_SERVER__PROXY:
			getProxy().clear();
			return;
		case FastPackage.WEB_SERVER__TYPE:
			setType(TYPE_EDEFAULT);
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
		case FastPackage.WEB_SERVER__PORT:
			return port != PORT_EDEFAULT;
		case FastPackage.WEB_SERVER__PROXY:
			return proxy != null && !proxy.isEmpty();
		case FastPackage.WEB_SERVER__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (port: ");
		result.append(port);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // WebServerImpl
