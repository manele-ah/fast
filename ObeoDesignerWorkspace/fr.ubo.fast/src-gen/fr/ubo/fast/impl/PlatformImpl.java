/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.Computer;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.Network;
import fr.ubo.fast.Platform;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Platform</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.PlatformImpl#getComputersPlatform <em>Computers Platform</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.PlatformImpl#getNetworksPlatform <em>Networks Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformImpl extends MinimalEObjectImpl.Container implements Platform
{
	/**
	 * The cached value of the '{@link #getComputersPlatform() <em>Computers Platform</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getComputersPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<Computer> computersPlatform;

	/**
	 * The cached value of the '{@link #getNetworksPlatform() <em>Networks Platform</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNetworksPlatform()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networksPlatform;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformImpl()
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
		return FastPackage.Literals.PLATFORM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computer> getComputersPlatform()
	{
		if (computersPlatform == null)
		{
			computersPlatform = new EObjectContainmentEList<Computer>(Computer.class, this,
					FastPackage.PLATFORM__COMPUTERS_PLATFORM);
		}
		return computersPlatform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworksPlatform()
	{
		if (networksPlatform == null)
		{
			networksPlatform = new EObjectContainmentEList<Network>(Network.class, this,
					FastPackage.PLATFORM__NETWORKS_PLATFORM);
		}
		return networksPlatform;
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
		case FastPackage.PLATFORM__COMPUTERS_PLATFORM:
			return ((InternalEList<?>) getComputersPlatform()).basicRemove(otherEnd, msgs);
		case FastPackage.PLATFORM__NETWORKS_PLATFORM:
			return ((InternalEList<?>) getNetworksPlatform()).basicRemove(otherEnd, msgs);
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
		case FastPackage.PLATFORM__COMPUTERS_PLATFORM:
			return getComputersPlatform();
		case FastPackage.PLATFORM__NETWORKS_PLATFORM:
			return getNetworksPlatform();
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
		case FastPackage.PLATFORM__COMPUTERS_PLATFORM:
			getComputersPlatform().clear();
			getComputersPlatform().addAll((Collection<? extends Computer>) newValue);
			return;
		case FastPackage.PLATFORM__NETWORKS_PLATFORM:
			getNetworksPlatform().clear();
			getNetworksPlatform().addAll((Collection<? extends Network>) newValue);
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
		case FastPackage.PLATFORM__COMPUTERS_PLATFORM:
			getComputersPlatform().clear();
			return;
		case FastPackage.PLATFORM__NETWORKS_PLATFORM:
			getNetworksPlatform().clear();
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
		case FastPackage.PLATFORM__COMPUTERS_PLATFORM:
			return computersPlatform != null && !computersPlatform.isEmpty();
		case FastPackage.PLATFORM__NETWORKS_PLATFORM:
			return networksPlatform != null && !networksPlatform.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PlatformImpl
