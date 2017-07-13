package com.uber.executor;

import java.io.IOException;

import com.uber.service.TripService;

public class Main {

public static void main(String args[]) throws IOException{
	
	/*BillCalculator billCalculator = new BillCalculator();
	Trip trip = new Trip("Sourabh",CarType.SMALL,2,11.40);
	billCalculator.checkBill(trip);*/	
	TripService tripService = new TripService();	
	tripService.getPriceEstimates("pune", "delhi");
	
}	
}
