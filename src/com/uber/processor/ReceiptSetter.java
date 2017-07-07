package com.uber.processor;

import com.uber.model.Receipt;

public class ReceiptSetter {

	
	public static Receipt set(String name, String type, int kmdriven, double charges) {
		// TODO Auto-generated method stub
		Receipt receipt = new Receipt();
		receipt.setCustomerName(name);
		receipt.setCarType(type);
		receipt.setKmDriven(kmdriven);
		receipt.setChrages(charges);
		return receipt;
	}

	
	
	
}
