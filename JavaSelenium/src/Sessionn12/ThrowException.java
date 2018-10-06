package Sessionn12;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		try {
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			int a = 4 / 0;
			System.out.println("data");
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("it is an ArrayIndexOutOfBoundsException");
				throw e;
			} else if (e instanceof ArithmeticException) {
				System.out.println("it is an ArithmeticException");
			}
		}

	}

}
