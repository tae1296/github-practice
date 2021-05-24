package ex.java.input;

public class inputParamater {

	public static void main(String[] args) {
	System.out.println("length = "+ args.length);
	System.out.println(args[0]);
	System.out.println(args[1]);
	System.out.println(args[2]);

	int a= Integer.parseInt(args[0]);
	int b= Integer.parseInt(args[1]);
	int c= Integer.parseInt(args[2]);
	
	System.out.println(a+b+c);
	}

}
