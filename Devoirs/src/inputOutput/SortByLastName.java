package inputOutput;

import java.util.Comparator;

public class SortByLastName implements Comparator<Employee> {

	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
				
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}

	
}
