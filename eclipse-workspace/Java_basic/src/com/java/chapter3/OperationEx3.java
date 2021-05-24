package com.java.chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);

		boolean ba = a>b;
		
		System.out.println(ba);

		System.out.println((5>3) && (5>2));
		System.out.println((5>3) || (5<2));
		System.out.println(!(5>3));
	}

}
