package exceptions2;

import except.Validator;

public class NumberValidator implements Validator {

	@Override
	
	public void validate (Object object) throws Exception{
		
		int[] set = (int[]) object;
		
		int a = set[0];
		int b = set[1];
		
		try{
			
			if (a==0)
				throw new MyException("My Exception 1");
			else if (b==0)
				throw new MyException("My Exception 2");
			
		}catch (MyException e){
			
			System.out.println(e.getMessage());
		}
		
	}
	
}
