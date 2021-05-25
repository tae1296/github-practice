package constructor;

public class Circle {
	String name;
	final double PI=3.14;
	double radius;
	
	public Circle(String n,double r) {
		name=n;
		radius=r;
	}

	public double getArea() {
		
		double result=PI*radius*radius;
		
		return result;
	}
	
	
}
