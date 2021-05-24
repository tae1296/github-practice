package com.java.chapter4;

import java.util.Scanner;

public class ArrayQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num[]= {-12,3,-9,5,8,-2,0,-8,3,10};
		double avg=0;
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		avg=sum/(num.length/2);
		System.out.println("짝수 배열 합 = "+sum);
		System.out.println("짝수 배열 평균 = "+avg);

	}

}
