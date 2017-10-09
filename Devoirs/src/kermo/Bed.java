package kermo;

public class Bed extends CarPart {

	private double volume;

	public Bed(double price, String brand, int numberOf, double volume) {
		super(price, brand, numberOf);
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
    
	public void repair(){
		
		System.out.println("Repair the Bed");
	}
	
	public void replace(){
		
		System.out.println("Replace the Bed");
	}
	
}
