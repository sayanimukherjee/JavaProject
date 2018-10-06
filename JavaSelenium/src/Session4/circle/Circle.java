package Session4;

public class Circle {

	double r;
	final static double pi = 3.14;

	double calArea() {
		double area = pi * this.r * this.r; // this keyword refers to radius r in the class
		return area;

	}

	double perimeter() {
		double perimeter = 2 * pi * this.r;
		return perimeter;
	}

	double diameter() {
		double diameter = 2 * this.r;
		return diameter;
	}
	Circle(double r){
		//Parameterized Constructor 
		this.r=r;
	}
	Circle(){
		//constructor
	}
	
	static void message() {
		System.out.println("This is inside static method");
	}
}
