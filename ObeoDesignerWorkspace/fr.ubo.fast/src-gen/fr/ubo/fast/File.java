/**
 */
package fr.ubo.fast;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>File</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.File#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getFile()
 * @model
 * @generated
 */
public interface File extends DataSource
{
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see fr.ubo.fast.FastPackage#getFile_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.File#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // File
