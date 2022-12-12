/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.Computer;
import fr.ubo.fast.DockerDeployment;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.NetworkInterface;
import fr.ubo.fast.OSType;
import fr.ubo.fast.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Computer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getOs <em>Os</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getRamMemory <em>Ram Memory</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getStorageMemory <em>Storage Memory</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getCpuNumber <em>Cpu Number</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getCpuCoresNumber <em>Cpu Cores Number</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getComputerServices <em>Computer Services</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getComputerNetworkInterfaces <em>Computer Network Interfaces</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.ComputerImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputerImpl extends NamedElementImpl implements Computer
{
	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final OSType OS_EDEFAULT = OSType.LINUX;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected OSType os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamMemory() <em>Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRamMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int RAM_MEMORY_EDEFAULT = 16384;

	/**
	 * The cached value of the '{@link #getRamMemory() <em>Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRamMemory()
	 * @generated
	 * @ordered
	 */
	protected int ramMemory = RAM_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageMemory() <em>Storage Memory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStorageMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int STORAGE_MEMORY_EDEFAULT = 512000;

	/**
	 * The cached value of the '{@link #getStorageMemory() <em>Storage Memory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStorageMemory()
	 * @generated
	 * @ordered
	 */
	protected int storageMemory = STORAGE_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuNumber() <em>Cpu Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCpuNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_NUMBER_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getCpuNumber() <em>Cpu Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCpuNumber()
	 * @generated
	 * @ordered
	 */
	protected int cpuNumber = CPU_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_FREQUENCY_EDEFAULT = 3200;

	/**
	 * The cached value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected int cpuFrequency = CPU_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuCoresNumber() <em>Cpu Cores Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCpuCoresNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_CORES_NUMBER_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getCpuCoresNumber() <em>Cpu Cores Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCpuCoresNumber()
	 * @generated
	 * @ordered
	 */
	protected int cpuCoresNumber = CPU_CORES_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComputerServices() <em>Computer Services</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getComputerServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> computerServices;

	/**
	 * The cached value of the '{@link #getComputerNetworkInterfaces() <em>Computer Network Interfaces</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getComputerNetworkInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkInterface> computerNetworkInterfaces;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected DockerDeployment deployment;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputerImpl()
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
		return FastPackage.Literals.COMPUTER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OSType getOs()
	{
		return os;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(OSType newOs)
	{
		OSType oldOs = os;
		os = newOs == null ? OS_EDEFAULT : newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getRamMemory()
	{
		return ramMemory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamMemory(int newRamMemory)
	{
		int oldRamMemory = ramMemory;
		ramMemory = newRamMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__RAM_MEMORY, oldRamMemory, ramMemory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getStorageMemory()
	{
		return storageMemory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageMemory(int newStorageMemory)
	{
		int oldStorageMemory = storageMemory;
		storageMemory = newStorageMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__STORAGE_MEMORY, oldStorageMemory,
					storageMemory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuNumber()
	{
		return cpuNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuNumber(int newCpuNumber)
	{
		int oldCpuNumber = cpuNumber;
		cpuNumber = newCpuNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__CPU_NUMBER, oldCpuNumber, cpuNumber));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuFrequency()
	{
		return cpuFrequency;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuFrequency(int newCpuFrequency)
	{
		int oldCpuFrequency = cpuFrequency;
		cpuFrequency = newCpuFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__CPU_FREQUENCY, oldCpuFrequency,
					cpuFrequency));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuCoresNumber()
	{
		return cpuCoresNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuCoresNumber(int newCpuCoresNumber)
	{
		int oldCpuCoresNumber = cpuCoresNumber;
		cpuCoresNumber = newCpuCoresNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__CPU_CORES_NUMBER, oldCpuCoresNumber,
					cpuCoresNumber));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getComputerServices()
	{
		if (computerServices == null)
		{
			computerServices = new EObjectContainmentEList<Service>(Service.class, this,
					FastPackage.COMPUTER__COMPUTER_SERVICES);
		}
		return computerServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkInterface> getComputerNetworkInterfaces()
	{
		if (computerNetworkInterfaces == null)
		{
			computerNetworkInterfaces = new EObjectResolvingEList<NetworkInterface>(NetworkInterface.class, this,
					FastPackage.COMPUTER__COMPUTER_NETWORK_INTERFACES);
		}
		return computerNetworkInterfaces;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DockerDeployment getDeployment()
	{
		return deployment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(DockerDeployment newDeployment, NotificationChain msgs)
	{
		DockerDeployment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__DEPLOYMENT,
					oldDeployment, newDeployment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(DockerDeployment newDeployment)
	{
		if (newDeployment != deployment)
		{
			NotificationChain msgs = null;
			if (deployment != null)
				msgs = ((InternalEObject) deployment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FastPackage.COMPUTER__DEPLOYMENT, null, msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject) newDeployment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FastPackage.COMPUTER__DEPLOYMENT, null, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__DEPLOYMENT, newDeployment,
					newDeployment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername)
	{
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword)
	{
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.COMPUTER__PASSWORD, oldPassword, password));
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
		case FastPackage.COMPUTER__COMPUTER_SERVICES:
			return ((InternalEList<?>) getComputerServices()).basicRemove(otherEnd, msgs);
		case FastPackage.COMPUTER__DEPLOYMENT:
			return basicSetDeployment(null, msgs);
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
		case FastPackage.COMPUTER__OS:
			return getOs();
		case FastPackage.COMPUTER__RAM_MEMORY:
			return getRamMemory();
		case FastPackage.COMPUTER__STORAGE_MEMORY:
			return getStorageMemory();
		case FastPackage.COMPUTER__CPU_NUMBER:
			return getCpuNumber();
		case FastPackage.COMPUTER__CPU_FREQUENCY:
			return getCpuFrequency();
		case FastPackage.COMPUTER__CPU_CORES_NUMBER:
			return getCpuCoresNumber();
		case FastPackage.COMPUTER__COMPUTER_SERVICES:
			return getComputerServices();
		case FastPackage.COMPUTER__COMPUTER_NETWORK_INTERFACES:
			return getComputerNetworkInterfaces();
		case FastPackage.COMPUTER__DEPLOYMENT:
			return getDeployment();
		case FastPackage.COMPUTER__USERNAME:
			return getUsername();
		case FastPackage.COMPUTER__PASSWORD:
			return getPassword();
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
		case FastPackage.COMPUTER__OS:
			setOs((OSType) newValue);
			return;
		case FastPackage.COMPUTER__RAM_MEMORY:
			setRamMemory((Integer) newValue);
			return;
		case FastPackage.COMPUTER__STORAGE_MEMORY:
			setStorageMemory((Integer) newValue);
			return;
		case FastPackage.COMPUTER__CPU_NUMBER:
			setCpuNumber((Integer) newValue);
			return;
		case FastPackage.COMPUTER__CPU_FREQUENCY:
			setCpuFrequency((Integer) newValue);
			return;
		case FastPackage.COMPUTER__CPU_CORES_NUMBER:
			setCpuCoresNumber((Integer) newValue);
			return;
		case FastPackage.COMPUTER__COMPUTER_SERVICES:
			getComputerServices().clear();
			getComputerServices().addAll((Collection<? extends Service>) newValue);
			return;
		case FastPackage.COMPUTER__COMPUTER_NETWORK_INTERFACES:
			getComputerNetworkInterfaces().clear();
			getComputerNetworkInterfaces().addAll((Collection<? extends NetworkInterface>) newValue);
			return;
		case FastPackage.COMPUTER__DEPLOYMENT:
			setDeployment((DockerDeployment) newValue);
			return;
		case FastPackage.COMPUTER__USERNAME:
			setUsername((String) newValue);
			return;
		case FastPackage.COMPUTER__PASSWORD:
			setPassword((String) newValue);
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
		case FastPackage.COMPUTER__OS:
			setOs(OS_EDEFAULT);
			return;
		case FastPackage.COMPUTER__RAM_MEMORY:
			setRamMemory(RAM_MEMORY_EDEFAULT);
			return;
		case FastPackage.COMPUTER__STORAGE_MEMORY:
			setStorageMemory(STORAGE_MEMORY_EDEFAULT);
			return;
		case FastPackage.COMPUTER__CPU_NUMBER:
			setCpuNumber(CPU_NUMBER_EDEFAULT);
			return;
		case FastPackage.COMPUTER__CPU_FREQUENCY:
			setCpuFrequency(CPU_FREQUENCY_EDEFAULT);
			return;
		case FastPackage.COMPUTER__CPU_CORES_NUMBER:
			setCpuCoresNumber(CPU_CORES_NUMBER_EDEFAULT);
			return;
		case FastPackage.COMPUTER__COMPUTER_SERVICES:
			getComputerServices().clear();
			return;
		case FastPackage.COMPUTER__COMPUTER_NETWORK_INTERFACES:
			getComputerNetworkInterfaces().clear();
			return;
		case FastPackage.COMPUTER__DEPLOYMENT:
			setDeployment((DockerDeployment) null);
			return;
		case FastPackage.COMPUTER__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case FastPackage.COMPUTER__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
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
		case FastPackage.COMPUTER__OS:
			return os != OS_EDEFAULT;
		case FastPackage.COMPUTER__RAM_MEMORY:
			return ramMemory != RAM_MEMORY_EDEFAULT;
		case FastPackage.COMPUTER__STORAGE_MEMORY:
			return storageMemory != STORAGE_MEMORY_EDEFAULT;
		case FastPackage.COMPUTER__CPU_NUMBER:
			return cpuNumber != CPU_NUMBER_EDEFAULT;
		case FastPackage.COMPUTER__CPU_FREQUENCY:
			return cpuFrequency != CPU_FREQUENCY_EDEFAULT;
		case FastPackage.COMPUTER__CPU_CORES_NUMBER:
			return cpuCoresNumber != CPU_CORES_NUMBER_EDEFAULT;
		case FastPackage.COMPUTER__COMPUTER_SERVICES:
			return computerServices != null && !computerServices.isEmpty();
		case FastPackage.COMPUTER__COMPUTER_NETWORK_INTERFACES:
			return computerNetworkInterfaces != null && !computerNetworkInterfaces.isEmpty();
		case FastPackage.COMPUTER__DEPLOYMENT:
			return deployment != null;
		case FastPackage.COMPUTER__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		case FastPackage.COMPUTER__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(" (os: ");
		result.append(os);
		result.append(", ramMemory: ");
		result.append(ramMemory);
		result.append(", storageMemory: ");
		result.append(storageMemory);
		result.append(", cpuNumber: ");
		result.append(cpuNumber);
		result.append(", cpuFrequency: ");
		result.append(cpuFrequency);
		result.append(", cpuCoresNumber: ");
		result.append(cpuCoresNumber);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} // ComputerImpl
