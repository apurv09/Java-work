package  com.zensar.strings;

import java.util.*;

public class WordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		int counter=1;
		System.out.println("Enter a String");
		str= sc.nextLine();
		for(int index=0;index<str.length();index++) {
			if (str.charAt(index)==' ' && str.charAt(index+1) != ' ') {
				counter++;
				
			}
		}
		System.out.println("No. of words="+counter);
			
	}

}

