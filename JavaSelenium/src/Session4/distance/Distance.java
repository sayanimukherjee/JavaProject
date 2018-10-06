package Session4.distance;

public class Distance {

	Point p1;
	Point p2;
	
	public Distance(Point p1, Point p2){
		this.p1=p1;
		this.p2=p2;
	}
	

	public double discalc() {

		double dis = Math.sqrt((p2.x-p1.x) * (p2.x-p1.x)) + ((p2.y-p1.y) * (p2.y-p1.y));
		return dis;

	}
}
