package leChat;

public abstract class Animal {

	public static int population ;
	private Anatomy anatomy;
	public Anatomy getAnatomy() {
		return anatomy;
	}
	public void setAnatomy(Anatomy anatomy) {
		this.anatomy = anatomy;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(Anatomy anatomy, int size, int age) {
		super();
		this.anatomy = anatomy;
		this.size = size;
		this.age = age;
	}

	private int size;
	private int age;
	
	
	public abstract void move();
	public abstract void eat();
	
	public void breed(){
		System.out.println("All animals breed.");
	}
	
}
