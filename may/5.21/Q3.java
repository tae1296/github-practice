package com.java.chapter5;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			int p=1;
			
			//3이상 10미만의 자연수를 받아 숫자 출력
			while(true) {
			System.out.println("숫자를 입력해주세요.(3이상 10미만)");
			n=sc.nextInt();
			
			if(n>=3 && n<10) {
				break;
			}else {
				System.out.println("입력 가능한 숫자를 확인해주세요.");
			}
			}

			for(int i=1;i<=n;i++) {
				for(int j=n;j>0;j--) {
					
					if(j>i) {
						System.out.print(" ");
					}else {
						System.out.print(p);
						p++;
					}
					
				}

				System.out.println();
				p=1;
			}
			
		}
}
