package com.zensar.binaryfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("tetfile1.txt");
		FileOutputStream fop=new FileOutputStream(f);
		
		if(f.exists()) {
			String str="This data is written through the program";
			fop.write(str.getBytes());
			
			fop.flush();
			fop.close();
			System.out.println("This data has been written");
		}
	}

}
