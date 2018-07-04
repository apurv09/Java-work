package com.zensar.binaryfiles;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class WriteData {

	public static void main(String[] args) {
		
		String str="1234,kumar,manager,89343\n";
		String str2="3456,anirudh,Operation Manager";
		try {
			FileOutputStream fos=new FileOutputStream("emp.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			bos.write(str.getBytes());
			bos.flush();
			
			bos.write(str2.getBytes());
			bos.flush();
			System.out.println("the data has been written");
		}
		catch(Exception e) {
			System.out.println("Error writing to a file:"+e);
		}
	}
}
