package com.java.chapter4;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str;
		
		System.out.println("층수를 입력해주세요!");
		int floor=sc.nextInt();
		
		switch(floor) {
		case 1: str="약국";break;
		case 2: str="정형외과";break;
		case 3: str="피부과";break;
		case 4: str="치과";break;
		case 5: str="헬스 클럽";break;
		default: str="없는 층수";break;		
		}
		System.out.println(floor+"층은 "+str+"입니다.");
		
	}

}
