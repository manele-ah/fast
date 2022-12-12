/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class FastFactoryImpl extends EFactoryImpl implements FastFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static FastFactory init()
	{
		try
		{
			FastFactory theFastFactory = (FastFactory) EPackage.Registry.INSTANCE.getEFactory(FastPackage.eNS_URI);
			if (theFastFactory != null)
			{
				return theFastFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FastFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public FastFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
		case FastPackage.TIME_SERIES_FRAMEWORK:
			return createTimeSeriesFramework();
		case FastPackage.NAMED_ELEMENT:
			return createNamedElement();
		case FastPackage.DATA:
			return createData();
		case FastPackage.SENSOR:
			return createSensor();
		case FastPackage.MEASURED_VARIABLE:
			return createMeasuredVariable();
		case FastPackage.META_DATA:
			return createMetaData();
		case FastPackage.TIME_SERIES:
			return createTimeSeries();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT:
			return createMinMaxVisualizationClient();
		case FastPackage.PLATFORM:
			return createPlatform();
		case FastPackage.COMPUTER:
			return createComputer();
		case FastPackage.DATABASE:
			return createDatabase();
		case FastPackage.WEB_SERVER:
			return createWebServer();
		case FastPackage.CONTAINER:
			return createContainer();
		case FastPackage.NETWORK:
			return createNetwork();
		case FastPackage.NETWORK_INTERFACE:
			return createNetworkInterface();
		case FastPackage.FILE:
			return createFile();
		case FastPackage.CALENDAR_SCALE:
			return createCalendarScale();
		case FastPackage.FACTOR_SCALE:
			return createFactorScale();
		case FastPackage.DOCKER_DEPLOYMENT:
			return createDockerDeployment();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
		case FastPackage.MEASUREMENT_DATA_UNIT:
			return createMeasurementDataUnitFromString(eDataType, initialValue);
		case FastPackage.PERIOD:
			return createPeriodFromString(eDataType, initialValue);
		case FastPackage.DATABASE_TYPE:
			return createDatabaseTypeFromString(eDataType, initialValue);
		case FastPackage.OS_TYPE:
			return createOSTypeFromString(eDataType, initialValue);
		case FastPackage.USER_POLICY:
			return createUserPolicyFromString(eDataType, initialValue);
		case FastPackage.WEB_SERVER_TYPE:
			return createWebServerTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
		case FastPackage.MEASUREMENT_DATA_UNIT:
			return convertMeasurementDataUnitToString(eDataType, instanceValue);
		case FastPackage.PERIOD:
			return convertPeriodToString(eDataType, instanceValue);
		case FastPackage.DATABASE_TYPE:
			return convertDatabaseTypeToString(eDataType, instanceValue);
		case FastPackage.OS_TYPE:
			return convertOSTypeToString(eDataType, instanceValue);
		case FastPackage.USER_POLICY:
			return convertUserPolicyToString(eDataType, instanceValue);
		case FastPackage.WEB_SERVER_TYPE:
			return convertWebServerTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeriesFramework createTimeSeriesFramework()
	{
		TimeSeriesFrameworkImpl timeSeriesFramework = new TimeSeriesFrameworkImpl();
		return timeSeriesFramework;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement()
	{
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData()
	{
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor()
	{
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredVariable createMeasuredVariable()
	{
		MeasuredVariableImpl measuredVariable = new MeasuredVariableImpl();
		return measuredVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData createMetaData()
	{
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeries createTimeSeries()
	{
		TimeSeriesImpl timeSeries = new TimeSeriesImpl();
		return timeSeries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MinMaxVisualizationClient createMinMaxVisualizationClient()
	{
		MinMaxVisualizationClientImpl minMaxVisualizationClient = new MinMaxVisualizationClientImpl();
		return minMaxVisualizationClient;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform()
	{
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Computer createComputer()
	{
		ComputerImpl computer = new ComputerImpl();
		return computer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase()
	{
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WebServer createWebServer()
	{
		WebServerImpl webServer = new WebServerImpl();
		return webServer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public fr.ubo.fast.Container createContainer()
	{
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork()
	{
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterface createNetworkInterface()
	{
		NetworkInterfaceImpl networkInterface = new NetworkInterfaceImpl();
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile()
	{
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CalendarScale createCalendarScale()
	{
		CalendarScaleImpl calendarScale = new CalendarScaleImpl();
		return calendarScale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FactorScale createFactorScale()
	{
		FactorScaleImpl factorScale = new FactorScaleImpl();
		return factorScale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DockerDeployment createDockerDeployment()
	{
		DockerDeploymentImpl dockerDeployment = new DockerDeploymentImpl();
		return dockerDeployment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementDataUnit createMeasurementDataUnitFromString(EDataType eDataType, String initialValue)
	{
		MeasurementDataUnit result = MeasurementDataUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementDataUnitToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriodFromString(EDataType eDataType, String initialValue)
	{
		Period result = Period.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeriodToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseType createDatabaseTypeFromString(EDataType eDataType, String initialValue)
	{
		DatabaseType result = DatabaseType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OSType createOSTypeFromString(EDataType eDataType, String initialValue)
	{
		OSType result = OSType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UserPolicy createUserPolicyFromString(EDataType eDataType, String initialValue)
	{
		UserPolicy result = UserPolicy.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserPolicyToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WebServerType createWebServerTypeFromString(EDataType eDataType, String initialValue)
	{
		WebServerType result = WebServerType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWebServerTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FastPackage getFastPackage()
	{
		return (FastPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FastPackage getPackage()
	{
		return FastPackage.eINSTANCE;
	}

} // FastFactoryImpl
