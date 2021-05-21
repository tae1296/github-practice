package chapter5.Question;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// 100미만의 양의 정수만 입력받음.
		// 입력받다가 0이 입력되면 종료.
		// 그때까지 입력받은 숫자 중 10의 자리의 개수를 세어 나타낸다.
		
		int num[]=new int[100];
		int count[]= {0,0,0,0,0,0,0,0,0,0};
		
		
		for(int i=0;i<100;i++) {
		System.out.println("숫자를 입력해주세요(끝내려면 0 또는 100이상의 숫자를 입력하세요)");
			num[i]=sc.nextInt();
			if(num[i]==0 || num[i]>=100) {
				break;
			}else {
				if(num[i]/10==0) {
					count[0]++;
					
				}else if(num[i]/10==1) {
					count[1]++;
					
				}else if(num[i]/10==2) {
					count[2]++;
					
				}else if(num[i]/10==3) {
					count[3]++;
					
				}else if(num[i]/10==4) {
					count[4]++;
					
				}else if(num[i]/10==5) {
					count[5]++;
					
				}else if(num[i]/10==6) {
					count[6]++;
					
				}else if(num[i]/10==7) {
					count[7]++;
					
				}else if(num[i]/10==8) {
					count[8]++;
					
				}else if(num[i]/10==9) {
					count[9]++;
					
				}
			}
		}
		for(int i=0;i<10;i++) {
			if(count[i]!=0) {
			System.out.println(i+" : "+count[i]);
		}
			}
		
		}
	}

