package verkhovnaRada;

import java.awt.Color;
import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);	
	List<Deputat> deputy = new ArrayList<>();
	
	deputy.add(new Deputat(55,170,"Elena","Bondarenko",41,true));
	deputy.add(new Deputat (90,172,"Vova","Groysman",39,true));
	deputy.add(new Deputat(85, 182, "Andrij", "Parubij", 54, false));
	
    ListIterator<Deputat> it = deputy.listIterator();

     
//	while(it.hasNext()){
//		System.out.println(it.next().toString());
//	}
	
//	String name = "ss";
//	while(it.hasNext()){
//		if(it.next().getName().equals(name)){
//			System.out.println(it.nextIndex());
//		};
//	}
	
//	System.out.println(deputy);
	
//	deputy.removeIf((Deputat dep) -> dep.getName().equals(name));
	
//	System.out.println(deputy);
//	
//	System.out.println(deputy.contains("Elena"));
	
//	for(Deputat dep: deputy){
//		if(dep.getName().equalsIgnoreCase(toBeRemoved)){
//			System.out.println(deputy.indexOf(dep));
//		};
//	}
	
//	deputy.clear();
	
     System.out.println(deputy);
	 System.out.println("Enter the name of deputat u want to remove");
	 String toBeRemoved = scanner.next();
	 boolean deleted = false;
	 
     while(it.hasNext() && deleted == false){
    	 
    	 //    	 System.out.println(it.next().getSurname());
    	 if(it.next().getName().equalsIgnoreCase(toBeRemoved)){
    		 it.remove(); 
    		 deleted = true;
    	 }
     }
	
     System.out.println("\n After removal:" +deputy);
	
     Color blue = new Color(2,4,5);
     
	}

}
