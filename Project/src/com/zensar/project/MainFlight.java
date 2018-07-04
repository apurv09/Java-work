package com.zensar.project;

import java.sql.SQLException;
import java.util.Scanner;

import com.zensar.jdbc.flight1.dao.FlightCreateData;
import com.zensar.jdbc.flight1.dao.FlightDbConnection;
import com.zensar.flight.pojo.FlightInfo;

public class MainFlight {

public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
		// TODO Auto-generated method stub
	FlightDbConnection.createConnection();
		readValues();
		
		FlightCreateData csd=new FlightCreateData();
		csd.showFlightDetails();
		csd.readFlightDetails();
		FlightDbConnection.closeConnection();
	}
	

	

	public static void readValues() throws ClassNotFoundException,SQLException{
		FlightInfo flight=new FlightInfo();
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("Enter Flight Id=");
		flight.setId(scnr.nextInt());
		
		System.out.println("Enter Flight Name=");
		flight.setName(scnr.next());
		
		System.out.println("Enter Flight Sounce=");
		flight.setSource(scnr.next());
		
		System.out.println("Enter Flight destination=");
		flight.setDestination(scnr.next());
		
		System.out.println("Enter Flight price=");
		flight.setPrice(scnr.nextFloat());
		
		FlightCreateData fsd=new FlightCreateData();
		fsd.insertFlightDetails(flight);
	}

}
