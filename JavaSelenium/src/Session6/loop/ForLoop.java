package Session6.loop;

public class ForLoop {

	public static void main(String[] args) {
		String name = "Sayani Mukherjee";
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println("Example of for loop " + name);
		}

		int count = 0;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.println("Example of nested for loop " + "i= " + i + " j= " + j + " name is " + name);
				count++;
				System.out.println("Count is " + count);
			}
		}
	}

}
