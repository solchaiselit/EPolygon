package commodity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Polygon {
	
	public static ArrayList<Ordinateur> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Ordinateur> comp = new HashSet<>();
		
		list.add(new Ordinateur("Dell", 500 + (int)(Math.random()*500)));
		list.add(new Ordinateur("HP", 500 + (int)(Math.random()*500)));
		list.add(new Ordinateur("Samsung", 500 + (int)(Math.random()*500)));
		list.add(new Ordinateur("Apple", 500 + (int)(Math.random()*500)));
		list.add(new Ordinateur("Lenovo", 500 + (int)(Math.random()*500)));
		list.add(new Ordinateur("Apple", 500+ (int)(Math.random()*500)));
		list.add(new Ordinateur("Dell", 500+(int)(Math.random()*500)));
		
		for(Ordinateur o: list){
			System.out.println(o);
		}
		
		list.sort(new SortByPrice());
		
		
		
		System.out.println();
		
		for(Ordinateur o: list){
			System.out.println(o);
		}
		
		list.sort(new SortByBrand());
		
		System.out.println();
		
		for(Ordinateur o: list){
			System.out.println(o);
		}
		
		System.out.println();
		
		list.sort(new SortByBrand().thenComparing(new SortByPrice()));
		
		for(Ordinateur o: list){
			
			System.out.println(o);
		}
		
		
//		Set<Integer> treeSet = new TreeSet<>();
//		
//		
//		
//		for(Ordinateur ord: comp){
//			treeSet.add(ord.getPrice());
//		}
//		
//	    System.out.println(treeSet.size()+"\n");
//		
//		
//		
//		for(Integer tree: treeSet){
//			System.out.println(tree);
//		}
//		
//		SortByPrice sortByPrice = new SortByPrice();
//		
//		System.out.println(comp);
		
//		sortByPrice(comp);
//		
//		for(Ordinateur o: comp){
//			sortByPrice(o);
//		}
	}

}
