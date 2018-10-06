package Session6.loop;

public class DoWhile {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		String s = "testing do while loop";
		// TODO Auto-generated method stub
		do {
			System.out.println("Inside do while: " + s);
			i++;
			count++;

		} while (i <= 5);
		System.out.println("Total number of iteration " + count);

	}

}
