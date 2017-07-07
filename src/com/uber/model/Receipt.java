package com.uber.model;

public class Receipt {

	private String customerName;
	private String carType;
	private int kmDriven;
	private double chrages;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getKmDriven() {
		return kmDriven;
	}
	public void setKmDriven(int kmDriven) {
		this.kmDriven = kmDriven;
	}
	public double getChrages() {
		return chrages;
	}
	public void setChrages(double chrages) {
		this.chrages = chrages;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Receipt [customerName=" + customerName + ", carType=" + carType + ", kmDriven=" + kmDriven
				+ ", chrages=" + chrages + "]";
	}
	
	
	
}
