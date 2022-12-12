/**
 */
package fr.ubo.fast;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Time
 * Series</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.TimeSeries#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.ubo.fast.TimeSeries#getEndTime <em>End Time</em>}</li>
 *   <li>{@link fr.ubo.fast.TimeSeries#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.ubo.fast.TimeSeries#getTimeSeriesMeasuredVariable <em>Time Series Measured Variable</em>}</li>
 *   <li>{@link fr.ubo.fast.TimeSeries#getTimeSeriesDataSource <em>Time Series Data Source</em>}</li>
 *   <li>{@link fr.ubo.fast.TimeSeries#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getTimeSeries()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='periodPositive'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot periodPositive='\n\t\t\tself.period &gt; 0'"
 * @generated
 */
public interface TimeSeries extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see fr.ubo.fast.FastPackage#getTimeSeries_StartTime()
	 * @model required="true"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.TimeSeries#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(String)
	 * @see fr.ubo.fast.FastPackage#getTimeSeries_EndTime()
	 * @model required="true"
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.TimeSeries#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(double)
	 * @see fr.ubo.fast.FastPackage#getTimeSeries_Period()
	 * @model default="1" required="true"
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.TimeSeries#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Time Series Measured Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series Measured Variable</em>' reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series Measured Variable</em>' reference.
	 * @see #setTimeSeriesMeasuredVariable(MeasuredVariable)
	 * @see fr.ubo.fast.FastPackage#getTimeSeries_TimeSeriesMeasuredVariable()
	 * @model required="true"
	 * @generated
	 */
	MeasuredVariable getTimeSeriesMeasuredVariable();

	/**
	 * Sets the value of the
	 * '{@link fr.ubo.fast.TimeSeries#getTimeSeriesMeasuredVariable <em>Time Series
	 * Measured Variable</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Time Series Measured Variable</em>'
	 *              reference.
	 * @see #getTimeSeriesMeasuredVariable()
	 * @generated
	 */
	void setTimeSeriesMeasuredVariable(MeasuredVariable value);

	/**
	 * Returns the value of the '<em><b>Time Series Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series Data Source</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series Data Source</em>' reference.
	 * @see #setTimeSeriesDataSource(DataSource)
	 * @see fr.ubo.fast.FastPackage#getTimeSeries_TimeSeriesDataSource()
	 * @model required="true"
	 * @generated
	 */
	DataSource getTimeSeriesDataSource();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.TimeSeries#getTimeSeriesDataSource <em>Time Series Data Source</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Time Series Data Source</em>' reference.
	 * @see #getTimeSeriesDataSource()
	 * @generated
	 */
	void setTimeSeriesDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.ubo.fast.FastPackage#getTimeSeries_Id()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.TimeSeries#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // TimeSeries
