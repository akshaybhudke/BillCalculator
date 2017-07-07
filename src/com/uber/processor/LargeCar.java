package com.uber.processor;

import com.uber.common.Car;
import com.uber.model.Receipt;

public class LargeCar implements Car{

	public Receipt calculateBillAmount(String name, String type, int kmdriven) {
		double charges;
		
		if(kmdriven<=10){
			charges=80;
		}else{
			int extraKm=kmdriven-10;
			charges=80+(extraKm*10);
		}
		
		return ReceiptSetter.set(name,type,kmdriven,charges);
		
		
	}


}
