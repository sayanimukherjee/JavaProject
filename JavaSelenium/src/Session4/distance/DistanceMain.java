package Session4.distance;

public class DistanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(2, 6);
		Point p2=new Point(4, 10);
		
		Distance d=new Distance(p1, p2);
		
		System.out.println("In main. Distance is " + d.discalc());

	}

}
