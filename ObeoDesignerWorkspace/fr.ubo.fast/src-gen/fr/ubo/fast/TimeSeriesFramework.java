/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Time
 * Series Framework</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.TimeSeriesFramework#getData <em>Data</em>}</li>
 *   <li>{@link fr.ubo.fast.TimeSeriesFramework#getPlatform <em>Platform</em>}</li>
 *   <li>{@link fr.ubo.fast.TimeSeriesFramework#getClients <em>Clients</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getTimeSeriesFramework()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentNamesSensors differentNamesMeasuredVariables differentNamesMetaData differentNamesTimeSeries differentNamesMinMaxVisualizationClients differentNamesComputers differentNamesContainers differentNamesServices differentNamesNetworks differentNamesNetworkInterfaces differentNamesScales differentNamesDockerDeployments'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentNamesSensors='\n\t\t\tSensor.allInstances() -&gt; forAll(sensor_1, sensor_2 | sensor_1 &lt;&gt; sensor_2 implies sensor_1.name &lt;&gt; sensor_2.name)' differentNamesMeasuredVariables='\n\t\t\tMeasuredVariable.allInstances() -&gt; forAll(variable_1, variable_2 | variable_1 &lt;&gt; variable_2 implies variable_1.name &lt;&gt; variable_2.name)' differentNamesMetaData='\n\t\t\tMetaData.allInstances() -&gt; forAll(data_1, data_2 | data_1 &lt;&gt; data_2 implies data_1.name &lt;&gt; data_2.name)' differentNamesTimeSeries='\n\t\t\tTimeSeries.allInstances() -&gt; forAll(series_1, series_2 | series_1 &lt;&gt; series_2 implies series_1.name &lt;&gt; series_2.name)' differentNamesMinMaxVisualizationClients='\n\t\t\tMinMaxVisualizationClient.allInstances() -&gt; forAll(client_1, client_2 | client_1 &lt;&gt; client_2 implies client_1.name &lt;&gt; client_2.name)' differentNamesComputers='\n\t\t\tComputer.allInstances() -&gt; forAll(computer_1, computer_2 | computer_1 &lt;&gt; computer_2 implies computer_1.name &lt;&gt; computer_2.name)' differentNamesContainers='\n\t\t\tContainer.allInstances() -&gt; forAll(container_1, container_2 | container_1 &lt;&gt; container_2 implies container_1.name &lt;&gt; container_2.name)' differentNamesServices='\n\t\t\tService.allInstances() -&gt; forAll(service_1, service_2 | service_1 &lt;&gt; service_2 implies service_1.name &lt;&gt; service_2.name)' differentNamesNetworks='\n\t\t\tNetwork.allInstances() -&gt; forAll(network_1, network_2 | network_1 &lt;&gt; network_2 implies network_1.name &lt;&gt; network_2.name)' differentNamesNetworkInterfaces='\n\t\t\tNetworkInterface.allInstances() -&gt; forAll(network_interface_1, network_interface_2 | network_interface_1 &lt;&gt; network_interface_2 implies network_interface_1.name &lt;&gt; network_interface_2.name)' differentNamesScales='\n\t\t\tScale.allInstances() -&gt; forAll(scale_1, scale_2 | scale_1 &lt;&gt; scale_2 implies scale_1.name &lt;&gt; scale_2.name)' differentNamesDockerDeployments='\n\t\t\tDockerDeployment.allInstances() -&gt; forAll(deployment_1, deployment_2 | deployment_1 &lt;&gt; deployment_2 implies deployment_1.name &lt;&gt; deployment_2.name)'"
 * @generated
 */
public interface TimeSeriesFramework extends EObject
{
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(Data)
	 * @see fr.ubo.fast.FastPackage#getTimeSeriesFramework_Data()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.TimeSeriesFramework#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' containment reference.
	 * @see #setPlatform(Platform)
	 * @see fr.ubo.fast.FastPackage#getTimeSeriesFramework_Platform()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Platform getPlatform();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.TimeSeriesFramework#getPlatform <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' containment reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(Platform value);

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.VisualizationClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getTimeSeriesFramework_Clients()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VisualizationClient> getClients();

} // TimeSeriesFramework
