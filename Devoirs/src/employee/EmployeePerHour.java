package employee;

public class EmployeePerHour extends Employee implements Salary {

	private int wagePerHour, hoursPerMonth;
	
	public EmployeePerHour(int wagePerHour, int hoursPerMonth, String name, 
			Position position, double loyaltyCoefficient){
		
		super(name, position, loyaltyCoefficient);
		this.wagePerHour = wagePerHour;
		this.hoursPerMonth = hoursPerMonth;
		}
	
	public void setWagePerHour(int wagePerHour){
		this.wagePerHour = wagePerHour;
		}
	
	public int getWagePerHour(){
		
		return wagePerHour;
	}

	public int getHoursPerMonth() {
		return hoursPerMonth;
	}

	public void setHoursPerMonth(int hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}
	
	public double salary()
	   {
		double monthlyIncome = this.getLoyaltyCoefficient()*this.getHoursPerMonth()
				*this.getWagePerHour();
		System.out.println("The monthly income of " + this.getName()+" is " +monthlyIncome);
		return monthlyIncome;
	   }
	
}
