package com.java.chapter4;

import java.util.Scanner;

public class SC_Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력해주세요.");
		int a=sc.nextInt();
		System.out.println("연산자를 입력해주세요.");
		String str=sc.next();
		System.out.println("두번째 정수를 입력해주세요.");
		int b=sc.nextInt();
		int j=0;
		int result=0;
		
		switch(str) {
		case "+" : result=a+b;
				   break;
		case "-" : result=a-b;
				   break;
		case "*" : result=a*b;
				   break;
		case "/" : result=a/b;
				   break;
		default : j=1;
		}
		
		if(j!=1) {
		System.out.println(a+" "+str+" "+b+" = "+result);
		}else {
			System.out.println("계산이 불가능합니다");
		}
	}

}
