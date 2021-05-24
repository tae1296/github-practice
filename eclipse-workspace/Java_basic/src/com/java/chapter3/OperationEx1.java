package com.java.chapter3;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore=50;
		int engScore=95;
		int korScore=98;
		
		int totalScore=mathScore+engScore+korScore;
		System.out.println("토탈 스코어 = "+totalScore);
		
		double avgScore=totalScore/3.0;
		System.out.println(avgScore);

	}

}
