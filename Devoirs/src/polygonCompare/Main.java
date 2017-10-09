package polygonCompare;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static ArrayList<Country> list = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	list.add(new Country("Albania", 75, 3, "Europe"));
	list.add(new Country("Belgium", 70, 9, "Europe"));
	list.add(new Country("Mexico", 1900, 110, "North America"));
	list.add(new Country("China", 9200, 1400, "Asia"));
	list.add(new Country("Vietnam", 700, 100, "Asia"));
	list.add(new Country("DRC", 1300, 85, "Africa"));
	
	for(Country c: list){
		System.out.println(c);
	}
	
	list.sort(new SortByName());
    System.out.println("\n Sorted by name: \n");
	for(Country c: list){
		System.out.println(c);
	}
	
	list.sort(new SortByAreaDesc());
	System.out.println("\n Sorted by area in descending order: \n");
	for(Country c: list){
		System.out.println(c);
	}

	list.sort(new SortByContinent().thenComparing(new SortByName()).thenComparing(new SortByPopulation()));
	System.out.println("\n Sorted by continent then by name: \n");
	for(Country c: list){
		System.out.println(c);
	}
		
	list.sort(new SortByContinent().reversed());
	System.out.println("\n sorted by continent in reverse order: \n");
	for(Country c: list){
		System.out.println(c);
	}
	
	}

}
