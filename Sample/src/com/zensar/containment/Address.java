package com.zensar.containment;

public class Address {

	private String houseNo,street,area,city;
	Address(String houseNo,String street,String area,String city){
		this.houseNo=houseNo;
		this.street=street;
		this.area=area;
		this.city=city;
				
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
