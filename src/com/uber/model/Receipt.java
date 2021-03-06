package com.uber.model;

import com.uber.common.CarType;

public class Receipt {

	private String customerName;
	private CarType carType;
	private double kmDriven;
	private double charges;
	
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
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	@Override
	public String toString() {
		return "Receipt [customerName=" + customerName + ", carType=" + carType + ", kmDriven=" + kmDriven
				+ ", charges=" + charges + "]";
	}
	
	
	
	
}
