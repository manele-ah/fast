/**
 */
package fr.ubo.fast.provider;

import fr.ubo.fast.FastFactory;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.Network;

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
 * This is the item provider adapter for a {@link fr.ubo.fast.Network} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class NetworkItemProvider extends NamedElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NetworkItemProvider(AdapterFactory adapterFactory)
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

			addPrefixPropertyDescriptor(object);
			addMaskPropertyDescriptor(object);
			addGatewayPropertyDescriptor(object);
			addDomainNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Prefix feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Network_prefix_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Network_prefix_feature", "_UI_Network_type"),
						FastPackage.Literals.NETWORK__PREFIX, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaskPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Network_mask_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Network_mask_feature", "_UI_Network_type"),
						FastPackage.Literals.NETWORK__MASK, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Gateway feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGatewayPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Network_gateway_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Network_gateway_feature", "_UI_Network_type"),
						FastPackage.Literals.NETWORK__GATEWAY, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Domain Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDomainNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Network_domainName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Network_domainName_feature", "_UI_Network_type"),
						FastPackage.Literals.NETWORK__DOMAIN_NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
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
			childrenFeatures.add(FastPackage.Literals.NETWORK__NETWORK_INTERFACES);
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
	 * This returns Network.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Network"));
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
		String label = ((Network) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Network_type")
				: getString("_UI_Network_type") + " " + label;
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

		switch (notification.getFeatureID(Network.class))
		{
		case FastPackage.NETWORK__PREFIX:
		case FastPackage.NETWORK__MASK:
		case FastPackage.NETWORK__GATEWAY:
		case FastPackage.NETWORK__DOMAIN_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FastPackage.NETWORK__NETWORK_INTERFACES:
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

		newChildDescriptors.add(createChildParameter(FastPackage.Literals.NETWORK__NETWORK_INTERFACES,
				FastFactory.eINSTANCE.createNetworkInterface()));
	}

}
