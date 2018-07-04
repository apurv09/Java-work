package com.zensar.jdbc.flight1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FlightDbConnection {
private static Connection connection=null;
	
	//opening connection with ORACLE database
	public static Connection createConnection() throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
		System.out.println(" "+"........connection established with oracle database....");
		return connection;
	}
	
	//closing connection
	public static void closeConnection() throws SQLException{
		System.out.println(".......connection closed with oracle database......");
		connection.close();
	}
}
