/**
 */
package ca.mcgill.emf.examples.hal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.mcgill.emf.examples.hal.ActivityLog;
import ca.mcgill.emf.examples.hal.AutomationRule;
import ca.mcgill.emf.examples.hal.HalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.impl.AutomationRuleImpl#getActivitylog <em>Activitylog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomationRuleImpl extends MinimalEObjectImpl.Container implements AutomationRule {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.AUTOMATION_RULE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.AUTOMATION_RULE__ACTIVITYLOG, oldActivitylog, activitylog));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__ACTIVITYLOG, oldActivitylog, newActivitylog);
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
				msgs = ((InternalEObject)activitylog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__RULES, ActivityLog.class, msgs);
			if (newActivitylog != null)
				msgs = ((InternalEObject)newActivitylog).eInverseAdd(this, HalPackage.ACTIVITY_LOG__RULES, ActivityLog.class, msgs);
			msgs = basicSetActivitylog(newActivitylog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.AUTOMATION_RULE__ACTIVITYLOG, newActivitylog, newActivitylog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.AUTOMATION_RULE__ACTIVITYLOG:
				if (activitylog != null)
					msgs = ((InternalEObject)activitylog).eInverseRemove(this, HalPackage.ACTIVITY_LOG__RULES, ActivityLog.class, msgs);
				return basicSetActivitylog((ActivityLog)otherEnd, msgs);
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
			case HalPackage.AUTOMATION_RULE__ACTIVITYLOG:
				return basicSetActivitylog(null, msgs);
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
			case HalPackage.AUTOMATION_RULE__ACTIVITYLOG:
				if (resolve) return getActivitylog();
				return basicGetActivitylog();
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
			case HalPackage.AUTOMATION_RULE__ACTIVITYLOG:
				setActivitylog((ActivityLog)newValue);
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
			case HalPackage.AUTOMATION_RULE__ACTIVITYLOG:
				setActivitylog((ActivityLog)null);
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
			case HalPackage.AUTOMATION_RULE__ACTIVITYLOG:
				return activitylog != null;
		}
		return super.eIsSet(featureID);
	}

} //AutomationRuleImpl
