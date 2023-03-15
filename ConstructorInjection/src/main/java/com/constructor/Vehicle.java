package com.constructor;

public class Vehicle {
	private int vehicleNumber;
	private String vehicleName;
	
	// Constructor is mandatory in constructor injection
	public Vehicle(int vehicleNumber,String vehicleName) {
		this.vehicleName=vehicleName;
		this.vehicleNumber=vehicleNumber;
	}
	
	// Getters and Setters are not mandatory.
	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", vehicleName=" + vehicleName + "]";
	}
	
}
