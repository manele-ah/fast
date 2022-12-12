/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.FastPackage;
import fr.ubo.fast.MetaData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Meta
 * Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.MetaDataImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaDataImpl extends NamedElementImpl implements MetaData
{
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataImpl()
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
		return FastPackage.Literals.META_DATA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue)
	{
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.META_DATA__VALUE, oldValue, value));
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
		case FastPackage.META_DATA__VALUE:
			return getValue();
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
		case FastPackage.META_DATA__VALUE:
			setValue((String) newValue);
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
		case FastPackage.META_DATA__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case FastPackage.META_DATA__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // MetaDataImpl
