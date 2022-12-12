/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.FastPackage;
import fr.ubo.fast.Network;
import fr.ubo.fast.NetworkInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Network</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.NetworkImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.NetworkImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.NetworkImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.NetworkImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.NetworkImpl#getNetworkInterfaces <em>Network Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends NamedElementImpl implements Network
{
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final String MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected String mask = MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected String gateway = GATEWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkInterfaces() <em>Network Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNetworkInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkInterface> networkInterfaces;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl()
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
		return FastPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix()
	{
		return prefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix)
	{
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.NETWORK__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMask()
	{
		return mask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(String newMask)
	{
		String oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.NETWORK__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getGateway()
	{
		return gateway;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(String newGateway)
	{
		String oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.NETWORK__GATEWAY, oldGateway, gateway));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainName()
	{
		return domainName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainName(String newDomainName)
	{
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(
					new ENotificationImpl(this, Notification.SET, FastPackage.NETWORK__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkInterface> getNetworkInterfaces()
	{
		if (networkInterfaces == null)
		{
			networkInterfaces = new EObjectContainmentEList<NetworkInterface>(NetworkInterface.class, this,
					FastPackage.NETWORK__NETWORK_INTERFACES);
		}
		return networkInterfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case FastPackage.NETWORK__NETWORK_INTERFACES:
			return ((InternalEList<?>) getNetworkInterfaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case FastPackage.NETWORK__PREFIX:
			return getPrefix();
		case FastPackage.NETWORK__MASK:
			return getMask();
		case FastPackage.NETWORK__GATEWAY:
			return getGateway();
		case FastPackage.NETWORK__DOMAIN_NAME:
			return getDomainName();
		case FastPackage.NETWORK__NETWORK_INTERFACES:
			return getNetworkInterfaces();
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
		case FastPackage.NETWORK__PREFIX:
			setPrefix((String) newValue);
			return;
		case FastPackage.NETWORK__MASK:
			setMask((String) newValue);
			return;
		case FastPackage.NETWORK__GATEWAY:
			setGateway((String) newValue);
			return;
		case FastPackage.NETWORK__DOMAIN_NAME:
			setDomainName((String) newValue);
			return;
		case FastPackage.NETWORK__NETWORK_INTERFACES:
			getNetworkInterfaces().clear();
			getNetworkInterfaces().addAll((Collection<? extends NetworkInterface>) newValue);
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
		case FastPackage.NETWORK__PREFIX:
			setPrefix(PREFIX_EDEFAULT);
			return;
		case FastPackage.NETWORK__MASK:
			setMask(MASK_EDEFAULT);
			return;
		case FastPackage.NETWORK__GATEWAY:
			setGateway(GATEWAY_EDEFAULT);
			return;
		case FastPackage.NETWORK__DOMAIN_NAME:
			setDomainName(DOMAIN_NAME_EDEFAULT);
			return;
		case FastPackage.NETWORK__NETWORK_INTERFACES:
			getNetworkInterfaces().clear();
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
		case FastPackage.NETWORK__PREFIX:
			return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
		case FastPackage.NETWORK__MASK:
			return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
		case FastPackage.NETWORK__GATEWAY:
			return GATEWAY_EDEFAULT == null ? gateway != null : !GATEWAY_EDEFAULT.equals(gateway);
		case FastPackage.NETWORK__DOMAIN_NAME:
			return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
		case FastPackage.NETWORK__NETWORK_INTERFACES:
			return networkInterfaces != null && !networkInterfaces.isEmpty();
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
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(", mask: ");
		result.append(mask);
		result.append(", gateway: ");
		result.append(gateway);
		result.append(", domainName: ");
		result.append(domainName);
		result.append(')');
		return result.toString();
	}

} // NetworkImpl
