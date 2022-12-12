/**
 */
package fr.ubo.fast;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Meta
 * Data</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.MetaData#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getMetaData()
 * @model
 * @generated
 */
public interface MetaData extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.ubo.fast.FastPackage#getMetaData_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MetaData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // MetaData
