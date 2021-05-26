package com.java.Cl.car;

public class Car {
	protected String carName;
	protected int cc;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Car() {
		this("소나타",1);
	}
	
	public Car(String name,int cc) {
		
	}
	
	public String run() {
		
		return "차량이름은 "+carName+"이고, 배기량은 "+cc+"cc이다.";
	}
	
}
