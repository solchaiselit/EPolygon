package employee;

public class EmployeeFixed extends Employee implements Salary{

	double stavka;
	
	public EmployeeFixed(double stavka, String name, Position position, 
			double loyaltyCoefficient){
		super(name, position, loyaltyCoefficient);
		this.stavka = stavka;
	}
	

	public double salary(){
    	
    	double monthlyIncome = 3000*this.getStavka()*this.getLoyaltyCoefficient();
    	System.out.println("The monthly income of " +this.getName() + " is " + monthlyIncome);
    	
    	return monthlyIncome;
    }
	
	public void setStavka(double stavka){
		
		this.stavka = stavka;
			
	}
	
	public double getStavka(){
		
		return stavka;
	}
	
		
}
