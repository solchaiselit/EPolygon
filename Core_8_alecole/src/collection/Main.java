package collection;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Fruit> fruits = new ArrayList<>();
		
		fruits.add(new Fruit("orange", 20));
		fruits.add(new Fruit("banana", 40));
		fruits.add(new Fruit("apple", 15));
		
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.size());
		System.out.println(fruits.size());
		System.out.println(fruits.size());
		
		
	}

}
