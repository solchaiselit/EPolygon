package Core1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		Rectangle one = new Rectangle(3,12);
//		
//		Rectangle two = new Rectangle (4,5);
//		
//		one.area();
//		one.perimeter();
//	
//		System.out.println(one.perimeter1(1, 1));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter width and length");
		
		int width = scanner.nextInt();
		int length = scanner.nextInt();
		
		Rectangle figure = new Rectangle(width,length);
		
		figure.area();
		figure.perimeter();
		
		
		
		
		scanner.close();		
		
	}

}
