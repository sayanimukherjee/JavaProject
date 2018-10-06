package Session4.assignment3;

public class BmicalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bmicalc a3 = new Bmicalc(80, 146);
		
		Bmi bmiResult = a3.calculatebmi();
		
		System.out.println("In main " + bmiResult.value);
		System.out.println("In main " + bmiResult.category());

	}

}
