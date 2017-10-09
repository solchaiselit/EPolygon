package Core1;

public class Rectangle {

	
	int width;
	int length;
	
	public Rectangle(){
		
	}

//	public Rectangle(int width, int length) {
//		super();
//		this.width = width;
//		this.length = length;
//	}
	
	public Rectangle(int width, int length){
		
		this.width = width;
		this.length = length;
		
	}
	
	
	public String perimeter1(int width, int length){
		int perimeter = 2*(width+length);
		String result = "The perimeter is " +perimeter;
		
		return result;
	} 
	
	
	public void perimeter(){
		
		int perimeter = 2*(width+length);
		System.out.println("The perimeter is " + perimeter);
		
	}
	
	public void area(){
		int area = width*length;
		System.out.println("The area is " +area);
	
	}
	
	
}
