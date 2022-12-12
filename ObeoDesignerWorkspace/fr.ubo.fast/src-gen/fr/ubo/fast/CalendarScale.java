/**
 */
package fr.ubo.fast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar Scale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.CalendarScale#getPeriods <em>Periods</em>}</li>
 *   <li>{@link fr.ubo.fast.CalendarScale#getFactors <em>Factors</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getCalendarScale()
 * @model
 * @generated
 */
public interface CalendarScale extends Scale
{
	/**
	 * Returns the value of the '<em><b>Periods</b></em>' attribute list.
	 * The list contents are of type {@link fr.ubo.fast.Period}.
	 * The literals are from the enumeration {@link fr.ubo.fast.Period}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periods</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periods</em>' attribute list.
	 * @see fr.ubo.fast.Period
	 * @see fr.ubo.fast.FastPackage#getCalendarScale_Periods()
	 * @model required="true"
	 * @generated
	 */
	EList<Period> getPeriods();

	/**
	 * Returns the value of the '<em><b>Factors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factors</em>' attribute list.
	 * @see fr.ubo.fast.FastPackage#getCalendarScale_Factors()
	 * @model required="true"
	 * @generated
	 */
	EList<Long> getFactors();

} // CalendarScale
