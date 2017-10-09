package enums;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		boolean ind = false;
		String enteredMonth = "bu";
		String enteredSeason = "bu";
		int enteredDays = 0;
		int enteredOrdinal = -1;
				
		Month [] month = Month.values();
		
		System.out.println("Enter a month or press 4 to quit");
		
		do{
			
			String enteredText = scanner.next();
		
		    for(int i = 0; i<month.length; i++){
								
			if(enteredText.equalsIgnoreCase(month[i].name())){
				System.out.println("bingo");
				ind = true;
				enteredMonth = month[i].name().toUpperCase();
				break;
			}else if(enteredText.equals("4")){
				ind = true;
				break;
			}
		    }
		    if(ind==false)
		    System.out.println("No such month. Try again:");
		    	
		} while(ind==false);
		    
		if(ind == true){
		enteredSeason = Month.valueOf(enteredMonth).getSeason().name();
		enteredDays = Month.valueOf(enteredMonth).getDays();
		enteredOrdinal = Month.valueOf(enteredMonth).ordinal();
		System.out.println("\n All the months of this season: ");
		
		for(int i = 0; i< month.length; i++){
			if(month[i].getSeason().name().equalsIgnoreCase(enteredSeason)){
				System.out.println(month[i].name());
			}
		}
		
			System.out.println("\n All the months with the same number of days: ");
			
			for(int i = 0; i< month.length; i++){
				if(month[i].getDays()==enteredDays){
					System.out.println(month[i].name());
				}
			}
			
			System.out.println("\n The next season: ");
						
			for(int i = enteredOrdinal; i < month.length; i++){
				if(!month[i].getSeason().name().equalsIgnoreCase(enteredSeason)){
					System.out.println(month[i].getSeason().name());
					break;
				}else if(i==(month.length-1)){
					for(int j = 0; j < enteredOrdinal; j++){
						if(!month[j].getSeason().name().equalsIgnoreCase(enteredSeason)){
							System.out.println(month[j].getSeason().name());
							break;
						}
					}
				}
			}
			
			if(enteredDays%2 == 0)
			System.out.println("\n" + enteredMonth + " has an even number of days");
			else
			System.out.println("\n" +enteredMonth + " has an odd number of days");	
	        
			
			
	    } 
		
		
		 
		scanner.close();
		
	}

}
