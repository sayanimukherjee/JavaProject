package Session4.assignment3;

public class Bmi {

	double value;

	Bmi(double value) {
		this.value = value;
	}

	String category() {
		if (value <= 18.5) {
			return "Category is underweight";
		} else if (value > 18.5 && value <= 24.9) {
			return "Category is normal weight";
		} else if (value >= 25 && value <= 29.9) {
			return "Category is overweight";
		} else {
			return "Category is obese";
		}

	}

}
