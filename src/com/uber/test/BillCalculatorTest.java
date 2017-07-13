package com.uber.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.uber.common.CarType;
import com.uber.model.Receipt;
import com.uber.model.Trip;
import com.uber.processor.TripValidator;
import com.uber.service.BillCalculator;

public class BillCalculatorTest {
	
	public void add(int a, int b){
		
	}

	@Test
	public void whenUserIsEligbleToTakeTripCheckBillWithSmallCar(){
		
		Trip trip = new Trip("Sourabh",CarType.SMALL,2,80);
		BillCalculator billCalculator = new BillCalculator();
		Receipt actual = new Receipt();
		actual=billCalculator.checkBill(trip);
		Receipt expected = new Receipt();
		expected.setCustomerName("Sourabh");
		expected.setCarType(CarType.SMALL);
		expected.setKmDriven(80);
		expected.setCharges(460);				
		assertEquals(expected.toString(), actual.toString());
		
	}
	
	@Test
	public void whenUserIsEligbleToTakeTripCheckBillMediumCar(){
	
		Trip trip = new Trip("Sourabh",CarType.MEDIUM,8,80);
		trip.setCarType(CarType.MEDIUM);
		trip.setNoOfPassangers(8);
		BillCalculator billCalculator = new BillCalculator();
		
		Receipt actual = new Receipt();
		actual=billCalculator.checkBill(trip);
		
		Receipt expected = new Receipt();
		expected.setCustomerName("Sourabh");
		expected.setCarType(CarType.MEDIUM);
		expected.setKmDriven(80);
		expected.setCharges(620);				
		assertEquals(expected.toString(), actual.toString());
		
	}
	
	@Test
	public void whenUserIsNotEligbleToTakeTripCheckBill(){
		Trip trip = new Trip("Sonakshi",CarType.SMALL,9,80);
		BillCalculator billCalculator = new BillCalculator();
		Receipt actual = billCalculator.checkBill(trip);
		Receipt expected = null;		
		assertEquals(expected, actual);
		
		
	}
	
}
