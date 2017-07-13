package com.uber.service;

import com.uber.common.CarType;
import com.uber.model.Receipt;
import com.uber.model.Trip;
import com.uber.model.TripEstimateResponse;
import com.uber.util.DistanceCalculator;

public class TripService {

	
	public TripEstimateResponse getPriceEstimates(String pickupAddress,String dropAddress){
		
		DistanceCalculator distanceCalculator = new DistanceCalculator();
		TripEstimateResponse tripEstimateResponse=distanceCalculator.calculateTripEstimate(pickupAddress,dropAddress);		
		return tripEstimateResponse;
	}	
		
}
