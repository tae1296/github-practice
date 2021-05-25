package method;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalcClass C = new CalcClass();
		
		int num1;
		int num2;
		String oper;
		double result=0;
		boolean t=true;
		
		System.out.println("숫자를 입력하세요");
		num1=sc.nextInt();
		
		System.out.println("계산할 부호를 넣어주세요");
		oper=sc.next();
		
		System.out.println("숫자를 입력하세요");
		num2=sc.nextInt();
		
		switch(oper) {		
		case "+" : result = (int)C.add(num1, num2);
					break;
		case "-" : result = (int)C.substract(num1, num2);
					break;
		case "*" : result = (int)C.multiply(num1, num2); 
					break;
		case "/" : result =  C.devision(num1, num2); 
					break;
		default : t=false; break;
		}
		
		if(t==true) {
		System.out.println(num1+" "+oper +" "+ num2+" = "+result);
		}else {
			System.out.println("잘못된 입력입니다.");
		}

	}

}
