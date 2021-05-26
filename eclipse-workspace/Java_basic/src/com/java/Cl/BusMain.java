package com.java.Cl;

public class BusMain {

	public static void main(String[] args) {
		Bus b = new Bus();

		b.setName("홍길동");
		b.setNumber(100);
		
		System.out.println("차량이름은 "+b.getName());
		System.out.println("차량번호는 "+b.getNumber());
		
		b.BusTop();
	}

}
