/**
 */
package ca.mcgill.emf.examples.hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#getSensors <em>Sensors</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.Room#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Sensor}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Sensor#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_Sensors()
	 * @see ca.mcgill.emf.examples.hal.Sensor#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.emf.examples.hal.Actuator}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Actuator#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' reference list.
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getRoom_Actuators()
	 * @see ca.mcgill.emf.examples.hal.Actuator#getRoom
	 * @model opposite="room"
	 * @generated
	 */
	EList<Actuator> getActuators();

} // Room
