package inputOutput;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2){
		
		int a = o1.getId();
		int b = o2.getId();
		
		return (a<b)? -1:(a>b)? 1:0;
		
	}

	
	
}
