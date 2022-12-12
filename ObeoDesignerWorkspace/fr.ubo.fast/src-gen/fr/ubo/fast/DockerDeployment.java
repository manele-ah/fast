/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Docker
 * Deployment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.DockerDeployment#getDirectory <em>Directory</em>}</li>
 *   <li>{@link fr.ubo.fast.DockerDeployment#getDeploymentContainers <em>Deployment Containers</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getDockerDeployment()
 * @model
 * @generated
 */
public interface DockerDeployment extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see fr.ubo.fast.FastPackage#getDockerDeployment_Directory()
	 * @model required="true"
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.DockerDeployment#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Containers</b></em>' containment reference list.
	 * The list contents are of type {@link fr.ubo.fast.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Containers</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Containers</em>' containment reference list.
	 * @see fr.ubo.fast.FastPackage#getDockerDeployment_DeploymentContainers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Container> getDeploymentContainers();

} // DockerDeployment
