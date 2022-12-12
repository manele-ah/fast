/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.FastPackage;
import fr.ubo.fast.MeasuredVariable;
import fr.ubo.fast.MetaData;
import fr.ubo.fast.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Sensor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.SensorImpl#getSensorMetaData <em>Sensor Meta Data</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.SensorImpl#getSensorMeasuredVariables <em>Sensor Measured Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends NamedElementImpl implements Sensor
{
	/**
	 * The cached value of the '{@link #getSensorMetaData() <em>Sensor Meta Data</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSensorMetaData()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaData> sensorMetaData;

	/**
	 * The cached value of the '{@link #getSensorMeasuredVariables() <em>Sensor Measured Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorMeasuredVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasuredVariable> sensorMeasuredVariables;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl()
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
		return FastPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaData> getSensorMetaData()
	{
		if (sensorMetaData == null)
		{
			sensorMetaData = new EObjectContainmentEList<MetaData>(MetaData.class, this,
					FastPackage.SENSOR__SENSOR_META_DATA);
		}
		return sensorMetaData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasuredVariable> getSensorMeasuredVariables()
	{
		if (sensorMeasuredVariables == null)
		{
			sensorMeasuredVariables = new EObjectContainmentEList<MeasuredVariable>(MeasuredVariable.class, this,
					FastPackage.SENSOR__SENSOR_MEASURED_VARIABLES);
		}
		return sensorMeasuredVariables;
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
		case FastPackage.SENSOR__SENSOR_META_DATA:
			return ((InternalEList<?>) getSensorMetaData()).basicRemove(otherEnd, msgs);
		case FastPackage.SENSOR__SENSOR_MEASURED_VARIABLES:
			return ((InternalEList<?>) getSensorMeasuredVariables()).basicRemove(otherEnd, msgs);
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
		case FastPackage.SENSOR__SENSOR_META_DATA:
			return getSensorMetaData();
		case FastPackage.SENSOR__SENSOR_MEASURED_VARIABLES:
			return getSensorMeasuredVariables();
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
		case FastPackage.SENSOR__SENSOR_META_DATA:
			getSensorMetaData().clear();
			getSensorMetaData().addAll((Collection<? extends MetaData>) newValue);
			return;
		case FastPackage.SENSOR__SENSOR_MEASURED_VARIABLES:
			getSensorMeasuredVariables().clear();
			getSensorMeasuredVariables().addAll((Collection<? extends MeasuredVariable>) newValue);
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
		case FastPackage.SENSOR__SENSOR_META_DATA:
			getSensorMetaData().clear();
			return;
		case FastPackage.SENSOR__SENSOR_MEASURED_VARIABLES:
			getSensorMeasuredVariables().clear();
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
		case FastPackage.SENSOR__SENSOR_META_DATA:
			return sensorMetaData != null && !sensorMetaData.isEmpty();
		case FastPackage.SENSOR__SENSOR_MEASURED_VARIABLES:
			return sensorMeasuredVariables != null && !sensorMeasuredVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SensorImpl
