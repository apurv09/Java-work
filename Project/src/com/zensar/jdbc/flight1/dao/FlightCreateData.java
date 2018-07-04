package com.zensar.jdbc.flight1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.zensar.jdbc.flight1.dao.FlightDbConnection;
import com.zensar.flight.pojo.FlightInfo;

public class FlightCreateData {
	Connection conn=null;
	Statement stmt=null;
	ResultSet FlightData=null;
	
	public void insertFlightDetails(FlightInfo flightinfo) throws ClassNotFoundException,SQLException{
		//connection to database
		conn=FlightDbConnection.createConnection();
		
		//create entity object-pojo
		stmt=conn.createStatement();
		int rows=stmt.executeUpdate("insert into flight values("+flightinfo.getId()+",'"
				+flightinfo.getName()+"','"+flightinfo.getSource()+"','"+flightinfo.getDestination()+"',"+flightinfo.getPrice()+")");
		System.out.println(rows+"Row Inserted");
	}
	
	
	public void showFlightDetails() throws ClassNotFoundException,SQLException{
		conn=FlightDbConnection.createConnection();
		stmt=conn.createStatement();
		System.out.println("Statement created");
		FlightData=stmt.executeQuery("select * from flight");
		
		System.out.println("execute query");
		
		while(FlightData.next()){
			System.out.println(FlightData.getInt("id"));
			System.out.println(FlightData.getString("operatorname"));
			System.out.println(FlightData.getString("source"));
			System.out.println(FlightData.getString("destination"));
			System.out.println(FlightData.getFloat("price"));
		}
	}
	
	public void readFlightDetails() throws ClassNotFoundException,SQLException{
		conn=FlightDbConnection.createConnection();
		Scanner scnr=new Scanner(System.in);
		System.out.println("enter flight id");
		int stid=scnr.nextInt();
		PreparedStatement pstmt=conn.prepareStatement("Select *from flight where id=?");
		pstmt.setInt(1,stid);
		System.out.println("preparedStatement created");
		FlightData=pstmt.executeQuery();
		
		//loop through the student data to display
		System.out.println("execute query");
		
		while(FlightData.next()){
			System.out.println(FlightData.getInt("id"));
			System.out.println(FlightData.getString("operatorname"));
			System.out.println(FlightData.getString("source"));
			System.out.println(FlightData.getString("destination"));
			System.out.println(FlightData.getFloat("price"));
		}
	}
}
