package com.java.chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1>0) && (num2>0);
		System.out.println(flag);

		flag = (num1<0) &&(num2>0);
		System.out.println(flag);

		flag = (num1<0) ||(num2>0);
		System.out.println(flag);

		int num0=100;
		
		System.out.println("+" +(num0 += 2));
		num0=100;
		System.out.println("-" +(num0 -= 2));
		num0=100;
		System.out.println("*" +(num0 *= 2));
		num0=100;
		System.out.println("/" +(num0 /= 2));
		num0=100;
		System.out.println("%" +(num0 %= 2));
		num0=100;
		System.out.println("<<" +(num0 <<= 2));
		num0=100;
		System.out.println(">>" +(num0 >>= 2));
		num0=100;
		System.out.println(">>>" +(num0 >>>= 2));
		num0=100;
		System.out.println("&" +(num0 &= 2));
		num0=100;
		System.out.println("|" +(num0 |= 2));
		num0=100;
		System.out.println("^" +(num0 ^= 2));
		
	}

}
