package com.java.Cl;

import java.util.Arrays;

public class Prime {
	int num;
	String[] prime;	
	String str="";	
	
	public Prime() {
		
	}
	
	public void setNumber(int n) {
		num=n;
	}

	public void primeNum() {
		for(int i=2; i<=num;i++) {
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
