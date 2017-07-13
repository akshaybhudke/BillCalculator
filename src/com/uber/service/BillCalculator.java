package com.uber.service;

import com.uber.common.Car;
import com.uber.model.Receipt;
import com.uber.model.Trip;
import com.uber.processor.LargeCar;
import com.uber.processor.MediumCar;
import com.uber.processor.SmallCar;
import com.uber.processor.TripValidator;

public class BillCalculator {
	
	Receipt receipt;
		
	public Receipt calculateBillAmount(Trip trip) {
		Car car;		
		String carType=trip.getCarType().toString();
			
		switch (carType) {
         case "SMALL":
        	 car = new SmallCar();
             receipt=car.calculateBillAmount(trip);
            
             break;
         case "MEDIUM":
        	  car = new MediumCar();
        	 receipt=car.calculateBillAmount(trip);
            
             break;
         case "LARGE":
        	  car=new LargeCar();
        	 receipt=car.calculateBillAmount(trip);
            
             break;
         default:
             break;
     }
		return receipt;
		
	}

	public Receipt checkBill(Trip trip) {
		// TODO Auto-generated method stub
		boolean canTakeTrip = TripValidator.validateTrip(trip);		
		if(canTakeTrip==true){
		BillCalculator billCalculator = new BillCalculator();		
		Receipt receipt = billCalculator.calculateBillAmount(trip);			
		System.out.println("Please have a look at your receipt :");
		System.out.println(receipt);
		return receipt;
		}else
			System.out.println("Your Trip is not valid,so Bill cannot be generated. Seat Count is more for selected CarType : "+trip.getCarType().toString());
		return null;
				
	}
	
}
