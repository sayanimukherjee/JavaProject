package Session5;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		System.out.println("You have entered " + a);
		
		System.out.println("Enter a string type name");
		String s=scan.next();
		System.out.println("Entered string type name is "+s);
		
		System.out.println("Enter a float number");
		float b= scan.nextFloat();
		System.out.println("Entered float type number is "+b);
		
		System.out.println("Enter  boolean");
		boolean c= scan.nextBoolean();
		System.out.println("Entered boolean "+c);
		
		
		
	}

}
