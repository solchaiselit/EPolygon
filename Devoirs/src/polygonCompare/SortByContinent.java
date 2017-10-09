package polygonCompare;

import java.util.Comparator;

public class SortByContinent implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		// TODO Auto-generated method stub
		
		return o1.getContinent().compareTo(o2.getContinent());
	}

	
	
}
