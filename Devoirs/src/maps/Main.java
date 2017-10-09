package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Map<Integer, String> map = new HashMap<>();
//		
//		map.put(10,  "ten");
//		map.put(20,  "twenty");
//		map.put(30,  "thirty");
//		map.put(40,  "forty");
//		map.put(50,  "fifty");
//		
//		System.out.println(map);
//		
//		
//		for(Integer i : map.keySet()){
//			System.out.println(i+" " + map.get(i));
//		}
//		
//		Set<Entry<Integer, String>> set = map.entrySet();
//		
//		for(Entry<Integer, String> en: set){
//			System.out.println(en);
//		}
		
		
//		Map<Person, Auto> map = new HashMap<Person, Auto>();
//		
//		map.put(new Person("ihor", 20), new Auto("mazda", 2));
//		map.put(new Person("ivan", 35), new Auto("cadillac", 0));
//		map.put(new Person("ira", 24), new Auto("lada", 10));
//		
//		int age = 0;
//		String nameAuto = " ";
//		
//		Set<Entry<Person, Auto>> set = map.entrySet();
//		
//		for(Entry<Person, Auto> en: set){
//			if(en.getValue().getYears()>maxAge){
//				maxAge = en.getValue().getYears();
//				name = en.getKey().getName();
//			}
//		}
//		
//		System.out.println(name);
		
//		for(Auto auto: map.values()){
//			if(age<auto.getYears()){
//				age = auto.getYears();
//				nameAuto = auto.getBrend();
//			}
//		}
		
//		System.out.println(name);
		
		List<Auto> list0 = new ArrayList<>();
		list0.add(new Auto("ford", 28));
		list0.add(new Auto("kamaz", 42));
		
		List<Auto> list1 = new ArrayList<>();
		list1.add(new Auto("lada", 10));
		list1.add(new Auto("mers", 3));
		
		List<Auto> list2 = new ArrayList<>();
		list2.add(new Auto("mazda", 5));
		list2.add(new Auto("smart", 2));
		
		
		Map<Person, List<Auto>> map = new HashMap<>();
		
		map.put(new Person("sashko", 19), list0);
		map.put(new Person("vova", 20), list1);
		map.put(new Person("roza", 23), list2);
		
		Set<Entry<Person, List<Auto>>> set = map.entrySet();
		
		int totalYears = 0;
		int maxYears = 0;
		
		String name = " ";
		
		for(Entry<Person,List<Auto>> en: set){
			
			System.out.println("ENTRY TO STRING: " + en.toString());
			for(Auto auto: en.getValue()){
				totalYears = totalYears+ auto.getYears();
			}
			if(totalYears>maxYears){
				maxYears = totalYears;
				name = en.getKey().getName();
				totalYears = 0;
			}
		}
		
		System.out.println(name + " has cars that are " + maxYears + " years old");
		
		System.out.println("set: " +set);
		
	}
	

}
