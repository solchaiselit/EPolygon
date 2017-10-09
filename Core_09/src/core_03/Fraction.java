package core_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fraction {
	
	private String fractionName;
	private List<Deputat> deputats = new ArrayList<>();
	
	
	
	Scanner scanner = new Scanner(System.in);
	
	public void addDeputat(){
		
		System.out.println("Enter deputat's weight, height, name, surname, age. Is he a briber (true or false)?");
	    
		int weight = scanner.nextInt();
		int height = scanner.nextInt();
	    
		String name = scanner.next();
		String surname = scanner.next();
	    
		int age = scanner.nextInt();
	  
	    Boolean answer = scanner.nextBoolean();
	  
	    Deputat deputat = new Deputat(weight, height, name, surname, age, answer);
	    
	    deputats.add(deputat);
	    	    
	}
	
	public void removeDeputat{
		
		
		
	}
	
	
	scanner.close();
}
