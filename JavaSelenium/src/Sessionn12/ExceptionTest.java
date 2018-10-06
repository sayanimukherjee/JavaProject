package Sessionn12;

public class ExceptionTest {

	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			int a = 4 / 0;
			System.out.println(a);

		}
		// catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
		// if (e instanceof ArrayIndexOutOfBoundsException) {
		// System.out.println("it is an ArrayIndexOutOfBoundsException");
		// } else if (e instanceof ArithmeticException) {
		// System.out.println("it is an ArithmeticException");
		// }
		// }
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("it is an ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("it is an ArithmeticException");
		}

		System.out.println("array created");
	}

}
