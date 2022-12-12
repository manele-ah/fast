/**
 */
package fr.ubo.fast;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see fr.ubo.fast.FastPackage
 * @generated
 */
public interface FastFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	FastFactory eINSTANCE = fr.ubo.fast.impl.FastFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Time Series Framework</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Time Series Framework</em>'.
	 * @generated
	 */
	TimeSeriesFramework createTimeSeriesFramework();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Measured Variable</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Measured Variable</em>'.
	 * @generated
	 */
	MeasuredVariable createMeasuredVariable();

	/**
	 * Returns a new object of class '<em>Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Data</em>'.
	 * @generated
	 */
	MetaData createMetaData();

	/**
	 * Returns a new object of class '<em>Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Series</em>'.
	 * @generated
	 */
	TimeSeries createTimeSeries();

	/**
	 * Returns a new object of class '<em>Min Max Visualization Client</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Min Max Visualization Client</em>'.
	 * @generated
	 */
	MinMaxVisualizationClient createMinMaxVisualizationClient();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer</em>'.
	 * @generated
	 */
	Computer createComputer();

	/**
	 * Returns a new object of class '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database</em>'.
	 * @generated
	 */
	Database createDatabase();

	/**
	 * Returns a new object of class '<em>Web Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Server</em>'.
	 * @generated
	 */
	WebServer createWebServer();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Network Interface</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Network Interface</em>'.
	 * @generated
	 */
	NetworkInterface createNetworkInterface();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Calendar Scale</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar Scale</em>'.
	 * @generated
	 */
	CalendarScale createCalendarScale();

	/**
	 * Returns a new object of class '<em>Factor Scale</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Factor Scale</em>'.
	 * @generated
	 */
	FactorScale createFactorScale();

	/**
	 * Returns a new object of class '<em>Docker Deployment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Docker Deployment</em>'.
	 * @generated
	 */
	DockerDeployment createDockerDeployment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FastPackage getFastPackage();

} // FastFactory
