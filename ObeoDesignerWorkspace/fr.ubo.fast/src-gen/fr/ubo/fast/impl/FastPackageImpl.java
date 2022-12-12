/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.CalendarScale;
import fr.ubo.fast.Computer;
import fr.ubo.fast.Data;
import fr.ubo.fast.DataSource;
import fr.ubo.fast.Database;
import fr.ubo.fast.DatabaseType;
import fr.ubo.fast.DockerDeployment;
import fr.ubo.fast.FactorScale;
import fr.ubo.fast.FastFactory;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.File;
import fr.ubo.fast.MeasuredVariable;
import fr.ubo.fast.MeasurementDataUnit;
import fr.ubo.fast.MetaData;
import fr.ubo.fast.MinMaxVisualizationClient;
import fr.ubo.fast.NamedElement;
import fr.ubo.fast.Network;
import fr.ubo.fast.NetworkInterface;
import fr.ubo.fast.OSType;
import fr.ubo.fast.Period;
import fr.ubo.fast.Platform;
import fr.ubo.fast.Scale;
import fr.ubo.fast.Sensor;
import fr.ubo.fast.Service;
import fr.ubo.fast.TimeSeries;
import fr.ubo.fast.TimeSeriesFramework;
import fr.ubo.fast.UserPolicy;
import fr.ubo.fast.VisualizationClient;
import fr.ubo.fast.WebServer;
import fr.ubo.fast.WebServerType;

import fr.ubo.fast.util.FastValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class FastPackageImpl extends EPackageImpl implements FastPackage
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSeriesFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredVariableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSeriesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minMaxVisualizationClientEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webServerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calendarScaleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factorScaleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationClientEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerDeploymentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementDataUnitEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum periodEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum osTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum webServerTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.ubo.fast.FastPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FastPackageImpl()
	{
		super(eNS_URI, FastFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FastPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FastPackage init()
	{
		if (isInited)
			return (FastPackage) EPackage.Registry.INSTANCE.getEPackage(FastPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFastPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FastPackageImpl theFastPackage = registeredFastPackage instanceof FastPackageImpl
				? (FastPackageImpl) registeredFastPackage
				: new FastPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFastPackage.createPackageContents();

		// Initialize created meta-data
		theFastPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theFastPackage, new EValidator.Descriptor()
		{
			public EValidator getEValidator()
			{
				return FastValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theFastPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FastPackage.eNS_URI, theFastPackage);
		return theFastPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSeriesFramework()
	{
		return timeSeriesFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeriesFramework_Data()
	{
		return (EReference) timeSeriesFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeriesFramework_Platform()
	{
		return (EReference) timeSeriesFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeriesFramework_Clients()
	{
		return (EReference) timeSeriesFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement()
	{
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name()
	{
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData()
	{
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_TimeSeriesData()
	{
		return (EReference) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_SensorsData()
	{
		return (EReference) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor()
	{
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_SensorMetaData()
	{
		return (EReference) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_SensorMeasuredVariables()
	{
		return (EReference) sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasuredVariable()
	{
		return measuredVariableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredVariable_Unit()
	{
		return (EAttribute) measuredVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasuredVariable_MeasuredVariableMetaData()
	{
		return (EReference) measuredVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaData()
	{
		return metaDataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaData_Value()
	{
		return (EAttribute) metaDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSeries()
	{
		return timeSeriesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSeries_StartTime()
	{
		return (EAttribute) timeSeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSeries_EndTime()
	{
		return (EAttribute) timeSeriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSeries_Period()
	{
		return (EAttribute) timeSeriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeries_TimeSeriesMeasuredVariable()
	{
		return (EReference) timeSeriesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSeries_TimeSeriesDataSource()
	{
		return (EReference) timeSeriesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSeries_Id()
	{
		return (EAttribute) timeSeriesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinMaxVisualizationClient()
	{
		return minMaxVisualizationClientEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinMaxVisualizationClient_ClientComputer()
	{
		return (EReference) minMaxVisualizationClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinMaxVisualizationClient_ChartWidth()
	{
		return (EAttribute) minMaxVisualizationClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinMaxVisualizationClient_ChartHeight()
	{
		return (EAttribute) minMaxVisualizationClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinMaxVisualizationClient_UserPolicy()
	{
		return (EAttribute) minMaxVisualizationClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinMaxVisualizationClient_ClientScale()
	{
		return (EReference) minMaxVisualizationClientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinMaxVisualizationClient_RawDataThreshold()
	{
		return (EAttribute) minMaxVisualizationClientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinMaxVisualizationClient_PreComputedDataThreshold()
	{
		return (EAttribute) minMaxVisualizationClientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinMaxVisualizationClient_UserTime()
	{
		return (EAttribute) minMaxVisualizationClientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinMaxVisualizationClient_PingTime()
	{
		return (EAttribute) minMaxVisualizationClientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinMaxVisualizationClient_TimeSeriesSelected()
	{
		return (EReference) minMaxVisualizationClientEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMinMaxVisualizationClient_AxisFactor()
	{
		return (EAttribute) minMaxVisualizationClientEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform()
	{
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_ComputersPlatform()
	{
		return (EReference) platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_NetworksPlatform()
	{
		return (EReference) platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputer()
	{
		return computerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_Os()
	{
		return (EAttribute) computerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_RamMemory()
	{
		return (EAttribute) computerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_StorageMemory()
	{
		return (EAttribute) computerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_CpuNumber()
	{
		return (EAttribute) computerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_CpuFrequency()
	{
		return (EAttribute) computerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_CpuCoresNumber()
	{
		return (EAttribute) computerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_ComputerServices()
	{
		return (EReference) computerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_ComputerNetworkInterfaces()
	{
		return (EReference) computerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputer_Deployment()
	{
		return (EReference) computerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_Username()
	{
		return (EAttribute) computerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputer_Password()
	{
		return (EAttribute) computerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService()
	{
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase()
	{
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Dbms()
	{
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Port()
	{
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Username()
	{
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_Password()
	{
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabase_DataDirectory()
	{
		return (EAttribute) databaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebServer()
	{
		return webServerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebServer_Port()
	{
		return (EAttribute) webServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebServer_Proxy()
	{
		return (EReference) webServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebServer_Type()
	{
		return (EAttribute) webServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer()
	{
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_ContainerServices()
	{
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_ContainerNetworkInterface()
	{
		return (EReference) containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork()
	{
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Prefix()
	{
		return (EAttribute) networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Mask()
	{
		return (EAttribute) networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Gateway()
	{
		return (EAttribute) networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_DomainName()
	{
		return (EAttribute) networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_NetworkInterfaces()
	{
		return (EReference) networkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkInterface()
	{
		return networkInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkInterface_IpAddress()
	{
		return (EAttribute) networkInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource()
	{
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile()
	{
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Path()
	{
		return (EAttribute) fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScale()
	{
		return scaleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalendarScale()
	{
		return calendarScaleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarScale_Periods()
	{
		return (EAttribute) calendarScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalendarScale_Factors()
	{
		return (EAttribute) calendarScaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactorScale()
	{
		return factorScaleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactorScale_Factor()
	{
		return (EAttribute) factorScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactorScale_ZoomsNumber()
	{
		return (EAttribute) factorScaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualizationClient()
	{
		return visualizationClientEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerDeployment()
	{
		return dockerDeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerDeployment_Directory()
	{
		return (EAttribute) dockerDeploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerDeployment_DeploymentContainers()
	{
		return (EReference) dockerDeploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurementDataUnit()
	{
		return measurementDataUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPeriod()
	{
		return periodEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseType()
	{
		return databaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOSType()
	{
		return osTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserPolicy()
	{
		return userPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWebServerType()
	{
		return webServerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FastFactory getFastFactory()
	{
		return (FastFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		timeSeriesFrameworkEClass = createEClass(TIME_SERIES_FRAMEWORK);
		createEReference(timeSeriesFrameworkEClass, TIME_SERIES_FRAMEWORK__DATA);
		createEReference(timeSeriesFrameworkEClass, TIME_SERIES_FRAMEWORK__PLATFORM);
		createEReference(timeSeriesFrameworkEClass, TIME_SERIES_FRAMEWORK__CLIENTS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__TIME_SERIES_DATA);
		createEReference(dataEClass, DATA__SENSORS_DATA);

		sensorEClass = createEClass(SENSOR);
		createEReference(sensorEClass, SENSOR__SENSOR_META_DATA);
		createEReference(sensorEClass, SENSOR__SENSOR_MEASURED_VARIABLES);

		measuredVariableEClass = createEClass(MEASURED_VARIABLE);
		createEAttribute(measuredVariableEClass, MEASURED_VARIABLE__UNIT);
		createEReference(measuredVariableEClass, MEASURED_VARIABLE__MEASURED_VARIABLE_META_DATA);

		metaDataEClass = createEClass(META_DATA);
		createEAttribute(metaDataEClass, META_DATA__VALUE);

		timeSeriesEClass = createEClass(TIME_SERIES);
		createEAttribute(timeSeriesEClass, TIME_SERIES__START_TIME);
		createEAttribute(timeSeriesEClass, TIME_SERIES__END_TIME);
		createEAttribute(timeSeriesEClass, TIME_SERIES__PERIOD);
		createEReference(timeSeriesEClass, TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE);
		createEReference(timeSeriesEClass, TIME_SERIES__TIME_SERIES_DATA_SOURCE);
		createEAttribute(timeSeriesEClass, TIME_SERIES__ID);

		minMaxVisualizationClientEClass = createEClass(MIN_MAX_VISUALIZATION_CLIENT);
		createEReference(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER);
		createEAttribute(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH);
		createEAttribute(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT);
		createEAttribute(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY);
		createEReference(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE);
		createEAttribute(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD);
		createEAttribute(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD);
		createEAttribute(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__USER_TIME);
		createEAttribute(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__PING_TIME);
		createEReference(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED);
		createEAttribute(minMaxVisualizationClientEClass, MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR);

		platformEClass = createEClass(PLATFORM);
		createEReference(platformEClass, PLATFORM__COMPUTERS_PLATFORM);
		createEReference(platformEClass, PLATFORM__NETWORKS_PLATFORM);

		computerEClass = createEClass(COMPUTER);
		createEAttribute(computerEClass, COMPUTER__OS);
		createEAttribute(computerEClass, COMPUTER__RAM_MEMORY);
		createEAttribute(computerEClass, COMPUTER__STORAGE_MEMORY);
		createEAttribute(computerEClass, COMPUTER__CPU_NUMBER);
		createEAttribute(computerEClass, COMPUTER__CPU_FREQUENCY);
		createEAttribute(computerEClass, COMPUTER__CPU_CORES_NUMBER);
		createEReference(computerEClass, COMPUTER__COMPUTER_SERVICES);
		createEReference(computerEClass, COMPUTER__COMPUTER_NETWORK_INTERFACES);
		createEReference(computerEClass, COMPUTER__DEPLOYMENT);
		createEAttribute(computerEClass, COMPUTER__USERNAME);
		createEAttribute(computerEClass, COMPUTER__PASSWORD);

		serviceEClass = createEClass(SERVICE);

		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__DBMS);
		createEAttribute(databaseEClass, DATABASE__PORT);
		createEAttribute(databaseEClass, DATABASE__USERNAME);
		createEAttribute(databaseEClass, DATABASE__PASSWORD);
		createEAttribute(databaseEClass, DATABASE__DATA_DIRECTORY);

		webServerEClass = createEClass(WEB_SERVER);
		createEAttribute(webServerEClass, WEB_SERVER__PORT);
		createEReference(webServerEClass, WEB_SERVER__PROXY);
		createEAttribute(webServerEClass, WEB_SERVER__TYPE);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTAINER_SERVICES);
		createEReference(containerEClass, CONTAINER__CONTAINER_NETWORK_INTERFACE);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__PREFIX);
		createEAttribute(networkEClass, NETWORK__MASK);
		createEAttribute(networkEClass, NETWORK__GATEWAY);
		createEAttribute(networkEClass, NETWORK__DOMAIN_NAME);
		createEReference(networkEClass, NETWORK__NETWORK_INTERFACES);

		networkInterfaceEClass = createEClass(NETWORK_INTERFACE);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__IP_ADDRESS);

		dataSourceEClass = createEClass(DATA_SOURCE);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__PATH);

		scaleEClass = createEClass(SCALE);

		calendarScaleEClass = createEClass(CALENDAR_SCALE);
		createEAttribute(calendarScaleEClass, CALENDAR_SCALE__PERIODS);
		createEAttribute(calendarScaleEClass, CALENDAR_SCALE__FACTORS);

		factorScaleEClass = createEClass(FACTOR_SCALE);
		createEAttribute(factorScaleEClass, FACTOR_SCALE__FACTOR);
		createEAttribute(factorScaleEClass, FACTOR_SCALE__ZOOMS_NUMBER);

		visualizationClientEClass = createEClass(VISUALIZATION_CLIENT);

		dockerDeploymentEClass = createEClass(DOCKER_DEPLOYMENT);
		createEAttribute(dockerDeploymentEClass, DOCKER_DEPLOYMENT__DIRECTORY);
		createEReference(dockerDeploymentEClass, DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS);

		// Create enums
		measurementDataUnitEEnum = createEEnum(MEASUREMENT_DATA_UNIT);
		periodEEnum = createEEnum(PERIOD);
		databaseTypeEEnum = createEEnum(DATABASE_TYPE);
		osTypeEEnum = createEEnum(OS_TYPE);
		userPolicyEEnum = createEEnum(USER_POLICY);
		webServerTypeEEnum = createEEnum(WEB_SERVER_TYPE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is
	 * guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sensorEClass.getESuperTypes().add(this.getNamedElement());
		measuredVariableEClass.getESuperTypes().add(this.getNamedElement());
		metaDataEClass.getESuperTypes().add(this.getNamedElement());
		timeSeriesEClass.getESuperTypes().add(this.getNamedElement());
		minMaxVisualizationClientEClass.getESuperTypes().add(this.getNamedElement());
		minMaxVisualizationClientEClass.getESuperTypes().add(this.getVisualizationClient());
		computerEClass.getESuperTypes().add(this.getNamedElement());
		serviceEClass.getESuperTypes().add(this.getNamedElement());
		databaseEClass.getESuperTypes().add(this.getDataSource());
		webServerEClass.getESuperTypes().add(this.getService());
		containerEClass.getESuperTypes().add(this.getNamedElement());
		networkEClass.getESuperTypes().add(this.getNamedElement());
		networkInterfaceEClass.getESuperTypes().add(this.getNamedElement());
		dataSourceEClass.getESuperTypes().add(this.getService());
		fileEClass.getESuperTypes().add(this.getDataSource());
		scaleEClass.getESuperTypes().add(this.getNamedElement());
		calendarScaleEClass.getESuperTypes().add(this.getScale());
		factorScaleEClass.getESuperTypes().add(this.getScale());
		dockerDeploymentEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(timeSeriesFrameworkEClass, TimeSeriesFramework.class, "TimeSeriesFramework", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSeriesFramework_Data(), this.getData(), null, "data", null, 1, 1, TimeSeriesFramework.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSeriesFramework_Platform(), this.getPlatform(), null, "platform", null, 1, 1,
				TimeSeriesFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSeriesFramework_Clients(), this.getVisualizationClient(), null, "clients", null, 1, -1,
				TimeSeriesFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_TimeSeriesData(), this.getTimeSeries(), null, "timeSeriesData", null, 1, -1, Data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getData_SensorsData(), this.getSensor(), null, "sensorsData", null, 1, -1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSensor_SensorMetaData(), this.getMetaData(), null, "sensorMetaData", null, 0, -1, Sensor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_SensorMeasuredVariables(), this.getMeasuredVariable(), null, "sensorMeasuredVariables",
				null, 1, -1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measuredVariableEClass, MeasuredVariable.class, "MeasuredVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasuredVariable_Unit(), this.getMeasurementDataUnit(), "unit", null, 1, 1,
				MeasuredVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMeasuredVariable_MeasuredVariableMetaData(), this.getMetaData(), null, "measuredVariableMetaData",
				null, 0, -1, MeasuredVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaData_Value(), ecorePackage.getEString(), "value", null, 1, 1, MetaData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSeriesEClass, TimeSeries.class, "TimeSeries", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSeries_StartTime(), ecorePackage.getEString(), "startTime", null, 1, 1, TimeSeries.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSeries_EndTime(), ecorePackage.getEString(), "endTime", null, 1, 1, TimeSeries.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSeries_Period(), ecorePackage.getEDouble(), "period", "1", 1, 1, TimeSeries.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSeries_TimeSeriesMeasuredVariable(), this.getMeasuredVariable(), null,
				"timeSeriesMeasuredVariable", null, 1, 1, TimeSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSeries_TimeSeriesDataSource(), this.getDataSource(), null, "timeSeriesDataSource", null, 1, 1,
				TimeSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSeries_Id(), ecorePackage.getEInt(), "id", "1", 1, 1, TimeSeries.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minMaxVisualizationClientEClass, MinMaxVisualizationClient.class, "MinMaxVisualizationClient",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinMaxVisualizationClient_ClientComputer(), this.getComputer(), null, "clientComputer", null, 1,
				1, MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinMaxVisualizationClient_ChartWidth(), ecorePackage.getEInt(), "chartWidth", "800", 1, 1,
				MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinMaxVisualizationClient_ChartHeight(), ecorePackage.getEInt(), "chartHeight", "400", 1, 1,
				MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinMaxVisualizationClient_UserPolicy(), this.getUserPolicy(), "userPolicy", null, 1, 1,
				MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMinMaxVisualizationClient_ClientScale(), this.getScale(), null, "clientScale", null, 1, 1,
				MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinMaxVisualizationClient_RawDataThreshold(), ecorePackage.getEDouble(), "rawDataThreshold", null,
				1, 1, MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinMaxVisualizationClient_PreComputedDataThreshold(), ecorePackage.getEDouble(),
				"preComputedDataThreshold", null, 1, 1, MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinMaxVisualizationClient_UserTime(), ecorePackage.getEDouble(), "userTime", "250.0", 1, 1,
				MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinMaxVisualizationClient_PingTime(), ecorePackage.getEDouble(), "pingTime", null, 1, 1,
				MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMinMaxVisualizationClient_TimeSeriesSelected(), this.getTimeSeries(), null, "timeSeriesSelected",
				null, 1, 1, MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMinMaxVisualizationClient_AxisFactor(), ecorePackage.getEInt(), "axisFactor", "10", 1, 1,
				MinMaxVisualizationClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatform_ComputersPlatform(), this.getComputer(), null, "computersPlatform", null, 1, -1,
				Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_NetworksPlatform(), this.getNetwork(), null, "networksPlatform", null, 1, -1,
				Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computerEClass, Computer.class, "Computer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputer_Os(), this.getOSType(), "os", null, 1, 1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_RamMemory(), ecorePackage.getEInt(), "ramMemory", "16384", 1, 1, Computer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_StorageMemory(), ecorePackage.getEInt(), "storageMemory", "512000", 1, 1, Computer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_CpuNumber(), ecorePackage.getEInt(), "cpuNumber", "2", 1, 1, Computer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_CpuFrequency(), ecorePackage.getEInt(), "cpuFrequency", "3200", 1, 1, Computer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_CpuCoresNumber(), ecorePackage.getEInt(), "cpuCoresNumber", "8", 1, 1, Computer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_ComputerServices(), this.getService(), null, "computerServices", null, 0, -1,
				Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_ComputerNetworkInterfaces(), this.getNetworkInterface(), null,
				"computerNetworkInterfaces", null, 1, -1, Computer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputer_Deployment(), this.getDockerDeployment(), null, "deployment", null, 0, 1, Computer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_Username(), ecorePackage.getEString(), "username", null, 1, 1, Computer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComputer_Password(), ecorePackage.getEString(), "password", null, 1, 1, Computer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Dbms(), this.getDatabaseType(), "dbms", null, 1, 1, Database.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Port(), ecorePackage.getEInt(), "port", "5432", 1, 1, Database.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Username(), ecorePackage.getEString(), "username", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Password(), ecorePackage.getEString(), "password", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_DataDirectory(), ecorePackage.getEString(), "dataDirectory", null, 1, 1, Database.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webServerEClass, WebServer.class, "WebServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebServer_Port(), ecorePackage.getEInt(), "port", "8080", 1, 1, WebServer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebServer_Proxy(), this.getDataSource(), null, "proxy", null, 0, -1, WebServer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebServer_Type(), this.getWebServerType(), "type", "GeoServer", 1, 1, WebServer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, fr.ubo.fast.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_ContainerServices(), this.getService(), null, "containerServices", null, 1, -1,
				fr.ubo.fast.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_ContainerNetworkInterface(), this.getNetworkInterface(), null,
				"containerNetworkInterface", null, 1, 1, fr.ubo.fast.Container.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Prefix(), ecorePackage.getEString(), "prefix", null, 1, 1, Network.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Mask(), ecorePackage.getEString(), "mask", null, 1, 1, Network.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_Gateway(), ecorePackage.getEString(), "gateway", null, 1, 1, Network.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_DomainName(), ecorePackage.getEString(), "domainName", null, 1, 1, Network.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_NetworkInterfaces(), this.getNetworkInterface(), null, "networkInterfaces", null, 1, -1,
				Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkInterfaceEClass, NetworkInterface.class, "NetworkInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkInterface_IpAddress(), ecorePackage.getEString(), "ipAddress", null, 1, 1,
				NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Path(), ecorePackage.getEString(), "path", null, 1, 1, File.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleEClass, Scale.class, "Scale", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(calendarScaleEClass, CalendarScale.class, "CalendarScale", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalendarScale_Periods(), this.getPeriod(), "periods", null, 1, -1, CalendarScale.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalendarScale_Factors(), ecorePackage.getELong(), "factors", null, 1, -1, CalendarScale.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factorScaleEClass, FactorScale.class, "FactorScale", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFactorScale_Factor(), ecorePackage.getEInt(), "factor", "2", 1, 1, FactorScale.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactorScale_ZoomsNumber(), ecorePackage.getEInt(), "zoomsNumber", "10", 1, 1, FactorScale.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualizationClientEClass, VisualizationClient.class, "VisualizationClient", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dockerDeploymentEClass, DockerDeployment.class, "DockerDeployment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerDeployment_Directory(), ecorePackage.getEString(), "directory", null, 1, 1,
				DockerDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDockerDeployment_DeploymentContainers(), this.getContainer(), null, "deploymentContainers", null,
				1, -1, DockerDeployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(measurementDataUnitEEnum, MeasurementDataUnit.class, "MeasurementDataUnit");
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.CELSIUS);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.METER);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.METER_PER_SECOND);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.BAR);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.LITER);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.GRAM);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.RADIAN);
		addEEnumLiteral(measurementDataUnitEEnum, MeasurementDataUnit.NONE);

		initEEnum(periodEEnum, Period.class, "Period");
		addEEnumLiteral(periodEEnum, Period.MILLISECOND);
		addEEnumLiteral(periodEEnum, Period.SECOND);
		addEEnumLiteral(periodEEnum, Period.MINUTE);
		addEEnumLiteral(periodEEnum, Period.HOUR);
		addEEnumLiteral(periodEEnum, Period.DAY);
		addEEnumLiteral(periodEEnum, Period.MONTH);
		addEEnumLiteral(periodEEnum, Period.YEAR);

		initEEnum(databaseTypeEEnum, DatabaseType.class, "DatabaseType");
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.TIME_SCALE_DB);
		addEEnumLiteral(databaseTypeEEnum, DatabaseType.INFLUX_DB);

		initEEnum(osTypeEEnum, OSType.class, "OSType");
		addEEnumLiteral(osTypeEEnum, OSType.LINUX);
		addEEnumLiteral(osTypeEEnum, OSType.WINDOWS);
		addEEnumLiteral(osTypeEEnum, OSType.MAC_OS);

		initEEnum(userPolicyEEnum, UserPolicy.class, "UserPolicy");
		addEEnumLiteral(userPolicyEEnum, UserPolicy.NAVIGATION_DIRECTIONS);

		initEEnum(webServerTypeEEnum, WebServerType.class, "WebServerType");
		addEEnumLiteral(webServerTypeEEnum, WebServerType.GEO_SERVER);
		addEEnumLiteral(webServerTypeEEnum, WebServerType.APACHE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations()
	{
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "settingDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(timeSeriesFrameworkEClass, source, new String[] { "constraints",
				"differentNamesSensors differentNamesMeasuredVariables differentNamesMetaData differentNamesTimeSeries differentNamesMinMaxVisualizationClients differentNamesComputers differentNamesContainers differentNamesServices differentNamesNetworks differentNamesNetworkInterfaces differentNamesScales differentNamesDockerDeployments" });
		addAnnotation(timeSeriesEClass, source, new String[] { "constraints", "periodPositive" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations()
	{
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(timeSeriesFrameworkEClass, source, new String[] { "differentNamesSensors",
				"\n\t\t\tSensor.allInstances() -> forAll(sensor_1, sensor_2 | sensor_1 <> sensor_2 implies sensor_1.name <> sensor_2.name)",
				"differentNamesMeasuredVariables",
				"\n\t\t\tMeasuredVariable.allInstances() -> forAll(variable_1, variable_2 | variable_1 <> variable_2 implies variable_1.name <> variable_2.name)",
				"differentNamesMetaData",
				"\n\t\t\tMetaData.allInstances() -> forAll(data_1, data_2 | data_1 <> data_2 implies data_1.name <> data_2.name)",
				"differentNamesTimeSeries",
				"\n\t\t\tTimeSeries.allInstances() -> forAll(series_1, series_2 | series_1 <> series_2 implies series_1.name <> series_2.name)",
				"differentNamesMinMaxVisualizationClients",
				"\n\t\t\tMinMaxVisualizationClient.allInstances() -> forAll(client_1, client_2 | client_1 <> client_2 implies client_1.name <> client_2.name)",
				"differentNamesComputers",
				"\n\t\t\tComputer.allInstances() -> forAll(computer_1, computer_2 | computer_1 <> computer_2 implies computer_1.name <> computer_2.name)",
				"differentNamesContainers",
				"\n\t\t\tContainer.allInstances() -> forAll(container_1, container_2 | container_1 <> container_2 implies container_1.name <> container_2.name)",
				"differentNamesServices",
				"\n\t\t\tService.allInstances() -> forAll(service_1, service_2 | service_1 <> service_2 implies service_1.name <> service_2.name)",
				"differentNamesNetworks",
				"\n\t\t\tNetwork.allInstances() -> forAll(network_1, network_2 | network_1 <> network_2 implies network_1.name <> network_2.name)",
				"differentNamesNetworkInterfaces",
				"\n\t\t\tNetworkInterface.allInstances() -> forAll(network_interface_1, network_interface_2 | network_interface_1 <> network_interface_2 implies network_interface_1.name <> network_interface_2.name)",
				"differentNamesScales",
				"\n\t\t\tScale.allInstances() -> forAll(scale_1, scale_2 | scale_1 <> scale_2 implies scale_1.name <> scale_2.name)",
				"differentNamesDockerDeployments",
				"\n\t\t\tDockerDeployment.allInstances() -> forAll(deployment_1, deployment_2 | deployment_1 <> deployment_2 implies deployment_1.name <> deployment_2.name)" });
		addAnnotation(timeSeriesEClass, source, new String[] { "periodPositive", "\n\t\t\tself.period > 0" });
	}

} // FastPackageImpl
