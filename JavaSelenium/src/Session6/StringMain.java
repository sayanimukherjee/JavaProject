package Session6;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ABC";
		String b = new String("ABC"); // creating new memory location

		if (a == b) {
			System.out.println("String a is equals to String b " + a);
		} else {
			System.out.println("String a is not equals String b " + a);

		}
		if (a.equals(b)) {
			System.out.println("String a equals String b");

		} else {
			System.out.println("String a not equals String b");
		}

		String c = "Sayani Mukherjee";
		String[] name = c.split(" "); // name is array of string type
		System.out.println(name[0]);

		String d = "123456789998989898";
		String e = d.substring(4, 10);
		System.out.println(e);
		String e1 = d.substring(6);
		System.out.println(e1);
		int l = e1.length();
		System.out.println("Length of e1 is " + l);

		String t = " Checking trim method ";
		String t1 = t.trim();
		System.out.println(t1);

		String x = "Checking equalsIgnore case";
		String y = "CHECKING EQUALSIGNORE CASE";
		if (x.equalsIgnoreCase(y)) {
			System.out.println("String x equals string y");
		} else {
			System.out.println("String x not equals String y");
		}

		if (x.equals(y)) {
			System.out.println("String x euals string y");
		} else {
			System.out.println("String x not equals string y");
		}

		String z = "sayani";
		String z1 = z.toUpperCase();
		System.out.println(z1);

		int i = 123;
		String s = String.valueOf(i);
		System.out.println(s);
		String s1 = i + "" + 10 * 2;
		System.out.println(s1);

		String s2 = "Line one \\nSecond line"; // \n is for next line \\n is for escaping the meaning of \n
		System.out.println(s2);

	}

}
