package com.uber.util;

import com.uber.common.CarType;
import com.uber.dao.DistanceCalculateDao;
import com.uber.model.Receipt;
import com.uber.model.Trip;
import com.uber.model.TripEstimateResponse;
import com.uber.service.BillCalculator;

public class DistanceCalculator {

	
	public TripEstimateResponse calculateTripEstimate(String pickupAddress,String dropAddress){
	Receipt receipt;
	DistanceCalculator distanceCalculator = new DistanceCalculator();
	double dist=distanceCalculator.getDistanceinKM(pickupAddress,dropAddress);		
	if(dist==0){
		receipt=null;
	}else{
	Trip trip = new Trip("Akshay",CarType.MEDIUM,4,dist);		
	BillCalculator billCalculator = new BillCalculator();
	receipt=billCalculator.checkBill(trip);
	}
	
	TripEstimateResponse estimateResponse= new TripEstimateResponse();		
	if(receipt!=null)
	return estimateResponse.setTripEstimate(receipt.getCharges());
	else
		return null;
}

	private double getDistanceinKM(String pickupAddress, String dropAddress) {		
	DistanceCalculateDao dao= new DistanceCalculateDao();	
	double distance=dao.getDistance(pickupAddress,dropAddress);		
		return distance;
	}

}
