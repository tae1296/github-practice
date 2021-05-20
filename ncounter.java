package com.java.chapter4;

import java.util.Scanner;

public class fdsafd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("N값을 입력해주세요");
		int n=sc.nextInt();
		double s;
		
		long sum = 0;
		for(int i=1;i<=n;i++) {
			s=Math.pow(2*i,(2*i)-1);
			sum+=s;
		}

		System.out.println(sum);
    // n=6 -> sum 744010475682
	}
}
