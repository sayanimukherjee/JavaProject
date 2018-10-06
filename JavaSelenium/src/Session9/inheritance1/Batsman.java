package Session9.inheritance1;

public class Batsman extends Cricket {

	String typeOfBatting;
	int noOfRuns;
	int noOf100s;
	int noOf50s;
	int NumofManofMatch;

	Batsman(String typeOfBatting,int noOfRuns, int noOf100s, int noOf50s, int NumofManofMatch, String name, String team, int age, int noOfMatchesPlayed) {
		super(name,team,age,noOfMatchesPlayed);
		this.typeOfBatting = typeOfBatting;
		this.noOfRuns = noOfRuns;
		this.noOf100s = noOf100s;
		this.noOf50s = noOf50s;
		this.NumofManofMatch = NumofManofMatch;
	}

	@Override
	public String toString() {
		return "Batsman [typeOfBatting=" + typeOfBatting + ", noOfRuns=" + noOfRuns + ", noOf100s=" + noOf100s
				+ ", noOf50s=" + noOf50s + ", NumofManofMatch=" + NumofManofMatch + ", Name=" + Name + ", Team=" + Team
				+ ", Age=" + Age + ", NoOfMatchesPlayed=" + NoOfMatchesPlayed + "]";
	}

}
