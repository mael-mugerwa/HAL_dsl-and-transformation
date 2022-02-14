package ca.mcgill.emf.examples.hal.controller;

import java.util.List;

public class TORoom {

	String name;
	List<String> sensorNames;
	List<String> actuatorNames;

	public TORoom(String name, List<String> sensorNames, List<String> actuatorNames) {
		this.name = name;
		this.sensorNames = sensorNames;
		this.actuatorNames = actuatorNames;
	}

	public String getName() {
		return name;
	}
	
	public List<String> getSensorNames() {
		return sensorNames;
	}

	public List<String> getActuatorNames() {
		return actuatorNames;
	}
	
	
}
