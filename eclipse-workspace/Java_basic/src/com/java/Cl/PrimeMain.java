package com.java.Cl;

import java.util.Scanner;

public class PrimeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Prime N=new Prime();
		
		System.out.println("숫자를 입력해주세요.");
		int t=sc.nextInt();
		
		N.setNumber(t);		
		N.primeNum();
		N.print();
	}

}
