package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Petro", "Petrenko", 345));
		students.add(new Student("Jana", "Janenko", 348));
		
			
		boolean contain = students.contains(new Student("Jana", "Janenko", 348));
        System.out.println(contain);		
		
        System.out.println(students.size());
        System.out.println(students.get(1));
       
        
//        Student studik = new Student("Jana", "Janenko", 348);
        
        System.out.println(students.contains(new Student("Jana", "Janenko", 348)));
        
//        Collections.replaceAll(students,students.getName("Jana"), "Bena");
		
	}

}
