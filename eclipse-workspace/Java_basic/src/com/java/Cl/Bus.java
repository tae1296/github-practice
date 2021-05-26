package com.java.Cl;

public class Bus {
	private String name;
	private int number;
	
	public Bus() {
		this("없음",0);
	}
	
	public Bus(String name,int number) {
		this.name =name;
		this.number=number;
	}
	
	public void BusTop() {
		System.out.println("버스의 이름은 "+name);
		System.out.println("버스의 번호는 "+number);
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
}
