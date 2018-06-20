package Session3;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println("Bigger number is " + a);
		} else
			System.out.println("Bigger number is " + b);

		// ternary operator
		int num1 = 30;
		int num2 = 40;
		int result = num1 > num2 ? num1 : num2;
		System.out.println("Bigger number using ternary operator is " + result);

	}

}
