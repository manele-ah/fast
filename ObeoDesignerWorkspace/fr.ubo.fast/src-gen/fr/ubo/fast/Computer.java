/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Computer</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.Computer#getOs <em>Os</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getRamMemory <em>Ram Memory</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getStorageMemory <em>Storage Memory</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getCpuNumber <em>Cpu Number</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getCpuCoresNumber <em>Cpu Cores Number</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getComputerServices <em>Computer Services</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getComputerNetworkInterfaces <em>Computer Network Interfaces</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getUsername <em>Username</em>}</li>
 *   <li>{@link fr.ubo.fast.Computer#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getComputer()
 * @model
 * @generated
 */
public interface Computer extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.ubo.fast.OSType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see fr.ubo.fast.OSType
	 * @see #setOs(OSType)
	 * @see fr.ubo.fast.FastPackage#getComputer_Os()
	 * @model required="true"
	 * @generated
	 */
	OSType getOs();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see fr.ubo.fast.OSType
	 * @see #getOs()
	 * @generated
	 */
	void setOs(OSType value);

	/**
	 * Returns the value of the '<em><b>Ram Memory</b></em>' attribute.
	 * The default value is <code>"16384"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Memory</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Memory</em>' attribute.
	 * @see #setRamMemory(int)
	 * @see fr.ubo.fast.FastPackage#getComputer_RamMemory()
	 * @model default="16384" required="true"
	 * @generated
	 */
	int getRamMemory();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getRamMemory <em>Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Memory</em>' attribute.
	 * @see #getRamMemory()
	 * @generated
	 */
	void setRamMemory(int value);

	/**
	 * Returns the value of the '<em><b>Storage Memory</b></em>' attribute.
	 * The default value is <code>"512000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Memory</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Memory</em>' attribute.
	 * @see #setStorageMemory(int)
	 * @see fr.ubo.fast.FastPackage#getComputer_StorageMemory()
	 * @model default="512000" required="true"
	 * @generated
	 */
	int getStorageMemory();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getStorageMemory <em>Storage Memory</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Storage Memory</em>' attribute.
	 * @see #getStorageMemory()
	 * @generated
	 */
	void setStorageMemory(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Number</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Number</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Number</em>' attribute.
	 * @see #setCpuNumber(int)
	 * @see fr.ubo.fast.FastPackage#getComputer_CpuNumber()
	 * @model default="2" required="true"
	 * @generated
	 */
	int getCpuNumber();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getCpuNumber <em>Cpu Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Number</em>' attribute.
	 * @see #getCpuNumber()
	 * @generated
	 */
	void setCpuNumber(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Frequency</b></em>' attribute.
	 * The default value is <code>"3200"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Frequency</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #setCpuFrequency(int)
	 * @see fr.ubo.fast.FastPackage#getComputer_CpuFrequency()
	 * @model default="3200" required="true"
	 * @generated
	 */
	int getCpuFrequency();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getCpuFrequency <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #getCpuFrequency()
	 * @generated
	 */
	void setCpuFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Cores Number</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Cores Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Cores Number</em>' attribute.
	 * @see #setCpuCoresNumber(int)
	 * @see fr.ubo.fast.FastPackage#getComputer_CpuCoresNumber()
	 * @model default="8" required="true"
	 * @generated
	 */
	int getCpuCoresNumber();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getCpuCoresNumber <em>Cpu Cores Number</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Cores Number</em>' attribute.
	 * @see #getCpuCoresNumber()
	 * @generated
	 */
	void setCpuCoresNumber(int value);

	/**
	 * Returns the value of the '<em><b>Computer Services</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer Services</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer Services</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getComputer_ComputerServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getComputerServices();

	/**
	 * Returns the value of the '<em><b>Computer Network Interfaces</b></em>' reference list.
	 * The list contents are of type {@link fr.ubo.fast.NetworkInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer Network Interfaces</em>' reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer Network Interfaces</em>' reference list.
	 * @see fr.ubo.fast.FastPackage#getComputer_ComputerNetworkInterfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<NetworkInterface> getComputerNetworkInterfaces();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference.
	 * @see #setDeployment(DockerDeployment)
	 * @see fr.ubo.fast.FastPackage#getComputer_Deployment()
	 * @model containment="true"
	 * @generated
	 */
	DockerDeployment getDeployment();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getDeployment <em>Deployment</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' containment reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(DockerDeployment value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see fr.ubo.fast.FastPackage#getComputer_Username()
	 * @model required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see fr.ubo.fast.FastPackage#getComputer_Password()
	 * @model required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.Computer#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // Computer
