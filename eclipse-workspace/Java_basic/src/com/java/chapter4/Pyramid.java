package com.java.chapter4;

public class Pyramid {

	public static void main(String[] args) {
		
		int a=1;
		int b=3;
		for(int i=0;i<4;i++) {
			for(int j=b;j>0;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<a;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			a+=2;
			b--;
		}

	}

}
