/**
 */
package fr.ubo.fast;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Min Max
 * Visualization Client</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getClientComputer <em>Client Computer</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getChartWidth <em>Chart Width</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getChartHeight <em>Chart Height</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getUserPolicy <em>User Policy</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getClientScale <em>Client Scale</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getRawDataThreshold <em>Raw Data Threshold</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getPreComputedDataThreshold <em>Pre Computed Data Threshold</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getUserTime <em>User Time</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getPingTime <em>Ping Time</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getTimeSeriesSelected <em>Time Series Selected</em>}</li>
 *   <li>{@link fr.ubo.fast.MinMaxVisualizationClient#getAxisFactor <em>Axis Factor</em>}</li>
 * </ul>
 *
 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient()
 * @model
 * @generated
 */
public interface MinMaxVisualizationClient extends NamedElement, VisualizationClient
{
	/**
	 * Returns the value of the '<em><b>Client Computer</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Computer</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Client Computer</em>' reference.
	 * @see #setClientComputer(Computer)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_ClientComputer()
	 * @model required="true"
	 * @generated
	 */
	Computer getClientComputer();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MinMaxVisualizationClient#getClientComputer <em>Client Computer</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Computer</em>' reference.
	 * @see #getClientComputer()
	 * @generated
	 */
	void setClientComputer(Computer value);

	/**
	 * Returns the value of the '<em><b>Chart Width</b></em>' attribute.
	 * The default value is <code>"800"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart Width</em>' attribute.
	 * @see #setChartWidth(int)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_ChartWidth()
	 * @model default="800" required="true"
	 * @generated
	 */
	int getChartWidth();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MinMaxVisualizationClient#getChartWidth <em>Chart Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Width</em>' attribute.
	 * @see #getChartWidth()
	 * @generated
	 */
	void setChartWidth(int value);

	/**
	 * Returns the value of the '<em><b>Chart Height</b></em>' attribute.
	 * The default value is <code>"400"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chart Height</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart Height</em>' attribute.
	 * @see #setChartHeight(int)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_ChartHeight()
	 * @model default="400" required="true"
	 * @generated
	 */
	int getChartHeight();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MinMaxVisualizationClient#getChartHeight <em>Chart Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chart Height</em>' attribute.
	 * @see #getChartHeight()
	 * @generated
	 */
	void setChartHeight(int value);

	/**
	 * Returns the value of the '<em><b>User Policy</b></em>' attribute. The
	 * literals are from the enumeration {@link fr.ubo.fast.UserPolicy}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Policy</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>User Policy</em>' attribute.
	 * @see fr.ubo.fast.UserPolicy
	 * @see #setUserPolicy(UserPolicy)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_UserPolicy()
	 * @model required="true"
	 * @generated
	 */
	UserPolicy getUserPolicy();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MinMaxVisualizationClient#getUserPolicy <em>User Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Policy</em>' attribute.
	 * @see fr.ubo.fast.UserPolicy
	 * @see #getUserPolicy()
	 * @generated
	 */
	void setUserPolicy(UserPolicy value);

	/**
	 * Returns the value of the '<em><b>Client Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Scale</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Scale</em>' containment reference.
	 * @see #setClientScale(Scale)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_ClientScale()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Scale getClientScale();

	/**
	 * Sets the value of the
	 * '{@link fr.ubo.fast.MinMaxVisualizationClient#getClientScale <em>Client
	 * Scale</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Client Scale</em>' containment
	 *              reference.
	 * @see #getClientScale()
	 * @generated
	 */
	void setClientScale(Scale value);

	/**
	 * Returns the value of the '<em><b>Raw Data Threshold</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Data Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Raw Data Threshold</em>' attribute.
	 * @see #setRawDataThreshold(double)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_RawDataThreshold()
	 * @model required="true"
	 * @generated
	 */
	double getRawDataThreshold();

	/**
	 * Sets the value of the
	 * '{@link fr.ubo.fast.MinMaxVisualizationClient#getRawDataThreshold <em>Raw
	 * Data Threshold</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Raw Data Threshold</em>' attribute.
	 * @see #getRawDataThreshold()
	 * @generated
	 */
	void setRawDataThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Pre Computed Data Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Computed Data Threshold</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Computed Data Threshold</em>' attribute.
	 * @see #setPreComputedDataThreshold(double)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_PreComputedDataThreshold()
	 * @model required="true"
	 * @generated
	 */
	double getPreComputedDataThreshold();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MinMaxVisualizationClient#getPreComputedDataThreshold <em>Pre Computed Data Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Computed Data Threshold</em>' attribute.
	 * @see #getPreComputedDataThreshold()
	 * @generated
	 */
	void setPreComputedDataThreshold(double value);

	/**
	 * Returns the value of the '<em><b>User Time</b></em>' attribute.
	 * The default value is <code>"250.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Time</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Time</em>' attribute.
	 * @see #setUserTime(double)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_UserTime()
	 * @model default="250.0" required="true"
	 * @generated
	 */
	double getUserTime();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MinMaxVisualizationClient#getUserTime <em>User Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Time</em>' attribute.
	 * @see #getUserTime()
	 * @generated
	 */
	void setUserTime(double value);

	/**
	 * Returns the value of the '<em><b>Ping Time</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ping Time</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ping Time</em>' attribute.
	 * @see #setPingTime(double)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_PingTime()
	 * @model required="true"
	 * @generated
	 */
	double getPingTime();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MinMaxVisualizationClient#getPingTime <em>Ping Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ping Time</em>' attribute.
	 * @see #getPingTime()
	 * @generated
	 */
	void setPingTime(double value);

	/**
	 * Returns the value of the '<em><b>Time Series Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series Selected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series Selected</em>' reference.
	 * @see #setTimeSeriesSelected(TimeSeries)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_TimeSeriesSelected()
	 * @model required="true"
	 * @generated
	 */
	TimeSeries getTimeSeriesSelected();

	/**
	 * Sets the value of the
	 * '{@link fr.ubo.fast.MinMaxVisualizationClient#getTimeSeriesSelected <em>Time
	 * Series Selected</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Time Series Selected</em>' reference.
	 * @see #getTimeSeriesSelected()
	 * @generated
	 */
	void setTimeSeriesSelected(TimeSeries value);

	/**
	 * Returns the value of the '<em><b>Axis Factor</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Factor</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Factor</em>' attribute.
	 * @see #setAxisFactor(int)
	 * @see fr.ubo.fast.FastPackage#getMinMaxVisualizationClient_AxisFactor()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getAxisFactor();

	/**
	 * Sets the value of the '{@link fr.ubo.fast.MinMaxVisualizationClient#getAxisFactor <em>Axis Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Factor</em>' attribute.
	 * @see #getAxisFactor()
	 * @generated
	 */
	void setAxisFactor(int value);

} // MinMaxVisualizationClient
