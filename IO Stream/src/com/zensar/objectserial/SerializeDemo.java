package com.zensar.objectserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] a) {
		Employee emp=new Employee();
		emp.name="Anirudh";
		emp.address="LB Colony, vizag";
		emp.SSN=1111;
		emp.number=101;
		
		try {
			FileOutputStream fileOut=new FileOutputStream("employees.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
		}
		catch(IOException ioex) {
			ioex.printStackTrace();
		}
	}
	
}
