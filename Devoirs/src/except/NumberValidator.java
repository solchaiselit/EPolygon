package except;

public class NumberValidator implements Validator {

	@Override
	public void validate(Object object) throws Exception {
		// TODO Auto-generated method stub
		
		Methods method = (Methods) object;
		
		
		try{
			if(method.getA()<0 && method.getB()<0){
				throw new MyException(ValidationMessages.IllegalArgumentException);
			}
			else if((method.getA()==0 && method.getB()!=0) || (method.getA()!=0 && method.getB() ==0)){
				throw new MyException(ValidationMessages.ArithmeticException);
			}
			else if(method.getA()==0 && method.getB()==0){
			
				throw new MyException(ValidationMessages.IllegalAccessException);
			}
			
			else if(method.getA()>0 && method.getB()>0){
				
				throw new MyException(ValidationMessages.MyException);
				
			}
		}
		
		catch (MyException e){
			System.out.println(e.getMessage());
		}
		
		
	}

	
	
	
}
