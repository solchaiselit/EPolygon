package commodity;

import java.util.Comparator;

public class SortByBrand implements Comparator<Ordinateur> {

	@Override
	public int compare(Ordinateur o1, Ordinateur o2) {
		// TODO Auto-generated method stub
		
//		System.out.println(o1.getBrand().compareTo(o2.getBrand()));
		
		return o1.getBrand().compareTo(o2.getBrand());
		
	}
	
}
