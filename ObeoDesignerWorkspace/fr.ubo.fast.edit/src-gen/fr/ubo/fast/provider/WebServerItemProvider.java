/**
 */
package fr.ubo.fast.provider;

import fr.ubo.fast.FastPackage;
import fr.ubo.fast.WebServer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.ubo.fast.WebServer} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class WebServerItemProvider extends ServiceItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WebServerItemProvider(AdapterFactory adapterFactory)
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

			addPortPropertyDescriptor(object);
			addProxyPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_WebServer_port_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_WebServer_port_feature", "_UI_WebServer_type"),
						FastPackage.Literals.WEB_SERVER__PORT, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Proxy feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProxyPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_WebServer_proxy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_WebServer_proxy_feature", "_UI_WebServer_type"),
						FastPackage.Literals.WEB_SERVER__PROXY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_WebServer_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_WebServer_type_feature", "_UI_WebServer_type"),
						FastPackage.Literals.WEB_SERVER__TYPE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This returns WebServer.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebServer"));
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
		String label = ((WebServer) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_WebServer_type")
				: getString("_UI_WebServer_type") + " " + label;
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

		switch (notification.getFeatureID(WebServer.class))
		{
		case FastPackage.WEB_SERVER__PORT:
		case FastPackage.WEB_SERVER__TYPE:
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
