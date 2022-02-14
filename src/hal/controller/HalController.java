package hal.controller;

import hal.Room;
import hal.Sensor;

import java.util.ArrayList;
import java.util.List;

import hal.Actuator;
import hal.SensorType;
import hal.ActuatorType;
import hal.HALSystem;
import hal.HalFactory;
import hal.application.HalApplication;

public class HalController {

	/**
	 * Add a room by first performing validation checks, update model, and save
	 * 
	 * @param roomName new room name
	 * @return error message or null if data saved successfully
	 */
	public static String addRoom(String roomName) {
		if (isStringValid(roomName)) {
			return "Room name must be specified";
		}
		if (existsRoom(roomName)) {
			return "Room with name " + roomName + " already exists";
		}
		HALSystem halSystem = HalApplication.getHALSystem();
		Room r = HalFactory.eINSTANCE.createRoom();
		r.setName(roomName);
		halSystem.getRooms().add(r);
		HalApplication.save();
		return null;
	}

	/**
	 * Show name of a room and list names and types of all its sensors and actuators
	 * 
	 * @param roomName name of the room
	 * @return string listing all information
	 */
	public static String showRoomDetails(String roomName) {
		if (isStringValid(roomName)) {
			return "Room name must be specified";
		}
		if (!existsRoom(roomName)) {
			return "Room with name " + roomName + " doesn't exist";
		}

		Room r = findRoom(roomName);
		List<Actuator> actuators = r.getActuators();
		List<Sensor> sensors = r.getSensors();

		StringBuilder sb = new StringBuilder();
		sb.append("Room with name " + r.getName() + "has the following sensors/actuators:\n");
		for (Actuator a : actuators) {
			sb.append("Actuator with name " + a.getName() + " of type " + a.getType().toString() + "\n");
		}
		for (Sensor s : sensors) {
			sb.append("Sensor with name " + s.getName() + " of type " + s.getType().toString() + "\n");
		}
		return sb.toString();
	}

	/**
	 * Update the name of a room
	 * 
	 * @param oldRoomName old name
	 * @param newRoomName new name
	 * @return error message or null if data saved successfully
	 */
	public static String updateRoom(String oldRoomName, String newRoomName) {
		if (!existsRoom(oldRoomName)) {
			return "Room with name " + oldRoomName + " does not exist";
		}
		if (oldRoomName.equals(newRoomName)) {
			return null;
		}
		if (isStringValid(newRoomName)) {
			return "Room name must be specified";
		}
		if (existsRoom(newRoomName)) {
			return "Room with name " + newRoomName + " already exists";
		}
		Room r = findRoom(oldRoomName);
		r.setName(newRoomName);
		HalApplication.save();
		return null;
	}

	/**
	 * Delete a room and its sensors/actuators keeping the readings and issued
	 * commands in the activity log
	 * 
	 * @param roomName room to be deleted
	 */
	public static String deleteRoom(String roomName) {
		Room r = findRoom(roomName);
		// if r is not found, no error message is returned because the end result is the
		// same:
		// the room with roomName does not exist
		if (r != null) {
			HALSystem halSystem = HalApplication.getHALSystem();

			// remove all sensors of the room
			List<Sensor> sensorsToBeDeleted = new ArrayList<Sensor>();
			for (Sensor s : halSystem.getSensors()) {
				if (s.getRoom().equals(s)) {
					s.setRoom(null);
					// don't remove sensor readings because need history kept in ActivityLog
					s.getReadings().forEach(reading -> reading.setSensor(null));
					sensorsToBeDeleted.add(s);
				}
			}
			while (sensorsToBeDeleted.size() > 0) {
				Sensor s = sensorsToBeDeleted.get(0);
				halSystem.getSensors().remove(s);
			}

			// remove all actuators of the room
			List<Actuator> actuatorsToBeDeleted = new ArrayList<Actuator>();
			for (Actuator a : halSystem.getActuators()) {
				if (a.getRoom().equals(a)) {
					a.setRoom(null);
					// don't remove issued commands because need history kept in ActivityLog
					a.getCommands().forEach(command -> command.setActuator(null));
					actuatorsToBeDeleted.add(a);
				}
			}
			while (actuatorsToBeDeleted.size() > 0) {
				Actuator a = actuatorsToBeDeleted.get(0);
				halSystem.getActuators().remove(a);
			}

			// remove room
			halSystem.getRooms().remove(r);
			HalApplication.save();
		}		
		return null;
	}

	/**
	 * Add a new sensor of a specific type to the room
	 * 
	 * @param roomName         room to add device to
	 * @param sensorName       name of device
	 * @param type             type of device
	 * @return error message or null if data saved successfully
	 */
	public static String addSensor(String roomName, String sensorName, String type) {
		if (!existsRoom(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
		if (isStringValid(sensorName)) {
			return "Device name must be specified";
		}
		if (existsDevice(sensorName)) {
			return "Device with name " + sensorName + " already exists";
		}

		boolean isSensor = SensorType.get(type) != null;

		HALSystem halSystem = HalApplication.getHALSystem();
		Room r = findRoom(roomName);

		if (isSensor) {
			Sensor s = HalFactory.eINSTANCE.createSensor();
			s.setRoom(r);
			s.setName(sensorName);
			s.setType(SensorType.get(type));
			r.getSensors().add(s);
			halSystem.getSensors().add(s);
			HalApplication.save();
		} else {
			return "Sensor type " + type + " is invalid";
		}
		return null;
	}
	
	/**
	 * Add a new sensor or actuator to a specific type to the room
	 * 
	 * @param roomName         room to add device to
	 * @param actuatorName       name of device
	 * @param type             type of device
	 * @param possibleCommands is any for the actuator
	 * @return error message or null if data saved successfully
	 */
	public static String addActuator(String roomName, String actuatorName, String type, String possibleCommands) {
		if (!existsRoom(roomName)) {
			return "Room with name " + roomName + " does not exist";
		}
		if (isStringValid(actuatorName)) {
			return "Device name must be specified";
		}
		if (existsDevice(actuatorName)) {
			return "Device with name " + actuatorName + " already exists";
		}

		boolean isActuator = ActuatorType.get(type) != null;

		HALSystem halSystem = HalApplication.getHALSystem();
		Room r = findRoom(roomName);

		if (isActuator) {
			Actuator a = HalFactory.eINSTANCE.createActuator();
			a.setRoom(r);
			a.setName(actuatorName);
			a.setType(ActuatorType.get(type));
			a.setPossibleCommands(possibleCommands);
			r.getActuators().add(a);
			halSystem.getActuators().add(a);
			HalApplication.save();
		} else {
			return "Actuator type " + type + " is invalid";
		}
		return null;
	}

	/**
	 * Delete a sensor or actuator from a room keeping the readings and issued
	 * commands in the activity log
	 * 
	 * @param deviceName device to be deleted
	 */
	public static String deleteDevice(String deviceName) {
		Sensor s = findSensor(deviceName);
		Actuator a = findActuator(deviceName);
		// if device is not found, no error message is returned because the end result
		// is the
		// same:
		if (s != null) {
			HALSystem halSystem = HalApplication.getHALSystem();

			// remove sensor from the room
			Room r = s.getRoom();
			r.getSensors().remove(s);

			// remove sensor from the room
			halSystem.getSensors().remove(s);
			HalApplication.save();
		} else if (a != null) {
			HALSystem halSystem = HalApplication.getHALSystem();

			// remove actuator from the room
			Room r = a.getRoom();
			r.getActuators().remove(a);

			// remove actuator
			halSystem.getActuators().remove(a);
			HalApplication.save();
		}
		
		return null;
	}

	/**
	 * Test that given string is valid
	 * 
	 * @param s string to test
	 * @return true if string valid, false otherwise
	 */
	private static boolean isStringValid(String s) {
		return s == null || s.length() == 0;
	}

	/**
	 * Verify a Room with the same doesn't exist
	 * 
	 * @param roomName name of the room to search for
	 * @return true if room exists, false otherwise
	 */
	private static boolean existsRoom(String roomName) {
		return findRoom(roomName) != null;
	}

	/**
	 * Search for room by name and return it
	 * 
	 * @param roomName name of the room to search for
	 * @return room if found, null otherwise
	 */
	private static Room findRoom(String roomName) {
		HALSystem halSystem = HalApplication.getHALSystem();
		for (Room r : halSystem.getRooms()) {
			if (r.getName().equals(roomName)) {
				return r;
			}
		}
		return null;
	}
	
	// query methods
	// do not change the model but return data (either a basic type or transfer object)
	
	public static TORoom getRoom(String roomName) {
		TORoom result = null;
		Room r = findRoom(roomName);
		if (r != null) {
			List<String> sensorNames = new ArrayList<String>();
			List<String> actuatorNames = new ArrayList<String>();
			for (Sensor s : r.getSensors()) {
				sensorNames.add(s.getName());
			}
			for (Actuator a : r.getActuators()) {
				actuatorNames.add(a.getName());
			}
			result = new TORoom(r.getName(), sensorNames, actuatorNames);
		}
		return result;
	}

	public static List<String> getRooms() {
		ArrayList<String> roomNames = new ArrayList<String>();
		HALSystem hal = HalApplication.getHALSystem();
		for (Room r : hal.getRooms()) {
			roomNames.add(r.getName());
		}
		return roomNames;
	}	
	
	//validation

	private static boolean existsDevice(String deviceName) {
		Actuator a = findActuator(deviceName);
		Sensor s = findSensor(deviceName);
		return a != null || s != null;
	}

	private static Actuator findActuator(String deviceName) {
		HALSystem halSystem = HalApplication.getHALSystem();
		for (Actuator a : halSystem.getActuators()) {
			if (a.getName().equals(deviceName)) {
				return a;
			}
		}
		return null;
	}

	private static Sensor findSensor(String deviceName) {
		HALSystem halSystem = HalApplication.getHALSystem();
		for (Sensor s : halSystem.getSensors()) {
			if (s.getName().equals(deviceName)) {
				return s;
			}
		}
		return null;
	}
}
