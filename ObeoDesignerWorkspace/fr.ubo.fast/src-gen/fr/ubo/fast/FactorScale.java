/**
 */
package fr.ubo.fast;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Factor
 * Scale</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.FactorScale#getFactor <em>Factor</em>}</li>
 *   <li>{@link fr.ubo.fast.FactorScale#getZoomsNumber <em>Zooms Number</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getFactorScale()
 * @model
 * @generated
 */
public interface FactorScale extends Scale
{
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(int)
	 * @see fr.ubo.fast.FastPackage#getFactorScale_Factor()
	 * @model default="2" required="true"
	 * @generated
	 */
	int getFactor();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.FactorScale#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(int value);

	/**
	 * Returns the value of the '<em><b>Zooms Number</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zooms Number</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zooms Number</em>' attribute.
	 * @see #setZoomsNumber(int)
	 * @see fr.ubo.fast.FastPackage#getFactorScale_ZoomsNumber()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getZoomsNumber();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.FactorScale#getZoomsNumber
	 * <em>Zooms Number</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Zooms Number</em>' attribute.
	 * @see #getZoomsNumber()
	 * @generated
	 */
	void setZoomsNumber(int value);

} // FactorScale
