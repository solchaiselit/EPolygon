package verkhovnaRada;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Fraction {
	
	private String fractionName;
	private List<Deputat> deputats = new ArrayList<>();
	
	
	
	
	public String getFractionName() {
		return fractionName;
	}

	public void setFractionName(String fractionName) {
		this.fractionName = fractionName;
	}

	public List<Deputat> getDeputats() {
		return deputats;
	}

	public void setDeputats(List<Deputat> deputats) {
		this.deputats = deputats;
	}

	public Fraction(String fractionName) {
		super();
		this.fractionName = fractionName;
	}

	Scanner scanner = new Scanner(System.in);
	
	public void addDeputat(){
		
		System.out.println("Enter deputat's weight, height, name, surname, age. Is he a briber (true or false)?");
	    
//		int weight = 0;
//		
//		while(!scanner.hasNextInt()){
//			System.out.println("wrong format. Try again.");
//			weight = scanner.nextInt();
//		};
		
		int weight = scanner.nextInt();
		int height = scanner.nextInt();
	    
		String name = scanner.next();
		String surname = scanner.next();
	    
		int age = scanner.nextInt();
	  
	    Boolean answer = scanner.nextBoolean();
	  
	    Deputat deputat = new Deputat(weight, height, name, surname, age, answer);
	    
	    deputats.add(deputat);
	    	    
	}
	
	public void viewDeputats(){
		if(deputats.isEmpty())
			System.out.println("This fraction is free of deputats");
		else{
		ListIterator<Deputat> it = deputats.listIterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
		}
	}
	

	@Override
	public String toString() {
		return "Fraction [fractionName=" + fractionName + ", deputats=" + deputats + "]";
	}

	public void removeDeputat(){
		
		System.out.println("Enter deputat's name and surname");
		String name = scanner.next();
		String surname = scanner.next();
		
		deputats.removeIf((Deputat dep) ->( dep.getName().equalsIgnoreCase(name)
				&& dep.getSurname().equalsIgnoreCase(surname)));
		
	}
	

	public void viewBribers(){
		if(deputats.isEmpty())
			System.out.println("This fraction is free of deputats");
		else{
		List<Deputat> bribers = new ArrayList<>();
		for(Deputat dep: deputats){
			if(dep.isBriber())
				bribers.add(dep);
		}
		
		System.out.println("List of bribers of this fraction: ");
		for(Deputat dep: bribers){
			System.out.println(dep.getName()+" " +dep.getSurname());
			dep.getBribeAmount();
		}
		}
	}
	
	public void getBiggestBriber(){
		
		int maxBribe = 0;
		int ind = -1;
		for(Deputat dep: deputats){
			if((dep.isBriber()) && (dep.getBribeAmount()>=maxBribe)){
				maxBribe = dep.getBribeAmount();
			    ind = deputats.indexOf(dep);
			}
		}
		
		if(ind != -1)
		System.out.println("The biggest briber(s) of this fraction: " 
		+deputats.get(ind).getName()+" " +deputats.get(ind).getSurname()+". He has " 
				+ deputats.get(ind).getBribeAmount() + " $ of bribes.");
		else
			System.out.println("This fraction has no bribers");
						
	}
	
	public void clearFraction(){
		
		deputats.clear();
		System.out.println("CLEARED )))");
	}
	
	public void bribeDeputat(String name, String surname){
		boolean exists = false;
		for(Deputat dep: deputats){
			if(dep.getName().equalsIgnoreCase(name) && dep.getSurname().equalsIgnoreCase(surname)){
			exists = true;
			dep.giveBribe();
			break;
			}
		}
		
	}

}
