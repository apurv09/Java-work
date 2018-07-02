package com.zensar.training.abstractclasses;

public class Circle extends Shape{
	
	float radius;
	void computeArea(float parameter1) {
		// TODO Auto-generated method stub
		radius = parameter1;
		area=(float) (Math.PI*radius*radius);
	}
	

}
