/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Sensor</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.Sensor#getSensorMetaData <em>Sensor Meta Data</em>}</li>
 *   <li>{@link fr.ubo.fast.Sensor#getSensorMeasuredVariables <em>Sensor Measured Variables</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Sensor Meta Data</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.MetaData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Meta Data</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Meta Data</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getSensor_SensorMetaData()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaData> getSensorMetaData();

	/**
	 * Returns the value of the '<em><b>Sensor Measured Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.MeasuredVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Measured Variables</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Measured Variables</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getSensor_SensorMeasuredVariables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MeasuredVariable> getSensorMeasuredVariables();

} // Sensor
