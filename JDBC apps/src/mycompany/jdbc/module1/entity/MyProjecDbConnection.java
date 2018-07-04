package mycompany.jdbc.module1.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Helper class to handle DATA CONNECTIVITY
  WITH  student database in oracle
  */

public class MyProjecDbConnection {

	
	//new instance of connection
	private static Connection connection=null;
	
	//opening connection with ORACLE database
	public static Connection createConnection()
		throws ClassNotFoundException,SQLException{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott", "tiger");
		System.out.println(""+"---Connection established with Oracle database---");
		return connection;
	}
	public static void closeConnection()throws SQLException{
		connection.close();
	}
}
