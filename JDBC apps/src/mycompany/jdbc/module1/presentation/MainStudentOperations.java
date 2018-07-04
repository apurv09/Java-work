package mycompany.jdbc.module1.presentation;

import java.util.Scanner;
import java.sql.SQLException;
import mycompany.jdbc.module1.entity.CreateShowData;
import mycompany.jdbc.module1.entity.MyProjecDbConnection;
import mycompany.jdbc.module1.entity.Student;

public class MainStudentOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//invoke readValues()
		MyProjecDbConnection.createConnection();
		readValues();
		//invoke showStudentDetils()
		
		//	showStudentDetails();
		MyProjecDbConnection.closeConnection();
		
	}
	public static void readValues() throws ClassNotFoundException,SQLException{
		Student student= new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id");
		student.setId(sc.nextInt());
		
		System.out.println("enter student Name");
		student.setName(sc.next());

		
		System.out.println("enter student qualification");
		student.setQualification(sc.next());
		
		System.out.println("enter student City");
		student.setCity(sc.next());
		
		
		CreateShowData csd=new CreateShowData();
		//inserting data
		System.out.println("in main method.." +student.getId());

		csd.insertStudentsDetails(student);
		csd.selectStudentsDetails(student);
		csd.readStudentDetails();
	}
	

}
