package Session1;

class ClassMain {
	public static void main(String args[]) {

		WaterFilter w = new WaterFilter();
		System.out.println(w.getFilter());
		w.setFilter("RO");
		System.out.println(w.getFilter());
		System.out.println(w.isTap());
		w.setTap(true);
		System.out.println(w.isTap());
		System.out.println(w.getCapacity());
		w.setCapacity(100);
		System.out.println(w.getCapacity());
		System.out.println("price before " + w.getPrice());
		w.setPrice(1000.80);
		System.out.println("price after " + w.getPrice());
		System.out.println("Object Value of w is " + w);

		System.out.println("Object w is " + w);

	}
}