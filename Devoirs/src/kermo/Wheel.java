package kermo;

public class Wheel extends CarPart {

	double radius;
	String tireType;
	
	public Wheel(double radius, String tireType, double price, int numberOf, String brand){
		
		super(price, brand, numberOf);
		this.radius = radius;
		this.tireType = tireType; 
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}
	
	public void replace(){
		System.out.println("Replace the wheel");
	}
	
	public void repair(){
		System.out.println("Repair the wheel");
	}
	
	public double increaseRadius(double howMuch){
		
		this.radius = radius*howMuch;
		System.out.println("The radius of " + this.getClass().getSimpleName() + " is now " + radius); 
		return radius;
	}
	
}
