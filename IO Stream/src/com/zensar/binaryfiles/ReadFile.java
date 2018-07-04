package com.zensar.binaryfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f;
		f=new File("tetfile1.txt");
		
		if(!f.exists()&&f.length()<0)
			System.out.println("This specified file is not exist");
		
		else {
			FileInputStream finp=new FileInputStream(f);
			byte b;
			do {
				b=(byte)finp.read();
				System.out.println((char)b);
			}
			while(b!=-1);
			finp.close();
		}
	}

}
