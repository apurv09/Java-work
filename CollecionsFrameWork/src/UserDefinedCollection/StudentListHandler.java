package UserDefinedCollection;

import java.util.ArrayList;
public class StudentListHandler {

	public static void main(String[] args) {
		ArrayList studentList=new ArrayList<Student>();
		
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		
		student1.setId(1001);
		student1.setName("AMD");
		
		student2.setId(1002);
		student2.setName("Smith");
		
		student3.setId(1003);
		student3.setName("leo");
		
	//add the student object to list
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
	//call show stud detial metd	
		showStudentDetails(studentList);
	}

	public static void showStudentDetails(ArrayList<Student> studentList) {
		for(Student student:studentList) {
		System.out.println(student.getId()+" "+student.getName()); 
		}
	}
}
