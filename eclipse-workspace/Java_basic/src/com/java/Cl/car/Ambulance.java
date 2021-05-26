package com.java.Cl.car;

public class Ambulance extends Car {
	protected int Kit;
	
	public int getKit() {
		return Kit;
	}
	public void setKit(int kit) {
		Kit = kit;
	}
	public Ambulance() {
		this("앰뷸런스",1,0);
	}
	public Ambulance(String name,int cc,int kit) {
		
	}
	
	public String run() {
		
		return "차량이름은 "+carName+"이고, 배기량은 "+cc+"cc이고, 응급키트는 "+Kit+"개를 보유하고 있다.";
	}
}
