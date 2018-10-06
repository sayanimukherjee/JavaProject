package Session4.triangle;

import Session4.distance.Distance;
import Session4.distance.Point;

public class Triangle {

	Point p1;
	Point p2;
	Point p3;

	Triangle(Point p1, Point p2, Point p3) {

		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	double calculatePerimeter() {
		
		Distance arm1 = new Distance (p1, p2);
		Distance arm2 = new Distance (p2, p3);
		Distance arm3 = new Distance (p1, p3);
		
		double peri= arm1.discalc()+ arm2.discalc()+ arm3.discalc();
		return peri;
		 

	}

}
