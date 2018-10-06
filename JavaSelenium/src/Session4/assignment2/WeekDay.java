package Session4.assignment2;

public class WeekDay {
	int number;

	WeekDay(int number) {
		this.number = number;
	}

	String day() {
		if (number == 1) {
			// System.out.println("Day is Sunday");
			return "Sunday";
		} else if (number == 2) {
			// System.out.println("Day is Monday");
			return "Monday";
		} else if (number == 3) {
			// System.out.println("Day is Tuesday");
			return "Tuesday";
		} else if (number == 4) {
			// System.out.println("Day is Wednesday");
			return "Wednesday";
		} else if (number == 5) {
			// System.out.println("Day is Thursday");
			return "Thursday";
		} else if (number == 6) {
			// System.out.println("Day is Friday");
			return "Friday";
		} else if (number == 7) {
			// System.out.println("Day is Saturday");
			return "Saturday";
		} else {
			// System.out.println("Error");
			return null;
		}

	}

}
