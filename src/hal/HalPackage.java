/**
 */
package hal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hal.HalFactory
 * @model kind="package"
 * @generated
 */
public interface HalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.mcgill.ca/emf/examples/hal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HalPackage eINSTANCE = hal.impl.HalPackageImpl.init();

	/**
	 * The meta object id for the '{@link hal.impl.HALSystemImpl <em>HAL System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.HALSystemImpl
	 * @see hal.impl.HalPackageImpl#getHALSystem()
	 * @generated
	 */
	int HAL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Home Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__HOME_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__RULES = 1;

	/**
	 * The feature id for the '<em><b>Activitylog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__ACTIVITYLOG = 2;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__READINGS = 3;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__COMMANDS = 4;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__ROOMS = 5;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__SENSORS = 6;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM__ACTUATORS = 7;

	/**
	 * The number of structural features of the '<em>HAL System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>HAL System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.NamedElementImpl
	 * @see hal.impl.HalPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.RoomImpl
	 * @see hal.impl.HalPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SENSORS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ACTUATORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.SensorImpl
	 * @see hal.impl.HalPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ROOM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__READINGS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActuatorImpl
	 * @see hal.impl.HalPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ROOM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Possible Commands</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__POSSIBLE_COMMANDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__COMMANDS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hal.impl.SensorReadingImpl <em>Sensor Reading</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.SensorReadingImpl
	 * @see hal.impl.HalPackageImpl#getSensorReading()
	 * @generated
	 */
	int SENSOR_READING = 5;

	/**
	 * The feature id for the '<em><b>Activitylog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__ACTIVITYLOG = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING__SENSOR = 3;

	/**
	 * The number of structural features of the '<em>Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensor Reading</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_READING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.IssuedCommandImpl <em>Issued Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.IssuedCommandImpl
	 * @see hal.impl.HalPackageImpl#getIssuedCommand()
	 * @generated
	 */
	int ISSUED_COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Activitylog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND__ACTIVITYLOG = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND__COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND__ACTUATOR = 3;

	/**
	 * The number of structural features of the '<em>Issued Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Issued Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUED_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.ActivityLogImpl <em>Activity Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.ActivityLogImpl
	 * @see hal.impl.HalPackageImpl#getActivityLog()
	 * @generated
	 */
	int ACTIVITY_LOG = 7;

	/**
	 * The feature id for the '<em><b>Readings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__READINGS = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__COMMANDS = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG__RULES = 2;

	/**
	 * The number of structural features of the '<em>Activity Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Activity Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_LOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.impl.AutomationRuleImpl
	 * @see hal.impl.HalPackageImpl#getAutomationRule()
	 * @generated
	 */
	int AUTOMATION_RULE = 8;

	/**
	 * The feature id for the '<em><b>Activitylog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE__ACTIVITYLOG = 0;

	/**
	 * The number of structural features of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Automation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATION_RULE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link hal.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.SensorType
	 * @see hal.impl.HalPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 9;

	/**
	 * The meta object id for the '{@link hal.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hal.ActuatorType
	 * @see hal.impl.HalPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link hal.HALSystem <em>HAL System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HAL System</em>'.
	 * @see hal.HALSystem
	 * @generated
	 */
	EClass getHALSystem();

	/**
	 * Returns the meta object for the attribute '{@link hal.HALSystem#getHomeAddress <em>Home Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Address</em>'.
	 * @see hal.HALSystem#getHomeAddress()
	 * @see #getHALSystem()
	 * @generated
	 */
	EAttribute getHALSystem_HomeAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HALSystem#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see hal.HALSystem#getRules()
	 * @see #getHALSystem()
	 * @generated
	 */
	EReference getHALSystem_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link hal.HALSystem#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activitylog</em>'.
	 * @see hal.HALSystem#getActivitylog()
	 * @see #getHALSystem()
	 * @generated
	 */
	EReference getHALSystem_Activitylog();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HALSystem#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Readings</em>'.
	 * @see hal.HALSystem#getReadings()
	 * @see #getHALSystem()
	 * @generated
	 */
	EReference getHALSystem_Readings();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HALSystem#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see hal.HALSystem#getCommands()
	 * @see #getHALSystem()
	 * @generated
	 */
	EReference getHALSystem_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HALSystem#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see hal.HALSystem#getRooms()
	 * @see #getHALSystem()
	 * @generated
	 */
	EReference getHALSystem_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HALSystem#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see hal.HALSystem#getSensors()
	 * @see #getHALSystem()
	 * @generated
	 */
	EReference getHALSystem_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link hal.HALSystem#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see hal.HALSystem#getActuators()
	 * @see #getHALSystem()
	 * @generated
	 */
	EReference getHALSystem_Actuators();

	/**
	 * Returns the meta object for class '{@link hal.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see hal.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference list '{@link hal.Room#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see hal.Room#getSensors()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Sensors();

	/**
	 * Returns the meta object for the reference list '{@link hal.Room#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuators</em>'.
	 * @see hal.Room#getActuators()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Actuators();

	/**
	 * Returns the meta object for class '{@link hal.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see hal.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the reference '{@link hal.Sensor#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see hal.Sensor#getRoom()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Room();

	/**
	 * Returns the meta object for the reference list '{@link hal.Sensor#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Readings</em>'.
	 * @see hal.Sensor#getReadings()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Readings();

	/**
	 * Returns the meta object for the attribute '{@link hal.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hal.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for class '{@link hal.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see hal.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the reference '{@link hal.Actuator#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see hal.Actuator#getRoom()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Room();

	/**
	 * Returns the meta object for the reference list '{@link hal.Actuator#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see hal.Actuator#getCommands()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Commands();

	/**
	 * Returns the meta object for the attribute '{@link hal.Actuator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hal.Actuator#getType()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Type();

	/**
	 * Returns the meta object for the attribute list '{@link hal.Actuator#getPossibleCommands <em>Possible Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Possible Commands</em>'.
	 * @see hal.Actuator#getPossibleCommands()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_PossibleCommands();

	/**
	 * Returns the meta object for class '{@link hal.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hal.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hal.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hal.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hal.SensorReading <em>Sensor Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor Reading</em>'.
	 * @see hal.SensorReading
	 * @generated
	 */
	EClass getSensorReading();

	/**
	 * Returns the meta object for the reference '{@link hal.SensorReading#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activitylog</em>'.
	 * @see hal.SensorReading#getActivitylog()
	 * @see #getSensorReading()
	 * @generated
	 */
	EReference getSensorReading_Activitylog();

	/**
	 * Returns the meta object for the attribute '{@link hal.SensorReading#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hal.SensorReading#getValue()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_Value();

	/**
	 * Returns the meta object for the attribute '{@link hal.SensorReading#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see hal.SensorReading#getTimestamp()
	 * @see #getSensorReading()
	 * @generated
	 */
	EAttribute getSensorReading_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link hal.SensorReading#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see hal.SensorReading#getSensor()
	 * @see #getSensorReading()
	 * @generated
	 */
	EReference getSensorReading_Sensor();

	/**
	 * Returns the meta object for class '{@link hal.IssuedCommand <em>Issued Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issued Command</em>'.
	 * @see hal.IssuedCommand
	 * @generated
	 */
	EClass getIssuedCommand();

	/**
	 * Returns the meta object for the reference '{@link hal.IssuedCommand#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activitylog</em>'.
	 * @see hal.IssuedCommand#getActivitylog()
	 * @see #getIssuedCommand()
	 * @generated
	 */
	EReference getIssuedCommand_Activitylog();

	/**
	 * Returns the meta object for the attribute '{@link hal.IssuedCommand#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see hal.IssuedCommand#getCommand()
	 * @see #getIssuedCommand()
	 * @generated
	 */
	EAttribute getIssuedCommand_Command();

	/**
	 * Returns the meta object for the attribute '{@link hal.IssuedCommand#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see hal.IssuedCommand#getTimestamp()
	 * @see #getIssuedCommand()
	 * @generated
	 */
	EAttribute getIssuedCommand_Timestamp();

	/**
	 * Returns the meta object for the reference '{@link hal.IssuedCommand#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see hal.IssuedCommand#getActuator()
	 * @see #getIssuedCommand()
	 * @generated
	 */
	EReference getIssuedCommand_Actuator();

	/**
	 * Returns the meta object for class '{@link hal.ActivityLog <em>Activity Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Log</em>'.
	 * @see hal.ActivityLog
	 * @generated
	 */
	EClass getActivityLog();

	/**
	 * Returns the meta object for the reference '{@link hal.ActivityLog#getReadings <em>Readings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Readings</em>'.
	 * @see hal.ActivityLog#getReadings()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Readings();

	/**
	 * Returns the meta object for the reference list '{@link hal.ActivityLog#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see hal.ActivityLog#getCommands()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Commands();

	/**
	 * Returns the meta object for the reference list '{@link hal.ActivityLog#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rules</em>'.
	 * @see hal.ActivityLog#getRules()
	 * @see #getActivityLog()
	 * @generated
	 */
	EReference getActivityLog_Rules();

	/**
	 * Returns the meta object for class '{@link hal.AutomationRule <em>Automation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automation Rule</em>'.
	 * @see hal.AutomationRule
	 * @generated
	 */
	EClass getAutomationRule();

	/**
	 * Returns the meta object for the reference '{@link hal.AutomationRule#getActivitylog <em>Activitylog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activitylog</em>'.
	 * @see hal.AutomationRule#getActivitylog()
	 * @see #getAutomationRule()
	 * @generated
	 */
	EReference getAutomationRule_Activitylog();

	/**
	 * Returns the meta object for enum '{@link hal.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see hal.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link hal.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see hal.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HalFactory getHalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hal.impl.HALSystemImpl <em>HAL System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.HALSystemImpl
		 * @see hal.impl.HalPackageImpl#getHALSystem()
		 * @generated
		 */
		EClass HAL_SYSTEM = eINSTANCE.getHALSystem();

		/**
		 * The meta object literal for the '<em><b>Home Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAL_SYSTEM__HOME_ADDRESS = eINSTANCE.getHALSystem_HomeAddress();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__RULES = eINSTANCE.getHALSystem_Rules();

		/**
		 * The meta object literal for the '<em><b>Activitylog</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__ACTIVITYLOG = eINSTANCE.getHALSystem_Activitylog();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__READINGS = eINSTANCE.getHALSystem_Readings();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__COMMANDS = eINSTANCE.getHALSystem_Commands();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__ROOMS = eINSTANCE.getHALSystem_Rooms();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__SENSORS = eINSTANCE.getHALSystem_Sensors();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAL_SYSTEM__ACTUATORS = eINSTANCE.getHALSystem_Actuators();

		/**
		 * The meta object literal for the '{@link hal.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.RoomImpl
		 * @see hal.impl.HalPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SENSORS = eINSTANCE.getRoom_Sensors();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ACTUATORS = eINSTANCE.getRoom_Actuators();

		/**
		 * The meta object literal for the '{@link hal.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.SensorImpl
		 * @see hal.impl.HalPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__ROOM = eINSTANCE.getSensor_Room();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__READINGS = eINSTANCE.getSensor_Readings();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '{@link hal.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActuatorImpl
		 * @see hal.impl.HalPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__ROOM = eINSTANCE.getActuator_Room();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__COMMANDS = eINSTANCE.getActuator_Commands();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TYPE = eINSTANCE.getActuator_Type();

		/**
		 * The meta object literal for the '<em><b>Possible Commands</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__POSSIBLE_COMMANDS = eINSTANCE.getActuator_PossibleCommands();

		/**
		 * The meta object literal for the '{@link hal.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.NamedElementImpl
		 * @see hal.impl.HalPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hal.impl.SensorReadingImpl <em>Sensor Reading</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.SensorReadingImpl
		 * @see hal.impl.HalPackageImpl#getSensorReading()
		 * @generated
		 */
		EClass SENSOR_READING = eINSTANCE.getSensorReading();

		/**
		 * The meta object literal for the '<em><b>Activitylog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_READING__ACTIVITYLOG = eINSTANCE.getSensorReading_Activitylog();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__VALUE = eINSTANCE.getSensorReading_Value();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR_READING__TIMESTAMP = eINSTANCE.getSensorReading_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR_READING__SENSOR = eINSTANCE.getSensorReading_Sensor();

		/**
		 * The meta object literal for the '{@link hal.impl.IssuedCommandImpl <em>Issued Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.IssuedCommandImpl
		 * @see hal.impl.HalPackageImpl#getIssuedCommand()
		 * @generated
		 */
		EClass ISSUED_COMMAND = eINSTANCE.getIssuedCommand();

		/**
		 * The meta object literal for the '<em><b>Activitylog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUED_COMMAND__ACTIVITYLOG = eINSTANCE.getIssuedCommand_Activitylog();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUED_COMMAND__COMMAND = eINSTANCE.getIssuedCommand_Command();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUED_COMMAND__TIMESTAMP = eINSTANCE.getIssuedCommand_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUED_COMMAND__ACTUATOR = eINSTANCE.getIssuedCommand_Actuator();

		/**
		 * The meta object literal for the '{@link hal.impl.ActivityLogImpl <em>Activity Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.ActivityLogImpl
		 * @see hal.impl.HalPackageImpl#getActivityLog()
		 * @generated
		 */
		EClass ACTIVITY_LOG = eINSTANCE.getActivityLog();

		/**
		 * The meta object literal for the '<em><b>Readings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__READINGS = eINSTANCE.getActivityLog_Readings();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__COMMANDS = eINSTANCE.getActivityLog_Commands();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_LOG__RULES = eINSTANCE.getActivityLog_Rules();

		/**
		 * The meta object literal for the '{@link hal.impl.AutomationRuleImpl <em>Automation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.impl.AutomationRuleImpl
		 * @see hal.impl.HalPackageImpl#getAutomationRule()
		 * @generated
		 */
		EClass AUTOMATION_RULE = eINSTANCE.getAutomationRule();

		/**
		 * The meta object literal for the '<em><b>Activitylog</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATION_RULE__ACTIVITYLOG = eINSTANCE.getAutomationRule_Activitylog();

		/**
		 * The meta object literal for the '{@link hal.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.SensorType
		 * @see hal.impl.HalPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link hal.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hal.ActuatorType
		 * @see hal.impl.HalPackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

	}

} //HalPackage
