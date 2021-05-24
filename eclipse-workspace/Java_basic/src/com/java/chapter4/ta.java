package com.java.chapter4;

public class ta {

	public static void main(String[] args) {
		String str4="하나둘셋";
		
		System.out.println(str4.charAt(0));
		
		
		String[] strs="하나 둘 셋".split(" ");
		System.out.println(strs.length);

		for(int i=0;i<strs.length;i++) {
			System.out.print(strs[i]+" ");
			
		}
		
		System.out.println("하나 두 ㄹ ㅅ ㅔ 넷".substring(1,4));
		
	}
}
