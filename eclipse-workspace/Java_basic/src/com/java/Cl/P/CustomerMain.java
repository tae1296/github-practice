package com.java.Cl.P;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c1=new Customer();
		
		c1.setCustomerID(10010);
		c1.setCustomerName("이순신");
		c1.calcPrice(10000);
		c1.bonusPoint=1000;
		System.out.println(c1.showCustomerInfo());

		VIPCustomer c2=new VIPCustomer();
		c2.setCustomerID(10020);
		c2.setCustomerName("강감찬");
		c2.calcPrice(10000);
		c2.bonusPoint=10000;
		c2.setAgentID(152);
		System.out.println(c2.showVIPinfo());
	}

}
