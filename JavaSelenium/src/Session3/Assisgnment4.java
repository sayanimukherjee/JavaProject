package Session3;

public class Assisgnment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float height = 1.98f;
		float weight =150f;
		float bmi;
		bmi= weight/(height*height);
		
		if (bmi<18.5) {
			System.out.println("Category is underweight. BMI is "+bmi);
		}
		if (bmi>=18.5 && bmi<=24.9) {
			System.out.println("Category is normal. BMI is "+bmi);
		}
		if (bmi>=25 && bmi<=29.9) {
			System.out.println("Category is overweight. BMI is "+bmi);
		}
		if (bmi>=30) {
			System.out.println("Category is obese. BMI is "+bmi);
		}
	}

}
