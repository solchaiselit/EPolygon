package projectCore;

public class TimeValidator implements Validator {

	@Override
	public Time validate (Object object) throws Exception {
		
//		Time time = (Time) object;
		
		Time enteredTime = new Time();
		
		boolean rightTime = false;
		boolean rightInput = false;
		
		int hours = 0;
		int min = 0;
		
		Main.scanner.nextLine();
		
		while(!rightTime || !rightInput){
		
		try{
			
			hours = Integer.parseInt(Main.scanner.nextLine());
			min = Integer.parseInt(Main.scanner.nextLine());
		
			
			 rightInput = true;
			
			 enteredTime = new Time(hours,min);
			
			 if(enteredTime.getMin()<0 || enteredTime.getHour()<0){
					throw new TimeExceptions(ValidationMessages.NEGATIVE);
				}
				else if(enteredTime.getMin()>60){
					throw new TimeExceptions(ValidationMessages.LARGE_MINUTE);
				}
				else if(enteredTime.getHour()>24){
					throw new TimeExceptions(ValidationMessages.LARGE_HOUR);
				}
				
				rightTime = true;
			 
			}
			catch (NumberFormatException e) {
		    
			System.out.println("WRONG INPUT EXCEPTION");
			System.out.println("Try again: ");
			}
			catch(TimeExceptions e){
				System.out.println(e.getMessage());
				System.out.println("Try again: ");
			}	
		
	};

	return enteredTime;
	}
}
