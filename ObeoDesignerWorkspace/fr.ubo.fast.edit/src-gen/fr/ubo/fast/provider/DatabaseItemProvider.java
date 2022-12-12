/**
 */
package fr.ubo.fast.provider;

import fr.ubo.fast.Database;
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
 * This is the item provider adapter for a {@link fr.ubo.fast.Database} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class DatabaseItemProvider extends DataSourceItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DatabaseItemProvider(AdapterFactory adapterFactory)
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

			addDbmsPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addDataDirectoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dbms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDbmsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Database_dbms_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Database_dbms_feature", "_UI_Database_type"),
						FastPackage.Literals.DATABASE__DBMS, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Database_port_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Database_port_feature", "_UI_Database_type"),
						FastPackage.Literals.DATABASE__PORT, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Username feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsernamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Database_username_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Database_username_feature", "_UI_Database_type"),
						FastPackage.Literals.DATABASE__USERNAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Database_password_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Database_password_feature", "_UI_Database_type"),
						FastPackage.Literals.DATABASE__PASSWORD, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Data Directory feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDataDirectoryPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(
						createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
								getResourceLocator(), getString("_UI_Database_dataDirectory_feature"),
								getString("_UI_PropertyDescriptor_description", "_UI_Database_dataDirectory_feature",
										"_UI_Database_type"),
								FastPackage.Literals.DATABASE__DATA_DIRECTORY, true, false, false,
								ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Database.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Database"));
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
		String label = ((Database) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Database_type")
				: getString("_UI_Database_type") + " " + label;
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

		switch (notification.getFeatureID(Database.class))
		{
		case FastPackage.DATABASE__DBMS:
		case FastPackage.DATABASE__PORT:
		case FastPackage.DATABASE__USERNAME:
		case FastPackage.DATABASE__PASSWORD:
		case FastPackage.DATABASE__DATA_DIRECTORY:
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
