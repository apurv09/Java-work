package com.zensar.library.pojo;
public class Book {
	int id;
	String name;
	float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println(id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println(name);
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		System.out.println(price);
		this.price = price;
	}
}
