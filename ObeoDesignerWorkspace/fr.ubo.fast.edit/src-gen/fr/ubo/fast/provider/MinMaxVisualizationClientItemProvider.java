/**
 */
package fr.ubo.fast.provider;

import fr.ubo.fast.FastFactory;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.MinMaxVisualizationClient;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.ubo.fast.MinMaxVisualizationClient} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MinMaxVisualizationClientItemProvider extends NamedElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MinMaxVisualizationClientItemProvider(AdapterFactory adapterFactory)
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

			addClientComputerPropertyDescriptor(object);
			addChartWidthPropertyDescriptor(object);
			addChartHeightPropertyDescriptor(object);
			addUserPolicyPropertyDescriptor(object);
			addRawDataThresholdPropertyDescriptor(object);
			addPreComputedDataThresholdPropertyDescriptor(object);
			addUserTimePropertyDescriptor(object);
			addPingTimePropertyDescriptor(object);
			addTimeSeriesSelectedPropertyDescriptor(object);
			addAxisFactorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Client Computer feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addClientComputerPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_clientComputer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_clientComputer_feature",
								"_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Chart Width feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChartWidthPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_chartWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_chartWidth_feature",
								"_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Chart Height feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addChartHeightPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_chartHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_chartHeight_feature",
								"_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Policy feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUserPolicyPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_userPolicy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_userPolicy_feature",
								"_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Raw Data Threshold feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRawDataThresholdPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_rawDataThreshold_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_rawDataThreshold_feature",
								"_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pre Computed Data Threshold feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreComputedDataThresholdPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_preComputedDataThreshold_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MinMaxVisualizationClient_preComputedDataThreshold_feature", "_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User Time feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUserTimePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_userTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_userTime_feature",
								"_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ping Time feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPingTimePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_pingTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_pingTime_feature",
								"_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Time Series Selected feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTimeSeriesSelectedPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MinMaxVisualizationClient_timeSeriesSelected_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_timeSeriesSelected_feature",
						"_UI_MinMaxVisualizationClient_type"),
				FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Axis Factor feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAxisFactorPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MinMaxVisualizationClient_axisFactor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MinMaxVisualizationClient_axisFactor_feature",
								"_UI_MinMaxVisualizationClient_type"),
						FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MinMaxVisualizationClient.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MinMaxVisualizationClient"));
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
		String label = ((MinMaxVisualizationClient) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MinMaxVisualizationClient_type")
				: getString("_UI_MinMaxVisualizationClient_type") + " " + label;
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

		switch (notification.getFeatureID(MinMaxVisualizationClient.class))
		{
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH:
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT:
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY:
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD:
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD:
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME:
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME:
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE,
				FastFactory.eINSTANCE.createCalendarScale()));

		newChildDescriptors.add(createChildParameter(FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE,
				FastFactory.eINSTANCE.createFactorScale()));
	}

}
