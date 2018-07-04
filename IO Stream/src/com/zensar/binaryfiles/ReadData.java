package com.zensar.binaryfiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin=new FileInputStream("emp.txt");
			
			BufferedInputStream bis=new BufferedInputStream(fin);
			while(bis.available()>0)
				System.out.println((char)bis.read());

			bis.close();
			fin.close();
		}
		catch(Exception e) {
			System.err.println("Error reading file:"+e);
		}
	}

}
