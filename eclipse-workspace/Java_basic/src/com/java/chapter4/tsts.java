package com.java.chapter4;

import java.util.Arrays;

public class tsts {

	public static void main(String[] args) {
			String[] strArr=new String[] {
					"1","2","3","4","5",
					"6","7","8","9","10"
			};
				
			System.out.println(strArr.toString());
			System.out.println(strArr);	

			for(int i=0; i< strArr.length; i++) {
				int t= i*Integer.parseInt(strArr[i]);
				strArr[i] = t+"";
				System.out.println(strArr[i]);	
			}
			
			strArr[5]="Hello";
			System.out.println(Arrays.toString(strArr));
	}

}
