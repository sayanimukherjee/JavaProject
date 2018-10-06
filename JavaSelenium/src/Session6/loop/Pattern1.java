package Session6.loop;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Another way using only one for loop
		for (int i = 1; i <= 16; i++) {
			if (i % 4 == 0) {
				System.out.println("@");
			} else {
				System.out.print("@");
			}
		}

		// Another way
		String s = "";
		for (int i = 1; i <= 16; i++) {
			if (i % 4 == 0) {
				s = s + "*\n"; // n represents next line

			} else {
				s = s + "*";
			}
		}
		System.out.println(s);

	}

}
