package Session9.inheritance1;

public class CricketMain {
	public static void main(String[] args) {
		Batsman b = new Batsman("right", 10, 20, 30, 5, "Dhoni", "India", 32, 10);
		System.out.println("Batsman " + b);

		Bowler bow = new Bowler("Spin", 10, 100, "Harbajan", "India", 29, 100);
		System.out.println("Bowler " + bow);

	}

}
