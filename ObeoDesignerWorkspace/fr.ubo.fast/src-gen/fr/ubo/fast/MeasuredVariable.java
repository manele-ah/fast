/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Measured
 * Variable</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.MeasuredVariable#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.ubo.fast.MeasuredVariable#getMeasuredVariableMetaData <em>Measured Variable Meta Data</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getMeasuredVariable()
 * @model
 * @generated
 */
public interface MeasuredVariable extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute. The literals are
	 * from the enumeration {@link fr.ubo.fast.MeasurementDataUnit}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see fr.ubo.fast.MeasurementDataUnit
	 * @see #setUnit(MeasurementDataUnit)
	 * @see fr.ubo.fast.FastPackage#getMeasuredVariable_Unit()
	 * @model required="true"
	 * @generated
	 */
	MeasurementDataUnit getUnit();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MeasuredVariable#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see fr.ubo.fast.MeasurementDataUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MeasurementDataUnit value);

	/**
	 * Returns the value of the '<em><b>Measured Variable Meta Data</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.MetaData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measured Variable Meta Data</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measured Variable Meta Data</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getMeasuredVariable_MeasuredVariableMetaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaData> getMeasuredVariableMetaData();

} // MeasuredVariable
