package inputOutput;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DataBase {

	String fileName = Main.fileName;
	
	public void start() throws IOException {
		
		
		
		boolean work = true;  
		
		while(work==true){
			
			System.out.println("Press 1 to show data; Press 2 to find employee by id number; Press 3 to remove employee"
					+ " by id number;\n Press 4 to add new employee; Press 5 to update information; Press 6 to sort DB entries"
					+ "\n Press 7 to exit menu");
			
			String key = Main.scanner.next();
			
			switch(key){
			
			case "1":{
				
				showData();
				break;				
			}
			
			case "2":{
				
				findById();
				break;
			}
				
			
			case "3": {
				
				removeById();				
				break;
			}
			
			case "4": {
				
				add();
				break;
			}
			
			case "5": {
				
				update();
				break;								
			}
			
			
			case "6": {
				
				sort();
				break;				
			}
			
			case "7": {
				
				work = false;
				break;
			}
			
			default: {
				
				System.out.println("Wrong input");
				break;
			}
			
			}

		}

	}
	
	public void showData() throws IOException{
		
		String tmp;
		

		
//		FileReader fr = new FileReader(fileName);
//		
//		BufferedReader br = new BufferedReader(fr);
		
		BufferedReader br = Main.br();
		
		while((tmp = br.readLine())!=null){
			System.out.println(tmp);
		}
	}
	
	public void findById() throws IOException{
		
				
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("Enter id");
		int id = Main.scanner.nextInt();
		String tmp;
		
		boolean exist = false;
											
		while((tmp = br.readLine())!=null){
			
			String [] ku = tmp.split("id=");
			int w =  Integer.parseInt(ku[1].substring(0, ku[1].indexOf(',',0)));
			
			if(w==id){
				System.out.println("Employee exists:\n" +tmp);
				exist = true;
				break;
			}
		}
		if(exist == false){
			System.out.println("No such employee");
		}	
	}
	
	public void removeById() throws IOException{
		
		System.out.println("Enter id number");
		
		boolean exists = false;
		int id = Main.scanner.nextInt();
		
		Main.fw();
		
		
		BufferedReader br = Main.br();
		
				/////Start looking if such id exists
		String tmp;
		
		ArrayList<Integer> idList = new ArrayList<>(); 
		
			//// Create List of IDs
		while((tmp = br.readLine())!=null){
			
			String [] ku = tmp.split("id=");
			int w =  Integer.parseInt(ku[1].substring(0, ku[1].indexOf(',',0)));
			idList.add(w);
		}


		///// Check if entered id is in the list
		
		if(!idList.contains(id)){
			System.out.println("ID does not exist");	
		}else
		{
		
//		System.out.println("loop1 passed");
		
		int indexOfId = idList.indexOf(id);
		
		   /// Go through the data base again searching for the line with that id
		
		FileWriter fw1 = new FileWriter("temp");
		BufferedReader br2 = new BufferedReader(new FileReader(fileName));
	
		String tmp1;
		int indexOfLine = 0;
		Main.list.clear();
		
//		System.out.println("Index od id: " + indexOfId);
		
		while((tmp1=br2.readLine())!=null){
//			System.out.println("Index of Line: " + indexOfLine);
//			System.out.println("line: " +tmp1);
			if(indexOfLine!=indexOfId){
				fw1.write(tmp1 + "\n");
				fw1.flush();
			}
			
			indexOfLine =indexOfLine+1;
			
		}
				
		  //// write temp into filename
		
		String tmp3;
		BufferedReader br1 = new BufferedReader(new FileReader("temp"));
		FileWriter fw3 = new FileWriter(fileName);
		
		while((tmp3=br1.readLine())!=null){
			
			fw3.write(tmp3+ "\n");
			fw3.flush();
		}
		
			br.close();
			br1.close();
			br2.close();
		    fw1.close();
		    fw3.close();
		}
	}
	
	public void add() throws IOException{
		
		FileWriter fw = new FileWriter(fileName,true);
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
				
		System.out.println("Enter id, first name, and last name");
		
		int id = Main.scanner.nextInt();
		String firstName = Main.scanner.next();
		String lastName = Main.scanner.next();
				/////Start looking if such id exists
		String tmp;
		
		ArrayList<Integer> idList = new ArrayList<>(); 
		
			//// Create List of IDs
		while((tmp = br.readLine())!=null){
			
			String [] ku = tmp.split("id=");
			int w =  Integer.parseInt(ku[1].substring(0, ku[1].indexOf(',',0)));
			idList.add(w);
		}

		br.close();
		///// Check if entered id is in the list
		
		while(idList.contains(id)){
			
			System.out.println("ID already exists. Enter another id:");
			id = Main.scanner.nextInt();
		}
	//// Now add employee
			
			Employee employee = new Employee(id, firstName, lastName);

			fw.write(employee.toString()+"\n");
		
		    fw.close();
		    
	}
	
	
	public void update() throws IOException{
		
		Map<Integer, EmployeeInfo> map = new TreeMap<>();		
		
		System.out.println("Enter id, new first name, and new last name");
		
		int enteredId = Main.scanner.nextInt();
		String newFirstName = Main.scanner.next();
		String newLastName = Main.scanner.next();
		
		
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		String tmp;
		
			while ((tmp=br.readLine())!=null){
			
			String [] stringArray = tmp.split("=");
			
			int id = Integer.parseInt(stringArray[1].split(",")[0]);
			String firstName = stringArray[2].split(",")[0];
			String lastName = stringArray[3].split("]")[0];
			
			EmployeeInfo ei = new EmployeeInfo(firstName,lastName);
			
			map.put(id, ei);
			
		}
			boolean exists = false;
			
			System.out.println("map to string: " +map.toString());
	 
			FileWriter fw = new FileWriter(fileName);
			
				EmployeeInfo newInfo = new EmployeeInfo(newFirstName,newLastName); 
								
				
				Set<Entry<Integer,EmployeeInfo>>  set = map.entrySet();
				
				System.out.println("set to string: " + set.toString());
				
				for(Entry<Integer,EmployeeInfo> e: set){
					    
						if(e.getKey()==enteredId){
							exists = true;
							map.replace(enteredId, map.get(enteredId), newInfo);
														
						}
						fw.write(e.toString()+ "\n");
				}

			if(!exists)
				System.out.println("no such id");
				
			br.close();
			fw.close();
		
		
	}
	
	
	
	
	
	public void sort() throws IOException{
		
		Main.list.clear();
		
//		int id = Main.scanner.nextInt();
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader (fr);
		
		String tmp;
		
		while ((tmp=br.readLine())!=null){
			
			String [] stringArray = tmp.split("=");
			
			int id = Integer.parseInt(stringArray[1].split(",")[0]);
			String firstName = stringArray[2].split(",")[0];
			String lastName = stringArray[3].split("]")[0];
			
			Employee employee = new Employee(id,firstName,lastName);
			
			Main.list.add(employee);
		}
		
				////Look to see if such an id exists
//		Boolean exists = false;
		
//		for(Employee e: Main.list){
//			if(e.getId()==id){
//				exists = true;
//				break;
//			}
//							
//		}
//		
//		if(exists ==false)
//			System.out.println("No such id");
	
			System.out.println("Enter: 1 to sort by id; 2 to sort by first name; "
					+ "3 to sort by last name");
			
			int key = Main.scanner.nextInt();
			
			switch(key){
			
			case 1:{
				Main.list.sort(new SortById().thenComparing(new SortByLastName()).thenComparing(new SortByFirstName()));
				break;
			}
			
			case 2: {
				Main.list.sort(new SortByFirstName().thenComparing(new SortByLastName()).thenComparing(new SortById()));
				break;
			}
			
			case 3: {
				Main.list.sort(new SortByLastName().thenComparing(new SortByFirstName()));
				break;
			}
			
			default: {
				
				System.out.println("Wrong input");
				break;
			}
			
			}
			
			FileWriter fw = new FileWriter(fileName);
			
			for(Employee e: Main.list){
				
				fw.write(e.toString()+"\n");
			}
			
			br.close();
			fw.close();
			
	
		
	
	}
	
//	public void update() throws IOException{
//		
//		Map<Integer, EmployeeInfo> map = new TreeMap<>();		
//		
//		System.out.println("Enter id, new first name, and new last name");
//		
//		int enteredId = Main.scanner.nextInt();
//		String newFirstName = Main.scanner.next();
//		String newLastName = Main.scanner.next();
//		
//		
//		
//		FileReader fr = new FileReader(fileName);
//		BufferedReader br = new BufferedReader(fr);
//		
//		String tmp;
//		
//			while ((tmp=br.readLine())!=null){
//			
//			String [] stringArray = tmp.split("=");
//			
//			int id = Integer.parseInt(stringArray[1].split(",")[0]);
//			String firstName = stringArray[2].split(",")[0];
//			String lastName = stringArray[3].split("]")[0];
//			
//			EmployeeInfo ei = new EmployeeInfo(firstName,lastName);
//			
//			map.put(id, ei);
//			
//		}
//			boolean exists = false;
//			
//			System.out.println("map to string: " +map.toString());
//	 
//			FileWriter fw = new FileWriter(fileName);
//			
//				EmployeeInfo newInfo = new EmployeeInfo(newFirstName,newLastName); 
//								
//				
//				Set<Entry<Integer,EmployeeInfo>>  set = map.entrySet();
//				
//				System.out.println("set to string: " + set.toString());
//				
//				for(Entry<Integer,EmployeeInfo> e: set){
//					    
//						if(e.getKey()==enteredId){
//							exists = true;
//							map.replace(enteredId, map.get(enteredId), newInfo);
//														
//						}
//						fw.write(e.toString()+ "\n");
//				}
//
//			if(exists == false)
//				System.out.println("no such id");
//				
//			br.close();
//			fw.close();
//		
//		
//	}
	
}


