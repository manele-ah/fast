/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.FactorScale;
import fr.ubo.fast.FastPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Factor
 * Scale</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.FactorScaleImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.FactorScaleImpl#getZoomsNumber <em>Zooms Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactorScaleImpl extends ScaleImpl implements FactorScale
{
	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int FACTOR_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected int factor = FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getZoomsNumber() <em>Zooms Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getZoomsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ZOOMS_NUMBER_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getZoomsNumber() <em>Zooms Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getZoomsNumber()
	 * @generated
	 * @ordered
	 */
	protected int zoomsNumber = ZOOMS_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FactorScaleImpl()
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
		return FastPackage.Literals.FACTOR_SCALE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getFactor()
	{
		return factor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(int newFactor)
	{
		int oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.FACTOR_SCALE__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getZoomsNumber()
	{
		return zoomsNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoomsNumber(int newZoomsNumber)
	{
		int oldZoomsNumber = zoomsNumber;
		zoomsNumber = newZoomsNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.FACTOR_SCALE__ZOOMS_NUMBER, oldZoomsNumber,
					zoomsNumber));
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
		case FastPackage.FACTOR_SCALE__FACTOR:
			return getFactor();
		case FastPackage.FACTOR_SCALE__ZOOMS_NUMBER:
			return getZoomsNumber();
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
		case FastPackage.FACTOR_SCALE__FACTOR:
			setFactor((Integer) newValue);
			return;
		case FastPackage.FACTOR_SCALE__ZOOMS_NUMBER:
			setZoomsNumber((Integer) newValue);
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
		case FastPackage.FACTOR_SCALE__FACTOR:
			setFactor(FACTOR_EDEFAULT);
			return;
		case FastPackage.FACTOR_SCALE__ZOOMS_NUMBER:
			setZoomsNumber(ZOOMS_NUMBER_EDEFAULT);
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
		case FastPackage.FACTOR_SCALE__FACTOR:
			return factor != FACTOR_EDEFAULT;
		case FastPackage.FACTOR_SCALE__ZOOMS_NUMBER:
			return zoomsNumber != ZOOMS_NUMBER_EDEFAULT;
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
		result.append(" (factor: ");
		result.append(factor);
		result.append(", zoomsNumber: ");
		result.append(zoomsNumber);
		result.append(')');
		return result.toString();
	}

} // FactorScaleImpl
