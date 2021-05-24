package com.java.chapter4;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=9; i++) {
			
			if(i%2!=0) {
				System.out.println(i+"단입니다");
				System.out.println();
				for(int j=1; j<=9;j++) {
					System.out.println(i+" x "+j+" = "+i*j);
				}
				System.out.println("============");
				System.out.println();
			}
		}
	}
}
