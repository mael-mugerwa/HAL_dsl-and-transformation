/**
 */
package hal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hal.Sensor#getRoom <em>Room</em>}</li>
 *   <li>{@link hal.Sensor#getReadings <em>Readings</em>}</li>
 *   <li>{@link hal.Sensor#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hal.HalPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hal.Room#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see hal.HalPackage#getSensor_Room()
	 * @see hal.Room#getSensors
	 * @model opposite="sensors" required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link hal.Sensor#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' reference list.
	 * The list contents are of type {@link hal.SensorReading}.
	 * It is bidirectional and its opposite is '{@link hal.SensorReading#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' reference list.
	 * @see hal.HalPackage#getSensor_Readings()
	 * @see hal.SensorReading#getSensor
	 * @model opposite="sensor"
	 * @generated
	 */
	EList<SensorReading> getReadings();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hal.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hal.SensorType
	 * @see #setType(SensorType)
	 * @see hal.HalPackage#getSensor_Type()
	 * @model required="true"
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link hal.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hal.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

} // Sensor
