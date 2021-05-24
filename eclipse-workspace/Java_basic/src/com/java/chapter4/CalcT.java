package com.java.chapter4;

import java.util.Scanner;

public class CalcT {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String[] obs = sc.nextLine().split(" ");
		
		System.out.println(obs.length);
		
		for(int i=0; i<obs.length;i++) {
			System.out.print(obs[i]);
		}
	}

}
