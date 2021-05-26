package com.java.Cl;

public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("김종수",37);
		Person p3=new Person("김희철",37,"AB","남성","의사");
		
		p1.play();
		System.out.println();
		p2.play();
		System.out.println();
		p3.play();
		
	}

}
