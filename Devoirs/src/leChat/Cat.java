package leChat;

public class Cat extends PetCat {

	private String favoriteFood;
	
	public Cat(Anatomy anatomy, int size, int age, int sizeOfFur, String name, String favoriteFood) {
		super(anatomy, size, age, sizeOfFur, name);
		this.favoriteFood = favoriteFood;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	
	@Override
	public String toString(){
		
		String string = "My Class hierarchy: " +this.getClass().getSimpleName() +" "
		+" " +this.getClass().getSuperclass().getSimpleName()
		+" " +this.getClass().getSuperclass().getSuperclass().getSimpleName()
		+" " +this.getClass().getSuperclass().getSuperclass().getSuperclass().getSimpleName()
		+ "\n Name: " + this.getName() +"\n Age: " +this.getAge()
				+ "\n Size: " + this.getSize() + "\n Favorite Food: " + this.getFavoriteFood()
	    + "\n Size of fur: " + this.getSizeOfFur();
		System.out.println(string);
		this.move(); this.breed(); this.climbTree(); this.recognizeOwner(); this.eat(); 
		return string;
	}
		
	
}
