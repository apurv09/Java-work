package com.zensar.test2.pojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductNavigator {

	ArrayList<Product> productList=new ArrayList();

	public void addProducts() {
		Scanner sc=new Scanner(System.in);
		Product[] product=new Product[10];
		
		for(int i=0;i<10;i++)
			product[i]=new Product();
		
		//input from usr
		for(int i=0;i<10;i++) {
		System.out.println("Product id");
		product[i].setId(sc.nextInt());
		System.out.println("Product NAme");
		product[i].setName(sc.next());
		System.out.println("Product Type");
		product[i].setTypeOfProduct(sc.next());
		System.out.println("Product Price");
		product[i].setPrice(sc.nextFloat());
		}
		for(int i=0;i<10;i++) {
			
		//add to arrayLIst	
		productList.add(product[i]);
		}
	}
	
	
	public void computeAveragePrice() {
		float avg=0,total=0;
		for(Product i:productList) {
			total=total+i.getPrice();
		}
		System.out.println(total);
		avg=total/10;
		System.out.println("avg"+avg);
	}
}
