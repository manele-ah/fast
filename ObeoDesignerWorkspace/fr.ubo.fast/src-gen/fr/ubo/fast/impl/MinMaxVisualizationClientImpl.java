/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.Computer;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.MinMaxVisualizationClient;
import fr.ubo.fast.Scale;
import fr.ubo.fast.TimeSeries;
import fr.ubo.fast.UserPolicy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Min Max
 * Visualization Client</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getClientComputer <em>Client Computer</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getChartWidth <em>Chart Width</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getChartHeight <em>Chart Height</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getUserPolicy <em>User Policy</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getClientScale <em>Client Scale</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getRawDataThreshold <em>Raw Data Threshold</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getPreComputedDataThreshold <em>Pre Computed Data Threshold</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getUserTime <em>User Time</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getPingTime <em>Ping Time</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getTimeSeriesSelected <em>Time Series Selected</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.MinMaxVisualizationClientImpl#getAxisFactor <em>Axis Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinMaxVisualizationClientImpl extends NamedElementImpl implements MinMaxVisualizationClient
{
	/**
	 * The cached value of the '{@link #getClientComputer() <em>Client Computer</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClientComputer()
	 * @generated
	 * @ordered
	 */
	protected Computer clientComputer;

	/**
	 * The default value of the '{@link #getChartWidth() <em>Chart Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChartWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int CHART_WIDTH_EDEFAULT = 800;

	/**
	 * The cached value of the '{@link #getChartWidth() <em>Chart Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChartWidth()
	 * @generated
	 * @ordered
	 */
	protected int chartWidth = CHART_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getChartHeight() <em>Chart Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChartHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int CHART_HEIGHT_EDEFAULT = 400;

	/**
	 * The cached value of the '{@link #getChartHeight() <em>Chart Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChartHeight()
	 * @generated
	 * @ordered
	 */
	protected int chartHeight = CHART_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserPolicy() <em>User Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final UserPolicy USER_POLICY_EDEFAULT = UserPolicy.NAVIGATION_DIRECTIONS;

	/**
	 * The cached value of the '{@link #getUserPolicy() <em>User Policy</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserPolicy()
	 * @generated
	 * @ordered
	 */
	protected UserPolicy userPolicy = USER_POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientScale() <em>Client Scale</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClientScale()
	 * @generated
	 * @ordered
	 */
	protected Scale clientScale;

	/**
	 * The default value of the '{@link #getRawDataThreshold() <em>Raw Data Threshold</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRawDataThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double RAW_DATA_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRawDataThreshold() <em>Raw Data Threshold</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRawDataThreshold()
	 * @generated
	 * @ordered
	 */
	protected double rawDataThreshold = RAW_DATA_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreComputedDataThreshold() <em>Pre Computed Data Threshold</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPreComputedDataThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double PRE_COMPUTED_DATA_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPreComputedDataThreshold() <em>Pre Computed Data Threshold</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPreComputedDataThreshold()
	 * @generated
	 * @ordered
	 */
	protected double preComputedDataThreshold = PRE_COMPUTED_DATA_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserTime() <em>User Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserTime()
	 * @generated
	 * @ordered
	 */
	protected static final double USER_TIME_EDEFAULT = 250.0;

	/**
	 * The cached value of the '{@link #getUserTime() <em>User Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserTime()
	 * @generated
	 * @ordered
	 */
	protected double userTime = USER_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPingTime() <em>Ping Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double PING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPingTime() <em>Ping Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPingTime()
	 * @generated
	 * @ordered
	 */
	protected double pingTime = PING_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSeriesSelected() <em>Time Series Selected</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTimeSeriesSelected()
	 * @generated
	 * @ordered
	 */
	protected TimeSeries timeSeriesSelected;

	/**
	 * The default value of the '{@link #getAxisFactor() <em>Axis Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAxisFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int AXIS_FACTOR_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getAxisFactor() <em>Axis Factor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAxisFactor()
	 * @generated
	 * @ordered
	 */
	protected int axisFactor = AXIS_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MinMaxVisualizationClientImpl()
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
		return FastPackage.Literals.MIN_MAX_VISUALIZATION_CLIENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Computer getClientComputer()
	{
		if (clientComputer != null && clientComputer.eIsProxy())
		{
			InternalEObject oldClientComputer = (InternalEObject) clientComputer;
			clientComputer = (Computer) eResolveProxy(oldClientComputer);
			if (clientComputer != oldClientComputer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER, oldClientComputer, clientComputer));
			}
		}
		return clientComputer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Computer basicGetClientComputer()
	{
		return clientComputer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientComputer(Computer newClientComputer)
	{
		Computer oldClientComputer = clientComputer;
		clientComputer = newClientComputer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER,
					oldClientComputer, clientComputer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getChartWidth()
	{
		return chartWidth;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setChartWidth(int newChartWidth)
	{
		int oldChartWidth = chartWidth;
		chartWidth = newChartWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH,
					oldChartWidth, chartWidth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getChartHeight()
	{
		return chartHeight;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setChartHeight(int newChartHeight)
	{
		int oldChartHeight = chartHeight;
		chartHeight = newChartHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT,
					oldChartHeight, chartHeight));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UserPolicy getUserPolicy()
	{
		return userPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserPolicy(UserPolicy newUserPolicy)
	{
		UserPolicy oldUserPolicy = userPolicy;
		userPolicy = newUserPolicy == null ? USER_POLICY_EDEFAULT : newUserPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY,
					oldUserPolicy, userPolicy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Scale getClientScale()
	{
		return clientScale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientScale(Scale newClientScale, NotificationChain msgs)
	{
		Scale oldClientScale = clientScale;
		clientScale = newClientScale;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE, oldClientScale, newClientScale);
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
	public void setClientScale(Scale newClientScale)
	{
		if (newClientScale != clientScale)
		{
			NotificationChain msgs = null;
			if (clientScale != null)
				msgs = ((InternalEObject) clientScale).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE, null, msgs);
			if (newClientScale != null)
				msgs = ((InternalEObject) newClientScale).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE, null, msgs);
			msgs = basicSetClientScale(newClientScale, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE,
					newClientScale, newClientScale));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRawDataThreshold()
	{
		return rawDataThreshold;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawDataThreshold(double newRawDataThreshold)
	{
		double oldRawDataThreshold = rawDataThreshold;
		rawDataThreshold = newRawDataThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FastPackage.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD, oldRawDataThreshold, rawDataThreshold));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getPreComputedDataThreshold()
	{
		return preComputedDataThreshold;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreComputedDataThreshold(double newPreComputedDataThreshold)
	{
		double oldPreComputedDataThreshold = preComputedDataThreshold;
		preComputedDataThreshold = newPreComputedDataThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD, oldPreComputedDataThreshold,
					preComputedDataThreshold));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getUserTime()
	{
		return userTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTime(double newUserTime)
	{
		double oldUserTime = userTime;
		userTime = newUserTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME,
					oldUserTime, userTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getPingTime()
	{
		return pingTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPingTime(double newPingTime)
	{
		double oldPingTime = pingTime;
		pingTime = newPingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME,
					oldPingTime, pingTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeries getTimeSeriesSelected()
	{
		if (timeSeriesSelected != null && timeSeriesSelected.eIsProxy())
		{
			InternalEObject oldTimeSeriesSelected = (InternalEObject) timeSeriesSelected;
			timeSeriesSelected = (TimeSeries) eResolveProxy(oldTimeSeriesSelected);
			if (timeSeriesSelected != oldTimeSeriesSelected)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FastPackage.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED, oldTimeSeriesSelected,
							timeSeriesSelected));
			}
		}
		return timeSeriesSelected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSeries basicGetTimeSeriesSelected()
	{
		return timeSeriesSelected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesSelected(TimeSeries newTimeSeriesSelected)
	{
		TimeSeries oldTimeSeriesSelected = timeSeriesSelected;
		timeSeriesSelected = newTimeSeriesSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FastPackage.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED, oldTimeSeriesSelected, timeSeriesSelected));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getAxisFactor()
	{
		return axisFactor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisFactor(int newAxisFactor)
	{
		int oldAxisFactor = axisFactor;
		axisFactor = newAxisFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR,
					oldAxisFactor, axisFactor));
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
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE:
			return basicSetClientScale(null, msgs);
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
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER:
			if (resolve)
				return getClientComputer();
			return basicGetClientComputer();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH:
			return getChartWidth();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT:
			return getChartHeight();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY:
			return getUserPolicy();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE:
			return getClientScale();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD:
			return getRawDataThreshold();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD:
			return getPreComputedDataThreshold();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME:
			return getUserTime();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME:
			return getPingTime();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED:
			if (resolve)
				return getTimeSeriesSelected();
			return basicGetTimeSeriesSelected();
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR:
			return getAxisFactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER:
			setClientComputer((Computer) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH:
			setChartWidth((Integer) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT:
			setChartHeight((Integer) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY:
			setUserPolicy((UserPolicy) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE:
			setClientScale((Scale) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD:
			setRawDataThreshold((Double) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD:
			setPreComputedDataThreshold((Double) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME:
			setUserTime((Double) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME:
			setPingTime((Double) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED:
			setTimeSeriesSelected((TimeSeries) newValue);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR:
			setAxisFactor((Integer) newValue);
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
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER:
			setClientComputer((Computer) null);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH:
			setChartWidth(CHART_WIDTH_EDEFAULT);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT:
			setChartHeight(CHART_HEIGHT_EDEFAULT);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY:
			setUserPolicy(USER_POLICY_EDEFAULT);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE:
			setClientScale((Scale) null);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD:
			setRawDataThreshold(RAW_DATA_THRESHOLD_EDEFAULT);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD:
			setPreComputedDataThreshold(PRE_COMPUTED_DATA_THRESHOLD_EDEFAULT);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME:
			setUserTime(USER_TIME_EDEFAULT);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME:
			setPingTime(PING_TIME_EDEFAULT);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED:
			setTimeSeriesSelected((TimeSeries) null);
			return;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR:
			setAxisFactor(AXIS_FACTOR_EDEFAULT);
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
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_COMPUTER:
			return clientComputer != null;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_WIDTH:
			return chartWidth != CHART_WIDTH_EDEFAULT;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CHART_HEIGHT:
			return chartHeight != CHART_HEIGHT_EDEFAULT;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_POLICY:
			return userPolicy != USER_POLICY_EDEFAULT;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__CLIENT_SCALE:
			return clientScale != null;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__RAW_DATA_THRESHOLD:
			return rawDataThreshold != RAW_DATA_THRESHOLD_EDEFAULT;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PRE_COMPUTED_DATA_THRESHOLD:
			return preComputedDataThreshold != PRE_COMPUTED_DATA_THRESHOLD_EDEFAULT;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__USER_TIME:
			return userTime != USER_TIME_EDEFAULT;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__PING_TIME:
			return pingTime != PING_TIME_EDEFAULT;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__TIME_SERIES_SELECTED:
			return timeSeriesSelected != null;
		case FastPackage.MIN_MAX_VISUALIZATION_CLIENT__AXIS_FACTOR:
			return axisFactor != AXIS_FACTOR_EDEFAULT;
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
		result.append(" (chartWidth: ");
		result.append(chartWidth);
		result.append(", chartHeight: ");
		result.append(chartHeight);
		result.append(", userPolicy: ");
		result.append(userPolicy);
		result.append(", rawDataThreshold: ");
		result.append(rawDataThreshold);
		result.append(", preComputedDataThreshold: ");
		result.append(preComputedDataThreshold);
		result.append(", userTime: ");
		result.append(userTime);
		result.append(", pingTime: ");
		result.append(pingTime);
		result.append(", axisFactor: ");
		result.append(axisFactor);
		result.append(')');
		return result.toString();
	}

} // MinMaxVisualizationClientImpl
