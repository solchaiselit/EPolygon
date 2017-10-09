package employee;

public abstract class Employee {

	
	private String name;
	private Position position;
	private double loyaltyCoefficient;
	
	
	public Employee(String name, Position position, double loyaltyCoefficient) {
		super();
		this.name = name;
		this.position = position;
		this.loyaltyCoefficient = loyaltyCoefficient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public double getLoyaltyCoefficient() {
		return loyaltyCoefficient;
	}
	public void setLoyaltyCoefficient(double loyaltyCoefficient) {
		this.loyaltyCoefficient = loyaltyCoefficient;
	}
	
	
	
	
	
	
}
