package Session4;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle.message();
		Circle c = new Circle(7);
		// c.r=7;
		System.out.println("Area of circle is " + c.calArea());
		System.out.println("Perimeter of circle is " + c.perimeter());
		System.out.println("Diamater of circle is " + c.diameter());

		Circle c1 = null;
		System.out.println(c1);
		c1 = new Circle(7);
		System.out.println(c1);

		Circle c2 = c;
		c2.r = 8;
		System.out.println("c1 and c refering in same memory location " + c2.r);
		System.out.println("c1 and c refering in same memory location " + c.r);

		System.out.println("Accessing pi static variable " + Circle.pi);

	}

}
