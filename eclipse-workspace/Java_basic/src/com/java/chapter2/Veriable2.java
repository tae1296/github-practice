package com.java.chapter2;

public class Veriable2 {

	public static void main(String[] args) {
		
		// byte : 1Byte 바이트형의 범위는 2^7 ~ 2^7-1이기 때문에 -128 ~ 127까지만 담을 수 있다.
		byte bs1 = -128;
		//byte bs2 = 128;
		
		// short : 2Byte 쇼트형의 범위는 2^15 ~ 2^15-1이기 때문에 -32768 ~ 32767까지만 담을 수 있다.
		short sh1 = 128;
		//short sh2 = 32768;
		short sh3 = -32768;
		
		// short : 2Byte 쇼트형의 범위는 2^31 ~ 2^31-1이기 때문에 -2147483648 ~ 2147483647까지만 담을 수 있다.
		int in1 = -2147483648;
		//int in2 = 2147483648;
		int in3 = 2147483647;
		
		//long : 변수에 숫자값은 int로 대입됨. long형으로 대입하려면 숫자 뒤에 l,L을 입력해 넣어야만 숫자를 long형으로 받아드림.
		//int num1 = 12345678900; -  error : out of range
		//long num2 = 12345678900; - error : out of range
		long num3 = 12345678900l;
		
		//char
		
		char ch1 = 'A';
		char ch2 = 'z';
	}

}
