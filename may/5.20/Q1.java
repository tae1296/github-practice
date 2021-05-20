package com.java.ArrayT;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//자연수 n을 입력받아서 1부터 n 사이에 홀수끼리 합하다가 n보다 합계가 커지면 그때까지 나온 숫자의 갯수와 합을 출력
			
		int sum=0;
		int count=0;
		System.out.println("숫자를 입력해주세요.");
		int n=sc.nextInt();
		
		for(int i=1;i<n;i++) {
			if(i%2!=0) {
				sum+=i;
				count++;
			}
			if(sum>n) {
				break;
			}
		}
		System.out.println("갯수 : "+count);
		System.out.println("합 : "+sum);
	}

}
