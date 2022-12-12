/**
 */
package fr.ubo.fast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>User Policy</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.ubo.fast.FastPackage#getUserPolicy()
 * @model
 * @generated
 */
public enum UserPolicy implements Enumerator
{
	/**
	 * The '<em><b>Navigation Directions</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #NAVIGATION_DIRECTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	NAVIGATION_DIRECTIONS(0, "NavigationDirections", "NavigationDirections");

	/**
	 * The '<em><b>Navigation Directions</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Navigation Directions</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NAVIGATION_DIRECTIONS
	 * @model name="NavigationDirections"
	 * @generated
	 * @ordered
	 */
	public static final int NAVIGATION_DIRECTIONS_VALUE = 0;

	/**
	 * An array of all the '<em><b>User Policy</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final UserPolicy[] VALUES_ARRAY = new UserPolicy[] { NAVIGATION_DIRECTIONS, };

	/**
	 * A public read-only list of all the '<em><b>User Policy</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserPolicy get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			UserPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserPolicy getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			UserPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserPolicy get(int value)
	{
		switch (value)
		{
		case NAVIGATION_DIRECTIONS_VALUE:
			return NAVIGATION_DIRECTIONS;
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
	private UserPolicy(int value, String name, String literal)
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

} // UserPolicy
