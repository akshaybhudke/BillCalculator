package com.uber.processor;

import com.uber.model.Trip;

public class TripValidator {

	public static boolean validateTrip(Trip trip) {
		
		int maxPassangersCount=trip.getCarType().getPassangerCount();
		
		if(trip.getNoOfPassangers()<=maxPassangersCount){
			
			return true;
		}else
			return false;
	}

}
