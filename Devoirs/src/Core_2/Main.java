package Core_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Job job = new Job ("driver", 12000);
		Gold gold = new Gold (2000);
		Man man = new Man ("Anton", 500);
		Woman woman = new Woman ("Ira");
		
		Life life = new Life();
		man.setGold(gold);
		
		life.getJob(job,man);
		life.date(man, woman, gold);
		
//		life.date(man,woman, gold);
		
		
	}

}
