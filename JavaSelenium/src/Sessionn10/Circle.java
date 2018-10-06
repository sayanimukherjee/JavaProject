package Sessionn10;

public class Circle implements Shape {

	double r;
	final static double PI = 3.14;

	public double area() {

		// System.out.println("area Circle ");
		return PI * r * r;

	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", area()=" + area() + ", circumstance()=" + circumstance() + "]";
	}

	public Circle(double r) {
		super();
		this.r = r;
	}

	public double circumstance() {

		// System.out.println("circumstance Circle");
		return 2 * PI * r;

	}

}
