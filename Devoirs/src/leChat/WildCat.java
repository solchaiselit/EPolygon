package leChat;

public abstract class WildCat extends CatLike {
   
	
	private int speed;
	
	public WildCat(Anatomy anatomy, int size, int age, int sizeOfFur, int speed) {
		super(anatomy, size, age, sizeOfFur);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void eat(){
		System.out.println("Wild cats prey on smaller animals");
	}
}
