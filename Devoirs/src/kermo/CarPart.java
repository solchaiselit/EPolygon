package kermo;

public abstract class CarPart {

	private static int numberOf;
	private double price;
	private String brand;

	public CarPart(double price, String brand, int numberOf){
		
		super();
		this.price = price;
		this.brand = brand;
		this.numberOf = numberOf;
	}
	
	public void setPrice(double price){
		
		this.price = price;
	}
	
	public static int getNumberOf() {
		return numberOf;
	}

	public static void setNumberOf(int numberOf) {
		CarPart.numberOf = numberOf;
	}

	public double getPrice(){
		
		return price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
		
	public abstract void replace();
	public abstract void repair();
	
	
}
