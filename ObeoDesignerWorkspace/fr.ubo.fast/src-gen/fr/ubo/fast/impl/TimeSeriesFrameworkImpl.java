/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.Data;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.Platform;
import fr.ubo.fast.TimeSeriesFramework;
import fr.ubo.fast.VisualizationClient;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Time
 * Series Framework</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesFrameworkImpl#getData <em>Data</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesFrameworkImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesFrameworkImpl#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSeriesFrameworkImpl extends MinimalEObjectImpl.Container implements TimeSeriesFramework
{
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected Platform platform;

	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<VisualizationClient> clients;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSeriesFrameworkImpl()
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
		return FastPackage.Literals.TIME_SERIES_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData()
	{
		return data;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Data newData, NotificationChain msgs)
	{
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FastPackage.TIME_SERIES_FRAMEWORK__DATA, oldData, newData);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData)
	{
		if (newData != data)
		{
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject) data).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FastPackage.TIME_SERIES_FRAMEWORK__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject) newData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FastPackage.TIME_SERIES_FRAMEWORK__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.TIME_SERIES_FRAMEWORK__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Platform getPlatform()
	{
		return platform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatform(Platform newPlatform, NotificationChain msgs)
	{
		Platform oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM, oldPlatform, newPlatform);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatform(Platform newPlatform)
	{
		if (newPlatform != platform)
		{
			NotificationChain msgs = null;
			if (platform != null)
				msgs = ((InternalEObject) platform).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM, null, msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject) newPlatform).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM, null, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM, newPlatform,
					newPlatform));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VisualizationClient> getClients()
	{
		if (clients == null)
		{
			clients = new EObjectContainmentEList<VisualizationClient>(VisualizationClient.class, this,
					FastPackage.TIME_SERIES_FRAMEWORK__CLIENTS);
		}
		return clients;
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
		case FastPackage.TIME_SERIES_FRAMEWORK__DATA:
			return basicSetData(null, msgs);
		case FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM:
			return basicSetPlatform(null, msgs);
		case FastPackage.TIME_SERIES_FRAMEWORK__CLIENTS:
			return ((InternalEList<?>) getClients()).basicRemove(otherEnd, msgs);
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
		case FastPackage.TIME_SERIES_FRAMEWORK__DATA:
			return getData();
		case FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM:
			return getPlatform();
		case FastPackage.TIME_SERIES_FRAMEWORK__CLIENTS:
			return getClients();
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
		case FastPackage.TIME_SERIES_FRAMEWORK__DATA:
			setData((Data) newValue);
			return;
		case FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM:
			setPlatform((Platform) newValue);
			return;
		case FastPackage.TIME_SERIES_FRAMEWORK__CLIENTS:
			getClients().clear();
			getClients().addAll((Collection<? extends VisualizationClient>) newValue);
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
		case FastPackage.TIME_SERIES_FRAMEWORK__DATA:
			setData((Data) null);
			return;
		case FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM:
			setPlatform((Platform) null);
			return;
		case FastPackage.TIME_SERIES_FRAMEWORK__CLIENTS:
			getClients().clear();
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
		case FastPackage.TIME_SERIES_FRAMEWORK__DATA:
			return data != null;
		case FastPackage.TIME_SERIES_FRAMEWORK__PLATFORM:
			return platform != null;
		case FastPackage.TIME_SERIES_FRAMEWORK__CLIENTS:
			return clients != null && !clients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TimeSeriesFrameworkImpl
