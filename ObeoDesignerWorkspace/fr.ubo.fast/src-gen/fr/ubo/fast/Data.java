/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Data</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.Data#getTimeSeriesData <em>Time Series Data</em>}</li>
 *   <li>{@link fr.ubo.fast.Data#getSensorsData <em>Sensors Data</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject
{
	/**
	 * Returns the value of the '<em><b>Time Series Data</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.TimeSeries}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series Data</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series Data</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getData_TimeSeriesData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeSeries> getTimeSeriesData();

	/**
	 * Returns the value of the '<em><b>Sensors Data</b></em>' containment reference
	 * list. The list contents are of type {@link fr.ubo.fast.Sensor}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors Data</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sensors Data</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getData_SensorsData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sensor> getSensorsData();

} // Data
