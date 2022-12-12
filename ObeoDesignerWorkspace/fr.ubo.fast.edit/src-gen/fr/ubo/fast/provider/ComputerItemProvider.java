/**
 */
package fr.ubo.fast.provider;

import fr.ubo.fast.Computer;
import fr.ubo.fast.FastFactory;
import fr.ubo.fast.FastPackage;

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
 * This is the item provider adapter for a {@link fr.ubo.fast.Computer} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ComputerItemProvider extends NamedElementItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComputerItemProvider(AdapterFactory adapterFactory)
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

			addOsPropertyDescriptor(object);
			addRamMemoryPropertyDescriptor(object);
			addStorageMemoryPropertyDescriptor(object);
			addCpuNumberPropertyDescriptor(object);
			addCpuFrequencyPropertyDescriptor(object);
			addCpuCoresNumberPropertyDescriptor(object);
			addComputerNetworkInterfacesPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Os feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Computer_os_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Computer_os_feature", "_UI_Computer_type"),
				FastPackage.Literals.COMPUTER__OS, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ram Memory feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRamMemoryPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Computer_ramMemory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Computer_ramMemory_feature", "_UI_Computer_type"),
						FastPackage.Literals.COMPUTER__RAM_MEMORY, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Storage Memory feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStorageMemoryPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(
						createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
								getResourceLocator(), getString("_UI_Computer_storageMemory_feature"),
								getString("_UI_PropertyDescriptor_description", "_UI_Computer_storageMemory_feature",
										"_UI_Computer_type"),
								FastPackage.Literals.COMPUTER__STORAGE_MEMORY, true, false, false,
								ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cpu Number feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCpuNumberPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Computer_cpuNumber_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Computer_cpuNumber_feature", "_UI_Computer_type"),
						FastPackage.Literals.COMPUTER__CPU_NUMBER, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Cpu Frequency feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCpuFrequencyPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(
						createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
								getResourceLocator(), getString("_UI_Computer_cpuFrequency_feature"),
								getString("_UI_PropertyDescriptor_description", "_UI_Computer_cpuFrequency_feature",
										"_UI_Computer_type"),
								FastPackage.Literals.COMPUTER__CPU_FREQUENCY, true, false, false,
								ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cpu Cores Number feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCpuCoresNumberPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(
						createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
								getResourceLocator(), getString("_UI_Computer_cpuCoresNumber_feature"),
								getString("_UI_PropertyDescriptor_description", "_UI_Computer_cpuCoresNumber_feature",
										"_UI_Computer_type"),
								FastPackage.Literals.COMPUTER__CPU_CORES_NUMBER, true, false, false,
								ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Computer Network Interfaces feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComputerNetworkInterfacesPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Computer_computerNetworkInterfaces_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Computer_computerNetworkInterfaces_feature",
								"_UI_Computer_type"),
						FastPackage.Literals.COMPUTER__COMPUTER_NETWORK_INTERFACES, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_Computer_username_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Computer_username_feature", "_UI_Computer_type"),
						FastPackage.Literals.COMPUTER__USERNAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
						getResourceLocator(), getString("_UI_Computer_password_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Computer_password_feature", "_UI_Computer_type"),
						FastPackage.Literals.COMPUTER__PASSWORD, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(FastPackage.Literals.COMPUTER__COMPUTER_SERVICES);
			childrenFeatures.add(FastPackage.Literals.COMPUTER__DEPLOYMENT);
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
	 * This returns Computer.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Computer"));
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
		String label = ((Computer) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Computer_type")
				: getString("_UI_Computer_type") + " " + label;
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

		switch (notification.getFeatureID(Computer.class))
		{
		case FastPackage.COMPUTER__OS:
		case FastPackage.COMPUTER__RAM_MEMORY:
		case FastPackage.COMPUTER__STORAGE_MEMORY:
		case FastPackage.COMPUTER__CPU_NUMBER:
		case FastPackage.COMPUTER__CPU_FREQUENCY:
		case FastPackage.COMPUTER__CPU_CORES_NUMBER:
		case FastPackage.COMPUTER__USERNAME:
		case FastPackage.COMPUTER__PASSWORD:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FastPackage.COMPUTER__COMPUTER_SERVICES:
		case FastPackage.COMPUTER__DEPLOYMENT:
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

		newChildDescriptors.add(
				createChildParameter(FastPackage.Literals.COMPUTER__COMPUTER_SERVICES, FastFactory.eINSTANCE.createDatabase()));

		newChildDescriptors.add(createChildParameter(FastPackage.Literals.COMPUTER__COMPUTER_SERVICES,
				FastFactory.eINSTANCE.createWebServer()));

		newChildDescriptors.add(
				createChildParameter(FastPackage.Literals.COMPUTER__COMPUTER_SERVICES, FastFactory.eINSTANCE.createFile()));

		newChildDescriptors.add(createChildParameter(FastPackage.Literals.COMPUTER__DEPLOYMENT,
				FastFactory.eINSTANCE.createDockerDeployment()));
	}

}
