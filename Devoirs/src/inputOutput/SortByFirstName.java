package inputOutput;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Employee> {

	@Override
	
	public int compare (Employee o1, Employee o2){
		
		return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
	}
	
}