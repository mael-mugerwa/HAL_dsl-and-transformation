/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAL System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.HALSystem#getHomeAddress <em>Home Address</em>}</li>
 *   <li>{@link hal.HALSystem#getRules <em>Rules</em>}</li>
 *   <li>{@link hal.HALSystem#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link hal.HALSystem#getReadings <em>Readings</em>}</li>
 *   <li>{@link hal.HALSystem#getCommands <em>Commands</em>}</li>
 *   <li>{@link hal.HALSystem#getRooms <em>Rooms</em>}</li>
 *   <li>{@link hal.HALSystem#getSensors <em>Sensors</em>}</li>
 *   <li>{@link hal.HALSystem#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getHALSystem()
 * @model
 * @generated
 */
public interface HALSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Home Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Address</em>' attribute.
	 * @see #setHomeAddress(String)
	 * @see hal.HalPackage#getHALSystem_HomeAddress()
	 * @model
	 * @generated
	 */
	String getHomeAddress();

	/**
	 * Sets the value of the '{@link hal.HALSystem#getHomeAddress <em>Home Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Address</em>' attribute.
	 * @see #getHomeAddress()
	 * @generated
	 */
	void setHomeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link hal.AutomationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see hal.HalPackage#getHALSystem_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<AutomationRule> getRules();

	/**
	 * Returns the value of the '<em><b>Activitylog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitylog</em>' containment reference.
	 * @see #setActivitylog(ActivityLog)
	 * @see hal.HalPackage#getHALSystem_Activitylog()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActivityLog getActivitylog();

	/**
	 * Sets the value of the '{@link hal.HALSystem#getActivitylog <em>Activitylog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitylog</em>' containment reference.
	 * @see #getActivitylog()
	 * @generated
	 */
	void setActivitylog(ActivityLog value);

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' containment reference list.
	 * The list contents are of type {@link hal.SensorReading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' containment reference list.
	 * @see hal.HalPackage#getHALSystem_Readings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SensorReading> getReadings();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link hal.IssuedCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see hal.HalPackage#getHALSystem_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssuedCommand> getCommands();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link hal.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see hal.HalPackage#getHALSystem_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link hal.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see hal.HalPackage#getHALSystem_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link hal.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see hal.HalPackage#getHALSystem_Actuators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

} // HALSystem
