package Session7.dice;

public class Dice {

	private int faceValue;

	// TODO Auto-generated method stub
	public int roll() {
		
		this.faceValue = RandomGenerator.random();
		
		
		return this.faceValue;

	}

	Dice() {
		
		this.faceValue = RandomGenerator.random();
	}

	public int getFaceValue() {
		return faceValue ;
	}
	

}
