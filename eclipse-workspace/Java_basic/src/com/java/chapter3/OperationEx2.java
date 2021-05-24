package com.java.chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;		
		int lastScore2 = --gameScore;
		
		System.out.println(gameScore +","+lastScore1);		
		System.out.println(gameScore +","+lastScore2);
		
		int lastScore3 =gameScore++;
		int lastScore4 =gameScore--;
		

		System.out.println(gameScore +","+lastScore3);		
		System.out.println(gameScore +","+lastScore4);

	}

}
