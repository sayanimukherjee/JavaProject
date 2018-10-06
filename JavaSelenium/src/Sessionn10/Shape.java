package Sessionn10;

import java.util.Comparator;

import Sessionn11.Student;

public interface Shape {

	abstract double area();

	abstract double circumstance();
	
	public static Comparator<Shape> ShapeComparator = new Comparator<Shape>() {
		public int compare(Shape s1, Shape s2) {
			if(s1.area()>s2.area()) {
				return 1;
			}
			else if(s1.area()<s2.area()) {
				return -1;
			}
			else
				return 0;
		}
			

};
}
