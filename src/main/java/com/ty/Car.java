package com.ty;

public class Car {

	String carName;
	int carAge;

	void details() {
		System.out.println("car details is called");
		System.out.println("car name is " + carName);
		System.out.println("car age is " + carAge);
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarAge() {
		return carAge;
	}

	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}

}
