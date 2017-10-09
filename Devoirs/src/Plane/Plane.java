package Plane;

public abstract class Plane {

	public Control control;
	
	public Plane(){
		
		super();
	}
	
	
	public int startEngine(){
		
		int r = 20 + (int)(Math.random()*68);
		
		System.out.println("Time before take off: " + r + " seconds");
		return r;		
	    }
	
	public int takeOff(){
		
		int r = (int)(Math.random()*1000);
		System.out.println("The plane flies " +r + " km");		
		return r;
	}
	
	public void landPlane(){
		
		System.out.println("The plane is landing.");		
	}
	
}
