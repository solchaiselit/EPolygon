package reflection;

public class Auto {

	private String brand;
	private Engine engine;
	public Auto(String brand, Engine engine) {
		super();
		this.brand = brand;
		this.engine = engine;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Auto [brand=" + brand + ", engine=" + engine + "]";
	}
	
	
	
}
