package com.java.chapter2;

public class ExplicatConversion {

	public static void main(String[] args) {
		double dnum=1.2;
		float fnum=0.9f;
		
		int iNum1 = (int)dnum+(int)fnum;
		int iNum2 = (int)(dnum+fnum);

		
		System.out.println((int)dnum+"+"+(int)fnum+ "=" + iNum1);
		System.out.println(dnum+ "+"+fnum+"="+iNum2);
		


	}

}
