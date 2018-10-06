package Session4.assignment3;

public class Bmicalc {

	double h;
	double w;
	
	Bmicalc(double h, double w){
		this.h=h;
		this.w=w;
	}
	

	Bmi calculatebmi() {
		
		double bmi= w/(h*h);
		Bmi b= new Bmi(bmi);
		return b;
	
	}

}
