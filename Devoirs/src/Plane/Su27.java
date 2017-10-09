package Plane;

public class Su27 extends Plane implements SpecialFeature {
    
	private int maxSpeed;
	private String color;
	
	public Su27(Control control, int maxSpeed, String color){
		
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	
		
	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void turbo(){
		
		int r = 27 + (int)(Math.random()*10);
		System.out.println("The turbo speed is " +r);
			
	}
	
	public void stealth(){
		
		int r = 27 + (int)(Math.random()*10);
		System.out.println("The plane is invisible for " +r + " minutes");
			
	}
	
	public void strike(){
		
		int r = (int)(Math.random()*10);
		System.out.println("Number of warheads dropped: " +r);
			
	}
	
	
}
