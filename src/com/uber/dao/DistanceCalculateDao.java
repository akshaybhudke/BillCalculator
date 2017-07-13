package com.uber.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DistanceCalculateDao {
 
	
	public double getDistance(String pickupAddress, String dropAddress) {	
	
	String query ="select distance from distanceInfo where source=\'"+pickupAddress+"\' and destination=\'"+dropAddress+"\';";
	
			PreparedStatement ps;
			double distance = 0;
			Connection con = null;
			try {
				con=ConnectionManager.getConnection();
				ps = con.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()){
					distance=rs.getDouble(1);	
											
				}else{
					System.out.println("Direct route is not allowed in between these cities");
					distance= 0;
					//checkForOtherRouteDistance(pickupAddress,dropAddress);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return distance;
			
			
	}

	/*
	 	private double checkForOtherRouteDistance(String pickupAddress, String dropAddress) {
		// TODO Auto-generated method stub
		
		String isSourcePresentQuery ="select * from distanceInfo where source=\'"+pickupAddress+"\';";
		List list = new ArrayList<>();
		PreparedStatement ps;
		double distance = 0;
		try {
			Connection con=ConnectionManager.getConnection();
			ps = con.prepareStatement(isSourcePresentQuery);
			ResultSet rs = ps.executeQuery();				
			if(rs.wasNull()){
				distance= 0;
			}else{
				while(rs.next()){
					list.add(rs.getString(2));
				}	
				System.out.println(list);					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return distance;
		
		
	}
	*/
}
