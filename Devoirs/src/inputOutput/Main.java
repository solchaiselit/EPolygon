package inputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);
	
	public static String fileName = "dataBase";
	
    
	public static FileWriter fw() throws IOException{
		
		FileWriter fw = new FileWriter(fileName, true);
		
//		fw.close();
		
		return fw;
		
		
	}
   	
	public static FileReader fr() throws IOException {
		
     	FileReader fr = new FileReader(fileName);
		return fr;
	}
	
	public static BufferedReader br() throws IOException {

		BufferedReader br = new BufferedReader(fr());

		return br;
	}
	
//	public static String readLine() throws IOException {
//		
//		return br().readLine();
//	}
	
//	public static List<Employee> some() throws FileNotFoundException{
//		
//		 FileReader fr = new FileReader("DataBase");
//		return null; 
//	}
//	public static File file = new File("DataBase");
	
	public static ArrayList<Employee> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		DataBase dataBase = new DataBase();
		
		
		
//		BufferedWriter bw = null;
//        FileWriter fw = null;
//        
//       
//        FileReader fr = null;
//        BufferedReader br = null;
//        
        
		
		dataBase.start();
		
		
//		if(bw!=null)
//		bw.close();
//			
//		if(fw!=null)
//		fw.close();
//			
//		if(br!=null)
//		br.close();
//			
//		if(fr!=null)
//		fr.close();
		
		
		}
		
		
		
		
			
//		Double.parseDouble(" ");

		
	

}
