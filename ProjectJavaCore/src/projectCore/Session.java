package projectCore;

public class Session implements Comparable<Session>{

	private Movie movie;
	private Time startTime;
	private Time endTime;
	
	
	public Session() {
		super();
	}


	public Session(Movie movie, Time startTime){
		
		super();
		this.movie = movie;
		this.startTime = startTime;
	}
	
	
	public Time getStartTime(){
		
		return this.startTime; 
	}
	
	public void setStartTime(Time time){
		
		this.startTime = time;		
	}
	
	public Movie getMovie(){
		
		return movie;
	}
	
	public void setMovie(Movie movie){
		
		this.movie = movie;
	}
	
	public Time getEndTime(){
		
		int t1  = this.getMovie().getDuration().hoursToMinutes();
		
		int t2 = this.getStartTime().hoursToMinutes();
		
		int t3 = t1+t2;
		
		Time endTime = new Time();
		
		return endTime.minutesToHours(t3); 		
		
	}
	
	
	
//	@Override
//	
//	public String toString(){
//		
//		return "Session: " + movie.toString() + " Start time: " + startTime.toString() +
//				" End time: " + endTime.toString();
//	}


	@Override
	public String toString() {
		return "Session [" + movie + "; Beginning = " + startTime + ", End = " + this.getEndTime() + "]";
	}


	@Override
	public int compareTo(Session o) {
		// TODO Auto-generated method stub
		if(this.getStartTime().hoursToMinutes()<o.getStartTime().hoursToMinutes())
			return -1;
		else if(this.getStartTime().hoursToMinutes()>o.getStartTime().hoursToMinutes())
			return 1;
		else
		return this.getMovie().getTitle().compareTo(o.movie.getTitle());
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
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
		Session other = (Session) obj;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
	
	
	
}
