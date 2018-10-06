package Session6.loop;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123456789";
		int i = 1;
		int count = 0;
		while (i <= 5) {
			System.out.println("inside while " + s);
			i++;
			count++;
		}
		System.out.println(count);
	}

}
