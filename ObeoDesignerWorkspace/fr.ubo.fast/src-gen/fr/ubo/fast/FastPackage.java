/**
 */
package fr.ubo.fast;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.ubo.fast.FastFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface FastPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.ubo.fast";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	FastPackage eINSTANCE = fr.ubo.fast.impl.FastPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.TimeSeriesFrameworkImpl <em>Time Series Framework</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see fr.ubo.fast.impl.TimeSeriesFrameworkImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getTimeSeriesFramework()
	 * @generated
	 */
	int TIME_SERIES_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FRAMEWORK__DATA = 0;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FRAMEWORK__PLATFORM = 1;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FRAMEWORK__CLIENTS = 2;

	/**
	 * The number of structural features of the '<em>Time Series Framework</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FRAMEWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Series Framework</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.NamedElementImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.DataImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

	/**
	 * The feature id for the '<em><b>Time Series Data</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TIME_SERIES_DATA = 0;

	/**
	 * The feature id for the '<em><b>Sensors Data</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SENSORS_DATA = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.SensorImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sensor Meta Data</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_META_DATA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor Measured Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SENSOR_MEASURED_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.MeasuredVariableImpl
	 * <em>Measured Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.ubo.fast.impl.MeasuredVariableImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getMeasuredVariable()
	 * @generated
	 */
	int MEASURED_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE__UNIT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measured Variable Meta Data</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measured Variable</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measured Variable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MEASURED_VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.MetaDataImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meta Data</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int META_DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.TimeSeriesImpl <em>Time Series</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.TimeSeriesImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getTimeSeries()
	 * @generated
	 */
	int TIME_SERIES = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__START_TIME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__END_TIME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__PERIOD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Series Measured Variable</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Series Data Source</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__TIME_SERIES_DATA_SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES__ID = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Time Series</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Time Series</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_SERIES_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl <em>Min Max
	 * Visualization Client</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.ubo.fast.impl.MinMaxVisualizationClientImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getMinMaxVisualizationClient()
	 * @generated
	 */
	int MIN_MAX_VISUALIZATION_CLIENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Client Computer</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chart Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chart Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Policy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Scale</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Raw Data Threshold</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pre Computed Data Threshold</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>User Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__USER_TIME = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ping Time</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__PING_TIME = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Time Series Selected</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Axis Factor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Min Max Visualization Client</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Min Max Visualization Client</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_MAX_VISUALIZATION_CLIENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.PlatformImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 8;

	/**
	 * The feature id for the '<em><b>Computers Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__COMPUTERS_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Networks Platform</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NETWORKS_PLATFORM = 1;

	/**
	 * The number of structural features of the '<em>Platform</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Platform</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.ComputerImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__OS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ram Memory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER__RAM_MEMORY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Storage Memory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER__STORAGE_MEMORY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cpu Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CPU_NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CPU_FREQUENCY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cpu Cores Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CPU_CORES_NUMBER = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Computer Services</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__COMPUTER_SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Computer Network Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__COMPUTER_NETWORK_INTERFACES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__DEPLOYMENT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER__USERNAME = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER__PASSWORD = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Computer</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Computer</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.ServiceImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Service</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.DataSourceImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = SERVICE__NAME;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Source</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.DatabaseImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Dbms</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DBMS = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PORT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATABASE__USERNAME = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATABASE__PASSWORD = DATA_SOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Directory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATA_DIRECTORY = DATA_SOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Database</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Database</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.WebServerImpl <em>Web Server</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.WebServerImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getWebServer()
	 * @generated
	 */
	int WEB_SERVER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER__PORT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER__PROXY = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER__TYPE = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Web Server</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Web Server</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int WEB_SERVER_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.ContainerImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Container Services</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER_SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Network Interface</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER_NETWORK_INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.NetworkImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NETWORK__PREFIX = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__MASK = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NETWORK__GATEWAY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NETWORK__DOMAIN_NAME = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORK_INTERFACES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Network</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.NetworkInterfaceImpl
	 * <em>Network Interface</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.ubo.fast.impl.NetworkInterfaceImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getNetworkInterface()
	 * @generated
	 */
	int NETWORK_INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__IP_ADDRESS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network Interface</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.FileImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = DATA_SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = DATA_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.ScaleImpl <em>Scale</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.ScaleImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Scale</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCALE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.CalendarScaleImpl
	 * <em>Calendar Scale</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.ubo.fast.impl.CalendarScaleImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getCalendarScale()
	 * @generated
	 */
	int CALENDAR_SCALE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_SCALE__NAME = SCALE__NAME;

	/**
	 * The feature id for the '<em><b>Periods</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALENDAR_SCALE__PERIODS = SCALE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALENDAR_SCALE__FACTORS = SCALE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Calendar Scale</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALENDAR_SCALE_FEATURE_COUNT = SCALE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Calendar Scale</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALENDAR_SCALE_OPERATION_COUNT = SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.FactorScaleImpl <em>Factor Scale</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.impl.FactorScaleImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getFactorScale()
	 * @generated
	 */
	int FACTOR_SCALE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_SCALE__NAME = SCALE__NAME;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACTOR_SCALE__FACTOR = SCALE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zooms Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACTOR_SCALE__ZOOMS_NUMBER = SCALE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Factor Scale</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACTOR_SCALE_FEATURE_COUNT = SCALE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Factor Scale</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FACTOR_SCALE_OPERATION_COUNT = SCALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.VisualizationClientImpl <em>Visualization Client</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see fr.ubo.fast.impl.VisualizationClientImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getVisualizationClient()
	 * @generated
	 */
	int VISUALIZATION_CLIENT = 21;

	/**
	 * The number of structural features of the '<em>Visualization Client</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_CLIENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Visualization Client</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.impl.DockerDeploymentImpl
	 * <em>Docker Deployment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.ubo.fast.impl.DockerDeploymentImpl
	 * @see fr.ubo.fast.impl.FastPackageImpl#getDockerDeployment()
	 * @generated
	 */
	int DOCKER_DEPLOYMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_DEPLOYMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCKER_DEPLOYMENT__DIRECTORY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Docker Deployment</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_DEPLOYMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Docker Deployment</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCKER_DEPLOYMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.MeasurementDataUnit <em>Measurement Data Unit</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see fr.ubo.fast.MeasurementDataUnit
	 * @see fr.ubo.fast.impl.FastPackageImpl#getMeasurementDataUnit()
	 * @generated
	 */
	int MEASUREMENT_DATA_UNIT = 23;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.Period <em>Period</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.Period
	 * @see fr.ubo.fast.impl.FastPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 24;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.DatabaseType
	 * @see fr.ubo.fast.impl.FastPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 25;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.OSType <em>OS Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.OSType
	 * @see fr.ubo.fast.impl.FastPackageImpl#getOSType()
	 * @generated
	 */
	int OS_TYPE = 26;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.UserPolicy <em>User Policy</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.UserPolicy
	 * @see fr.ubo.fast.impl.FastPackageImpl#getUserPolicy()
	 * @generated
	 */
	int USER_POLICY = 27;

	/**
	 * The meta object id for the '{@link fr.ubo.fast.WebServerType <em>Web Server Type</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see fr.ubo.fast.WebServerType
	 * @see fr.ubo.fast.impl.FastPackageImpl#getWebServerType()
	 * @generated
	 */
	int WEB_SERVER_TYPE = 28;

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.TimeSeriesFramework
	 * <em>Time Series Framework</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Time Series Framework</em>'.
	 * @see fr.ubo.fast.TimeSeriesFramework
	 * @generated
	 */
	EClass getTimeSeriesFramework();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link fr.ubo.fast.TimeSeriesFramework#getData <em>Data</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see fr.ubo.fast.TimeSeriesFramework#getData()
	 * @see #getTimeSeriesFramework()
	 * @generated
	 */
	EReference getTimeSeriesFramework_Data();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link fr.ubo.fast.TimeSeriesFramework#getPlatform <em>Platform</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Platform</em>'.
	 * @see fr.ubo.fast.TimeSeriesFramework#getPlatform()
	 * @see #getTimeSeriesFramework()
	 * @generated
	 */
	EReference getTimeSeriesFramework_Platform();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ubo.fast.TimeSeriesFramework#getClients <em>Clients</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Clients</em>'.
	 * @see fr.ubo.fast.TimeSeriesFramework#getClients()
	 * @see #getTimeSeriesFramework()
	 * @generated
	 */
	EReference getTimeSeriesFramework_Clients();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.ubo.fast.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.ubo.fast.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Data <em>Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see fr.ubo.fast.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ubo.fast.Data#getTimeSeriesData <em>Time Series Data</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Time Series
	 *         Data</em>'.
	 * @see fr.ubo.fast.Data#getTimeSeriesData()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_TimeSeriesData();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link fr.ubo.fast.Data#getSensorsData <em>Sensors Data</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Sensors
	 *         Data</em>'.
	 * @see fr.ubo.fast.Data#getSensorsData()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_SensorsData();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see fr.ubo.fast.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.Sensor#getSensorMetaData <em>Sensor Meta Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor Meta Data</em>'.
	 * @see fr.ubo.fast.Sensor#getSensorMetaData()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_SensorMetaData();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.Sensor#getSensorMeasuredVariables <em>Sensor Measured Variables</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensor Measured Variables</em>'.
	 * @see fr.ubo.fast.Sensor#getSensorMeasuredVariables()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_SensorMeasuredVariables();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.MeasuredVariable <em>Measured Variable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Variable</em>'.
	 * @see fr.ubo.fast.MeasuredVariable
	 * @generated
	 */
	EClass getMeasuredVariable();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.MeasuredVariable#getUnit <em>Unit</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.ubo.fast.MeasuredVariable#getUnit()
	 * @see #getMeasuredVariable()
	 * @generated
	 */
	EAttribute getMeasuredVariable_Unit();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.MeasuredVariable#getMeasuredVariableMetaData <em>Measured Variable Meta Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measured Variable Meta Data</em>'.
	 * @see fr.ubo.fast.MeasuredVariable#getMeasuredVariableMetaData()
	 * @see #getMeasuredVariable()
	 * @generated
	 */
	EReference getMeasuredVariable_MeasuredVariableMetaData();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see fr.ubo.fast.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MetaData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.ubo.fast.MetaData#getValue()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Value();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.TimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Series</em>'.
	 * @see fr.ubo.fast.TimeSeries
	 * @generated
	 */
	EClass getTimeSeries();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.TimeSeries#getStartTime <em>Start Time</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see fr.ubo.fast.TimeSeries#getStartTime()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EAttribute getTimeSeries_StartTime();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.TimeSeries#getEndTime <em>End Time</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see fr.ubo.fast.TimeSeries#getEndTime()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EAttribute getTimeSeries_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.TimeSeries#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fr.ubo.fast.TimeSeries#getPeriod()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EAttribute getTimeSeries_Period();

	/**
	 * Returns the meta object for the reference '{@link fr.ubo.fast.TimeSeries#getTimeSeriesMeasuredVariable <em>Time Series Measured Variable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Series Measured Variable</em>'.
	 * @see fr.ubo.fast.TimeSeries#getTimeSeriesMeasuredVariable()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EReference getTimeSeries_TimeSeriesMeasuredVariable();

	/**
	 * Returns the meta object for the reference '{@link fr.ubo.fast.TimeSeries#getTimeSeriesDataSource <em>Time Series Data Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Series Data Source</em>'.
	 * @see fr.ubo.fast.TimeSeries#getTimeSeriesDataSource()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EReference getTimeSeries_TimeSeriesDataSource();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.TimeSeries#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.ubo.fast.TimeSeries#getId()
	 * @see #getTimeSeries()
	 * @generated
	 */
	EAttribute getTimeSeries_Id();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.MinMaxVisualizationClient <em>Min Max Visualization Client</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Max Visualization Client</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient
	 * @generated
	 */
	EClass getMinMaxVisualizationClient();

	/**
	 * Returns the meta object for the reference '{@link fr.ubo.fast.MinMaxVisualizationClient#getClientComputer <em>Client Computer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Computer</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getClientComputer()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EReference getMinMaxVisualizationClient_ClientComputer();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MinMaxVisualizationClient#getChartWidth <em>Chart Width</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chart Width</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getChartWidth()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EAttribute getMinMaxVisualizationClient_ChartWidth();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MinMaxVisualizationClient#getChartHeight <em>Chart Height</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chart Height</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getChartHeight()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EAttribute getMinMaxVisualizationClient_ChartHeight();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MinMaxVisualizationClient#getUserPolicy <em>User Policy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Policy</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getUserPolicy()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EAttribute getMinMaxVisualizationClient_UserPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link fr.ubo.fast.MinMaxVisualizationClient#getClientScale <em>Client Scale</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client Scale</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getClientScale()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EReference getMinMaxVisualizationClient_ClientScale();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MinMaxVisualizationClient#getRawDataThreshold <em>Raw Data Threshold</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Data Threshold</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getRawDataThreshold()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EAttribute getMinMaxVisualizationClient_RawDataThreshold();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MinMaxVisualizationClient#getPreComputedDataThreshold <em>Pre Computed Data Threshold</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Computed Data Threshold</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getPreComputedDataThreshold()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EAttribute getMinMaxVisualizationClient_PreComputedDataThreshold();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MinMaxVisualizationClient#getUserTime <em>User Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Time</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getUserTime()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EAttribute getMinMaxVisualizationClient_UserTime();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MinMaxVisualizationClient#getPingTime <em>Ping Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ping Time</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getPingTime()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EAttribute getMinMaxVisualizationClient_PingTime();

	/**
	 * Returns the meta object for the reference '{@link fr.ubo.fast.MinMaxVisualizationClient#getTimeSeriesSelected <em>Time Series Selected</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Series Selected</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getTimeSeriesSelected()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EReference getMinMaxVisualizationClient_TimeSeriesSelected();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.MinMaxVisualizationClient#getAxisFactor <em>Axis Factor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Factor</em>'.
	 * @see fr.ubo.fast.MinMaxVisualizationClient#getAxisFactor()
	 * @see #getMinMaxVisualizationClient()
	 * @generated
	 */
	EAttribute getMinMaxVisualizationClient_AxisFactor();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see fr.ubo.fast.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.Platform#getComputersPlatform <em>Computers Platform</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computers Platform</em>'.
	 * @see fr.ubo.fast.Platform#getComputersPlatform()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_ComputersPlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.Platform#getNetworksPlatform <em>Networks Platform</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks Platform</em>'.
	 * @see fr.ubo.fast.Platform#getNetworksPlatform()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_NetworksPlatform();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see fr.ubo.fast.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.Computer#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see fr.ubo.fast.Computer#getOs()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_Os();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Computer#getRamMemory <em>Ram Memory</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ram Memory</em>'.
	 * @see fr.ubo.fast.Computer#getRamMemory()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_RamMemory();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Computer#getStorageMemory <em>Storage Memory</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Storage Memory</em>'.
	 * @see fr.ubo.fast.Computer#getStorageMemory()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_StorageMemory();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Computer#getCpuNumber <em>Cpu Number</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Cpu Number</em>'.
	 * @see fr.ubo.fast.Computer#getCpuNumber()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_CpuNumber();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Computer#getCpuFrequency <em>Cpu Frequency</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Cpu Frequency</em>'.
	 * @see fr.ubo.fast.Computer#getCpuFrequency()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_CpuFrequency();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.Computer#getCpuCoresNumber <em>Cpu Cores Number</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Cores Number</em>'.
	 * @see fr.ubo.fast.Computer#getCpuCoresNumber()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_CpuCoresNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.Computer#getComputerServices <em>Computer Services</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computer Services</em>'.
	 * @see fr.ubo.fast.Computer#getComputerServices()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_ComputerServices();

	/**
	 * Returns the meta object for the reference list '{@link fr.ubo.fast.Computer#getComputerNetworkInterfaces <em>Computer Network Interfaces</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Computer Network Interfaces</em>'.
	 * @see fr.ubo.fast.Computer#getComputerNetworkInterfaces()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_ComputerNetworkInterfaces();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link fr.ubo.fast.Computer#getDeployment <em>Deployment</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Deployment</em>'.
	 * @see fr.ubo.fast.Computer#getDeployment()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Deployment();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Computer#getUsername <em>Username</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see fr.ubo.fast.Computer#getUsername()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_Username();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Computer#getPassword <em>Password</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see fr.ubo.fast.Computer#getPassword()
	 * @see #getComputer()
	 * @generated
	 */
	EAttribute getComputer_Password();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Service <em>Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see fr.ubo.fast.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Database <em>Database</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see fr.ubo.fast.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.Database#getDbms <em>Dbms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dbms</em>'.
	 * @see fr.ubo.fast.Database#getDbms()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Dbms();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.Database#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see fr.ubo.fast.Database#getPort()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Port();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Database#getUsername <em>Username</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see fr.ubo.fast.Database#getUsername()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Username();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Database#getPassword <em>Password</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see fr.ubo.fast.Database#getPassword()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Password();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Database#getDataDirectory <em>Data Directory</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Data Directory</em>'.
	 * @see fr.ubo.fast.Database#getDataDirectory()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_DataDirectory();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.WebServer <em>Web Server</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Server</em>'.
	 * @see fr.ubo.fast.WebServer
	 * @generated
	 */
	EClass getWebServer();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.WebServer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see fr.ubo.fast.WebServer#getPort()
	 * @see #getWebServer()
	 * @generated
	 */
	EAttribute getWebServer_Port();

	/**
	 * Returns the meta object for the reference list '{@link fr.ubo.fast.WebServer#getProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Proxy</em>'.
	 * @see fr.ubo.fast.WebServer#getProxy()
	 * @see #getWebServer()
	 * @generated
	 */
	EReference getWebServer_Proxy();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.WebServer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.ubo.fast.WebServer#getType()
	 * @see #getWebServer()
	 * @generated
	 */
	EAttribute getWebServer_Type();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Container <em>Container</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see fr.ubo.fast.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.Container#getContainerServices <em>Container Services</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Services</em>'.
	 * @see fr.ubo.fast.Container#getContainerServices()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ContainerServices();

	/**
	 * Returns the meta object for the reference '{@link fr.ubo.fast.Container#getContainerNetworkInterface <em>Container Network Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Network Interface</em>'.
	 * @see fr.ubo.fast.Container#getContainerNetworkInterface()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ContainerNetworkInterface();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Network <em>Network</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see fr.ubo.fast.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.Network#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see fr.ubo.fast.Network#getPrefix()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.Network#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see fr.ubo.fast.Network#getMask()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Mask();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Network#getGateway <em>Gateway</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Gateway</em>'.
	 * @see fr.ubo.fast.Network#getGateway()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Gateway();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.Network#getDomainName <em>Domain Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see fr.ubo.fast.Network#getDomainName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.Network#getNetworkInterfaces <em>Network Interfaces</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Interfaces</em>'.
	 * @see fr.ubo.fast.Network#getNetworkInterfaces()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_NetworkInterfaces();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface</em>'.
	 * @see fr.ubo.fast.NetworkInterface
	 * @generated
	 */
	EClass getNetworkInterface();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.NetworkInterface#getIpAddress <em>Ip Address</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see fr.ubo.fast.NetworkInterface#getIpAddress()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_IpAddress();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see fr.ubo.fast.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.File <em>File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see fr.ubo.fast.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link fr.ubo.fast.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.ubo.fast.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale</em>'.
	 * @see fr.ubo.fast.Scale
	 * @generated
	 */
	EClass getScale();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.CalendarScale <em>Calendar Scale</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Scale</em>'.
	 * @see fr.ubo.fast.CalendarScale
	 * @generated
	 */
	EClass getCalendarScale();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link fr.ubo.fast.CalendarScale#getPeriods <em>Periods</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Periods</em>'.
	 * @see fr.ubo.fast.CalendarScale#getPeriods()
	 * @see #getCalendarScale()
	 * @generated
	 */
	EAttribute getCalendarScale_Periods();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link fr.ubo.fast.CalendarScale#getFactors <em>Factors</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Factors</em>'.
	 * @see fr.ubo.fast.CalendarScale#getFactors()
	 * @see #getCalendarScale()
	 * @generated
	 */
	EAttribute getCalendarScale_Factors();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.FactorScale <em>Factor Scale</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Factor Scale</em>'.
	 * @see fr.ubo.fast.FactorScale
	 * @generated
	 */
	EClass getFactorScale();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.FactorScale#getFactor <em>Factor</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see fr.ubo.fast.FactorScale#getFactor()
	 * @see #getFactorScale()
	 * @generated
	 */
	EAttribute getFactorScale_Factor();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.FactorScale#getZoomsNumber <em>Zooms Number</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Zooms Number</em>'.
	 * @see fr.ubo.fast.FactorScale#getZoomsNumber()
	 * @see #getFactorScale()
	 * @generated
	 */
	EAttribute getFactorScale_ZoomsNumber();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.VisualizationClient
	 * <em>Visualization Client</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Visualization Client</em>'.
	 * @see fr.ubo.fast.VisualizationClient
	 * @generated
	 */
	EClass getVisualizationClient();

	/**
	 * Returns the meta object for class '{@link fr.ubo.fast.DockerDeployment <em>Docker Deployment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Deployment</em>'.
	 * @see fr.ubo.fast.DockerDeployment
	 * @generated
	 */
	EClass getDockerDeployment();

	/**
	 * Returns the meta object for the attribute
	 * '{@link fr.ubo.fast.DockerDeployment#getDirectory <em>Directory</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see fr.ubo.fast.DockerDeployment#getDirectory()
	 * @see #getDockerDeployment()
	 * @generated
	 */
	EAttribute getDockerDeployment_Directory();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.ubo.fast.DockerDeployment#getDeploymentContainers <em>Deployment Containers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Containers</em>'.
	 * @see fr.ubo.fast.DockerDeployment#getDeploymentContainers()
	 * @see #getDockerDeployment()
	 * @generated
	 */
	EReference getDockerDeployment_DeploymentContainers();

	/**
	 * Returns the meta object for enum '{@link fr.ubo.fast.MeasurementDataUnit
	 * <em>Measurement Data Unit</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for enum '<em>Measurement Data Unit</em>'.
	 * @see fr.ubo.fast.MeasurementDataUnit
	 * @generated
	 */
	EEnum getMeasurementDataUnit();

	/**
	 * Returns the meta object for enum '{@link fr.ubo.fast.Period <em>Period</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Period</em>'.
	 * @see fr.ubo.fast.Period
	 * @generated
	 */
	EEnum getPeriod();

	/**
	 * Returns the meta object for enum '{@link fr.ubo.fast.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see fr.ubo.fast.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

	/**
	 * Returns the meta object for enum '{@link fr.ubo.fast.OSType <em>OS Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS Type</em>'.
	 * @see fr.ubo.fast.OSType
	 * @generated
	 */
	EEnum getOSType();

	/**
	 * Returns the meta object for enum '{@link fr.ubo.fast.UserPolicy <em>User Policy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Policy</em>'.
	 * @see fr.ubo.fast.UserPolicy
	 * @generated
	 */
	EEnum getUserPolicy();

	/**
	 * Returns the meta object for enum '{@link fr.ubo.fast.WebServerType <em>Web Server Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Web Server Type</em>'.
	 * @see fr.ubo.fast.WebServerType
	 * @generated
	 */
	EEnum getWebServerType();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FastFactory getFastFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.TimeSeriesFrameworkImpl <em>Time Series Framework</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.TimeSeriesFrameworkImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getTimeSeriesFramework()
		 * @generated
		 */
		EClass TIME_SERIES_FRAMEWORK = eINSTANCE.getTimeSeriesFramework();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES_FRAMEWORK__DATA = eINSTANCE.getTimeSeriesFramework_Data();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES_FRAMEWORK__PLATFORM = eINSTANCE.getTimeSeriesFramework_Platform();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES_FRAMEWORK__CLIENTS = eINSTANCE.getTimeSeriesFramework_Clients();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.NamedElementImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.DataImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Time Series Data</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference DATA__TIME_SERIES_DATA = eINSTANCE.getData_TimeSeriesData();

		/**
		 * The meta object literal for the '<em><b>Sensors Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SENSORS_DATA = eINSTANCE.getData_SensorsData();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.SensorImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Sensor Meta Data</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference SENSOR__SENSOR_META_DATA = eINSTANCE.getSensor_SensorMetaData();

		/**
		 * The meta object literal for the '<em><b>Sensor Measured Variables</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference SENSOR__SENSOR_MEASURED_VARIABLES = eINSTANCE.getSensor_SensorMeasuredVariables();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.MeasuredVariableImpl
		 * <em>Measured Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.ubo.fast.impl.MeasuredVariableImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getMeasuredVariable()
		 * @generated
		 */
		EClass MEASURED_VARIABLE = eINSTANCE.getMeasuredVariable();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_VARIABLE__UNIT = eINSTANCE.getMeasuredVariable_Unit();

		/**
		 * The meta object literal for the '<em><b>Measured Variable Meta Data</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA = eINSTANCE
				.getMeasuredVariable_MeasuredVariableMetaData();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.MetaDataImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__VALUE = eINSTANCE.getMetaData_Value();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.TimeSeriesImpl <em>Time Series</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.TimeSeriesImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getTimeSeries()
		 * @generated
		 */
		EClass TIME_SERIES = eINSTANCE.getTimeSeries();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SERIES__START_TIME = eINSTANCE.getTimeSeries_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SERIES__END_TIME = eINSTANCE.getTimeSeries_EndTime();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SERIES__PERIOD = eINSTANCE.getTimeSeries_Period();

		/**
		 * The meta object literal for the '<em><b>Time Series Measured Variable</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE = eINSTANCE.getTimeSeries_TimeSeriesMeasuredVariable();

		/**
		 * The meta object literal for the '<em><b>Time Series Data Source</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SERIES__TIME_SERIES_DATA_SOURCE = eINSTANCE.getTimeSeries_TimeSeriesDataSource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TIME_SERIES__ID = eINSTANCE.getTimeSeries_Id();

		/**
		 * The meta object literal for the
		 * '{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl <em>Min Max
		 * Visualization Client</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.ubo.fast.impl.MinMaxVisualizationClientImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getMinMaxVisualizationClient()
		 * @generated
		 */
		EClass MIN_MAX_VISUALIZATION_CLIENT = eINSTANCE.getMinMaxVisualizationClient();

		/**
		 * The meta object literal for the '<em><b>Client Computer</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER = eINSTANCE.getMinMaxVisualizationClient_ClientComputer();

		/**
		 * The meta object literal for the '<em><b>Chart Width</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH = eINSTANCE.getMinMaxVisualizationClient_ChartWidth();

		/**
		 * The meta object literal for the '<em><b>Chart Height</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT = eINSTANCE.getMinMaxVisualizationClient_ChartHeight();

		/**
		 * The meta object literal for the '<em><b>User Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY = eINSTANCE.getMinMaxVisualizationClient_UserPolicy();

		/**
		 * The meta object literal for the '<em><b>Client Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE = eINSTANCE.getMinMaxVisualizationClient_ClientScale();

		/**
		 * The meta object literal for the '<em><b>Raw Data Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD = eINSTANCE
				.getMinMaxVisualizationClient_RawDataThreshold();

		/**
		 * The meta object literal for the '<em><b>Pre Computed Data Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD = eINSTANCE
				.getMinMaxVisualizationClient_PreComputedDataThreshold();

		/**
		 * The meta object literal for the '<em><b>User Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_MAX_VISUALIZATION_CLIENT__USER_TIME = eINSTANCE.getMinMaxVisualizationClient_UserTime();

		/**
		 * The meta object literal for the '<em><b>Ping Time</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_MAX_VISUALIZATION_CLIENT__PING_TIME = eINSTANCE.getMinMaxVisualizationClient_PingTime();

		/**
		 * The meta object literal for the '<em><b>Time Series Selected</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED = eINSTANCE
				.getMinMaxVisualizationClient_TimeSeriesSelected();

		/**
		 * The meta object literal for the '<em><b>Axis Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR = eINSTANCE.getMinMaxVisualizationClient_AxisFactor();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.PlatformImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>Computers Platform</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference PLATFORM__COMPUTERS_PLATFORM = eINSTANCE.getPlatform_ComputersPlatform();

		/**
		 * The meta object literal for the '<em><b>Networks Platform</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference PLATFORM__NETWORKS_PLATFORM = eINSTANCE.getPlatform_NetworksPlatform();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.ComputerImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute COMPUTER__OS = eINSTANCE.getComputer_Os();

		/**
		 * The meta object literal for the '<em><b>Ram Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__RAM_MEMORY = eINSTANCE.getComputer_RamMemory();

		/**
		 * The meta object literal for the '<em><b>Storage Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__STORAGE_MEMORY = eINSTANCE.getComputer_StorageMemory();

		/**
		 * The meta object literal for the '<em><b>Cpu Number</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__CPU_NUMBER = eINSTANCE.getComputer_CpuNumber();

		/**
		 * The meta object literal for the '<em><b>Cpu Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__CPU_FREQUENCY = eINSTANCE.getComputer_CpuFrequency();

		/**
		 * The meta object literal for the '<em><b>Cpu Cores Number</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__CPU_CORES_NUMBER = eINSTANCE.getComputer_CpuCoresNumber();

		/**
		 * The meta object literal for the '<em><b>Computer Services</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference COMPUTER__COMPUTER_SERVICES = eINSTANCE.getComputer_ComputerServices();

		/**
		 * The meta object literal for the '<em><b>Computer Network Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__COMPUTER_NETWORK_INTERFACES = eINSTANCE.getComputer_ComputerNetworkInterfaces();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__DEPLOYMENT = eINSTANCE.getComputer_Deployment();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__USERNAME = eINSTANCE.getComputer_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTER__PASSWORD = eINSTANCE.getComputer_Password();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.ServiceImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.DatabaseImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Dbms</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__DBMS = eINSTANCE.getDatabase_Dbms();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PORT = eINSTANCE.getDatabase_Port();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__USERNAME = eINSTANCE.getDatabase_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__PASSWORD = eINSTANCE.getDatabase_Password();

		/**
		 * The meta object literal for the '<em><b>Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__DATA_DIRECTORY = eINSTANCE.getDatabase_DataDirectory();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.WebServerImpl <em>Web Server</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.WebServerImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getWebServer()
		 * @generated
		 */
		EClass WEB_SERVER = eINSTANCE.getWebServer();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVER__PORT = eINSTANCE.getWebServer_Port();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SERVER__PROXY = eINSTANCE.getWebServer_Proxy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SERVER__TYPE = eINSTANCE.getWebServer_Type();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.ContainerImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Container Services</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference CONTAINER__CONTAINER_SERVICES = eINSTANCE.getContainer_ContainerServices();

		/**
		 * The meta object literal for the '<em><b>Container Network Interface</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINER_NETWORK_INTERFACE = eINSTANCE.getContainer_ContainerNetworkInterface();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.NetworkImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__PREFIX = eINSTANCE.getNetwork_Prefix();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__MASK = eINSTANCE.getNetwork_Mask();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__GATEWAY = eINSTANCE.getNetwork_Gateway();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__DOMAIN_NAME = eINSTANCE.getNetwork_DomainName();

		/**
		 * The meta object literal for the '<em><b>Network Interfaces</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference NETWORK__NETWORK_INTERFACES = eINSTANCE.getNetwork_NetworkInterfaces();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.NetworkInterfaceImpl
		 * <em>Network Interface</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.ubo.fast.impl.NetworkInterfaceImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getNetworkInterface()
		 * @generated
		 */
		EClass NETWORK_INTERFACE = eINSTANCE.getNetworkInterface();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__IP_ADDRESS = eINSTANCE.getNetworkInterface_IpAddress();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.DataSourceImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.FileImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.ScaleImpl <em>Scale</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.ScaleImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getScale()
		 * @generated
		 */
		EClass SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.CalendarScaleImpl
		 * <em>Calendar Scale</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.ubo.fast.impl.CalendarScaleImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getCalendarScale()
		 * @generated
		 */
		EClass CALENDAR_SCALE = eINSTANCE.getCalendarScale();

		/**
		 * The meta object literal for the '<em><b>Periods</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_SCALE__PERIODS = eINSTANCE.getCalendarScale_Periods();

		/**
		 * The meta object literal for the '<em><b>Factors</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALENDAR_SCALE__FACTORS = eINSTANCE.getCalendarScale_Factors();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.FactorScaleImpl <em>Factor Scale</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.FactorScaleImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getFactorScale()
		 * @generated
		 */
		EClass FACTOR_SCALE = eINSTANCE.getFactorScale();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR_SCALE__FACTOR = eINSTANCE.getFactorScale_Factor();

		/**
		 * The meta object literal for the '<em><b>Zooms Number</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACTOR_SCALE__ZOOMS_NUMBER = eINSTANCE.getFactorScale_ZoomsNumber();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.VisualizationClientImpl <em>Visualization Client</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.impl.VisualizationClientImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getVisualizationClient()
		 * @generated
		 */
		EClass VISUALIZATION_CLIENT = eINSTANCE.getVisualizationClient();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.impl.DockerDeploymentImpl
		 * <em>Docker Deployment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.ubo.fast.impl.DockerDeploymentImpl
		 * @see fr.ubo.fast.impl.FastPackageImpl#getDockerDeployment()
		 * @generated
		 */
		EClass DOCKER_DEPLOYMENT = eINSTANCE.getDockerDeployment();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_DEPLOYMENT__DIRECTORY = eINSTANCE.getDockerDeployment_Directory();

		/**
		 * The meta object literal for the '<em><b>Deployment Containers</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EReference DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS = eINSTANCE.getDockerDeployment_DeploymentContainers();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.MeasurementDataUnit <em>Measurement Data Unit</em>}' enum.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see fr.ubo.fast.MeasurementDataUnit
		 * @see fr.ubo.fast.impl.FastPackageImpl#getMeasurementDataUnit()
		 * @generated
		 */
		EEnum MEASUREMENT_DATA_UNIT = eINSTANCE.getMeasurementDataUnit();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.Period <em>Period</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.Period
		 * @see fr.ubo.fast.impl.FastPackageImpl#getPeriod()
		 * @generated
		 */
		EEnum PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.DatabaseType
		 * @see fr.ubo.fast.impl.FastPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.OSType <em>OS Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.OSType
		 * @see fr.ubo.fast.impl.FastPackageImpl#getOSType()
		 * @generated
		 */
		EEnum OS_TYPE = eINSTANCE.getOSType();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.UserPolicy <em>User Policy</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.UserPolicy
		 * @see fr.ubo.fast.impl.FastPackageImpl#getUserPolicy()
		 * @generated
		 */
		EEnum USER_POLICY = eINSTANCE.getUserPolicy();

		/**
		 * The meta object literal for the '{@link fr.ubo.fast.WebServerType <em>Web Server Type</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see fr.ubo.fast.WebServerType
		 * @see fr.ubo.fast.impl.FastPackageImpl#getWebServerType()
		 * @generated
		 */
		EEnum WEB_SERVER_TYPE = eINSTANCE.getWebServerType();

	}

} // FastPackage
