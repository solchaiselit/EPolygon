package projectCore;

public class Movie {

	private String title;
	private Time duration;
	
	
	
	public Movie() {
		super();
	}

	public Movie(String title, Time duration){
		
		super();
		this.title = title;
		this.duration = duration;
	}
	
	public String getTitle(){
		
		return this.title; 
	}
	
	public void setTitle(String title){
		
		this.title = title;
		
	}
	
	public Time getDuration(){
		
		return duration;
	}
	
	public void setDuration(Time duration){
		
		if(duration.hoursToMinutes()>300)
			System.out.println("The movie is too long");
		
		else
		this.duration = duration;
		
	}
	
	@Override
	public String toString(){
		
		return "Movie title = " + title + "; duration = " + duration.getHour() + 
				" hr " + duration.getMin() + " min";  
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Movie other = (Movie) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}
