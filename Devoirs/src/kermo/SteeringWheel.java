package kermo;

public class SteeringWheel extends CarPart {
	
	private boolean hydro;
	
	public SteeringWheel(boolean hydro, double price, int numberOf, String brand){
		
		super(price, brand, numberOf);
		this.hydro = hydro;
		
	}
	
	public void setHydro(boolean hydro){
		
		this.hydro = hydro;
	}
	
	public boolean getHydro(){
		
		return hydro;
		
	}
	
	public void repair(){
		
		System.out.println("Repair the Steering Wheel");
	}
	
	public void replace(){
		
		System.out.println("Replace the Steering Wheel");
	}

	public void changeHydro(){
		if(this.hydro==true){
			this.hydro = false;
		    System.out.println("This is not a Hydro steering wheel anymore");
		}
		else{
			this.hydro = true;
		    System.out.println("This is now a Hydro Steering Wheel");
		}
	}
	
}
