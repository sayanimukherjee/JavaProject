package Session4.assignment1;

public class AgeMessage {

	double age;
	
	AgeMessage(double age){
		this.age=age;
	}

	String age() {
		if (age < 16) {

			return "You can't drive";
		} 
		else if (age >= 16 && age <= 17) {

			return "You can drive but can't vote";
		} 
		else if (age >= 18 && age <= 24) {

			return "You can vote but cannot rent a car";
		} 
		else {

			return "You can do pretty much anything";
		}

	}

}
