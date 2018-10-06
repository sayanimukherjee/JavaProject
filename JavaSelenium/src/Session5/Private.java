package Session5;

public class Private {

	private int a;
	private int b;
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setA(int a) {
		this.a=a;
	}
	
	public int getA() {
		return this.a;
	}

	private void m1() {
		System.out.println("Inside private method m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private p = new Private();
		p.m1();
		p.a = 9;

	}

}
