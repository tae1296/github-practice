package chapter5.Question;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 100개의 정수를 저장할 수 있는 배열 작성. 정수를 입력받다가 0을 입력받으면 0을 제외한 입력된 값을 나중에 입력된 것부터 출력
		int[] num=new int[100];
		
		for(int i=0;i<num.length;i++) {
			System.out.println("수를 입력하세요");
			num[i]=sc.nextInt();
			if(num[i]==0) break;
		}
		for(int i=num.length-1;i>=0;i--) {
			if(num[i]!=0) {
				System.out.print(num[i]+" ");
			}
		}
	}

}
