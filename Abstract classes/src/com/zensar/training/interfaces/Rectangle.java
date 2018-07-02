package com.zensar.training.interfaces;

public class Rectangle {

	float area,length,breadth;
	public void computeArea(float parameter1) {
		length=parameter1;
		breadth=3;
		area=(float)(length*breadth);
	}
	public void showArea() {
		System.out.println("Area of rectangle="+area);
	}


}
