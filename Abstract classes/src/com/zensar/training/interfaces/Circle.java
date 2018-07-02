package com.zensar.training.interfaces;

public class Circle implements Shape{
	float radius,area;
	public void computeArea(float parameter1) {
		radius=parameter1;
		area=(float)(Math.PI*radius*radius);
	}
	public void showArea() {
		System.out.println("Area of circle="+area);
	}

}
