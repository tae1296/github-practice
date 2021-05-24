package com.java.chapter4;
import java.util.Scanner;

public class OverWeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ans=" ";
		while(!ans.equals("q")||!ans.equals("-1")) {
		
		System.out.println("키를 입력해주세요");
		int height=sc.nextInt();
		
		System.out.println("몸무게를 입력해주세요");
		int weight=sc.nextInt();
		
		int overW=weight+100-height;
		
		if(overW>0) {
			System.out.println("비만입니다. 비만수치는 "+overW+"입니다.");
		}else {
			System.out.println("장상입니다.");
		}
		
		System.out.println("다시 실행하려면 아무키나 입력해주세요.(종료하려면 q 또는 -1)");
		ans=sc.next();
		}
	}
}