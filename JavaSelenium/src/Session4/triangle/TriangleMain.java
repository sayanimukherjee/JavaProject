package Session4.triangle;

import Session4.distance.Point;

public class TriangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(2, 3);
		Point p2 = new Point(4, 6);
		Point p3 = new Point(10, 20);

		Triangle t = new Triangle(p1, p2, p3);

		System.out.println("The perimeter of Traingle is " + t.calculatePerimeter());

	}

}
