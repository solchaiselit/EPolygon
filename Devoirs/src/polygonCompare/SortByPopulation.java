package polygonCompare;

import java.util.Comparator;

public class SortByPopulation implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2){
		
		int p1 = o1.getPopulation();
		int p2 = o2.getPopulation();
		
		return (p1<p2)? -1:(p1>p2)? 1:0;
		
		
	}
	
}
