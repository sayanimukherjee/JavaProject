package Session6.loop;

import java.util.Scanner;

public class SumLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of first " + num + "natural numbers is " + sum);

	}

}
