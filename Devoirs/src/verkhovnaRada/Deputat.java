package verkhovnaRada;

import java.util.Scanner;

public class Deputat extends Person {

	
	private String name; 
	private String surname;
	private int age;
	private int bribeAmount;
	private boolean briber;
	
	public Deputat(int weight, int height, String name, String surname,
			int age, boolean briber) {
		super(weight, height);
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.briber = briber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBribeAmount() {
		return bribeAmount;
	}

	public void setBribeAmount(int bribeAmount) {
		this.bribeAmount = bribeAmount;
	}

	public boolean isBriber() {
		return briber;
	}

	public void setBriber(boolean briber) {
		this.briber = briber;
	}
	
	
	public void giveBribe(){
		if(briber == true){
			System.out.println("Enter bribe amount");
			Scanner scanner = new Scanner(System.in);
			int bribeSum = scanner.nextInt();
			if(bribeSum>5000)
				System.out.println("Police arrests deputat");
			else if(bribeSum <= 0)
				System.out.println("Deputat is not stupid");
			else{
			this.bribeAmount = bribeAmount+ bribeSum; 
			System.out.println("Deputat has gained " +bribeAmount + "$ of bribes.");
			}
		}
		else
			System.out.println("This deputat does not take bribes");
	}

	@Override
	public String toString() {
		return "Deputat [name=" + name + ", surname=" + surname + ", age=" + age + ", bribeAmount=" + bribeAmount
				+ ", briber=" + briber + "]";
	}
	
}
