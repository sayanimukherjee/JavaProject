package Session3;

public class Assisgnment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 18;
		if (age < 16) {
			System.out.println("You acn't drive. Age is " + age);
		} else if (age >= 16 && age <= 17) {
			System.out.println("You can drive but not vote. Age is " + age);
		} else if (age >= 18 && age <= 24) {
			System.out.println("You can vote but not rent a car. Age is " + age);
		} else
			System.out.println("You can do pretty much anything.Age is " + age);

	}
}
