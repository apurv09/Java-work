package com.zensar.training.abstractclasses;

public class Rectangle extends Shape {
	float length,breadth;
		void computeArea(float parameter1) {
		
		length=parameter1;
		breadth=4;
		area=(float)(length*breadth);
//		System.out.println("Area of rectangle:"+area);
}
}
