package constructor;

public class CircleMain {

	public static void main(String[] args) {
		Circle pi=new Circle("pizza", 10.0);
		Circle dou=new Circle("dounut",2.0);
		
		System.out.println("반지름이 10인 피자와 반지름이 2인 도넛의 면적을 구하라");
		
		System.out.println("피자의 면적은 "+pi.getArea());
		System.out.println("도넛의 면적은 "+dou.getArea());

	}

}
