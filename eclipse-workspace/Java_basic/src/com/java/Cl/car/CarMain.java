package com.java.Cl.car;

public class CarMain {

	public static void main(String[] args) {
		Car car=new Car();
		
		car.setCarName("소나타");
		car.setCc(1000);
		System.out.println(car.run());
		
		Ambulance am=new Ambulance();
		am.setCarName("앰뷸런스");
		am.setCc(1500);
		am.setKit(5);
		System.out.println(am.run());
	}

}
