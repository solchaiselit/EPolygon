package kermo;

public class Car {

	private String model;
	private int age;
	private Wheel wheel;
	private SteeringWheel steeringWheel;
	private Bed bed;
	
	public Car(String model, int age, Wheel wheel, SteeringWheel steeringWheel, Bed bed) {
		super();
		this.model = model;
		this.age = age;
		this.wheel = wheel;
		this.steeringWheel = steeringWheel;
		this.bed = bed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", age=" + age + ", wheel=" + wheel + ", steeringWheel=" + steeringWheel
				+ ", bed=" + bed + ", getModel()=" + getModel() + ", getAge()=" + getAge() + ", getWheel()="
				+ getWheel() + ", getSteeringWheel()=" + getSteeringWheel() + ", getBed()=" + getBed() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

//	public static void go(){
//		if(getWheel().getNumberOf() == Wheel.getNumberOf()){
//			System.out.println("GO");
//		}
//		else
//			System.out.println("Can't go");
//		
//	}
	
}
