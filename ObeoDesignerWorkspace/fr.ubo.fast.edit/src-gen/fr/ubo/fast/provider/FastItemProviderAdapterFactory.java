/**
 */
package fr.ubo.fast.provider;

import fr.ubo.fast.util.FastAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class FastItemProviderAdapterFactory extends FastAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FastItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.TimeSeriesFramework} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSeriesFrameworkItemProvider timeSeriesFrameworkItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.TimeSeriesFramework}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTimeSeriesFrameworkAdapter()
	{
		if (timeSeriesFrameworkItemProvider == null)
		{
			timeSeriesFrameworkItemProvider = new TimeSeriesFrameworkItemProvider(this);
		}

		return timeSeriesFrameworkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.NamedElement} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.NamedElement}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter()
	{
		if (namedElementItemProvider == null)
		{
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.Data} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemProvider dataItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.Data}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataAdapter()
	{
		if (dataItemProvider == null)
		{
			dataItemProvider = new DataItemProvider(this);
		}

		return dataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.Sensor} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorItemProvider sensorItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.Sensor}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSensorAdapter()
	{
		if (sensorItemProvider == null)
		{
			sensorItemProvider = new SensorItemProvider(this);
		}

		return sensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.MeasuredVariable} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected MeasuredVariableItemProvider measuredVariableItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.MeasuredVariable}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMeasuredVariableAdapter()
	{
		if (measuredVariableItemProvider == null)
		{
			measuredVariableItemProvider = new MeasuredVariableItemProvider(this);
		}

		return measuredVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.MetaData} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataItemProvider metaDataItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.MetaData}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createMetaDataAdapter()
	{
		if (metaDataItemProvider == null)
		{
			metaDataItemProvider = new MetaDataItemProvider(this);
		}

		return metaDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.TimeSeries} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected TimeSeriesItemProvider timeSeriesItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.TimeSeries}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createTimeSeriesAdapter()
	{
		if (timeSeriesItemProvider == null)
		{
			timeSeriesItemProvider = new TimeSeriesItemProvider(this);
		}

		return timeSeriesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.MinMaxVisualizationClient} instances.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MinMaxVisualizationClientItemProvider minMaxVisualizationClientItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.MinMaxVisualizationClient}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinMaxVisualizationClientAdapter()
	{
		if (minMaxVisualizationClientItemProvider == null)
		{
			minMaxVisualizationClientItemProvider = new MinMaxVisualizationClientItemProvider(this);
		}

		return minMaxVisualizationClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.Platform} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformItemProvider platformItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.Platform}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createPlatformAdapter()
	{
		if (platformItemProvider == null)
		{
			platformItemProvider = new PlatformItemProvider(this);
		}

		return platformItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.Computer} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerItemProvider computerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.Computer}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createComputerAdapter()
	{
		if (computerItemProvider == null)
		{
			computerItemProvider = new ComputerItemProvider(this);
		}

		return computerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.Database} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseItemProvider databaseItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.Database}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDatabaseAdapter()
	{
		if (databaseItemProvider == null)
		{
			databaseItemProvider = new DatabaseItemProvider(this);
		}

		return databaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.WebServer} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected WebServerItemProvider webServerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.WebServer}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createWebServerAdapter()
	{
		if (webServerItemProvider == null)
		{
			webServerItemProvider = new WebServerItemProvider(this);
		}

		return webServerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.Container} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.Container}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter()
	{
		if (containerItemProvider == null)
		{
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.Network} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkItemProvider networkItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.Network}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createNetworkAdapter()
	{
		if (networkItemProvider == null)
		{
			networkItemProvider = new NetworkItemProvider(this);
		}

		return networkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.NetworkInterface} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected NetworkInterfaceItemProvider networkInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.NetworkInterface}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createNetworkInterfaceAdapter()
	{
		if (networkInterfaceItemProvider == null)
		{
			networkInterfaceItemProvider = new NetworkInterfaceItemProvider(this);
		}

		return networkInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.File} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FileItemProvider fileItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.File}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileAdapter()
	{
		if (fileItemProvider == null)
		{
			fileItemProvider = new FileItemProvider(this);
		}

		return fileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.CalendarScale} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected CalendarScaleItemProvider calendarScaleItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.CalendarScale}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createCalendarScaleAdapter()
	{
		if (calendarScaleItemProvider == null)
		{
			calendarScaleItemProvider = new CalendarScaleItemProvider(this);
		}

		return calendarScaleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.FactorScale} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected FactorScaleItemProvider factorScaleItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.FactorScale}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createFactorScaleAdapter()
	{
		if (factorScaleItemProvider == null)
		{
			factorScaleItemProvider = new FactorScaleItemProvider(this);
		}

		return factorScaleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.ubo.fast.DockerDeployment} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected DockerDeploymentItemProvider dockerDeploymentItemProvider;

	/**
	 * This creates an adapter for a {@link fr.ubo.fast.DockerDeployment}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createDockerDeploymentAdapter()
	{
		if (dockerDeploymentItemProvider == null)
		{
			dockerDeploymentItemProvider = new DockerDeploymentItemProvider(this);
		}

		return dockerDeploymentItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose()
	{
		if (timeSeriesFrameworkItemProvider != null)
			timeSeriesFrameworkItemProvider.dispose();
		if (namedElementItemProvider != null)
			namedElementItemProvider.dispose();
		if (dataItemProvider != null)
			dataItemProvider.dispose();
		if (sensorItemProvider != null)
			sensorItemProvider.dispose();
		if (measuredVariableItemProvider != null)
			measuredVariableItemProvider.dispose();
		if (metaDataItemProvider != null)
			metaDataItemProvider.dispose();
		if (timeSeriesItemProvider != null)
			timeSeriesItemProvider.dispose();
		if (minMaxVisualizationClientItemProvider != null)
			minMaxVisualizationClientItemProvider.dispose();
		if (platformItemProvider != null)
			platformItemProvider.dispose();
		if (computerItemProvider != null)
			computerItemProvider.dispose();
		if (databaseItemProvider != null)
			databaseItemProvider.dispose();
		if (webServerItemProvider != null)
			webServerItemProvider.dispose();
		if (containerItemProvider != null)
			containerItemProvider.dispose();
		if (networkItemProvider != null)
			networkItemProvider.dispose();
		if (networkInterfaceItemProvider != null)
			networkInterfaceItemProvider.dispose();
		if (fileItemProvider != null)
			fileItemProvider.dispose();
		if (calendarScaleItemProvider != null)
			calendarScaleItemProvider.dispose();
		if (factorScaleItemProvider != null)
			factorScaleItemProvider.dispose();
		if (dockerDeploymentItemProvider != null)
			dockerDeploymentItemProvider.dispose();
	}

}
