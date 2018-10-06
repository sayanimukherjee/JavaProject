package Session6.loop;

import java.util.Scanner;

public class MultiplicationLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int m = 1;
		for (int i = 1; i <= num; i++) {
			m = m * i;

		}
		System.out.println("Multiplication of first " + num + " numbers is " + m);

	}

}
