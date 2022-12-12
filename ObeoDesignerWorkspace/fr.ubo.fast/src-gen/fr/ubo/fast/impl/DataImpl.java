/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.Data;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.Sensor;
import fr.ubo.fast.TimeSeries;

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
 * '<em><b>Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.DataImpl#getTimeSeriesData <em>Time Series Data</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.DataImpl#getSensorsData <em>Sensors Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data
{
	/**
	 * The cached value of the '{@link #getTimeSeriesData() <em>Time Series Data</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTimeSeriesData()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSeries> timeSeriesData;

	/**
	 * The cached value of the '{@link #getSensorsData() <em>Sensors Data</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSensorsData()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensorsData;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl()
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
		return FastPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSeries> getTimeSeriesData()
	{
		if (timeSeriesData == null)
		{
			timeSeriesData = new EObjectContainmentEList<TimeSeries>(TimeSeries.class, this,
					FastPackage.DATA__TIME_SERIES_DATA);
		}
		return timeSeriesData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensorsData()
	{
		if (sensorsData == null)
		{
			sensorsData = new EObjectContainmentEList<Sensor>(Sensor.class, this, FastPackage.DATA__SENSORS_DATA);
		}
		return sensorsData;
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
		case FastPackage.DATA__TIME_SERIES_DATA:
			return ((InternalEList<?>) getTimeSeriesData()).basicRemove(otherEnd, msgs);
		case FastPackage.DATA__SENSORS_DATA:
			return ((InternalEList<?>) getSensorsData()).basicRemove(otherEnd, msgs);
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
		case FastPackage.DATA__TIME_SERIES_DATA:
			return getTimeSeriesData();
		case FastPackage.DATA__SENSORS_DATA:
			return getSensorsData();
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
		case FastPackage.DATA__TIME_SERIES_DATA:
			getTimeSeriesData().clear();
			getTimeSeriesData().addAll((Collection<? extends TimeSeries>) newValue);
			return;
		case FastPackage.DATA__SENSORS_DATA:
			getSensorsData().clear();
			getSensorsData().addAll((Collection<? extends Sensor>) newValue);
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
		case FastPackage.DATA__TIME_SERIES_DATA:
			getTimeSeriesData().clear();
			return;
		case FastPackage.DATA__SENSORS_DATA:
			getSensorsData().clear();
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
		case FastPackage.DATA__TIME_SERIES_DATA:
			return timeSeriesData != null && !timeSeriesData.isEmpty();
		case FastPackage.DATA__SENSORS_DATA:
			return sensorsData != null && !sensorsData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DataImpl
