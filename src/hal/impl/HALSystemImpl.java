/**
 */
package hal.impl;

import hal.ActivityLog;
import hal.AutomationRule;
import hal.HALSystem;
import hal.HalPackage;
import hal.IssuedCommand;
import hal.NamedElement;
import hal.SensorReading;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAL System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.HALSystemImpl#getHomeAddress <em>Home Address</em>}</li>
 *   <li>{@link hal.impl.HALSystemImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link hal.impl.HALSystemImpl#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link hal.impl.HALSystemImpl#getNamedelement <em>Namedelement</em>}</li>
 *   <li>{@link hal.impl.HALSystemImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link hal.impl.HALSystemImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HALSystemImpl extends MinimalEObjectImpl.Container implements HALSystem {
	/**
	 * The default value of the '{@link #getHomeAddress() <em>Home Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomeAddress() <em>Home Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeAddress()
	 * @generated
	 * @ordered
	 */
	protected String homeAddress = HOME_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<AutomationRule> rules;

	/**
	 * The cached value of the '{@link #getActivitylog() <em>Activitylog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitylog()
	 * @generated
	 * @ordered
	 */
	protected ActivityLog activitylog;

	/**
	 * The cached value of the '{@link #getNamedelement() <em>Namedelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedelement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> namedelement;

	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected EList<SensorReading> readings;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<IssuedCommand> commands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HALSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.HAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHomeAddress() {
		return homeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomeAddress(String newHomeAddress) {
		String oldHomeAddress = homeAddress;
		homeAddress = newHomeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.HAL_SYSTEM__HOME_ADDRESS, oldHomeAddress, homeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutomationRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<AutomationRule>(AutomationRule.class, this, HalPackage.HAL_SYSTEM__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityLog getActivitylog() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.HAL_SYSTEM__ACTIVITYLOG, oldActivitylog, newActivitylog);
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
				msgs = ((InternalEObject)activitylog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HalPackage.HAL_SYSTEM__ACTIVITYLOG, null, msgs);
			if (newActivitylog != null)
				msgs = ((InternalEObject)newActivitylog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HalPackage.HAL_SYSTEM__ACTIVITYLOG, null, msgs);
			msgs = basicSetActivitylog(newActivitylog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.HAL_SYSTEM__ACTIVITYLOG, newActivitylog, newActivitylog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedelement() {
		if (namedelement == null) {
			namedelement = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, HalPackage.HAL_SYSTEM__NAMEDELEMENT);
		}
		return namedelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensorReading> getReadings() {
		if (readings == null) {
			readings = new EObjectContainmentEList<SensorReading>(SensorReading.class, this, HalPackage.HAL_SYSTEM__READINGS);
		}
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssuedCommand> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<IssuedCommand>(IssuedCommand.class, this, HalPackage.HAL_SYSTEM__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HalPackage.HAL_SYSTEM__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case HalPackage.HAL_SYSTEM__ACTIVITYLOG:
				return basicSetActivitylog(null, msgs);
			case HalPackage.HAL_SYSTEM__NAMEDELEMENT:
				return ((InternalEList<?>)getNamedelement()).basicRemove(otherEnd, msgs);
			case HalPackage.HAL_SYSTEM__READINGS:
				return ((InternalEList<?>)getReadings()).basicRemove(otherEnd, msgs);
			case HalPackage.HAL_SYSTEM__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
			case HalPackage.HAL_SYSTEM__HOME_ADDRESS:
				return getHomeAddress();
			case HalPackage.HAL_SYSTEM__RULES:
				return getRules();
			case HalPackage.HAL_SYSTEM__ACTIVITYLOG:
				return getActivitylog();
			case HalPackage.HAL_SYSTEM__NAMEDELEMENT:
				return getNamedelement();
			case HalPackage.HAL_SYSTEM__READINGS:
				return getReadings();
			case HalPackage.HAL_SYSTEM__COMMANDS:
				return getCommands();
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
			case HalPackage.HAL_SYSTEM__HOME_ADDRESS:
				setHomeAddress((String)newValue);
				return;
			case HalPackage.HAL_SYSTEM__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends AutomationRule>)newValue);
				return;
			case HalPackage.HAL_SYSTEM__ACTIVITYLOG:
				setActivitylog((ActivityLog)newValue);
				return;
			case HalPackage.HAL_SYSTEM__NAMEDELEMENT:
				getNamedelement().clear();
				getNamedelement().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case HalPackage.HAL_SYSTEM__READINGS:
				getReadings().clear();
				getReadings().addAll((Collection<? extends SensorReading>)newValue);
				return;
			case HalPackage.HAL_SYSTEM__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends IssuedCommand>)newValue);
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
			case HalPackage.HAL_SYSTEM__HOME_ADDRESS:
				setHomeAddress(HOME_ADDRESS_EDEFAULT);
				return;
			case HalPackage.HAL_SYSTEM__RULES:
				getRules().clear();
				return;
			case HalPackage.HAL_SYSTEM__ACTIVITYLOG:
				setActivitylog((ActivityLog)null);
				return;
			case HalPackage.HAL_SYSTEM__NAMEDELEMENT:
				getNamedelement().clear();
				return;
			case HalPackage.HAL_SYSTEM__READINGS:
				getReadings().clear();
				return;
			case HalPackage.HAL_SYSTEM__COMMANDS:
				getCommands().clear();
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
			case HalPackage.HAL_SYSTEM__HOME_ADDRESS:
				return HOME_ADDRESS_EDEFAULT == null ? homeAddress != null : !HOME_ADDRESS_EDEFAULT.equals(homeAddress);
			case HalPackage.HAL_SYSTEM__RULES:
				return rules != null && !rules.isEmpty();
			case HalPackage.HAL_SYSTEM__ACTIVITYLOG:
				return activitylog != null;
			case HalPackage.HAL_SYSTEM__NAMEDELEMENT:
				return namedelement != null && !namedelement.isEmpty();
			case HalPackage.HAL_SYSTEM__READINGS:
				return readings != null && !readings.isEmpty();
			case HalPackage.HAL_SYSTEM__COMMANDS:
				return commands != null && !commands.isEmpty();
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
		result.append(" (homeAddress: ");
		result.append(homeAddress);
		result.append(')');
		return result.toString();
	}

} //HALSystemImpl
