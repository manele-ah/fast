/**
 */
package fr.ubo.fast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Measurement Data Unit</b></em>', and utility methods for working with
 * them. <!-- end-user-doc -->
 * @see fr.ubo.fast.FastPackage#getMeasurementDataUnit()
 * @model
 * @generated
 */
public enum MeasurementDataUnit implements Enumerator
{
	/**
	 * The '<em><b>Celsius</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #CELSIUS_VALUE
	 * @generated
	 * @ordered
	 */
	CELSIUS(0, "Celsius", "Celsius"),

	/**
	 * The '<em><b>Meter</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #METER_VALUE
	 * @generated
	 * @ordered
	 */
	METER(1, "Meter", "Meter"),
	/**
	 * The '<em><b>Meter Per Second</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #METER_PER_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	METER_PER_SECOND(2, "MeterPerSecond", "MeterPerSecond"),
	/**
	 * The '<em><b>Bar</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BAR(3, "Bar", "Bar"),
	/**
	 * The '<em><b>Liter</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #LITER_VALUE
	 * @generated
	 * @ordered
	 */
	LITER(4, "Liter", "Liter"),
	/**
	 * The '<em><b>Gram</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #GRAM_VALUE
	 * @generated
	 * @ordered
	 */
	GRAM(5, "Gram", "Gram"),
	/**
	 * The '<em><b>Radian</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #RADIAN_VALUE
	 * @generated
	 * @ordered
	 */
	RADIAN(6, "Radian", "Radian"),
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(7, "None", "None");

	/**
	 * The '<em><b>Celsius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Celsius</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CELSIUS
	 * @model name="Celsius"
	 * @generated
	 * @ordered
	 */
	public static final int CELSIUS_VALUE = 0;

	/**
	 * The '<em><b>Meter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meter</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METER
	 * @model name="Meter"
	 * @generated
	 * @ordered
	 */
	public static final int METER_VALUE = 1;

	/**
	 * The '<em><b>Meter Per Second</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meter Per Second</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METER_PER_SECOND
	 * @model name="MeterPerSecond"
	 * @generated
	 * @ordered
	 */
	public static final int METER_PER_SECOND_VALUE = 2;

	/**
	 * The '<em><b>Bar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bar</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAR
	 * @model name="Bar"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_VALUE = 3;

	/**
	 * The '<em><b>Liter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Liter</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITER
	 * @model name="Liter"
	 * @generated
	 * @ordered
	 */
	public static final int LITER_VALUE = 4;

	/**
	 * The '<em><b>Gram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gram</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAM
	 * @model name="Gram"
	 * @generated
	 * @ordered
	 */
	public static final int GRAM_VALUE = 5;

	/**
	 * The '<em><b>Radian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radian</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIAN
	 * @model name="Radian"
	 * @generated
	 * @ordered
	 */
	public static final int RADIAN_VALUE = 6;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Measurement Data Unit</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final MeasurementDataUnit[] VALUES_ARRAY = new MeasurementDataUnit[] { CELSIUS, METER,
			METER_PER_SECOND, BAR, LITER, GRAM, RADIAN, NONE, };

	/**
	 * A public read-only list of all the '<em><b>Measurement Data Unit</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasurementDataUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measurement Data Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementDataUnit get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			MeasurementDataUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Data Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementDataUnit getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			MeasurementDataUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Data Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasurementDataUnit get(int value)
	{
		switch (value)
		{
		case CELSIUS_VALUE:
			return CELSIUS;
		case METER_VALUE:
			return METER;
		case METER_PER_SECOND_VALUE:
			return METER_PER_SECOND;
		case BAR_VALUE:
			return BAR;
		case LITER_VALUE:
			return LITER;
		case GRAM_VALUE:
			return GRAM;
		case RADIAN_VALUE:
			return RADIAN;
		case NONE_VALUE:
			return NONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private MeasurementDataUnit(int value, String name, String literal)
	{
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral()
	{
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return literal;
	}

} // MeasurementDataUnit
