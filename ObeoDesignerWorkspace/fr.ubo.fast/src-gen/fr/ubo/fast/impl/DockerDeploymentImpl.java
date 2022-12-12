/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.DockerDeployment;
import fr.ubo.fast.FastPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Docker
 * Deployment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.DockerDeploymentImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.DockerDeploymentImpl#getDeploymentContainers <em>Deployment Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerDeploymentImpl extends NamedElementImpl implements DockerDeployment
{
	/**
	 * The default value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected String directory = DIRECTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeploymentContainers() <em>Deployment Containers</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDeploymentContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<fr.ubo.fast.Container> deploymentContainers;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerDeploymentImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return FastPackage.Literals.DOCKER_DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirectory()
	{
		return directory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectory(String newDirectory)
	{
		String oldDirectory = directory;
		directory = newDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.DOCKER_DEPLOYMENT__DIRECTORY, oldDirectory,
					directory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fr.ubo.fast.Container> getDeploymentContainers()
	{
		if (deploymentContainers == null)
		{
			deploymentContainers = new EObjectContainmentEList<fr.ubo.fast.Container>(fr.ubo.fast.Container.class, this,
					FastPackage.DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS);
		}
		return deploymentContainers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
		case FastPackage.DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS:
			return ((InternalEList<?>) getDeploymentContainers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
		case FastPackage.DOCKER_DEPLOYMENT__DIRECTORY:
			return getDirectory();
		case FastPackage.DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS:
			return getDeploymentContainers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FastPackage.DOCKER_DEPLOYMENT__DIRECTORY:
			setDirectory((String) newValue);
			return;
		case FastPackage.DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS:
			getDeploymentContainers().clear();
			getDeploymentContainers().addAll((Collection<? extends fr.ubo.fast.Container>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
		case FastPackage.DOCKER_DEPLOYMENT__DIRECTORY:
			setDirectory(DIRECTORY_EDEFAULT);
			return;
		case FastPackage.DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS:
			getDeploymentContainers().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
		case FastPackage.DOCKER_DEPLOYMENT__DIRECTORY:
			return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
		case FastPackage.DOCKER_DEPLOYMENT__DEPLOYMENT_CONTAINERS:
			return deploymentContainers != null && !deploymentContainers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (directory: ");
		result.append(directory);
		result.append(')');
		return result.toString();
	}

} // DockerDeploymentImpl
