/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Actuator#getRoom <em>Room</em>}</li>
 *   <li>{@link hal.Actuator#getPossibleCommands <em>Possible Commands</em>}</li>
 *   <li>{@link hal.Actuator#getCommands <em>Commands</em>}</li>
 *   <li>{@link hal.Actuator#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hal.Room#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see hal.HalPackage#getActuator_Room()
	 * @see hal.Room#getActuators
	 * @model opposite="actuators" required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link hal.Actuator#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link hal.IssuedCommand}.
	 * It is bidirectional and its opposite is '{@link hal.IssuedCommand#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see hal.HalPackage#getActuator_Commands()
	 * @see hal.IssuedCommand#getActuator
	 * @model opposite="actuator"
	 * @generated
	 */
	EList<IssuedCommand> getCommands();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hal.ActuatorType
	 * @see #setType(ActuatorType)
	 * @see hal.HalPackage#getActuator_Type()
	 * @model required="true"
	 * @generated
	 */
	ActuatorType getType();

	/**
	 * Sets the value of the '{@link hal.Actuator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hal.ActuatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActuatorType value);

	/**
	 * Returns the value of the '<em><b>Possible Commands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Commands</em>' attribute.
	 * @see #setPossibleCommands(String)
	 * @see hal.HalPackage#getActuator_PossibleCommands()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getPossibleCommands();

	/**
	 * Sets the value of the '{@link hal.Actuator#getPossibleCommands <em>Possible Commands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Possible Commands</em>' attribute.
	 * @see #getPossibleCommands()
	 * @generated
	 */
	void setPossibleCommands(String value);

} // Actuator
