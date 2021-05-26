
public class CallAnotherConst {

class Person{
	String name;
	int age;

	Person(){
//		this.name="홍길동";
//		this.age=30; = 
		this("고길동",30); // this 생성자는 항상 제일 먼저.
	}
	
	Person(String name,int age){
		this.name=name;
		this.age = age;
	}
	
}

	public static void main(String[] args) {
		
	}

}
