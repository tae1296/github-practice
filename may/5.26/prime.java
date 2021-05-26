package com.java.Cl;

import java.util.Arrays;

public class prime {
	int num;
	String[] prime;	
	String str="";
	
	public void primeNum(int n) {
		for(int i=2; i<=n;i++) {
			boolean isPrime=true;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				str+=i+" ";
			}
		}
		prime=str.split(" ");
		
	}
	
	public void print() {
		System.out.println(Arrays.toString(prime));
	}
}
