/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.FastPackage;
import fr.ubo.fast.MeasuredVariable;
import fr.ubo.fast.MeasurementDataUnit;
import fr.ubo.fast.MetaData;

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
 * '<em><b>Measured Variable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.MeasuredVariableImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MeasuredVariableImpl#getMeasuredVariableMetaData <em>Measured Variable Meta Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasuredVariableImpl extends NamedElementImpl implements MeasuredVariable
{
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final MeasurementDataUnit UNIT_EDEFAULT = MeasurementDataUnit.CELSIUS;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected MeasurementDataUnit unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasuredVariableMetaData() <em>Measured Variable Meta Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredVariableMetaData()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaData> measuredVariableMetaData;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasuredVariableImpl()
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
		return FastPackage.Literals.MEASURED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementDataUnit getUnit()
	{
		return unit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(MeasurementDataUnit newUnit)
	{
		MeasurementDataUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MEASURED_VARIABLE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaData> getMeasuredVariableMetaData()
	{
		if (measuredVariableMetaData == null)
		{
			measuredVariableMetaData = new EObjectContainmentEList<MetaData>(MetaData.class, this,
					FastPackage.MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA);
		}
		return measuredVariableMetaData;
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
		case FastPackage.MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA:
			return ((InternalEList<?>) getMeasuredVariableMetaData()).basicRemove(otherEnd, msgs);
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
		case FastPackage.MEASURED_VARIABLE__UNIT:
			return getUnit();
		case FastPackage.MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA:
			return getMeasuredVariableMetaData();
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
		case FastPackage.MEASURED_VARIABLE__UNIT:
			setUnit((MeasurementDataUnit) newValue);
			return;
		case FastPackage.MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA:
			getMeasuredVariableMetaData().clear();
			getMeasuredVariableMetaData().addAll((Collection<? extends MetaData>) newValue);
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
		case FastPackage.MEASURED_VARIABLE__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case FastPackage.MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA:
			getMeasuredVariableMetaData().clear();
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
		case FastPackage.MEASURED_VARIABLE__UNIT:
			return unit != UNIT_EDEFAULT;
		case FastPackage.MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA:
			return measuredVariableMetaData != null && !measuredVariableMetaData.isEmpty();
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} // MeasuredVariableImpl
