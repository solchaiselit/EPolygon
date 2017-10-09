package Plane;

public class Control {

	private int weight;
	private int height;
	private int length;
	
		public Control(int weight, int height, int length) {
		super();
		this.weight = weight;
		this.height = height;
		this.length = length;
	}
		
	
		public int getWeight() {
			return weight;
		}



		public void setWeight(int weight) {
			this.weight = weight;
		}



		public int getHeight() {
			return height;
		}



		public void setHeight(int height) {
			this.height = height;
		}



		public int getLength() {
			return length;
		}



		public void setLength(int length) {
			this.length = length;
		}


	public int moveUp(){
		
		int r = (int)(Math.random()*100);
		System.out.println("The plane moves up " +r +" meters");
		return r;
	}
	
	public int moveDown(){
		
		int r = (int)(Math.random()*100);
		System.out.println("The plane moves down " +r +" meters");
		return r;
	}

	public int moveForward(){
	
	int r = (int)(Math.random()*100);
	System.out.println("The plane moves forward " +r +" meters");
	return r;
	}

	public int moveBack(){
	
	int r = (int)(Math.random()*100);
	System.out.println("The plane moves back " +r +" meters");
	return r;
}
	
}
