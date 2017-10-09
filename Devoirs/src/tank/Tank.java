package tank;

public class Tank {
	
	private Hull hull;
    private Turret turret;
   
    private int distance, health;
    private boolean dead;
    
    public void move(){
    	
    }
    
    public void stop(){
    	
    	
    }

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		if(distance >= 0 || distance < 100)
			
		this.distance = distance;
	}
      
    

}
