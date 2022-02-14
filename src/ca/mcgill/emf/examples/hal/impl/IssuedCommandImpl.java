/**
 */
package ca.mcgill.emf.examples.hal.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.mcgill.emf.examples.hal.ActivityLog;
import ca.mcgill.emf.examples.hal.Actuator;
import ca.mcgill.emf.examples.hal.HalPackage;
import ca.mcgill.emf.examples.hal.IssuedCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issued Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.IssuedCommandImpl#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.IssuedCommandImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.IssuedCommandImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.IssuedCommandImpl#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssuedCommandImpl extends MinimalEObjectImpl.Container implements IssuedCommand {
	/**
	 * The cached value of the '{@link #getActivitylog() <em>Activitylog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitylog()
	 * @generated
	 * @ordered
	 */
	protected ActivityLog activitylog;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected Actuator actuator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssuedCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ISSUED_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog getActivitylog() {
		if (activitylog != null && activitylog.eIsProxy()) {
			InternalEObject oldActivitylog = (InternalEObject)activitylog;
			activitylog = (ActivityLog)eResolveProxy(oldActivitylog);
			if (activitylog != oldActivitylog) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ISSUED_COMMAND__ACTIVITYLOG, oldActivitylog, activitylog));
			}
		}
		return activitylog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog basicGetActivitylog() {
		return activitylog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivitylog(ActivityLog newActivitylog, NotificationChain msgs) {
		ActivityLog oldActivitylog = activitylog;
		activitylog = newActivitylog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ISSUED_COMMAND__ACTIVITYLOG, oldActivitylog, newActivitylog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivitylog(ActivityLog newActivitylog) {
		if (newActivitylog != activitylog) {
			NotificationChain msgs = null;
			if (activitylog != null)
				msgs = ((InternalEObject)activitylog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__COMMANDS, ActivityLog.class, msgs);
			if (newActivitylog != null)
				msgs = ((InternalEObject)newActivitylog).eInverseAdd(this, HalPackage.ACTIVITY_LOG__COMMANDS, ActivityLog.class, msgs);
			msgs = basicSetActivitylog(newActivitylog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ISSUED_COMMAND__ACTIVITYLOG, newActivitylog, newActivitylog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ISSUED_COMMAND__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ISSUED_COMMAND__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getActuator() {
		if (actuator != null && actuator.eIsProxy()) {
			InternalEObject oldActuator = (InternalEObject)actuator;
			actuator = (Actuator)eResolveProxy(oldActuator);
			if (actuator != oldActuator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ISSUED_COMMAND__ACTUATOR, oldActuator, actuator));
			}
		}
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator basicGetActuator() {
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuator(Actuator newActuator, NotificationChain msgs) {
		Actuator oldActuator = actuator;
		actuator = newActuator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ISSUED_COMMAND__ACTUATOR, oldActuator, newActuator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuator(Actuator newActuator) {
		if (newActuator != actuator) {
			NotificationChain msgs = null;
			if (actuator != null)
				msgs = ((InternalEObject)actuator).eInverseRemove(this, HalPackage.ACTUATOR__COMMANDS, Actuator.class, msgs);
			if (newActuator != null)
				msgs = ((InternalEObject)newActuator).eInverseAdd(this, HalPackage.ACTUATOR__COMMANDS, Actuator.class, msgs);
			msgs = basicSetActuator(newActuator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ISSUED_COMMAND__ACTUATOR, newActuator, newActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.ISSUED_COMMAND__ACTIVITYLOG:
				if (activitylog != null)
					msgs = ((InternalEObject)activitylog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__COMMANDS, ActivityLog.class, msgs);
				return basicSetActivitylog((ActivityLog)otherEnd, msgs);
			case HalPackage.ISSUED_COMMAND__ACTUATOR:
				if (actuator != null)
					msgs = ((InternalEObject)actuator).eInverseRemove(this, HalPackage.ACTUATOR__COMMANDS, Actuator.class, msgs);
				return basicSetActuator((Actuator)otherEnd, msgs);
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
			case HalPackage.ISSUED_COMMAND__ACTIVITYLOG:
				return basicSetActivitylog(null, msgs);
			case HalPackage.ISSUED_COMMAND__ACTUATOR:
				return basicSetActuator(null, msgs);
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
			case HalPackage.ISSUED_COMMAND__ACTIVITYLOG:
				if (resolve) return getActivitylog();
				return basicGetActivitylog();
			case HalPackage.ISSUED_COMMAND__COMMAND:
				return getCommand();
			case HalPackage.ISSUED_COMMAND__TIMESTAMP:
				return getTimestamp();
			case HalPackage.ISSUED_COMMAND__ACTUATOR:
				if (resolve) return getActuator();
				return basicGetActuator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HalPackage.ISSUED_COMMAND__ACTIVITYLOG:
				setActivitylog((ActivityLog)newValue);
				return;
			case HalPackage.ISSUED_COMMAND__COMMAND:
				setCommand((String)newValue);
				return;
			case HalPackage.ISSUED_COMMAND__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case HalPackage.ISSUED_COMMAND__ACTUATOR:
				setActuator((Actuator)newValue);
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
			case HalPackage.ISSUED_COMMAND__ACTIVITYLOG:
				setActivitylog((ActivityLog)null);
				return;
			case HalPackage.ISSUED_COMMAND__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case HalPackage.ISSUED_COMMAND__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case HalPackage.ISSUED_COMMAND__ACTUATOR:
				setActuator((Actuator)null);
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
			case HalPackage.ISSUED_COMMAND__ACTIVITYLOG:
				return activitylog != null;
			case HalPackage.ISSUED_COMMAND__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case HalPackage.ISSUED_COMMAND__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case HalPackage.ISSUED_COMMAND__ACTUATOR:
				return actuator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (command: ");
		result.append(command);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //IssuedCommandImpl
