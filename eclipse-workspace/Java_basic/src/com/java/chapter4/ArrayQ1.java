package com.java.chapter4;

import java.util.Scanner;

public class ArrayQ1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num[]= {-12,3,-9,5,8,-2,0,-8,3,10};
		int max=0;
		int n=0;
		
		for(int i=0;i<num.length;i++) {
			for(int j=1;j<num.length;j++) {
			if(num[i]<num[j]) {
				max=num[j];
			}else {
				max=num[i];
			}}
		}
		
		System.out.println("최대값은 "+max);
	}

}
