package Sessionn10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Sessionn11.Student;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new java.util.ArrayList<Integer>();

		Circle c1 = new Circle(2);
		Circle c2 = new Circle(4);

		Square s1 = new Square(6);
		Square s2 = new Square(4);

		List<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(c1);
		shapeList.add(c2);
		shapeList.add(s1);
		shapeList.add(s2);
		//System.out.println("shapeList " + shapeList);

		Collections.sort(shapeList, Shape.ShapeComparator);
		System.out.println("ShapeList is " + shapeList);

	}

}
