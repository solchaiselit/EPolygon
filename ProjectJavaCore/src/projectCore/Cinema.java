package projectCore;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class Cinema {
	
	

	static Time timeOpen = new Time(8,00);
	static Time timeClose = new Time(24,00);
	
	static Time breakTime = new Time(0,10);
	
	static int timeForBreak = breakTime.hoursToMinutes();
	
	Schedule schedule = new Schedule(new TreeSet<Session>());
	
	
	Map<Days,Schedule> map = new TreeMap<>();
	
	
	Cinema(){
		
		for(Days d: Days.values()){
			
			map.put(d, new Schedule());	
			
		}
		
		
	}
	
	Set<Entry<Days,Schedule>> entrySet = map.entrySet();
	
	boolean play = true;
	
	public void start() throws Exception{
	
	while(play==true){
		
		System.out.println(
				  "Enter 1 to add a movie; "
				+ "Enter 2 to add a session; "
				+ "Enter 3 to remove a movie;\n "
				+ "Enter 4 to remove a session; "
				+ "Enter 5 to sort movies by name; "
				+ "Enter 6 to sort movies by duration;\n "
				+ "Enter 7 to show schedule by day;"
				+ "Enter 8 to show weekly schedule; "
				+ "Enter 9 to update information;\n "
				+ "Enter q to exit; " 
				);
		
		String key = Main.scanner.next(); 
		
		switch(key){
		
		case "1": {			
			addMovie();
			break;
		}
		
		case "2": {
			
			addSession();
		 	break;
		}
		
		case "3": {
			
			removeMovie();
			break;
		}

		case "4": {
			
			removeSession();
			break;
		}

		case "5": {
			sortMoviesByName();
			break;
		}

		case "6": {
			sortMoviesByDuration();
			break;
		}

		case "7": {
			showScheduleByDay();
			break;
		}
		
		case "8": {
			showWeeklySchedule();
			break;
		}
		
		case "9": {
		
			updateInfo();
			break;
		}
		
		case "q": {
			
			play = false;
			break;
			
		}
		
		default: {
			
			break;
		}
		
		}
		
	}
		
	}
	
	public void addMovie() throws Exception{

		System.out.println("Enter movie title: ");
		
		String name = Main.scanner.next();
		

		System.out.println("Enter movie duration (hours, minutes): ");

		Time time = timeValidate();
		
		Movie movie = new Movie(name, time);
		
		Main.movieList.add(movie);
		
		
		
		Schedule scheduleSpecificMovie = new Schedule();
		
		System.out.println("Add sessions for this movie? (y or n)");
		
		String add = Main.scanner.next();
		
		switch(add){
		
		case "y":{
			
			boolean endSessions = false;
			
			boolean dayExist = false;
			
			Days pickDay = returnDay();
			
			System.out.println("Enter number of sessions for this movie: ");
			
			int numberSessions = Main.scanner.nextInt();
			
			
			Time startTime = new Time();
			
			for(int i = 1; i<numberSessions+1; i++){
				
				System.out.println("Enter start time for session # " + i + " (hours, min):");
				
				
				startTime = timeValidate();
				
				int m = startTime.hoursToMinutes();
				
				if(checkSpot(movie,startTime, pickDay)){
					Session session = new Session(movie,startTime);
					map.get(pickDay).getSet().add(session);
					scheduleSpecificMovie.getSet().add(session);
				}				
			}
				
			while(endSessions==false){	
			
					
					System.out.println("Enter another day for this schedule? (y or n)");
					
					String anotherDay = Main.scanner.next();
					
					switch(anotherDay){
					
					case "y":{
					
						Days pickAnotherDay = returnDay();
						
						map.get(pickAnotherDay).getSet().addAll(scheduleSpecificMovie
								.getSet());
						
						endSessions = false;
						break;
					}
					
					case "n":{
						
						endSessions=true;
						break;
					}
					
					default: {
						
						break;
					}
					}
			}
					
					break;
				}
			}
			
			}
			
			
	
	
	public void addSession() throws Exception {
		
		System.out.println("Enter movie name");
		
		String movieName = Main.scanner.next();
		
		if(!checkForMovie(movieName))
			System.out.println("No such movie");
		else{
			
			Days weekDay = returnDay();
			
			System.out.println("Enter start time (hours, minutes): ");
		
			Time startTime = timeValidate();
						
			if(checkSpot(returnMovie(movieName), startTime, weekDay)){
				
				map.get(weekDay).getSet().add(new Session(returnMovie(movieName),startTime));
				
			};
			
		}
			

	}


	public void removeMovie(){
	
			System.out.println("Enter movie name");
			
			String movieName = Main.scanner.next();
			
			if(!checkForMovie(movieName)){
				
				System.out.println("No such movie");			
			}
			
			else{
				
			
				
				Movie movie = new Movie();
				
				movie = returnMovie(movieName);
				
				
				
				for(Entry<Days, Schedule> entry: entrySet){
					
					Iterator it = entry.getValue().getSet().iterator();
					
						while(it.hasNext()){
							
							Session s = (Session) it.next();
							
							if(s.getMovie().equals(movie))
								it.remove();
							
//							if(entry.getValue().getSet().contains(s) g contains())
//								it.remove();
	
							}
						}
					
				}
			

	}

	public void removeSession() throws Exception{
	
		System.out.println("Enter movie name");
		
		String movieName = Main.scanner.next();
		
		if(!checkForMovie(movieName))
			System.out.println("No such movie");
		else{
			
			Days weekDay = returnDay();
			
			System.out.println("Enter start time (hours, minutes): ");
			
			
			Time startTime = timeValidate();
			
			Session session = new Session(returnMovie(movieName),startTime);
			
			boolean exists = false;
			
			 for(Schedule sch: map.values()){
				 
				 for(Session s: sch.getSet()){
					 
					 if(s.equals(session)){
						 
						 sch.getSet().remove(session);
						 
						 exists = true;
					
						 break;
					 }
					 if(exists)
						 break;
				 }
				 
			 }
			 
			 if(!exists)
				 System.out.println("No such session");
				
			};
			
			
			
			
		}
		


	public void sortMoviesByName(){
	

	}

	public void sortMoviesByDuration(){
	

	}

	public void showScheduleByDay(){
	

	}


	public void showWeeklySchedule(){
	
		System.out.println("Schedule for the week:\n");
		
		for(Entry<Days,Schedule> e: entrySet){
			
			System.out.println(e.getKey().toString() + " " +

				map.get(e.getKey()).toStringOverridden().toString());  
		}

	}


	
	public void updateInfo(){
	

	}
	

	@Override
	public String toString() {
		return "Cinema [map=" + map + "]";
	}


	public boolean checkSpot(Movie movie, Time startTime,Days d){
		
		boolean exists = false;
		
		int m = startTime.hoursToMinutes();
		
		if(m<Cinema.timeOpen.hoursToMinutes()){
			exists = true;
			System.out.println("The cinema is not open yet");
			}
		else if(m+movie.getDuration().hoursToMinutes()>timeClose.hoursToMinutes()){
			exists=true;
			System.out.println("The cinema is closed already");
		}
		else{
		for(Session s: map.get(d).getSet()){
			
			int beginCurrent = s.getStartTime().hoursToMinutes();
			int endCurrent = s.getEndTime().hoursToMinutes();
			if((m >= beginCurrent && m <= (endCurrent+timeForBreak)) ||
					(m + movie.getDuration().hoursToMinutes()<= (endCurrent+timeForBreak)) 
					&& (m + movie.getDuration().hoursToMinutes()>=beginCurrent)){
				
				System.out.println("This time spot is already taken");
				exists = true;
			}
		
	
				
				
	}
		
		}
		return !exists;
	}
	
	
	public Days returnDay(){
		
		boolean dayExist = false;
		
		Days pickDay = Days.FRIDAY;
		
		while(dayExist==false){

			System.out.println("Enter day of the week for this movie schedule");
			String weekDay = Main.scanner.next();				
			
			for(Days d: Days.values()){
				
				if(weekDay.equalsIgnoreCase(d.name())){
					
					pickDay = d;
		
					dayExist = true;
				}
					
			}
			}
		
		return pickDay;
	}
	
	
	
	public boolean checkForMovie(String name){
		
		boolean exists = false;
		
		 for(Schedule sch: map.values()){
			 
			 for(Session s: sch.getSet()){
				 
				 if(s.getMovie().getTitle().equalsIgnoreCase(name)){
					 
					 exists = true;
				
					 break;
				 }
				 if(exists)
					 break;
			 }
			 
		 }
		
		return exists;
	}
	
	
	public boolean checkForSession(Session session){
		
		
		boolean exists = false;
		
		 for(Schedule sch: map.values()){
			 
			 for(Session s: sch.getSet()){
				 
				 if(s.equals(session)){
					 
					 exists = true;
				
					 break;
				 }
				 if(exists)
					 break;
			 }
			 
		 }
		
		return exists;
	}
	
	public Movie returnMovie(String name){
		
		boolean exists = false;
		
		Movie movie = new Movie();
		
		 for(Schedule sch: map.values()){
			 
			 for(Session s: sch.getSet()){
				 
				 if(s.getMovie().getTitle().equalsIgnoreCase(name)){
					 
					 movie = s.getMovie();
					 				 
					 exists = true;
				
					 break;
				 }
				 if(exists)
					 break;
			 }
			 
		 }
		
		return movie;
	}
	
	public Time timeValidate() throws Exception{
		
		TimeValidator tv = new TimeValidator();
		
		Time t = new Time(-1,0);

		t = tv.validate(t);
		
		return t;
	}
	
	
}