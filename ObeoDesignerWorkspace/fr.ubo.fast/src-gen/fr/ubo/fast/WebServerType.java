/**
 */
package fr.ubo.fast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Web Server Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.ubo.fast.FastPackage#getWebServerType()
 * @model
 * @generated
 */
public enum WebServerType implements Enumerator
{
	/**
	 * The '<em><b>Geo Server</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #GEO_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	GEO_SERVER(0, "GeoServer", "GeoServer"),
	/**
	 * The '<em><b>Apache</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #APACHE_VALUE
	 * @generated
	 * @ordered
	 */
	APACHE(1, "Apache", "Apache");

	/**
	 * The '<em><b>Geo Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Geo Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEO_SERVER
	 * @model name="GeoServer"
	 * @generated
	 * @ordered
	 */
	public static final int GEO_SERVER_VALUE = 0;

	/**
	 * The '<em><b>Apache</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Apache</b></em>' literal object isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APACHE
	 * @model name="Apache"
	 * @generated
	 * @ordered
	 */
	public static final int APACHE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Web Server Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final WebServerType[] VALUES_ARRAY = new WebServerType[] { GEO_SERVER, APACHE, };

	/**
	 * A public read-only list of all the '<em><b>Web Server Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WebServerType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Web Server Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebServerType get(String literal)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			WebServerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Web Server Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebServerType getByName(String name)
	{
		for (int i = 0; i < VALUES_ARRAY.length; ++i)
		{
			WebServerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name))
			{
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Web Server Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WebServerType get(int value)
	{
		switch (value)
		{
		case GEO_SERVER_VALUE:
			return GEO_SERVER;
		case APACHE_VALUE:
			return APACHE;
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
	private WebServerType(int value, String name, String literal)
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

} // WebServerType
