package recollection;

public class Movie {

	
	static String name;
	
	String arch;
	
	private Actor actor;
	
	private double duration;
	
	static int g = 2;
	
	int h = 4;
	

	
	Movie(String name, int h, int g){
		
		this.name = name;
		this.h = h;
		this.g= Movie.g;
		
	}
	
	Movie(){
		
	};
	
	public int sum(int g){
		
		int res = Movie.g+g;
		return res;
		
	}
	
	
}
