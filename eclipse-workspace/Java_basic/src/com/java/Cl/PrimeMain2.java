package com.java.Cl;

import java.util.Scanner;

public class PrimeMain2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Prime1 p1 = new Prime1();
		System.out.println("숫자를 입력해주세요.");
		int t=sc.nextInt();
		
		p1.setNumber(t);
		p1.primeNumber();
		p1.print();
	}

}
