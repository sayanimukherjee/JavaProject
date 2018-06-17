package Session1;

class ClassMain{
	public static void main(String args[]){
	
	WaterFilter w= new WaterFilter();
	System.out.println(w.filter);
	w.filter="RO";
	System.out.println(w.filter);
	System.out.println(w.tap);
	w.tap=true;
	System.out.println(w.tap);
	System.out.println(w.capacity);
	w.capacity=100;
	System.out.println(w.capacity);
	System.out.println("price before "+w.price);
	w.price=1000.80;
	System.out.println("price after "+w.price);
	System.out.println("Value of w is "+w);
	}
}