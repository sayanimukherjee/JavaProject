package Session3;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=true;
		short s=10;
		int i= 1000;
		long l= 1000090909;
		float f=198f;
		double d=178.8;
		char c='t';
		System.out.println(b);
		System.out.print(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		double d1=f;
		long l1=i;
		System.out.println(d1);
		System.out.println(l1);
		Boolean b1=new Boolean(true);
		Short s1=new Short(s);
		Integer i1=new Integer(i);
		Long l2=new Long(l);
		Float f1=new Float(f);
		Double d2= new Double(d);
		Character ch=new Character(c);
		System.out.println(b1);
		System.out.print(s1);
		System.out.println(i1);
		System.out.println(l2);
		System.out.println(f1);
		System.out.println(d2);
		System.out.println(ch);
		
		String str="1234";
		int i2=Integer.parseInt(str);
		System.out.println("String to integer "+i2);
		
		long l3=16;
		int b4=(int) l3; //Typecasting
		System.out.println("long to int type casting " +b4);
		
		double l4=999999999;
		int i4=(int) l4;
		System.out.println("long to int type casting " +i4);
		
		int i5=4;
		System.out.println("pre increment is  "+ (++i5));
		System.out.println("post increment is " +i5++);
		System.out.println("pre increment is  "+ ++i5);
		
		
	}

}
