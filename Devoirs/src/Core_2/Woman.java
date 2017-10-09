package Core_2;

public class Woman {
    
	private String name;
	
	public Woman(String name){
		super();
		this.name = name;
	}
		
	private Job job;
	private Gold gold;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Gold getGold() {
		return gold;
	}
	public void setGold(Gold gold) {
		this.gold = gold;
	}
	
	
	
	
}
