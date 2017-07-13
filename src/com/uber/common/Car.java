package com.uber.common;

import com.uber.model.Receipt;
import com.uber.model.Trip;

public interface Car {
	public Receipt calculateBillAmount(Trip trip) ;
}
