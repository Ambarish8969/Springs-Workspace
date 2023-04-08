package com.mock2;

public class Car {
	private int carId;
	private String carName;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + "]";
	}

}
