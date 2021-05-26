package com.java.Cl.calc;

public class CalcMain {

	public static void main(String[] args) {
		Substract sb=new Substract(20,10);

		System.out.println("두수의 합은 "+sb.sum());
		System.out.println("두수의 평균은 "+sb.avg());		
		System.out.println("두수의 차는 "+sb.sub());
	}

}
