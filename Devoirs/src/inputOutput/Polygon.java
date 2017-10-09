package inputOutput;

import java.util.Scanner;

public class Polygon {
	
	public static void main(String [] args){
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter id");
	int id = Main.scanner.nextInt();
	String tmp = "Employee [id=145, firstName=Ivan, lastName=Kravtsiv]";
	
	boolean exist = false;
					
	
	
		String [] ku = tmp.split("id=");
		
		System.out.println(tmp+ "\n"+ "ku[1] = " + ku[0]+"\n " +ku[1].indexOf(',', 0));
		
		
		int w = Integer.parseInt(ku[1].substring(0, ku[1].indexOf(',',0)));
		
		System.out.println("w = " +w);
		
		for(int i = 0; i<ku.length; i++){
			
			if(w==id){
				System.out.println("Employee exists");
				exist = true;
				break;
			}
		}
	if(!exist){
		System.out.println("No such employee");
	}	
}
	

}
