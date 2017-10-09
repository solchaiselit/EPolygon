package exceptions2;

public class Main {

	public static void main(String[] args) throws Exception{
		
		NumberValidator nv = new NumberValidator();
		
		
		int set [] = new int[2];
		
		set[0] = 0;
		set[1] = 7;
		
		try{
		
		nv.validate(set);
				
		Method method = new Method(set[0],set[1]);
		method.add();
		
		}catch(MyException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
	
}
