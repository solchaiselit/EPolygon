package package1;

public class Bird {
	
	private Appearance appearance;
	
	private String species;
	
	private int flightSpeed;
	
	


	public Bird(Appearance appearance, String species, int flightSpeed) {
		super();
		this.appearance = appearance;
		this.species = species;
		this.flightSpeed = flightSpeed;
	}

	public Appearance getAppearance() {
		return appearance;
	}

	public void setAppearance(Appearance appearance) {
		this.appearance = appearance;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		if(species.equals("chicken")){
			System.out.println("Chicken is not a bird");
		}else{
		this.species = species;
		}
	}

	public int getFlightSpeed() {
		return flightSpeed;
	}

	public void setFlightSpeed(int flightSpeed) {
		this.flightSpeed = flightSpeed;
	}

	
	
	
	

}