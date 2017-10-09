package nestedClass;

public class Judge {
	
	
	private String name;
	
	public static class Punishment{
		
		public void inStaticClassMethod(){
			
			
			
			System.out.println("in static class");
			Judge judge = new Judge();
			
			judge.name = "john";
		}
		
		public  static class Prison{
			
		}
	}
}
