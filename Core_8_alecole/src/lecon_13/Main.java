package lecon_13;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("persons.txt");
	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
		Person person1 = new Person("anton", 22);
		Person person2 = new Person("ira", 34);
		Person person3 = new Person("ivan", 20);
		
//		List<Person> list = new ArrayList<>();
//		
//		list.add(person1);
//		list.add(person2);
//		list.add(person3);
////		
		
		
		
//		
//		oos.writeObject(list);
		
		
		oos.writeObject(person2);
		oos.writeObject(person3);
//		
//		oos.close();
		
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.txt"));
//		
//		List<Person> persons = (List<Person>) ois.readObject();
//		
//		for(Person person: persons){
//			
//			System.out.println(person.getName());
//		}
		
		Person maxAgePerson = (Person) ois.readObject();
		
		try{
			
			while(true){
				
				Person p = (Person) ois.readObject();
				
//				System.out.println(ois.readObject());
				
				System.out.println(ois.readObject().toString());
				
			}
			
			
		}catch (EOFException e){
			
		}
		
		
		
	}

}
