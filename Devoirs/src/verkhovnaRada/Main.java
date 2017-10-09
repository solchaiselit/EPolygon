package verkhovnaRada;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner scanner = new Scanner(System.in);
	  Fraction BPP = new Fraction("BPP");
	  
	  VerkhovnaRada VR = new VerkhovnaRada("VR");
	 
	  int k = 0;
	  
	  do{
	  
	  System.out.println("\n Press: 1 to add deputat; 2 to view members of the fraction; "
			  		+ "3 to remove deputat;\n 4 to view the bribers of this fraction; "
			  		+ "5 to see the biggest briber of the fraction; 6 to clear the fraction;"
			  		+ "\n 7 to bribe deputat; 8 to add a fraction; 9 to exit this menu;"
			  		+ "\n 10 to add deputat to a fraction; 11 to view the list of fractions; "
			  		+ "12 to remove a fraction" +"\n 13 to clear a fraction; "
			  				+ "14 to view members of a fraction; 15 to remove a deputy from a fraction"
			  				+ "\n 16 to view list of bribers by fraction; 17 to see the biggest briber;"
			  				+ "18 to bribe a deputat");
		  
	  int enteredOption = Integer.parseInt(scanner.next().replaceAll("[^0-9]", "8"));  
	  switch(enteredOption){
	  
	  case 1: {BPP.addDeputat();
	  			break;
	  }
	  
	  case 2: {BPP.viewDeputats();
	  			
	  			break;
	  }
	  
	  case 3: {BPP.removeDeputat();
	  			
	  			break;
	  }
	  
	  case 4:{
		    BPP.viewBribers();
		    break;
	  }
	  
	  case 5: {
		     
		    BPP.getBiggestBriber();
		    break;
	  }
	  
	  case 6:{
		  BPP.clearFraction();
		  break;
	  }
	  
//	  case 7: {
//		  BPP.bribeDeputat(String name, String surname);
//		  break;
//	  }
	  
  
	  case 8: {
		        VR.addFraction();
		        break;
	  }
	  
	  case 9: { k = -1;
      System.exit(0);
	  }
	  
	  case 10: {
		        VR.addDeputatToFraction();
		        break;
		  
	  }
	  
	  default:   {
		        break; 
	  }
	  
	  case 11: {
		  VR.viewFractions();
		  break;
	  }
	  
	  case 12: {
		  VR.removeFraction();
		  break;
	  }
	  
	  case 13: {
		  VR.clearFraction();
		  break;
	  }
	  
	  case 14: {
		  VR.viewOneFraction();
		  break;
	  }
	  
	  case 15: {
		  VR.removeDeputyFromFraction();
		  break;
	  }
	  
	  case 16: {
		  VR.viewBribersByFraction();
		  break;
	  }
	  case 17: {
		  VR.viewBiggestBriber();
		  break;
	  }
	  
	  case 18: {
		  VR.bribeDeputat();
		  break;
	  }
	  
	  }
	  }while(k==0);
	  
//	  if(k!=0)
//	  System.out.println(BPP.getDeputats().get(0).toString());
	  
	 scanner.close();
	  
	}
	

}
