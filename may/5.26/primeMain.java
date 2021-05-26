package com.java.Cl;

import java.util.Scanner;

public class primeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		prime N=new prime();
		
		System.out.println("숫자를 입력해주세요.");
		N.num=sc.nextInt();
		System.out.println(N.num);
		N.primeNum(N.num);
		N.print();
	}

}
