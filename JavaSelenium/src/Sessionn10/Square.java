package Sessionn10;

public class Square implements Shape{
	double side;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side * side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", area()=" + area() + ", circumstance()=" + circumstance() + "]";
	}

	@Override
	public double circumstance() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	
	
	
	

}
