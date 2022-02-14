/**
 */
package ca.mcgill.emf.examples.hal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.mcgill.emf.examples.hal.ActivityLog;
import ca.mcgill.emf.examples.hal.AutomationRule;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.IssuedCommand;
import ca.mcgill.emf.examples.hal.SensorReading;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.ActivityLogImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityLogImpl extends MinimalEObjectImpl.Container implements ActivityLog {
	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected SensorReading readings;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<IssuedCommand> commands;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<AutomationRule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTIVITY_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorReading getReadings() {
		if (readings != null && readings.eIsProxy()) {
			InternalEObject oldReadings = (InternalEObject)readings;
			readings = (SensorReading)eResolveProxy(oldReadings);
			if (readings != oldReadings) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTIVITY_LOG__READINGS, oldReadings, readings));
			}
		}
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorReading basicGetReadings() {
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadings(SensorReading newReadings, NotificationChain msgs) {
		SensorReading oldReadings = readings;
		readings = newReadings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ACTIVITY_LOG__READINGS, oldReadings, newReadings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadings(SensorReading newReadings) {
		if (newReadings != readings) {
			NotificationChain msgs = null;
			if (readings != null)
				msgs = ((InternalEObject)readings).eInverseRemove(this, HalPackage.SENSOR_READING__ACTIVITYLOG, SensorReading.class, msgs);
			if (newReadings != null)
				msgs = ((InternalEObject)newReadings).eInverseAdd(this, HalPackage.SENSOR_READING__ACTIVITYLOG, SensorReading.class, msgs);
			msgs = basicSetReadings(newReadings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTIVITY_LOG__READINGS, newReadings, newReadings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssuedCommand> getCommands() {
		if (commands == null) {
			commands = new EObjectWithInverseResolvingEList<IssuedCommand>(IssuedCommand.class, this, HalPackage.ACTIVITY_LOG__COMMANDS, HalPackage.ISSUED_COMMAND__ACTIVITYLOG);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutomationRule> getRules() {
		if (rules == null) {
			rules = new EObjectWithInverseResolvingEList<AutomationRule>(AutomationRule.class, this, HalPackage.ACTIVITY_LOG__RULES, HalPackage.AUTOMATION_RULE__ACTIVITYLOG);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.ACTIVITY_LOG__READINGS:
				if (readings != null)
					msgs = ((InternalEObject)readings).eInverseRemove(this, HalPackage.SENSOR_READING__ACTIVITYLOG, SensorReading.class, msgs);
				return basicSetReadings((SensorReading)otherEnd, msgs);
			case HalPackage.ACTIVITY_LOG__COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
			case HalPackage.ACTIVITY_LOG__RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRules()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.ACTIVITY_LOG__READINGS:
				return basicSetReadings(null, msgs);
			case HalPackage.ACTIVITY_LOG__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case HalPackage.ACTIVITY_LOG__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HalPackage.ACTIVITY_LOG__READINGS:
				if (resolve) return getReadings();
				return basicGetReadings();
			case HalPackage.ACTIVITY_LOG__COMMANDS:
				return getCommands();
			case HalPackage.ACTIVITY_LOG__RULES:
				return getRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HalPackage.ACTIVITY_LOG__READINGS:
				setReadings((SensorReading)newValue);
				return;
			case HalPackage.ACTIVITY_LOG__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends IssuedCommand>)newValue);
				return;
			case HalPackage.ACTIVITY_LOG__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends AutomationRule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HalPackage.ACTIVITY_LOG__READINGS:
				setReadings((SensorReading)null);
				return;
			case HalPackage.ACTIVITY_LOG__COMMANDS:
				getCommands().clear();
				return;
			case HalPackage.ACTIVITY_LOG__RULES:
				getRules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HalPackage.ACTIVITY_LOG__READINGS:
				return readings != null;
			case HalPackage.ACTIVITY_LOG__COMMANDS:
				return commands != null && !commands.isEmpty();
			case HalPackage.ACTIVITY_LOG__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityLogImpl
