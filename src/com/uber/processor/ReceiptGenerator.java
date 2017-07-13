package com.uber.processor;

import com.uber.model.Receipt;
import com.uber.model.Trip;

public class ReceiptGenerator {

	
	public static Receipt set(Trip trip, double charges) {
		// TODO Auto-generated method stub
		Receipt receipt = new Receipt();
		receipt.setCustomerName(trip.getCustomerName());
		receipt.setCarType(trip.getCarType());
		receipt.setKmDriven(trip.getKmDriven());
		receipt.setCharges(charges);
		return receipt;
	}

	
	
	
}
