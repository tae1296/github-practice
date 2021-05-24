package com.java.chapter4;

import java.util.Scanner;

public class ArrayQ3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		String[] beta = new String[10];
		
		
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"번째 알파벳을 입력하세요");
			beta[i]=sc.next();
			}
		System.out.print("[ ");
		for(int j=9;j>=0;j--) {
			System.out.print(beta[j]+" ");
		}
		System.out.print("]");
	}

}
