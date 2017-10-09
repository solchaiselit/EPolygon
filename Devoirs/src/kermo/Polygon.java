package kermo;

import java.util.Scanner;

public class Polygon {
	
	public static void main(String[] args){
	
		int k = 0;
		int m = 0;
	int a = (int) Math.round(2.5);
	System.out.println("a = " + a);
		
	Scanner scanner = new Scanner(System.in);
			
	String arg = scanner.next();
	
	char [] masyv = arg.toCharArray();
    
	for (int i = 0; i < masyv.length/2; i++) {
		if(masyv[i]==masyv[(masyv.length-i)]){
	     ++k;
	     m = i;
		}
	}
	if(k==m){
		System.out.println("it's a palindrome");
	}
	else
		System.out.println("it's not a palindrome");
	
	
	scanner.close();
	
	}
	
}
