package polygonCompare;

import java.util.Comparator;

public class SortByAreaDesc implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		// TODO Auto-generated method stub
		int b1 = o1.getArea();
		int b2 = o2.getArea();
		
		return (b1>b2)? -1:(b2>b1)? 1:0; 
	}

	
	
}
