package leChat;

public abstract class CatLike extends Animal{

	
	private int sizeOfFur;
	
	
	
	public int getSizeOfFur() {
		return sizeOfFur;
	}

	public void setSizeOfFur(int sizeOfFur) {
		this.sizeOfFur = sizeOfFur;
	}

	public CatLike(Anatomy anatomy, int size, int age, int sizeOfFur) {
		super(anatomy, size, age);
		this.sizeOfFur = sizeOfFur;
	}

	public void climbTree(){
		
	}
	
	public void move(){
		System.out.println("The cat family runs and climbs trees");
	}
	
}
