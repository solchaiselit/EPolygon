package tank;

public enum Rank {

	SEARGANT(10), CAPTAIN(20), MAJOR(30);
	
	private int experience;
	
		
	private Rank(int experience) {
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	
	
	
	
}
