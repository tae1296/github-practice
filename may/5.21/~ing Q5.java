package chapter5.Question;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 10개의 정수를 입력받아 배열에 넣고 저장한 후 내림차순으로 출력
		
		int[] Arr=new int[10];
		int tmp=0;
		for(int i=0; i<Arr.length;i++) {
			System.out.println((i+1)+"/"+Arr.length+" 숫자를 입력하세요");
			Arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<Arr.length-1;i++) {
			// [0] >= [1] true=> 0과 1번 자리 바꿈 false면 유지
			
			if(Arr[i]>=Arr[i+1]) {

				tmp=Arr[i];
				Arr[i]=Arr[i+1];
				Arr[i+1]=tmp;
			}else {
				
			}
	
		}
		
		
		System.out.println(Arrays.toString(Arr)); // 배열 출력
		
	}

}
