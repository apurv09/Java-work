package com.zensar.containment;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=
				new Address("12-6-9/A","Road No.1","Hebbal","Banglore");
		
		Customer customer=new Customer();
		customer.setId(1001);
		customer.setName("Fedrick");
		customer.setAdddress(address);
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getAdddress().getHouseNo());
		System.out.println(customer.getAdddress().getArea());
		System.out.println(customer.getAdddress().getStreet());
		System.out.println(customer.getAdddress().getCity());
	}

}
