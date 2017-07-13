package com.uber.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.uber.common.CarType;
import com.uber.model.Trip;
import com.uber.processor.TripValidator;

public class TripValidatorTest {

	
	 Trip trip = new Trip("Sourabh",CarType.SMALL,2,11.40);
	 @Test
	 public void whenNoOfPassangersIsEqualOrLessThanAllowedPassengersInSmallCar(){
		 TripValidator actual = new TripValidator();
		 boolean response=actual.validateTrip(trip);
		 assertEquals(true, response);
	 }
	 
	 
	 Trip trip1 = new Trip("Sourabh",CarType.SMALL,7,11.40);
	 @Test
	 public void whenNoOfPassangersMoreThanAllowedPassengersInSmallCar(){
		 TripValidator actual = new TripValidator();
		 boolean response=actual.validateTrip(trip1);
		 assertEquals(false, response);
	 }
	 
			
	
			
			
	
	
}
