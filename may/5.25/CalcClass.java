package method;

public class CalcClass {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
	public int substract(int num1,int num2) {
		return num1-num2;
	}
	
	public int multiply(int num1,int num2) {
		return num1*num2;
	}
	
	public double devision(int num1,int num2) {
		if(num2==0) {
			System.out.println("나누는 수는 0이 될 수 없음");
			return 0;
		}else {
			return (double)num1/num2;
		}
	}
}
