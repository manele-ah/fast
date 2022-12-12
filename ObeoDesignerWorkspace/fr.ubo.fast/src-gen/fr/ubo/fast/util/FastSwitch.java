/**
 */
package fr.ubo.fast.util;

import fr.ubo.fast.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see fr.ubo.fast.FastPackage
 * @generated
 */
public class FastSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static FastPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public FastSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = FastPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
		case FastPackage.TIME_SERIES_FRAMEWORK:
		{
			TimeSeriesFramework timeSeriesFramework = (TimeSeriesFramework) theEObject;
			T result = caseTimeSeriesFramework(timeSeriesFramework);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.NAMED_ELEMENT:
		{
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.DATA:
		{
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.SENSOR:
		{
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseNamedElement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.MEASURED_VARIABLE:
		{
			MeasuredVariable measuredVariable = (MeasuredVariable) theEObject;
			T result = caseMeasuredVariable(measuredVariable);
			if (result == null)
				result = caseNamedElement(measuredVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.META_DATA:
		{
			MetaData metaData = (MetaData) theEObject;
			T result = caseMetaData(metaData);
			if (result == null)
				result = caseNamedElement(metaData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.TIME_SERIES:
		{
			TimeSeries timeSeries = (TimeSeries) theEObject;
			T result = caseTimeSeries(timeSeries);
			if (result == null)
				result = caseNamedElement(timeSeries);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT:
		{
			MinMaxVisualizationClient minMaxVisualizationClient = (MinMaxVisualizationClient) theEObject;
			T result = caseMinMaxVisualizationClient(minMaxVisualizationClient);
			if (result == null)
				result = caseNamedElement(minMaxVisualizationClient);
			if (result == null)
				result = caseVisualizationClient(minMaxVisualizationClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.PLATFORM:
		{
			Platform platform = (Platform) theEObject;
			T result = casePlatform(platform);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.COMPUTER:
		{
			Computer computer = (Computer) theEObject;
			T result = caseComputer(computer);
			if (result == null)
				result = caseNamedElement(computer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.SERVICE:
		{
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = caseNamedElement(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.DATABASE:
		{
			Database database = (Database) theEObject;
			T result = caseDatabase(database);
			if (result == null)
				result = caseDataSource(database);
			if (result == null)
				result = caseService(database);
			if (result == null)
				result = caseNamedElement(database);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.WEB_SERVER:
		{
			WebServer webServer = (WebServer) theEObject;
			T result = caseWebServer(webServer);
			if (result == null)
				result = caseService(webServer);
			if (result == null)
				result = caseNamedElement(webServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.CONTAINER:
		{
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = caseNamedElement(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.NETWORK:
		{
			Network network = (Network) theEObject;
			T result = caseNetwork(network);
			if (result == null)
				result = caseNamedElement(network);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.NETWORK_INTERFACE:
		{
			NetworkInterface networkInterface = (NetworkInterface) theEObject;
			T result = caseNetworkInterface(networkInterface);
			if (result == null)
				result = caseNamedElement(networkInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.DATA_SOURCE:
		{
			DataSource dataSource = (DataSource) theEObject;
			T result = caseDataSource(dataSource);
			if (result == null)
				result = caseService(dataSource);
			if (result == null)
				result = caseNamedElement(dataSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.FILE:
		{
			File file = (File) theEObject;
			T result = caseFile(file);
			if (result == null)
				result = caseDataSource(file);
			if (result == null)
				result = caseService(file);
			if (result == null)
				result = caseNamedElement(file);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.SCALE:
		{
			Scale scale = (Scale) theEObject;
			T result = caseScale(scale);
			if (result == null)
				result = caseNamedElement(scale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.CALENDAR_SCALE:
		{
			CalendarScale calendarScale = (CalendarScale) theEObject;
			T result = caseCalendarScale(calendarScale);
			if (result == null)
				result = caseScale(calendarScale);
			if (result == null)
				result = caseNamedElement(calendarScale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.FACTOR_SCALE:
		{
			FactorScale factorScale = (FactorScale) theEObject;
			T result = caseFactorScale(factorScale);
			if (result == null)
				result = caseScale(factorScale);
			if (result == null)
				result = caseNamedElement(factorScale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.VISUALIZATION_CLIENT:
		{
			VisualizationClient visualizationClient = (VisualizationClient) theEObject;
			T result = caseVisualizationClient(visualizationClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FastPackage.DOCKER_DEPLOYMENT:
		{
			DockerDeployment dockerDeployment = (DockerDeployment) theEObject;
			T result = caseDockerDeployment(dockerDeployment);
			if (result == null)
				result = caseNamedElement(dockerDeployment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Series Framework</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Series Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSeriesFramework(TimeSeriesFramework object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Variable</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredVariable(MeasuredVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaData(MetaData object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Series</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSeries(TimeSeries object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Max Visualization Client</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Max Visualization Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinMaxVisualizationClient(MinMaxVisualizationClient object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputer(Computer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Server</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebServer(WebServer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkInterface(NetworkInterface object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScale(Scale object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar Scale</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalendarScale(CalendarScale object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factor Scale</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factor Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactorScale(FactorScale object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization Client</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizationClient(VisualizationClient object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Deployment</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerDeployment(DockerDeployment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last
	 * case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} // FastSwitch
