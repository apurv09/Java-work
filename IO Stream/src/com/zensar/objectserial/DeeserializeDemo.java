package com.zensar.objectserial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = null;
		try {
			FileInputStream fileIn=new FileInputStream("employees.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			emp=(Employee) in.readObject();
			in.close();
			fileIn.close();
		}catch(IOException ioex) {
			ioex.printStackTrace();
			return;
			
		}catch (ClassNotFoundException cnfex){
			System.out.println("Employee class not found");
			cnfex.printStackTrace();
			return;
			
		}
		System.out.println("Name:"+emp.name);
		System.out.println("Address:"+emp.address);
		System.out.println("SSN:"+emp.SSN);
		System.out.println("Number:"+emp.number);
	}

}
