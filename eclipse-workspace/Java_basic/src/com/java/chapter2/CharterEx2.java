package com.java.chapter2;

public class CharterEx2 {

	public static void main(String[] args) {
//		char ch1 = '한';
//		char ch2='\uD55C'; // 유니코드 Escape sequence 형식
//
//		System.out.println(ch1);
//		System.out.println(ch2);

		int a = 65;
		int b = -66;
		
		char a2 = 65;
//		char b2 = -66;

		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		
		char gul = '\uAE00';
		
		System.out.println("\uAE00 = "+gul);
		System.out.println("\\uAE00 = "+gul);
		
	}

}
