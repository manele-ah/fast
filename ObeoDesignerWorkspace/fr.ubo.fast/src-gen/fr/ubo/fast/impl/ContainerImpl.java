/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.FastPackage;
import fr.ubo.fast.NetworkInterface;
import fr.ubo.fast.Service;

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
 * '<em><b>Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.ContainerImpl#getContainerServices <em>Container Services</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ContainerImpl#getContainerNetworkInterface <em>Container Network Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends NamedElementImpl implements fr.ubo.fast.Container
{
	/**
	 * The cached value of the '{@link #getContainerServices() <em>Container Services</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContainerServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> containerServices;

	/**
	 * The cached value of the '{@link #getContainerNetworkInterface() <em>Container
	 * Network Interface</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getContainerNetworkInterface()
	 * @generated
	 * @ordered
	 */
	protected NetworkInterface containerNetworkInterface;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl()
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
		return FastPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getContainerServices()
	{
		if (containerServices == null)
		{
			containerServices = new EObjectContainmentEList<Service>(Service.class, this,
					FastPackage.CONTAINER__CONTAINER_SERVICES);
		}
		return containerServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface getContainerNetworkInterface()
	{
		if (containerNetworkInterface != null && containerNetworkInterface.eIsProxy())
		{
			InternalEObject oldContainerNetworkInterface = (InternalEObject) containerNetworkInterface;
			containerNetworkInterface = (NetworkInterface) eResolveProxy(oldContainerNetworkInterface);
			if (containerNetworkInterface != oldContainerNetworkInterface)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FastPackage.CONTAINER__CONTAINER_NETWORK_INTERFACE,
							oldContainerNetworkInterface, containerNetworkInterface));
			}
		}
		return containerNetworkInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface basicGetContainerNetworkInterface()
	{
		return containerNetworkInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerNetworkInterface(NetworkInterface newContainerNetworkInterface)
	{
		NetworkInterface oldContainerNetworkInterface = containerNetworkInterface;
		containerNetworkInterface = newContainerNetworkInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.CONTAINER__CONTAINER_NETWORK_INTERFACE,
					oldContainerNetworkInterface, containerNetworkInterface));
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
		case FastPackage.CONTAINER__CONTAINER_SERVICES:
			return ((InternalEList<?>) getContainerServices()).basicRemove(otherEnd, msgs);
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
		case FastPackage.CONTAINER__CONTAINER_SERVICES:
			return getContainerServices();
		case FastPackage.CONTAINER__CONTAINER_NETWORK_INTERFACE:
			if (resolve)
				return getContainerNetworkInterface();
			return basicGetContainerNetworkInterface();
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
		case FastPackage.CONTAINER__CONTAINER_SERVICES:
			getContainerServices().clear();
			getContainerServices().addAll((Collection<? extends Service>) newValue);
			return;
		case FastPackage.CONTAINER__CONTAINER_NETWORK_INTERFACE:
			setContainerNetworkInterface((NetworkInterface) newValue);
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
		case FastPackage.CONTAINER__CONTAINER_SERVICES:
			getContainerServices().clear();
			return;
		case FastPackage.CONTAINER__CONTAINER_NETWORK_INTERFACE:
			setContainerNetworkInterface((NetworkInterface) null);
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
		case FastPackage.CONTAINER__CONTAINER_SERVICES:
			return containerServices != null && !containerServices.isEmpty();
		case FastPackage.CONTAINER__CONTAINER_NETWORK_INTERFACE:
			return containerNetworkInterface != null;
		}
		return super.eIsSet(featureID);
	}

} // ContainerImpl
