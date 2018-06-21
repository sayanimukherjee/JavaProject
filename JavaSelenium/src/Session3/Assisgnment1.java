package Session3;

public class Assisgnment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "123.4";
		String s2 = "412";
		String s3 = "512";
		// find the biggest number
		
	
		float a= Float.parseFloat(s1);
		int b= Integer.parseInt(s2);
		int c= Integer.parseInt(s3);
		
		if(a>b && a>c) {
			System.out.println("the largest number is a "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The largest number is b "+b);
		}
		else {
			System.out.println("The largest number is c "+c);
		}
	}

}
