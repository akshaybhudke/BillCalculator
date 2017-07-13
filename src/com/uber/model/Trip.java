package com.uber.model;

import com.uber.common.CarType;

public class Trip {

	private String customerName;
	private CarType carType;
	private double kmDriven;
	private int noOfPassangers;
	
	
	public Trip(){
		
	}
	

	public Trip(String customerName, CarType carType,int noOfPassangers, double kmDriven ) {
		super();
		this.customerName = customerName;
		this.carType = carType;
		this.kmDriven = kmDriven;
		this.noOfPassangers = noOfPassangers;
	}


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public CarType getCarType() {
		return carType;
	}
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	public double getKmDriven() {
		return kmDriven;
	}
	public void setKmDriven(double kmDriven) {
		this.kmDriven = kmDriven;
	}
	
	public int getNoOfPassangers() {
		return noOfPassangers;
	}

	public void setNoOfPassangers(int noOfPassangers) {
		this.noOfPassangers = noOfPassangers;
	}

	
	
}
