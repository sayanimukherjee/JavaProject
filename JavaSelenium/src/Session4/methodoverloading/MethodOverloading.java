package Session4;

public class MethodOverloading {

	double sum(double a, double b) {
		double sum1 = a + b;
		System.out.println("Sum of first method is " + sum1);
		return sum1;
	}

	double sum(double a, double b, double c) {
		double sum2 = a + b + c;
		System.out.println("Sum of second method is " + sum2);
		return sum2;
	}

	double sum(int a, int b) {
		int sum3 = a + b;
		System.out.println("Sum of third method is " + sum3);
		return sum3;
	}

}
