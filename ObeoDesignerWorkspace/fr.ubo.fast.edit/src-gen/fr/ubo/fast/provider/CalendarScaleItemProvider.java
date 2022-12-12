/**
 */
package fr.ubo.fast.provider;

import fr.ubo.fast.CalendarScale;
import fr.ubo.fast.FastPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.ubo.fast.CalendarScale} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class CalendarScaleItemProvider extends ScaleItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CalendarScaleItemProvider(AdapterFactory adapterFactory)
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

			addPeriodsPropertyDescriptor(object);
			addFactorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Periods feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CalendarScale_periods_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CalendarScale_periods_feature",
								"_UI_CalendarScale_type"),
						FastPackage.Literals.CALENDAR_SCALE__PERIODS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Factors feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFactorsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CalendarScale_factors_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CalendarScale_factors_feature",
								"_UI_CalendarScale_type"),
						FastPackage.Literals.CALENDAR_SCALE__FACTORS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CalendarScale.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CalendarScale"));
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
		String label = ((CalendarScale) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CalendarScale_type")
				: getString("_UI_CalendarScale_type") + " " + label;
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

		switch (notification.getFeatureID(CalendarScale.class))
		{
		case FastPackage.CALENDAR_SCALE__PERIODS:
		case FastPackage.CALENDAR_SCALE__FACTORS:
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
