/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.CalendarScale;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.Period;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Calendar Scale</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.CalendarScaleImpl#getPeriods <em>Periods</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.CalendarScaleImpl#getFactors <em>Factors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalendarScaleImpl extends ScaleImpl implements CalendarScale
{
	/**
	 * The cached value of the '{@link #getPeriods() <em>Periods</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPeriods()
	 * @generated
	 * @ordered
	 */
	protected EList<Period> periods;

	/**
	 * The cached value of the '{@link #getFactors() <em>Factors</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> factors;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CalendarScaleImpl()
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
		return FastPackage.Literals.CALENDAR_SCALE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Period> getPeriods()
	{
		if (periods == null)
		{
			periods = new EDataTypeUniqueEList<Period>(Period.class, this, FastPackage.CALENDAR_SCALE__PERIODS);
		}
		return periods;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getFactors()
	{
		if (factors == null)
		{
			factors = new EDataTypeUniqueEList<Long>(Long.class, this, FastPackage.CALENDAR_SCALE__FACTORS);
		}
		return factors;
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
		case FastPackage.CALENDAR_SCALE__PERIODS:
			return getPeriods();
		case FastPackage.CALENDAR_SCALE__FACTORS:
			return getFactors();
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
		case FastPackage.CALENDAR_SCALE__PERIODS:
			getPeriods().clear();
			getPeriods().addAll((Collection<? extends Period>) newValue);
			return;
		case FastPackage.CALENDAR_SCALE__FACTORS:
			getFactors().clear();
			getFactors().addAll((Collection<? extends Long>) newValue);
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
		case FastPackage.CALENDAR_SCALE__PERIODS:
			getPeriods().clear();
			return;
		case FastPackage.CALENDAR_SCALE__FACTORS:
			getFactors().clear();
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
		case FastPackage.CALENDAR_SCALE__PERIODS:
			return periods != null && !periods.isEmpty();
		case FastPackage.CALENDAR_SCALE__FACTORS:
			return factors != null && !factors.isEmpty();
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
		result.append(" (periods: ");
		result.append(periods);
		result.append(", factors: ");
		result.append(factors);
		result.append(')');
		return result.toString();
	}

} // CalendarScaleImpl
