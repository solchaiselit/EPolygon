package package1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird ptah = new Bird(new Appearance(2, 100, 3, "black"), "chicken", 80);
		
		System.out.println("this is a " + ptah.getAppearance().getColor() +" "
				+ ptah.getSpecies() +" that weighs " + ptah.getAppearance().getWeightKg() +
				" kg and can fly up to " + ptah.getFlightSpeed() + " km per hour!");
	}

}