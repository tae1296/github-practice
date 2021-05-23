package com.java.chapter5;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			char ch='A';
			//3이상 10이하의 자연수를 받아 영어 출력
			while(true) {
			System.out.println("숫자를 입력해주세요.(3이상 10이하)");
			n=sc.nextInt();
			
			if(n>=3 && n<=10) {
				break;
			}else {
				System.out.println("입력 가능한 숫자를 확인해주세요.");
			}
			}
			
			for(int i=n;i>0;i--) {
				for(int j=i;j>0;j--) {
					System.out.print(ch);
					ch++;
				}
				System.out.println();
			}
			
		}
}
