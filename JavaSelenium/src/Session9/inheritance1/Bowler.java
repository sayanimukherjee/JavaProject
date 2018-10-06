package Session9.inheritance1;

public class Bowler extends Cricket{
	
	String typeofBowling;
	int numOfUnits;
	int oversBowled;
	public Bowler(String typeofBowling, int numOfUnits, int oversBowled, String name, String team, int age, int noOfMatchesPlayed) {
		super(name,team,age,noOfMatchesPlayed);
		this.typeofBowling = typeofBowling;
		this.numOfUnits = numOfUnits;
		this.oversBowled = oversBowled;
	}
	@Override
	public String toString() {
		return "Bowler [typeofBowling=" + typeofBowling + ", numOfUnits=" + numOfUnits + ", oversBowled=" + oversBowled
				+ ", Name=" + Name + ", Team=" + Team + ", Age=" + Age + ", NoOfMatchesPlayed=" + NoOfMatchesPlayed
				+ "]";
	}
	
	

}
