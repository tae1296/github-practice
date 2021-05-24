package com.java.chapter2;

public class DoubleEx1 {

	public static void main(String[] args) {
		double drum = 3.14;
		float frum = 3.14f;

		System.out.println(drum);
		System.out.println(frum);

		double drum2 = -3.14;
		float frum2 = -3.14f;
		
		System.out.println(drum2);
		System.out.println(frum2);

		//실수에서 정수
		System.out.println("double to long"+(long)drum2);
		System.out.println("double to int"+(int)drum2);
		System.out.println("double to short"+(short)drum2);
		System.out.println("double to byte"+(byte)drum2);
	
		//정수에서 실수
		
		int i=32768;
		int i1=214748367;
		int i2=-214748368;
		
		double dnum3=i;

		System.out.println("int to double"+(double)i);
		System.out.println("int to double"+dnum3);
		System.out.println("int to floate"+(float)i);
		System.out.println("int to double"+(double)i1);
		System.out.println("int to floate"+(float)i1);
		System.out.println("int to double"+(double)i2);
		System.out.println("int to floate"+(float)i2);
	}

}
