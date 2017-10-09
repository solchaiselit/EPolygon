package projectCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {

	static Scanner scanner = new Scanner(System.in);
	
	static List<Movie> movieList = new ArrayList();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		Cinema cinema = new Cinema();
		
		
		cinema.start();
		
		
		scanner.close();
	}

}
