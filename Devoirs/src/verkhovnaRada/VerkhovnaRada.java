package verkhovnaRada;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class VerkhovnaRada {

	List<Fraction> rada = new ArrayList<>();
	private String name;
	
	Scanner scanner = new Scanner(System.in);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VerkhovnaRada(String name) {
		super();
		this.name = name;
	}

	public VerkhovnaRada(List<Fraction> rada) {
		super();
		this.rada = rada;
	}
	
	public VerkhovnaRada() {
		super();
	}

	public List<Fraction> getRada() {
		return rada;
	}

	public void setRada(List<Fraction> rada) {
		this.rada = rada;
	}


	public void addFraction(){
		
		System.out.println("Enter the name of the fraction");
		rada.add(new Fraction(scanner.next()));
	}
	
	public void addDeputatToFraction(){
		System.out.println("Enter the name of fraction");
		int ind = -1;
		String fractionName = scanner.next();
		for(Fraction frac: rada){
			if(frac.getFractionName().equalsIgnoreCase(fractionName)){
				ind = rada.indexOf(frac);
				break;
			}
		}
		if(ind!=-1)
		rada.get(ind).addDeputat();
		else
			System.out.println("No such Fraction");
	}
	
	public void removeFraction(){
		System.out.println("Enter name of fraction to be removed");
		ListIterator<Fraction> it = rada.listIterator();
		String fractionToRemove = scanner.next();
		boolean deleted = false;
		while(it.hasNext() && deleted == false){
			if(it.next().getFractionName().equalsIgnoreCase(fractionToRemove)){
			it.remove();	
			deleted = true;
			}
			if(deleted == false)
				System.out.println("No such fraction");
		}
	}
	
	public void viewFractions(){
		ListIterator<Fraction> it = rada.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public void clearFraction(){
		System.out.println("Enter the name of fraction to be cleared");
		String toClear = scanner.next();
		boolean exists = false;
		for(Fraction frac: rada){
			if(frac.getFractionName().equalsIgnoreCase(toClear)){
				exists = true;
				frac.clearFraction();
				break;
			}
		}
		if(exists == false)
			System.out.println("No such fraction");
				
		
	}
	
	public void viewOneFraction(){
		System.out.println("Enter the name of fraction");
		String FractionName = scanner.next();
		boolean exists = false;
		for(Fraction frac: rada){
			if(frac.getFractionName().equalsIgnoreCase(FractionName)){
				exists = true;
				frac.viewDeputats();
				break;
			}
		}
		if(exists == false)
			System.out.println("No such fraction");
	}
	
	public void removeDeputyFromFraction(){
		System.out.println("Enter the name of fraction");
		String fractionName = scanner.next();
//		System.out.println("Enter the surname of deputy to be removed");
//		String deputyName = scanner.next();
		boolean fracExists = false;
//		boolean depExists = false;
		for(Fraction frac: rada){
			if(frac.getFractionName().equalsIgnoreCase(fractionName)){
				fracExists = true;
				frac.removeDeputat();
				break;
			}
		}
		if(fracExists == false)
			System.out.println("No such fraction");
	}
	
	public void viewBribersByFraction(){
		System.out.println("Enter the name of fraction");
		String FractionName = scanner.next();
		boolean exists = false;
		for(Fraction frac: rada){
			if(frac.getFractionName().equalsIgnoreCase(FractionName)){
				exists = true;
				frac.viewBribers();
				break;
			}
		}
		if(exists == false)
			System.out.println("No such fraction");
	}
	
	public void viewBiggestBriber(){
		int maxBribe = 0;
		String maxName = "";
		String maxSurname = "";
		for(Fraction frac: rada){
			for(Deputat dep: frac.getDeputats()){
				if(dep.isBriber() && dep.getBribeAmount()>maxBribe){
					maxBribe = dep.getBribeAmount();
					maxName = dep.getName();
					maxSurname = dep.getSurname();
				}
			}
			
		}
		System.out.println("The biggest briber in Rada is " +maxName +" " + maxSurname);
	}
	
	public void bribeDeputat(){
		System.out.println("Enter deputat's name and surname");
		String name = scanner.next();
		String surname = scanner.next();
		boolean exists = false;
		for(Fraction frac: rada){
			for(Deputat dep: frac.getDeputats()){
				if(dep.getName().equalsIgnoreCase(name) 
						&& dep.getSurname().equalsIgnoreCase(surname)){
					frac.bribeDeputat(name, surname);
					exists = true;
					break;
				}
			}
			if(exists == true)
				break;
		}
		if(exists == false)
			System.out.println("No such deputat");
	}
	
	
}
