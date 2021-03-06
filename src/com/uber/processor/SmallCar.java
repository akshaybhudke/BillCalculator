package com.uber.processor;

import com.uber.common.Car;
import com.uber.model.Receipt;
import com.uber.model.Trip;

public class SmallCar implements Car{

	
	public Receipt calculateBillAmount(Trip trip) {
		double charges;
		
		if(trip.getKmDriven()<=10){
			charges=40;
		}else{
			double extraKm=trip.getKmDriven()-10;
			charges=40+(extraKm*6);
		}
		
		return ReceiptGenerator.set(trip,charges);
		
		
	}

}
