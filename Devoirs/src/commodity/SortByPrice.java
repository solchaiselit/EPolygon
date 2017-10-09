package commodity;

import java.util.Comparator;

public class SortByPrice implements Comparator<Ordinateur> {

	@Override
	public int compare(Ordinateur o1, Ordinateur o2) {
		// TODO Auto-generated method stub
		int a1 = o1.getPrice();
		int a2 = o2.getPrice();
		
		return (a1<a2)? -1:(a2<a1)? 1:0;
		
	}

	
	
}
