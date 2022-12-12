/**
 */
package fr.ubo.fast.provider;

import fr.ubo.fast.FastPackage;
import fr.ubo.fast.TimeSeries;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.ubo.fast.TimeSeries} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class TimeSeriesItemProvider extends NamedElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TimeSeriesItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addStartTimePropertyDescriptor(object);
			addEndTimePropertyDescriptor(object);
			addPeriodPropertyDescriptor(object);
			addTimeSeriesMeasuredVariablePropertyDescriptor(object);
			addTimeSeriesDataSourcePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start Time feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStartTimePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(
						createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
								getResourceLocator(), getString("_UI_TimeSeries_startTime_feature"),
								getString("_UI_PropertyDescriptor_description", "_UI_TimeSeries_startTime_feature",
										"_UI_TimeSeries_type"),
								FastPackage.Literals.TIME_SERIES__START_TIME, true, false, false,
								ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the End Time feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndTimePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(
						createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
								getResourceLocator(), getString("_UI_TimeSeries_endTime_feature"),
								getString("_UI_PropertyDescriptor_description", "_UI_TimeSeries_endTime_feature",
										"_UI_TimeSeries_type"),
								FastPackage.Literals.TIME_SERIES__END_TIME, true, false, false,
								ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TimeSeries_period_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TimeSeries_period_feature", "_UI_TimeSeries_type"),
						FastPackage.Literals.TIME_SERIES__PERIOD, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Time Series Measured Variable feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSeriesMeasuredVariablePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TimeSeries_timeSeriesMeasuredVariable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TimeSeries_timeSeriesMeasuredVariable_feature",
								"_UI_TimeSeries_type"),
						FastPackage.Literals.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Time Series Data Source feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTimeSeriesDataSourcePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TimeSeries_timeSeriesDataSource_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TimeSeries_timeSeriesDataSource_feature",
								"_UI_TimeSeries_type"),
						FastPackage.Literals.TIME_SERIES__TIME_SERIES_DATA_SOURCE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TimeSeries_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_TimeSeries_id_feature", "_UI_TimeSeries_type"),
						FastPackage.Literals.TIME_SERIES__ID, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This returns TimeSeries.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimeSeries"));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage()
	{
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((TimeSeries) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TimeSeries_type")
				: getString("_UI_TimeSeries_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(TimeSeries.class))
		{
		case FastPackage.TIME_SERIES__START_TIME:
		case FastPackage.TIME_SERIES__END_TIME:
		case FastPackage.TIME_SERIES__PERIOD:
		case FastPackage.TIME_SERIES__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
