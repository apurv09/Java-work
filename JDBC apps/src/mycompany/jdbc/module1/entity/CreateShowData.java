package mycompany.jdbc.module1.entity;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import mycompany.jdbc.module1.entity.Student;
public class CreateShowData {

	Connection conn=null;
	Statement stmt=null;
	ResultSet studentData=null;
	
	public void insertStudentsDetails(Student student) throws ClassNotFoundException, SQLException {
		//con to db
		conn= MyProjecDbConnection.createConnection();
		//create entity object -pojo
		stmt=conn.createStatement();
		int rows=stmt.executeUpdate("insert into student values("+student.getId()+",'"+student.getName()+"','"+student.getQualification()+"','"+student.getCity()+"')");
		System.out.println(rows+"Row Inserted");
	}

	public void selectStudentsDetails(Student student) throws ClassNotFoundException, SQLException {
		//con to db
		conn= MyProjecDbConnection.createConnection();
		//create entity object -pojo
		stmt=conn.createStatement();
		ResultSet studentData = stmt.executeQuery("select * from student");
		while(studentData.next())
			System.out.println(studentData.getInt(1)+" "+studentData.getString("name")+" "+studentData.getString(3)+" "+studentData.getString(4));
		}
	public void readStudentDetails() throws ClassNotFoundException, SQLException {
		
		conn =MyProjecDbConnection.createConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id");
		int stid=sc.nextInt();
		PreparedStatement pstmt=
				conn.prepareStatement("select * from student where id=?");
		
		pstmt.setInt(1, stid);
		System.out.println("PreparedStmt created");
		studentData=pstmt.executeQuery();
		
		//loop through student data to display
		System.out.println("Execute query");
		
		while(studentData.next())
			System.out.println(studentData.getInt(1)+" "+studentData.getString("name")+" "+studentData.getString(3)+" "+studentData.getString(4));

	}
}
