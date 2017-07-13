package com.uber.processor;

import com.uber.common.Car;
import com.uber.model.Receipt;
import com.uber.model.Trip;

public class MediumCar implements Car{

	public Receipt calculateBillAmount(Trip trip) {
		double charges;
		
		if(trip.getKmDriven()<=10){
			charges=60;
		}else{
			double extraKm=trip.getKmDriven()-10;
			charges=60+(extraKm*8);
		}
		
		return ReceiptGenerator.set(trip,charges);
		
		
	}

}
