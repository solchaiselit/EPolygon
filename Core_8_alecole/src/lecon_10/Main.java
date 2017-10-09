package lecon_10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Set<Integer> set = new TreeSet<Integer>();
//		
//		set.add(12);
//		set.add(1);
//		set.add(10);
//		set.add(9);
//		set.add(15);
//		set.add(1);
//		
//		for (Integer i : set) {
//				System.out.println(i);
//		}
		
		Set<Pie> pies = new TreeSet<>(new SortByPrice().thenComparing(new SortByName()));
		
		pies.add(new Pie("napoleon", 60));
		pies.add(new Pie("napoleon", 260));
		pies.add(new Pie("napoleon", 160));
		pies.add(new Pie("gold key", 230));
		pies.add(new Pie("sharkotka", 10));
		pies.add(new Pie("apple", 80));
		
		for(Pie p: pies){
		System.out.println(p);
		}
		
//		int maxPrice = 0;
//		String name = "apple";
//		
//		for (Pie pie : pies) {
//			if(pie.getPrice()> maxPrice){
//				maxPrice = pie.getPrice();
//				name = pie.getName();
//			}
//		}
//		System.out.println("Most expensive pie: " + name);
	}
	
   

}
