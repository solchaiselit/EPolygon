package leChat;

public class Jaguar extends WildCat {
    
	private int numberSpots;

	public Jaguar(Anatomy anatomy, int size, int age, int sizeOfFur, int speed, int numberSpots) {
		super(anatomy, size, age, sizeOfFur, speed);
		this.numberSpots = numberSpots;
	}

	public int getNumberSpots() {
		return numberSpots;
	}

	public void setNumberSpots(int numberSpots) {
		this.numberSpots = numberSpots;
	}
	
	@Override
	public String toString(){
		
		String string = "My Class hierarchy: " +this.getClass().getSimpleName() +" "
				+" " +this.getClass().getSuperclass().getSimpleName()
				+" " +this.getClass().getSuperclass().getSuperclass().getSimpleName()
				+" " +this.getClass().getSuperclass().getSuperclass().getSuperclass().getSimpleName() 
		+ "\n Age: " +this.getAge()
				+ "\n Size: " + this.getSize() + "\n Number of Spots: " + this.getNumberSpots()
	    + "\n Size of fur: " + this.getSizeOfFur()
	    + "\n Speed: " + this.getSpeed();
		System.out.println(string);
		this.move(); this.breed(); this.climbTree(); this.eat(); 
		return string;
	}
	
}
