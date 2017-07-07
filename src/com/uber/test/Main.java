package com.uber.test;

import java.io.IOException;

import com.uber.model.Receipt;
import com.uber.service.BillCalculator;

public class Main {

public static void main(String args[]) throws IOException{
	
	BillCalculator billCalculator = new BillCalculator();
	
	Receipt re = billCalculator.calculateBillAmount("sourabh", "Medium",11);
	System.out.println(re);
	
	
}
	


	
}
