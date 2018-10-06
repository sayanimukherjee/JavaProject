package Session7.dice;

public class DiceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int sum = 0;
		do {

			int firstValue = d1.roll();
			int secondValue = d2.roll();
			sum = firstValue + secondValue;
			System.out.println("Sum of face values of d1 and d2 is "+sum);

		} while (sum < 10);
		System.out.println("Face value for dice 1 " + d1.getFaceValue());
		System.out.println("Face value for dice 2 " + d2.getFaceValue());
	}

}
