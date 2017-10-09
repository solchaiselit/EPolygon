package zooclub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Zooclub {

	Map<Person,List<Animal>> map = new HashMap<>();
	
	Set<Entry<Person,List<Animal>>> set = map.entrySet();
	
	public void start(){
		
		boolean play = true;
		
		while(play==true){
			
			System.out.println("Enter 1 to add a person; "
					+ "Enter 2 to add an animal to a person; "
					+ "Enter 3 to remove an animal from a person;\n "
					+ "Enter 4 to remove a person; "
					+ "Enter 5 to remove an animal from all persons; "
					+ "Enter 6 to show the club;\n "
					+ "Enter 7 to exit; " 
					);
			
			String key = Main.scanner.next(); 
			
			switch(key){
			
			case "1": {			
				addPerson();
				break;
			}
			
			case "2": {
				
				addAnimal();
				break;
			}
			
			case "3": {
				
				removeAnimalfromPerson();
				break;
			}

			case "4": {
				
				removePerson();
				break;
			}

			case "5": {
				removeAnimalFromAll();
				break;
			}

			case "6": {
				System.out.println(map.toString());
				break;
			}

			
			case "7": {
				
				play = false;
				break;
				
			}
			
			default: {
				
				break;
			}
			
			}
			
			
		}
		
	}
	
	public void addPerson(){
		System.out.println("Enter person's name and age");
		String name = Main.scanner.next(); 
		int age = Main.scanner.nextInt();
		Person person = new Person(name,age);
		ArrayList<Animal> list = new ArrayList();
		map.put(person, list);
		
	}
	
	public void addAnimal(){
		System.out.println("Add animal's kind and name");
		String kind = Main.scanner.next();
		String name = Main.scanner.next();
		Animal animal = new Animal(kind,name);
		System.out.println("Enter person's name");
		String personName = Main.scanner.next();

		boolean exists = false;
		for(Person p: map.keySet()){
			if(p.getName().equalsIgnoreCase(personName)){
				map.get(p).add(new Animal(kind,name));
				exists = true;
				break;
			}
				
			}
		
	    if(exists==false){
	    	System.out.println("No such person");
	    }
	}
	
	public void removeAnimalfromPerson(){
		

		System.out.println("Enter person's name");
		String pName = Main.scanner.next();
		System.out.println("Enter animal name");
		String aName = Main.scanner.next();
		
		boolean exists = false;
		for(Person p: map.keySet()){
			if(p.getName().equalsIgnoreCase(pName)){
							
				ListIterator<Animal> iterator = map.get(p).listIterator();	
				boolean deleted = false;
				while(iterator.hasNext() && deleted==false){
					if(iterator.next().getName().equalsIgnoreCase(aName)){
						iterator.remove();
						deleted = true;
						break;
					}
				}
				if(deleted==false){
				System.out.println("no such animal for this person");
				}
				exists = true;
				break;
			}	
	}	
	    if(exists==false){
	    	System.out.println("No such person");
	    }
		
		
	}
	
	public void removePerson(){
		
		System.out.println("Enter person's name");
		String name = Main.scanner.next();
		
	    boolean deleted = false;
	    
	    for(Person p: map.keySet()){
	    	if(p.getName().equalsIgnoreCase(name)){
	    		map.remove(p, map.get(p));
	    		deleted = true;
	    		break;
	    	}
	    }
	    
	    if(deleted == false){
	    	System.out.println("no such person");
	    }
		
	}
	
	public void removeAnimalFromAll(){
		
		System.out.println("Enter animal kind");
		String kind = Main.scanner.next();
		
		boolean deleted = false;
		
		for(Entry<Person,List<Animal>> e: set){
			
			
			ListIterator<Animal> it = e.getValue().listIterator();
			
			
			while(it.hasNext()){
				if(it.next().getKind().equalsIgnoreCase(kind)){
					
					deleted = true;
					it.remove();
					
				}
			}
			
		}
		if(deleted==false){
			System.out.println("no such kind");
		}
		
	}

	@Override
	public String toString() {
		return "Zooclub [map=" + map + "]\n";
	}
	
	
	
}
