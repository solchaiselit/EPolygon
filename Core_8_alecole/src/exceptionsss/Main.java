package exceptionsss;

import java.util.Scanner;

public class Main {

	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		User user = new User("dgdf", "sdf");
		
		UserValidator userValidator = new UserValidator();
		
		userValidator.validate(user);
		
		System.out.println(user);
		
		System.out.println("feeee");
		
	}
	
//	scanner.close;

}
