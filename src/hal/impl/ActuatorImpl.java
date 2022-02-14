/**
 */
package hal.impl;

import hal.Actuator;
import hal.ActuatorType;
import hal.HalPackage;
import hal.IssuedCommand;
import hal.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hal.impl.ActuatorImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link hal.impl.ActuatorImpl#getPossibleCommands <em>Possible Commands</em>}</li>
 *   <li>{@link hal.impl.ActuatorImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link hal.impl.ActuatorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends NamedElementImpl implements Actuator {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getPossibleCommands() <em>Possible Commands</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<String> possibleCommands;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActuatorType TYPE_EDEFAULT = ActuatorType.HEATER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActuatorType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HalPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HalPackage.ACTUATOR__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__ROOM, oldRoom, newRoom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		if (newRoom != room) {
			NotificationChain msgs = null;
			if (room != null)
				msgs = ((InternalEObject)room).eInverseRemove(this, HalPackage.ROOM__ACTUATORS, Room.class, msgs);
			if (newRoom != null)
				msgs = ((InternalEObject)newRoom).eInverseAdd(this, HalPackage.ROOM__ACTUATORS, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssuedCommand> getCommands() {
		if (commands == null) {
			commands = new EObjectWithInverseResolvingEList<IssuedCommand>(IssuedCommand.class, this, HalPackage.ACTUATOR__COMMANDS, HalPackage.ISSUED_COMMAND__ACTUATOR);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActuatorType newType) {
		ActuatorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HalPackage.ACTUATOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPossibleCommands() {
		if (possibleCommands == null) {
			possibleCommands = new EDataTypeUniqueEList<String>(String.class, this, HalPackage.ACTUATOR__POSSIBLE_COMMANDS);
		}
		return possibleCommands;
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
			case HalPackage.ACTUATOR__ROOM:
				if (room != null)
					msgs = ((InternalEObject)room).eInverseRemove(this, HalPackage.ROOM__ACTUATORS, Room.class, msgs);
				return basicSetRoom((Room)otherEnd, msgs);
			case HalPackage.ACTUATOR__COMMANDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommands()).basicAdd(otherEnd, msgs);
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
			case HalPackage.ACTUATOR__ROOM:
				return basicSetRoom(null, msgs);
			case HalPackage.ACTUATOR__COMMANDS:
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
			case HalPackage.ACTUATOR__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case HalPackage.ACTUATOR__POSSIBLE_COMMANDS:
				return getPossibleCommands();
			case HalPackage.ACTUATOR__COMMANDS:
				return getCommands();
			case HalPackage.ACTUATOR__TYPE:
				return getType();
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
			case HalPackage.ACTUATOR__ROOM:
				setRoom((Room)newValue);
				return;
			case HalPackage.ACTUATOR__POSSIBLE_COMMANDS:
				getPossibleCommands().clear();
				getPossibleCommands().addAll((Collection<? extends String>)newValue);
				return;
			case HalPackage.ACTUATOR__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends IssuedCommand>)newValue);
				return;
			case HalPackage.ACTUATOR__TYPE:
				setType((ActuatorType)newValue);
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
			case HalPackage.ACTUATOR__ROOM:
				setRoom((Room)null);
				return;
			case HalPackage.ACTUATOR__POSSIBLE_COMMANDS:
				getPossibleCommands().clear();
				return;
			case HalPackage.ACTUATOR__COMMANDS:
				getCommands().clear();
				return;
			case HalPackage.ACTUATOR__TYPE:
				setType(TYPE_EDEFAULT);
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
			case HalPackage.ACTUATOR__ROOM:
				return room != null;
			case HalPackage.ACTUATOR__POSSIBLE_COMMANDS:
				return possibleCommands != null && !possibleCommands.isEmpty();
			case HalPackage.ACTUATOR__COMMANDS:
				return commands != null && !commands.isEmpty();
			case HalPackage.ACTUATOR__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (possibleCommands: ");
		result.append(possibleCommands);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
