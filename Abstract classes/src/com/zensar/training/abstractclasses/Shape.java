package com.zensar.training.abstractclasses;
public abstract class Shape {
	
	float area;
	abstract void computeArea(float parameter1);
	public void showArea() {
		System.out.println("Area="+area);
	}
}
