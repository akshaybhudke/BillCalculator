package com.uber.common;

import com.uber.model.Receipt;

public interface Car {

	
	public Receipt calculateBillAmount(String Name, String type,int kmdriven) ;
	
	
}
