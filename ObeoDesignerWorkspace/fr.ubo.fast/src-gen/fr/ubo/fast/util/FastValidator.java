/**
 */
package fr.ubo.fast.util;

import fr.ubo.fast.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see fr.ubo.fast.FastPackage
 * @generated
 */
public class FastValidator extends EObjectValidator
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final FastValidator INSTANCE = new FastValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.ubo.fast";

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public FastValidator()
	{
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage()
	{
		return FastPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		switch (classifierID)
		{
		case FastPackage.TIME_SERIES_FRAMEWORK:
			return validateTimeSeriesFramework((TimeSeriesFramework) value, diagnostics, context);
		case FastPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case FastPackage.DATA:
			return validateData((Data) value, diagnostics, context);
		case FastPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case FastPackage.MEASURED_VARIABLE:
			return validateMeasuredVariable((MeasuredVariable) value, diagnostics, context);
		case FastPackage.META_DATA:
			return validateMetaData((MetaData) value, diagnostics, context);
		case FastPackage.TIME_SERIES:
			return validateTimeSeries((TimeSeries) value, diagnostics, context);
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT:
			return validateMinMaxVisualizationClient((MinMaxVisualizationClient) value, diagnostics, context);
		case FastPackage.PLATFORM:
			return validatePlatform((Platform) value, diagnostics, context);
		case FastPackage.COMPUTER:
			return validateComputer((Computer) value, diagnostics, context);
		case FastPackage.SERVICE:
			return validateService((Service) value, diagnostics, context);
		case FastPackage.DATABASE:
			return validateDatabase((Database) value, diagnostics, context);
		case FastPackage.WEB_SERVER:
			return validateWebServer((WebServer) value, diagnostics, context);
		case FastPackage.CONTAINER:
			return validateContainer((Container) value, diagnostics, context);
		case FastPackage.NETWORK:
			return validateNetwork((Network) value, diagnostics, context);
		case FastPackage.NETWORK_INTERFACE:
			return validateNetworkInterface((NetworkInterface) value, diagnostics, context);
		case FastPackage.DATA_SOURCE:
			return validateDataSource((DataSource) value, diagnostics, context);
		case FastPackage.FILE:
			return validateFile((File) value, diagnostics, context);
		case FastPackage.SCALE:
			return validateScale((Scale) value, diagnostics, context);
		case FastPackage.CALENDAR_SCALE:
			return validateCalendarScale((CalendarScale) value, diagnostics, context);
		case FastPackage.FACTOR_SCALE:
			return validateFactorScale((FactorScale) value, diagnostics, context);
		case FastPackage.VISUALIZATION_CLIENT:
			return validateVisualizationClient((VisualizationClient) value, diagnostics, context);
		case FastPackage.DOCKER_DEPLOYMENT:
			return validateDockerDeployment((DockerDeployment) value, diagnostics, context);
		case FastPackage.MEASUREMENT_DATA_UNIT:
			return validateMeasurementDataUnit((MeasurementDataUnit) value, diagnostics, context);
		case FastPackage.PERIOD:
			return validatePeriod((Period) value, diagnostics, context);
		case FastPackage.DATABASE_TYPE:
			return validateDatabaseType((DatabaseType) value, diagnostics, context);
		case FastPackage.OS_TYPE:
			return validateOSType((OSType) value, diagnostics, context);
		case FastPackage.USER_POLICY:
			return validateUserPolicy((UserPolicy) value, diagnostics, context);
		case FastPackage.WEB_SERVER_TYPE:
			return validateWebServerType((WebServerType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework(TimeSeriesFramework timeSeriesFramework, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(timeSeriesFramework, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesSensors(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesMeasuredVariables(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesMetaData(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesTimeSeries(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesMinMaxVisualizationClients(timeSeriesFramework, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesComputers(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesContainers(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesServices(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesNetworks(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesNetworkInterfaces(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesScales(timeSeriesFramework, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeriesFramework_differentNamesDockerDeployments(timeSeriesFramework, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the differentNamesSensors constraint of
	 * '<em>Time Series Framework</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_SENSORS__EEXPRESSION = "\n"
			+ "\t\t\tSensor.allInstances() -> forAll(sensor_1, sensor_2 | sensor_1 <> sensor_2 implies sensor_1.name <> sensor_2.name)";

	/**
	 * Validates the differentNamesSensors constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesSensors(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesSensors",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_SENSORS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesMeasuredVariables constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_MEASURED_VARIABLES__EEXPRESSION = "\n"
			+ "\t\t\tMeasuredVariable.allInstances() -> forAll(variable_1, variable_2 | variable_1 <> variable_2 implies variable_1.name <> variable_2.name)";

	/**
	 * Validates the differentNamesMeasuredVariables constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesMeasuredVariables(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesMeasuredVariables",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_MEASURED_VARIABLES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesMetaData constraint of
	 * '<em>Time Series Framework</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_META_DATA__EEXPRESSION = "\n"
			+ "\t\t\tMetaData.allInstances() -> forAll(data_1, data_2 | data_1 <> data_2 implies data_1.name <> data_2.name)";

	/**
	 * Validates the differentNamesMetaData constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesMetaData(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesMetaData",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_META_DATA__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesTimeSeries constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_TIME_SERIES__EEXPRESSION = "\n"
			+ "\t\t\tTimeSeries.allInstances() -> forAll(series_1, series_2 | series_1 <> series_2 implies series_1.name <> series_2.name)";

	/**
	 * Validates the differentNamesTimeSeries constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesTimeSeries(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesTimeSeries",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_TIME_SERIES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesMinMaxVisualizationClients constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_MIN_MAX_VISUALIZATION_CLIENTS__EEXPRESSION = "\n"
			+ "\t\t\tMinMaxVisualizationClient.allInstances() -> forAll(client_1, client_2 | client_1 <> client_2 implies client_1.name <> client_2.name)";

	/**
	 * Validates the differentNamesMinMaxVisualizationClients constraint of
	 * '<em>Time Series Framework</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesMinMaxVisualizationClients(
			TimeSeriesFramework timeSeriesFramework, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesMinMaxVisualizationClients",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_MIN_MAX_VISUALIZATION_CLIENTS__EEXPRESSION, Diagnostic.ERROR,
				DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesComputers constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_COMPUTERS__EEXPRESSION = "\n"
			+ "\t\t\tComputer.allInstances() -> forAll(computer_1, computer_2 | computer_1 <> computer_2 implies computer_1.name <> computer_2.name)";

	/**
	 * Validates the differentNamesComputers constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesComputers(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesComputers",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_COMPUTERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesContainers constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_CONTAINERS__EEXPRESSION = "\n"
			+ "\t\t\tContainer.allInstances() -> forAll(container_1, container_2 | container_1 <> container_2 implies container_1.name <> container_2.name)";

	/**
	 * Validates the differentNamesContainers constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesContainers(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesContainers",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_CONTAINERS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesServices constraint of
	 * '<em>Time Series Framework</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_SERVICES__EEXPRESSION = "\n"
			+ "\t\t\tService.allInstances() -> forAll(service_1, service_2 | service_1 <> service_2 implies service_1.name <> service_2.name)";

	/**
	 * Validates the differentNamesServices constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesServices(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesServices",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_SERVICES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesNetworks constraint of
	 * '<em>Time Series Framework</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_NETWORKS__EEXPRESSION = "\n"
			+ "\t\t\tNetwork.allInstances() -> forAll(network_1, network_2 | network_1 <> network_2 implies network_1.name <> network_2.name)";

	/**
	 * Validates the differentNamesNetworks constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesNetworks(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesNetworks",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_NETWORKS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesNetworkInterfaces constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_NETWORK_INTERFACES__EEXPRESSION = "\n"
			+ "\t\t\tNetworkInterface.allInstances() -> forAll(network_interface_1, network_interface_2 | network_interface_1 <> network_interface_2 implies network_interface_1.name <> network_interface_2.name)";

	/**
	 * Validates the differentNamesNetworkInterfaces constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesNetworkInterfaces(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesNetworkInterfaces",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_NETWORK_INTERFACES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesScales constraint of
	 * '<em>Time Series Framework</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_SCALES__EEXPRESSION = "\n"
			+ "\t\t\tScale.allInstances() -> forAll(scale_1, scale_2 | scale_1 <> scale_2 implies scale_1.name <> scale_2.name)";

	/**
	 * Validates the differentNamesScales constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesScales(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesScales",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_SCALES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the differentNamesDockerDeployments constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_DOCKER_DEPLOYMENTS__EEXPRESSION = "\n"
			+ "\t\t\tDockerDeployment.allInstances() -> forAll(deployment_1, deployment_2 | deployment_1 <> deployment_2 implies deployment_1.name <> deployment_2.name)";

	/**
	 * Validates the differentNamesDockerDeployments constraint of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeriesFramework_differentNamesDockerDeployments(TimeSeriesFramework timeSeriesFramework,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES_FRAMEWORK, timeSeriesFramework, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "differentNamesDockerDeployments",
				TIME_SERIES_FRAMEWORK__DIFFERENT_NAMES_DOCKER_DEPLOYMENTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuredVariable(MeasuredVariable measuredVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(measuredVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaData(MetaData metaData, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(metaData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeries(TimeSeries timeSeries, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		if (!validate_NoCircularContainment(timeSeries, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timeSeries, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timeSeries, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timeSeries, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timeSeries, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timeSeries, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timeSeries, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timeSeries, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timeSeries, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSeries_periodPositive(timeSeries, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the periodPositive constraint of '<em>Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SERIES__PERIOD_POSITIVE__EEXPRESSION = "\n" + "\t\t\tself.period > 0";

	/**
	 * Validates the periodPositive constraint of '<em>Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSeries_periodPositive(TimeSeries timeSeries, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return validate(FastPackage.Literals.TIME_SERIES, timeSeries, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "periodPositive", TIME_SERIES__PERIOD_POSITIVE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinMaxVisualizationClient(MinMaxVisualizationClient minMaxVisualizationClient,
			DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(minMaxVisualizationClient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlatform(Platform platform, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(platform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputer(Computer computer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(computer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(database, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebServer(WebServer webServer, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(webServer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(container, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(network, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkInterface(NetworkInterface networkInterface, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(networkInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSource(DataSource dataSource, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(dataSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(file, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScale(Scale scale, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(scale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendarScale(CalendarScale calendarScale, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(calendarScale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactorScale(FactorScale factorScale, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(factorScale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisualizationClient(VisualizationClient visualizationClient, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(visualizationClient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDockerDeployment(DockerDeployment dockerDeployment, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return validate_EveryDefaultConstraint(dockerDeployment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementDataUnit(MeasurementDataUnit measurementDataUnit, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeriod(Period period, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabaseType(DatabaseType databaseType, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSType(OSType osType, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserPolicy(UserPolicy userPolicy, DiagnosticChain diagnostics, Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWebServerType(WebServerType webServerType, DiagnosticChain diagnostics,
			Map<Object, Object> context)
	{
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // FastValidator
