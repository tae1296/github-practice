package com.java.ArrayT;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=1;
		//자연수 n을 입력받아 n x n 출력
		System.out.println("수 입력");
		int n=sc.nextInt();
		int[][] nxn= new int[n][n];
		
		for(int i=0;i<n;i++) {

			for(int j=0;j<n;j++) {
				
				
				nxn[i][j]=num%10;
				
				System.out.print(nxn[i][j]+" ");
				num+=2;
			}

			System.out.println();
		}
		
		

	}

}
