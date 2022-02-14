/**
 */
package ca.mcgill.emf.examples.hal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issued Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.emf.examples.hal.IssuedCommand#getActivitylog <em>Activitylog</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.IssuedCommand#getCommand <em>Command</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.IssuedCommand#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link ca.mcgill.emf.examples.hal.IssuedCommand#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand()
 * @model
 * @generated
 */
public interface IssuedCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Activitylog</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.ActivityLog#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitylog</em>' reference.
	 * @see #setActivitylog(ActivityLog)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand_Activitylog()
	 * @see ca.mcgill.emf.examples.hal.ActivityLog#getCommands
	 * @model opposite="commands" required="true"
	 * @generated
	 */
	ActivityLog getActivitylog();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getActivitylog <em>Activitylog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitylog</em>' reference.
	 * @see #getActivitylog()
	 * @generated
	 */
	void setActivitylog(ActivityLog value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand_Command()
	 * @model required="true"
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.emf.examples.hal.Actuator#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see ca.mcgill.emf.examples.hal.HalPackage#getIssuedCommand_Actuator()
	 * @see ca.mcgill.emf.examples.hal.Actuator#getCommands
	 * @model opposite="commands"
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link ca.mcgill.emf.examples.hal.IssuedCommand#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

} // IssuedCommand
