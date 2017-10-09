package service;


public class Time {

	
	private int hour;
	private int min;
	
	boolean rightMin = false;
	
	
	public Time(int hour, int min){
		
		super();
			
		this.hour = hour;
		
		this.min = min;
		
	}
	
	
	
	public int getHour(){
		
		return hour;
		
	}
	
	public int getMin(){
		
		return this.min;
	}
	
	public void setHour(int hour){
		if(hour > 0 && hour < 24)
		this.hour = hour;
		else System.out.println("wrong input for hours");
	}
	
	public void setMin(int min){
		
		if(min > 0 && min < 60)
			this.min = min;
			else System.out.println("wrong input for minutes");
	}
	
	public int hoursToMinutes(){
		
		int min = this.getHour()*60+this.getMin();
		return min;
		
	}
	
	public Time minutesToHours(int min){
		
		Time time = new Time(min/60,(min%60));
		
		return time;
	}

	
	
	public Time() {
		super();
	}

	@Override
	public String toString(){
		
//		if(hour==1)
//		return Integer.toString(hour) + " hour " + Integer.toString(min) + " min";
//		else
//			return Integer.toString(hour) + " hours " + Integer.toString(min) + " min";
		
		if(min<10)
			return Integer.toString(hour) + ":" + "0" + Integer.toString(min);
		else
			return Integer.toString(hour) + ":" + Integer.toString(min);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		return true;
	}
	
	
}
