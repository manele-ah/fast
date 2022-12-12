/**
 */
package fr.ubo.fast.impl;

import fr.ubo.fast.DataSource;
import fr.ubo.fast.FastPackage;
import fr.ubo.fast.MeasuredVariable;
import fr.ubo.fast.TimeSeries;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Time
 * Series</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesImpl#getTimeSeriesMeasuredVariable <em>Time Series Measured Variable</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesImpl#getTimeSeriesDataSource <em>Time Series Data Source</em>}</li>
 *   <li>{@link fr.ubo.fast.impl.TimeSeriesImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSeriesImpl extends NamedElementImpl implements TimeSeries
{
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected String endTime = END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected double period = PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSeriesMeasuredVariable() <em>Time Series Measured Variable</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTimeSeriesMeasuredVariable()
	 * @generated
	 * @ordered
	 */
	protected MeasuredVariable timeSeriesMeasuredVariable;

	/**
	 * The cached value of the '{@link #getTimeSeriesDataSource() <em>Time Series Data Source</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTimeSeriesDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource timeSeriesDataSource;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSeriesImpl()
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
		return FastPackage.Literals.TIME_SERIES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartTime()
	{
		return startTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(String newStartTime)
	{
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(
					new ENotificationImpl(this, Notification.SET, FastPackage.TIME_SERIES__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndTime()
	{
		return endTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(String newEndTime)
	{
		String oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.TIME_SERIES__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriod()
	{
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(double newPeriod)
	{
		double oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.TIME_SERIES__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredVariable getTimeSeriesMeasuredVariable()
	{
		if (timeSeriesMeasuredVariable != null && timeSeriesMeasuredVariable.eIsProxy())
		{
			InternalEObject oldTimeSeriesMeasuredVariable = (InternalEObject) timeSeriesMeasuredVariable;
			timeSeriesMeasuredVariable = (MeasuredVariable) eResolveProxy(oldTimeSeriesMeasuredVariable);
			if (timeSeriesMeasuredVariable != oldTimeSeriesMeasuredVariable)
			{
				if (eNotificationRequired())
					eNotify(
							new ENotificationImpl(this, Notification.RESOLVE, FastPackage.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE,
									oldTimeSeriesMeasuredVariable, timeSeriesMeasuredVariable));
			}
		}
		return timeSeriesMeasuredVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredVariable basicGetTimeSeriesMeasuredVariable()
	{
		return timeSeriesMeasuredVariable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesMeasuredVariable(MeasuredVariable newTimeSeriesMeasuredVariable)
	{
		MeasuredVariable oldTimeSeriesMeasuredVariable = timeSeriesMeasuredVariable;
		timeSeriesMeasuredVariable = newTimeSeriesMeasuredVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE,
					oldTimeSeriesMeasuredVariable, timeSeriesMeasuredVariable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getTimeSeriesDataSource()
	{
		if (timeSeriesDataSource != null && timeSeriesDataSource.eIsProxy())
		{
			InternalEObject oldTimeSeriesDataSource = (InternalEObject) timeSeriesDataSource;
			timeSeriesDataSource = (DataSource) eResolveProxy(oldTimeSeriesDataSource);
			if (timeSeriesDataSource != oldTimeSeriesDataSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FastPackage.TIME_SERIES__TIME_SERIES_DATA_SOURCE,
							oldTimeSeriesDataSource, timeSeriesDataSource));
			}
		}
		return timeSeriesDataSource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetTimeSeriesDataSource()
	{
		return timeSeriesDataSource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSeriesDataSource(DataSource newTimeSeriesDataSource)
	{
		DataSource oldTimeSeriesDataSource = timeSeriesDataSource;
		timeSeriesDataSource = newTimeSeriesDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.TIME_SERIES__TIME_SERIES_DATA_SOURCE,
					oldTimeSeriesDataSource, timeSeriesDataSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId)
	{
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FastPackage.TIME_SERIES__ID, oldId, id));
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
		case FastPackage.TIME_SERIES__START_TIME:
			return getStartTime();
		case FastPackage.TIME_SERIES__END_TIME:
			return getEndTime();
		case FastPackage.TIME_SERIES__PERIOD:
			return getPeriod();
		case FastPackage.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE:
			if (resolve)
				return getTimeSeriesMeasuredVariable();
			return basicGetTimeSeriesMeasuredVariable();
		case FastPackage.TIME_SERIES__TIME_SERIES_DATA_SOURCE:
			if (resolve)
				return getTimeSeriesDataSource();
			return basicGetTimeSeriesDataSource();
		case FastPackage.TIME_SERIES__ID:
			return getId();
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
		case FastPackage.TIME_SERIES__START_TIME:
			setStartTime((String) newValue);
			return;
		case FastPackage.TIME_SERIES__END_TIME:
			setEndTime((String) newValue);
			return;
		case FastPackage.TIME_SERIES__PERIOD:
			setPeriod((Double) newValue);
			return;
		case FastPackage.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE:
			setTimeSeriesMeasuredVariable((MeasuredVariable) newValue);
			return;
		case FastPackage.TIME_SERIES__TIME_SERIES_DATA_SOURCE:
			setTimeSeriesDataSource((DataSource) newValue);
			return;
		case FastPackage.TIME_SERIES__ID:
			setId((Integer) newValue);
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
		case FastPackage.TIME_SERIES__START_TIME:
			setStartTime(START_TIME_EDEFAULT);
			return;
		case FastPackage.TIME_SERIES__END_TIME:
			setEndTime(END_TIME_EDEFAULT);
			return;
		case FastPackage.TIME_SERIES__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
			return;
		case FastPackage.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE:
			setTimeSeriesMeasuredVariable((MeasuredVariable) null);
			return;
		case FastPackage.TIME_SERIES__TIME_SERIES_DATA_SOURCE:
			setTimeSeriesDataSource((DataSource) null);
			return;
		case FastPackage.TIME_SERIES__ID:
			setId(ID_EDEFAULT);
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
		case FastPackage.TIME_SERIES__START_TIME:
			return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
		case FastPackage.TIME_SERIES__END_TIME:
			return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
		case FastPackage.TIME_SERIES__PERIOD:
			return period != PERIOD_EDEFAULT;
		case FastPackage.TIME_SERIES__TIME_SERIES_MEASURED_VARIABLE:
			return timeSeriesMeasuredVariable != null;
		case FastPackage.TIME_SERIES__TIME_SERIES_DATA_SOURCE:
			return timeSeriesDataSource != null;
		case FastPackage.TIME_SERIES__ID:
			return id != ID_EDEFAULT;
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
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", period: ");
		result.append(period);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // TimeSeriesImpl
