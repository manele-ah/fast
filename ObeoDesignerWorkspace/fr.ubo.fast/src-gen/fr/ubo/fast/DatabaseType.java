/**
 */
package fr.ubo.fast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Database Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.ubo.fast.FastPackage#getDatabaseType()
 * @model
 * @generated
 */
public enum DatabaseType implements Enumerator
{
	/**
	 * The '<em><b>Time Scale DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SCALE_DB_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_SCALE_DB(0, "TimeScaleDB", "TimeScaleDB"),

	/**
	 * The '<em><b>Influx DB</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #INFLUX_DB_VALUE
	 * @generated
	 * @ordered
	 */
	INFLUX_DB(1, "InfluxDB", "InfluxDB");

	/**
	 * The '<em><b>Time Scale DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Scale DB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_SCALE_DB
	 * @model name="TimeScaleDB"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCALE_DB_VALUE = 0;

	/**
	 * The '<em><b>Influx DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Influx DB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFLUX_DB
	 * @model name="InfluxDB"
	 * @generated
	 * @ordered
	 */
	public static final int INFLUX_DB_VALUE = 1;

	/**
	 * An array of all the '<em><b>Database Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DatabaseType[] VALUES_ARRAY = new DatabaseType[] { TIME_SCALE_DB, INFLUX_DB, };

	/**
	 * A public read-only list of all the '<em><b>Database Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatabaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DatabaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			DatabaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Database Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatabaseType get(int value)
	{
		switch (value)
		{
		case TIME_SCALE_DB_VALUE:
			return TIME_SCALE_DB;
		case INFLUX_DB_VALUE:
			return INFLUX_DB;
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
	private DatabaseType(int value, String name, String literal)
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

} // DatabaseType
