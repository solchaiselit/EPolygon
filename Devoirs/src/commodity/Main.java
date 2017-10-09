package commodity;

import java.util.Set;
import java.util.TreeSet;


/*
Created by IK on 19.03.2017
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Set<Ordinateur> set = new TreeSet<>(new SortByPrice().thenComparing(new SortByBrand()));
		
		set.add(new Ordinateur("dell", 1000));
		set.add(new Ordinateur("samsung", 600));
		set.add(new Ordinateur("fuji", 500));
		set.add(new Ordinateur("fuji", 400));
		
		for(Ordinateur o: set){
			System.out.println(o.toString());
		}
	}

}
