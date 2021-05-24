package com.java.chapter4;

public class ArrayTest {

	public static void main(String[] args) {
		String[] arr1;
		arr1 = new String[10];
		
		String[] arr2=new String[10];
		String arr3[]=new String[10];
		
		//2번
		String[] arr4=new String[] {
				"1","2","3","4","5",
				"6","7","8","9","10"
		};

		//3번
		String[] arr5= {
				"1","2","3","4","5",
				"6","7","8","9","10"
		};
		String[] arr6= {};

		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		System.out.println(arr5.length);
		System.out.println(arr6.length);
		
		//double 5 8 30 크기 배열
		
		double[] darr1=new double[] {0.1,0.2,0.3,0.4,0.5};
;
		double[] darr2= {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8};
		
		double[] darr3=new double[30];		

		System.out.println(darr1.length);
		System.out.println(darr2.length);
		System.out.println(darr3.length);
	}

}
