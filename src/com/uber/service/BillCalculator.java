package com.uber.service;

import com.uber.common.Car;
import com.uber.model.Receipt;
import com.uber.processor.LargeCar;
import com.uber.processor.MediumCar;
import com.uber.processor.SmallCar;

public class BillCalculator {
	
	Receipt receipt;
		
	public Receipt calculateBillAmount(String name, String carType,int kmdriven) {
		 Car car;
		switch (carType) {
         case "Small":
        	 car = new SmallCar();
             receipt=car.calculateBillAmount(name, carType, kmdriven);
            
             break;
         case "Medium":
        	  car = new MediumCar();
        	 receipt=car.calculateBillAmount(name, carType, kmdriven);
            
             break;
         case "Large":
        	  car=new LargeCar();
        	 receipt=car.calculateBillAmount(name, carType, kmdriven);
            
             break;
         default:
             break;
     }
		return receipt;
		
	}
	
}
