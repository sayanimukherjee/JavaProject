package Session9.inheritance;

public class ParentChildMain {

	public static void main(String[] args) {

		// MrGupta p = new MrGupta();
		// System.out.print("Parent ");
		// p.drivecar();
		//
		// Child c = new Child();
		// System.out.print("Child ");
		// c.drivecar(); // c inherits method of parent class
		// System.out.print("Parent ");
		// p.drivecar();
		//
		// MrGupta obj1 = new Child();
		// MrGupta obj2 = new Child2();
		// System.out.print("child 1 ");
		// obj1.drivecar();
		// System.out.print("child 2 ");
		// obj2.drivecar();

		MrGupta mrGupta = new MrGupta();
		Child child1 = new Child();
		Child2 child2 = new Child2();

		SharmaUncle sharmaUncle = new SharmaUncle();
		sharmaUncle.driveCar(mrGupta);
		sharmaUncle.driveCar(child1);

	}

}
