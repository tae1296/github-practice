package com.java.chapter4;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char grade;
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();

		if(score>=90) {
			grade = 'A';
		}else if(score>=80 && score<90) {
			grade = 'B';
		}else if(score>=70 && score<80) {
			grade = 'C';			
		}else if(score>=60 && score<70) {
			grade = 'D';			
		}else {
			grade = 'F';
		}
		System.out.println("당신의 성적은 "+grade+"입니다.");
	}

}
