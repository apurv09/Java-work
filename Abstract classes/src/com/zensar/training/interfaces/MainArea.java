package com.zensar.training.interfaces;
import java.util.*;
public class MainArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle();
		Rectangle rectangle=new Rectangle();
		Scanner sc =new Scanner(System.in);
		float length;
		length=sc.nextFloat();
		rectangle.computeArea(length);
		rectangle.showArea();
		circle.computeArea(5);
		circle.showArea();
	}

}
