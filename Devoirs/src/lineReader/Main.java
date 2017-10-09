package lineReader;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 0;
		int localMax = 0;
		int k = 0;

		System.out.println("Enter a string");
		
		Scanner scanner = new Scanner(System.in);
					
		String string = scanner.nextLine();
		
				
		char[] array = string.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			if(!Character.isDigit(string.charAt(i))){
					
					localMax = 0;
			}else{
			localMax = localMax+1;
			}
			if(localMax > max){
			max = localMax;
			k = i;
			}
		}
	
		System.out.println("The maximum contigious number of digits is " +max);
	    
		for(int m = 0; m<max; m++){
			System.out.print(array[k-max+m+1]);
		}
		
		scanner.close();
		
		
		
	}

}
