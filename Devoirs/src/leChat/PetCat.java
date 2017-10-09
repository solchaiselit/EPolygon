package leChat;

public abstract class PetCat extends CatLike {
    
	private String name;
	
	public PetCat(Anatomy anatomy, int size, int age, int sizeOfFur, String name) {
		super(anatomy, size, age, sizeOfFur);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void recognizeOwner(){
		
		System.out.println("Pet cats know their owners");
	}
	
	public void eat(){
		
		System.out.println("Pet Cats eat human food");
	}
	
}
