package com.java.ArrayT;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);  
		
	    System.out.println("숫자를 입력해주세요");
	    int n=sc.nextInt();
	    
	    char A[][]=new char[n][n];
	    int center=A.length/2;
	    char ch='*';
	    int begin=0;
	    int end=A[0].length;
	    
	    for(int row=0;row<A.length;row++) {
	    	if(row<=center) {
	    		begin = row;
	    		end = (A[row].length -1) -row;
	    	}else{
	    		begin = (A[row].length -1) - row; end = row;
	    		
	    	}for(int COL=begin;COL<=end;COL++){
	    		 A[row][COL] = ch;
	    		 }
	    	}
			  
	    	for(int i = 0; i<A.length;i++){
	    		for(int j =0; j< A[i].length;j++){
			  if(A[i][j] == 0) {
				  System.out.print(" ");
				  }else{
			  System.out.print(A[i][j]+""); 
			  } 
			  }
	    	System.out.println(); }
	    }
	    
}