package Session7.person;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String n = sc.nextLine();
		System.out.println("Name is " + n);

		System.out.println("Enter dob dd/mm/yyyy");
		String dob = sc.nextLine();
		System.out.println("Date of Birth is " + dob);

		Person p = new Person(n, dob);
		System.out.println("Current age is" + p.calcAge());
		System.out.println("Age after 3 years" + p.calcAge(3));
		System.out.println("Age before 3 years " + p.calcAge(-3));

	}

}
