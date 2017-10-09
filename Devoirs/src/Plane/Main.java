package Plane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
		Control control = new Control (200,4,50);
		
			
		Su27 su = new Su27(new Control (200,4,50),900, "white");
		
	    su.startEngine();
	    su.takeOff();
        control.moveDown(); 
        control.moveForward();
	    control.moveUp();
	    su.stealth();
	    su.strike();
	    su.turbo();
	    su.landPlane();
	    
	    System.out.println(su.getColor());
	    
	}

}
