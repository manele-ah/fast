/**
 */
package fr.ubo.fast.util;

import fr.ubo.fast.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see fr.ubo.fast.FastPackage
 * @generated
 */
public class FastAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static FastPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public FastAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = FastPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!--
	 * begin-user-doc --> This implementation returns <code>true</code> if the
	 * object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FastSwitch<Adapter> modelSwitch = new FastSwitch<Adapter>()
	{
		@Override
		public Adapter caseTimeSeriesFramework(TimeSeriesFramework object)
		{
			return createTimeSeriesFrameworkAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object)
		{
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseData(Data object)
		{
			return createDataAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object)
		{
			return createSensorAdapter();
		}

		@Override
		public Adapter caseMeasuredVariable(MeasuredVariable object)
		{
			return createMeasuredVariableAdapter();
		}

		@Override
		public Adapter caseMetaData(MetaData object)
		{
			return createMetaDataAdapter();
		}

		@Override
		public Adapter caseTimeSeries(TimeSeries object)
		{
			return createTimeSeriesAdapter();
		}

		@Override
		public Adapter caseMinMaxVisualizationClient(MinMaxVisualizationClient object)
		{
			return createMinMaxVisualizationClientAdapter();
		}

		@Override
		public Adapter casePlatform(Platform object)
		{
			return createPlatformAdapter();
		}

		@Override
		public Adapter caseComputer(Computer object)
		{
			return createComputerAdapter();
		}

		@Override
		public Adapter caseService(Service object)
		{
			return createServiceAdapter();
		}

		@Override
		public Adapter caseDatabase(Database object)
		{
			return createDatabaseAdapter();
		}

		@Override
		public Adapter caseWebServer(WebServer object)
		{
			return createWebServerAdapter();
		}

		@Override
		public Adapter caseContainer(Container object)
		{
			return createContainerAdapter();
		}

		@Override
		public Adapter caseNetwork(Network object)
		{
			return createNetworkAdapter();
		}

		@Override
		public Adapter caseNetworkInterface(NetworkInterface object)
		{
			return createNetworkInterfaceAdapter();
		}

		@Override
		public Adapter caseDataSource(DataSource object)
		{
			return createDataSourceAdapter();
		}

		@Override
		public Adapter caseFile(File object)
		{
			return createFileAdapter();
		}

		@Override
		public Adapter caseScale(Scale object)
		{
			return createScaleAdapter();
		}

		@Override
		public Adapter caseCalendarScale(CalendarScale object)
		{
			return createCalendarScaleAdapter();
		}

		@Override
		public Adapter caseFactorScale(FactorScale object)
		{
			return createFactorScaleAdapter();
		}

		@Override
		public Adapter caseVisualizationClient(VisualizationClient object)
		{
			return createVisualizationClientAdapter();
		}

		@Override
		public Adapter caseDockerDeployment(DockerDeployment object)
		{
			return createDockerDeploymentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object)
		{
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.TimeSeriesFramework <em>Time Series Framework</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.TimeSeriesFramework
	 * @generated
	 */
	public Adapter createTimeSeriesFrameworkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Data <em>Data</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Data
	 * @generated
	 */
	public Adapter createDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link fr.ubo.fast.MeasuredVariable <em>Measured Variable</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.ubo.fast.MeasuredVariable
	 * @generated
	 */
	public Adapter createMeasuredVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.MetaData
	 * @generated
	 */
	public Adapter createMetaDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.TimeSeries <em>Time Series</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.TimeSeries
	 * @generated
	 */
	public Adapter createTimeSeriesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.MinMaxVisualizationClient <em>Min Max Visualization Client</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.MinMaxVisualizationClient
	 * @generated
	 */
	public Adapter createMinMaxVisualizationClientAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Computer
	 * @generated
	 */
	public Adapter createComputerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Service <em>Service</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Service
	 * @generated
	 */
	public Adapter createServiceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Database <em>Database</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.WebServer <em>Web Server</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.WebServer
	 * @generated
	 */
	public Adapter createWebServerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Container <em>Container</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Container
	 * @generated
	 */
	public Adapter createContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Network <em>Network</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link fr.ubo.fast.NetworkInterface <em>Network Interface</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.ubo.fast.NetworkInterface
	 * @generated
	 */
	public Adapter createNetworkInterfaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.File <em>File</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.File
	 * @generated
	 */
	public Adapter createFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.Scale
	 * @generated
	 */
	public Adapter createScaleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link fr.ubo.fast.CalendarScale <em>Calendar Scale</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.ubo.fast.CalendarScale
	 * @generated
	 */
	public Adapter createCalendarScaleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.ubo.fast.FactorScale <em>Factor Scale</em>}'.
	 * <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.ubo.fast.FactorScale
	 * @generated
	 */
	public Adapter createFactorScaleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link fr.ubo.fast.VisualizationClient <em>Visualization Client</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.ubo.fast.VisualizationClient
	 * @generated
	 */
	public Adapter createVisualizationClientAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link fr.ubo.fast.DockerDeployment <em>Docker Deployment</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.ubo.fast.DockerDeployment
	 * @generated
	 */
	public Adapter createDockerDeploymentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} // FastAdapterFactory
