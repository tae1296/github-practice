package com.java.chapter4;

import java.util.Scanner;

public class tetete {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자입력");
		
		int num=sc.nextInt();
		int i = 2; // i : 나눌 대상

		boolean isPrime = true;

		while (i <= num) {
			isPrime = true;			
			
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrime = false;
				}
				continue;
			}

			

			if (isPrime == true) {
				System.out.print(i+" ");}

			i++;

		}


	}

}
