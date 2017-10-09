package polygonCompare;

import java.util.Comparator;

public class SortByArea implements Comparator<Country> {

	@Override
	public int compare(Country o1, Country o2) {
		// TODO Auto-generated method stub
		
		return (o1.getArea()<o2.getArea())? -1:(o2.getArea()<o1.getArea())? 1:0;
		
	}

}
