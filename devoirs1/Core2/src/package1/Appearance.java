package package1;

public class Appearance {

	private int weightKg;
	
	private int Speed;
	
	private int age;
	
	private String color;

	public Appearance(int weightKg, int speed, int age, String color) {
		super();
		this.weightKg = weightKg;
		Speed = speed;
		this.age = age;
		this.color = color;
	}

	public int getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(int weightKg) {
		this.weightKg = weightKg;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	
	
}
