package hal.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import hal.controller.*;

public class HalPage extends JFrame {
	
	private static final long serialVersionUID = -4426310869335015542L;
	
	// UI elements
	private JLabel errorMessage = new JLabel();
	// room
	private JComboBox<String> roomsList = new JComboBox<String>(new String[0]);
	private JButton showRoomButton = new JButton();
	private JButton deleteRoomButton = new JButton();
	private JButton clearRoomButton = new JButton();
	private JLabel roomNameLabel = new JLabel();
	private JLabel roomNameText = new JLabel();
	private JLabel newRoomNameLabel = new JLabel();
	private JTextField newRoomNameTextField = new JTextField();
	private JButton addRoomButton = new JButton();
	private JButton updateRoomButton = new JButton();
	
	// room's devices
	private JTable devicesTable = new JTable();
	private JScrollPane devicesScrollPane = new JScrollPane(devicesTable);
	private JLabel removeDeviceLabel = new JLabel();
	
	// room's sensors
		
	private JLabel newSensorNameLabel = new JLabel();
	private JTextField newSensorNameTextField = new JTextField();
	private JLabel newSensorTypeLabel = new JLabel();
	private JTextField newSensorTypeTextField = new JTextField();
	private JButton addSensorButton = new JButton();
	
	// room's actuators
	private JLabel newActuatorNameLabel = new JLabel();
	private JTextField newActuatorNameTextField = new JTextField();
	private JLabel newActuatorTypeLabel = new JLabel();
	private JTextField newActuatorTypeTextField = new JTextField();
	private JButton addActuatorButton = new JButton();
	
	// data elements
	private String error = null;
	
	// room's devices
	private DefaultTableModel devicesDtm;
	private String devicesColumnNames[] = {"Devices"};
	private static final int HEIGHT_DEVICES_TABLE = 100;	
	
	public HalPage() {
		initComponents();
		refreshData(null);
	}
		
	/** This method is called from within the constructor to initialize the form.
	 */
	@SuppressWarnings("serial")
	private void initComponents() {
		// elements for error message
		errorMessage.setForeground(Color.RED);
		
		// elements for room
		initializeButton(showRoomButton, "Show", this::showRoomButtonActionPerformed);
		initializeButton(deleteRoomButton, "Delete", this::deleteRoomButtonActionPerformed);
		initializeButton(clearRoomButton, "Clear", this::clearRoomButtonActionPerformed);
		roomNameLabel.setText("Room Name:");
		roomNameText.setText("");
		newRoomNameLabel.setText("New Room Name:");
		initializeButton(addRoomButton, "Add", this::addRoomButtonActionPerformed);
		initializeButton(updateRoomButton, "Update", this::updateRoomButtonActionPerformed);
		
		// elements for room's devices
		removeDeviceLabel.setText("Select a row in the table and hit the delete key on keyboard to remove a device");
		this.add(devicesScrollPane);
		Dimension dDevices = devicesTable.getPreferredSize();
		devicesScrollPane.setPreferredSize(new Dimension(dDevices.width, HEIGHT_DEVICES_TABLE));
		devicesScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		devicesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// enable delete key in table to remove a row (sensor)
		InputMap deviceInputMap = devicesTable.getInputMap(JComponent.WHEN_FOCUSED);
		ActionMap deviceActionMap = devicesTable.getActionMap();
		deviceInputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "delete");
		deviceActionMap.put("delete", new AbstractAction() {
			public void actionPerformed(ActionEvent deleteEvent) {
				devicesTableDeleteKeyActionPerformed(deleteEvent);
		    }
		});
		
		// elements for room's sensors	
		newSensorNameLabel.setText("New Sensor Name:");
		newSensorTypeLabel.setText("New Sensor Type:");
		initializeButton(addSensorButton, "Add Sensor", this::addSensorButtonActionPerformed);
		
		// elements for room's actuators		
		newActuatorNameLabel.setText("New Actuator Name:");
		newActuatorTypeLabel.setText("New Actuator Type:");
		initializeButton(addActuatorButton, "Add Actuator", this::addActuatorButtonActionPerformed);
		
		// global settings and listeners
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("HAL System: Room Management");

		// horizontal line elements
		JSeparator horizontalLine = new JSeparator();
		
		// layout
				GroupLayout layout = new GroupLayout(getContentPane());
				getContentPane().setLayout(layout);
				layout.setAutoCreateGaps(true);
				layout.setAutoCreateContainerGaps(true);
				layout.setHorizontalGroup(
						layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup()
								.addComponent(errorMessage)
								.addGroup(layout.createSequentialGroup()
										.addComponent(roomsList, 200, 200, 400)
										.addComponent(showRoomButton)
										.addComponent(deleteRoomButton)
										.addComponent(clearRoomButton))
								.addComponent(horizontalLine)
								.addGroup(layout.createSequentialGroup()
										.addComponent(roomNameLabel)
										.addComponent(roomNameText))
								.addGroup(layout.createSequentialGroup()
										.addComponent(newRoomNameLabel)
										.addComponent(newRoomNameTextField, 200, 200, 400)
										.addComponent(addRoomButton)
										.addComponent(updateRoomButton))
								.addComponent(removeDeviceLabel)
								.addComponent(devicesScrollPane)
								.addGroup(layout.createSequentialGroup()
										.addComponent(newSensorNameLabel)
										.addComponent(newSensorNameTextField, 200, 200, 400)
										.addComponent(addSensorButton))
								.addGroup(layout.createSequentialGroup()
										.addComponent(newSensorTypeLabel)
										.addComponent(newSensorTypeTextField, 200, 200, 300))
								.addGroup(layout.createSequentialGroup()
										.addComponent(newActuatorNameLabel)
										.addComponent(newActuatorNameTextField, 200, 200, 400))
								.addGroup(layout.createSequentialGroup()
										.addComponent(newActuatorTypeLabel)
										.addComponent(newActuatorTypeTextField, 200, 200, 300)
										.addComponent(addActuatorButton)))
						);

				layout.setVerticalGroup(
						layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
								.addComponent(errorMessage)
								.addGroup(layout.createParallelGroup()
										.addComponent(roomsList)
										.addComponent(showRoomButton)
										.addComponent(deleteRoomButton)
										.addComponent(clearRoomButton))
								.addComponent(horizontalLine)
								.addGroup(layout.createParallelGroup()
										.addComponent(roomNameLabel)
										.addComponent(roomNameText))
								.addGroup(layout.createParallelGroup()
										.addComponent(newRoomNameLabel)
										.addComponent(newRoomNameTextField)
										.addComponent(addRoomButton)
										.addComponent(updateRoomButton))
								.addComponent(removeDeviceLabel)
								.addComponent(devicesScrollPane)
								.addGroup(layout.createParallelGroup()
										.addComponent(newSensorNameLabel)
										.addComponent(newSensorNameTextField))
								.addGroup(layout.createParallelGroup()
										.addComponent(newSensorTypeLabel)
										.addComponent(newSensorTypeTextField)
										.addComponent(addSensorButton))								
								.addGroup(layout.createParallelGroup()
										.addComponent(newActuatorNameLabel)
										.addComponent(newActuatorNameTextField))
								.addGroup(layout.createParallelGroup()
										.addComponent(newActuatorTypeLabel)
										.addComponent(newActuatorTypeTextField)
										.addComponent(addActuatorButton)))
						);
				
				pack();
		
	}
	
	/** This method is called each time the page needs to be updated to the latest data.
	 *  An empty page is shown if null is passed into the method.
	 */
	private void refreshData(String roomName) {
		// error
		errorMessage.setText(error);
		if (error == null || error.length() == 0) {
			// retrieve the room
			TORoom foundRoom = null;
			if (roomName != null) {
				foundRoom = HalController.getRoom(roomName);
			}
			// populate room list
			roomsList.removeAllItems();
			int index = 0, foundIndex = -1;
			for (String rName : HalController.getRooms()) {
				roomsList.addItem(rName);
				if (rName.equals(foundRoom == null ? null : foundRoom.getName())) {
					foundIndex = index;
				}
				index++;
			};
			// enable rooms list UI elements only if at least one room exist
			roomsList.setEnabled(index > 0);
			roomsList.setSelectedIndex(foundIndex);
			showRoomButton.setEnabled(index > 0);
			deleteRoomButton.setEnabled(index > 0);
			// populate other UI elements depending on whether a room was found or not
			if (foundIndex == -1) {
				foundRoom = null;
				// room
				roomNameText.setText("");
				newRoomNameTextField.setText("");
				// room's devices
				populateDevicesTable(null);
				// room's sensors
				newSensorNameTextField.setText("");
				newSensorTypeTextField.setText("");
				// room's actuators
				newActuatorNameTextField.setText("");
				newActuatorTypeTextField.setText("");
				// set allowed UI elements to enabled 
				clearRoomButton.setEnabled(false);
				addRoomButton.setEnabled(true);
				updateRoomButton.setEnabled(false);
				newSensorNameTextField.setEnabled(false);
				newSensorTypeTextField.setEnabled(false);
				addSensorButton.setEnabled(false);
				newActuatorNameTextField.setEnabled(false);
				newActuatorTypeTextField.setEnabled(false);
				addActuatorButton.setEnabled(false);
			} else {
				// room
				roomNameText.setText(foundRoom.getName());
				newRoomNameTextField.setText(foundRoom.getName());
				// room's devices
				populateDevicesTable(foundRoom);
				// room's sensors
				newSensorNameTextField.setText("");
				newSensorTypeTextField.setText("");
				// room's actuators
				newActuatorNameTextField.setText("");
				newActuatorTypeTextField.setText("");
				// set allowed UI elements to enabled
				clearRoomButton.setEnabled(true);
				addRoomButton.setEnabled(false);
				updateRoomButton.setEnabled(true);
				newSensorNameTextField.setEnabled(true);
				newSensorTypeTextField.setEnabled(true);
				addSensorButton.setEnabled(true);
				newActuatorNameTextField.setEnabled(true);
				newActuatorTypeTextField.setEnabled(true);
				addActuatorButton.setEnabled(true);
			}
			Dimension dDevices = devicesTable.getPreferredSize();
			devicesScrollPane.setPreferredSize(new Dimension(dDevices.width, HEIGHT_DEVICES_TABLE));			
		}

		// this is needed because the size of the window changes depending on whether an error message is shown or not
		pack();
	}
	
	/** The following ...ActionPerformed methods first call the Controller and then refresh the page with the desired group.
	 */
	
	private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HalController.addRoom(newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}
	
	private void clearRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData(null);
	}
	
	private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (roomsList.getSelectedIndex() != -1) {
			String roomName = (String) roomsList.getSelectedItem();
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete room " + roomName + "?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) { 
				error = HalController.deleteRoom(roomName);
				refreshData(null);
			}
		}
	}
	
	private void showRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = null;
		refreshData((String) roomsList.getSelectedItem());
	}
	
	private void updateRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HalController.updateRoom(roomNameText.getText(), newRoomNameTextField.getText());
		refreshData(newRoomNameTextField.getText());
	}

	private void addSensorButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HalController.addSensor(roomNameText.getText(), newSensorNameTextField.getText(), newSensorTypeTextField.getText());
		refreshData(roomNameText.getText());
	}
	
	private void addActuatorButtonActionPerformed(java.awt.event.ActionEvent evt) {
		error = HalController.addActuator(roomNameText.getText(), newActuatorNameTextField.getText(), newActuatorTypeTextField.getText(), null);
		refreshData(roomNameText.getText());
	}
	
	private void devicesTableDeleteKeyActionPerformed(java.awt.event.ActionEvent evt) {
		if (devicesTable.getSelectedRow() != -1) {
			String deviceName = (String) devicesTable.getModel().getValueAt(devicesTable.getSelectedRow(), 0);
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete device " + deviceName + "?", 
	        		"Confirm Deletion",	JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (choice == 0) { 
				error = HalController.deleteDevice(deviceName);
				refreshData(roomNameText.getText());
			}
		}
	}

	/** The following methods are helper methods to simplify the methods.
	 */
	
	private void initializeButton(JButton button, String text, ActionListener actionListener) {
		button.setText(text);
		button.addActionListener(actionListener);
	}

	private void populateDevicesTable(TORoom foundRoom) {
		devicesDtm = new DefaultTableModel(0, 0);
		devicesDtm.setColumnIdentifiers(devicesColumnNames);
		devicesTable.setModel(devicesDtm);
		if (foundRoom != null) {			
			for (String sensorName : foundRoom.getSensorNames()) {
				Object[] obj = {sensorName};
				devicesDtm.addRow(obj);
			}
			for (String actuatorName : foundRoom.getActuatorNames()) {
				Object[] obj = {actuatorName};
				devicesDtm.addRow(obj);
			}
		}
	}

}
