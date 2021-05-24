package com.java.chapter3;

public class OperationTest3 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int e = a/b;
		int g = a%b;
		
		System.out.println(a+" / "+b+" = " + e +" ... " + g);
	}

}
