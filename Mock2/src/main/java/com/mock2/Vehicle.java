package com.mock2;

import java.util.Map;

public class Vehicle {
	private String vehicleType;
	private Map<String,String> vahicleDetails;

	public Map<String, String> getVahicleDetails() {
		return vahicleDetails;
	}

	public void setVahicleDetails(Map<String, String> vahicleDetails) {
		this.vahicleDetails = vahicleDetails;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", vahicleDetails=" + vahicleDetails + "]";
	}

}
