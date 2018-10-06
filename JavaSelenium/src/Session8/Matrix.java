package Session8;

public class Matrix {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {

				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[0].length; j++) {
//				System.out.print(c[i][j]+ " ");
//			}
//			System.out.println();
//			
//		}
	}
}
