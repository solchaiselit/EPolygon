package projectCore;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Schedule implements Comparable<Schedule>{

	private TreeSet<Session> set = new TreeSet<>();
	

	public Schedule() {
		super();
	}

	public Schedule(TreeSet<Session> set) {
		super();
		this.set = set;
	}

	public TreeSet<Session> getSet() {
		return set;
	}

	public void setSet(TreeSet<Session> set) {
		this.set = set;
	}

	
	public void addSession(){
		
//		System.out.println("Enter movie title and duration (hours, minutes): ");
//		String title = Main.scanner.next();
//		int durationHour = Main.scanner.nextInt();
//		int durationMin = Main.scanner.nextInt();
//		
//		System.out.println("Enter movie start time (hour, min): ");
//		
//		int startHour = Main.scanner.nextInt();
//		int startMin = Main.scanner.nextInt();		
//		
//		Session session = new Session(new Movie(title, 
//				new Time(durationHour,durationMin)), 
//				new Time(startHour, startMin));
//		
//		set.add(session);
			
//		System.out.println("ADDED TO SCHEDULE");
		

	}
	
	
	public void removeSession(){
		
		
	}
	
	
	public List<String> toStringOverridden(){
		
		
		List<String> toStringArray = new ArrayList<>();
		
		
		
		//		String toStringArray[] = new String[set.size()];
		
//		set.toArray();
		
		//		int i=0;
		
//		for(int i = 0; i<set.size(); i++){
//			
//		}

				for(Session s: set){
			
					toStringArray.add("\n       " + s.toString()); 
					
		}
		
		return toStringArray;
		
	}
	
	@Override
	public String toString() {
		
		
		
		return "Schedule {" + set + "}";
	}

	@Override
	public int compareTo(Schedule o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
}
