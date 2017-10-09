package except;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int a = 4;
		int b = 0;
		
		try{
			
			Methods method = new Methods(a,b);
			
			NumberValidator nv = new NumberValidator();
			
			nv.validate(method);
			
			System.out.println(method.add());
			System.out.println(method.subtract());
			System.out.println(method.multiply());
			System.out.println(method.divide());
			
		}catch (MyException e){
			System.out.println(e.getMessage());
		}
		
		
//		try{
//			if(a<0 && b<0){
//				throw new MyException(ValidationMessages.IllegalArgumentException);
//			}
//			else if((a==0 && b!=0) || (a!=0 && b ==0)){
//				throw new MyException(ValidationMessages.ArithmeticException);
//			}
//			else if(a==0 && b==0){
//			
//				throw new MyException(ValidationMessages.IllegalAccessException);
//			}
//			
//			else if(a>0 && b>0){
//				
//				throw new MyException(ValidationMessages.MyException);
//				
//			}
			
			
			
//		}	catch(MyException e){
//				
//				System.out.println(e.getMessage());
//			}
		

//			
//		NumberValidator numberValidator = new NumberValidator();
//		
//		numberValidator.validate(method);
		
		
		
	}

}
