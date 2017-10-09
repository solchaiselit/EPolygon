package Core_2;

public class Life {

	public void date(Man man, Woman woman, Gold gold){
		  
		if(!man.getGold().equals(null)){
	      woman.setGold(man.getGold());
	      man.setMoney(man.getMoney()-man.getGold().getPrice());
	      man.setGold(null);
	      	      
	      System.out.println("The woman now has gold and the man has only "
	      		+ man.getMoney() + " dollars");
		}else{
		
		  man.setMoney(man.getMoney()-gold.getPrice());
		  man.setGold(gold);
		  System.out.println("The man now has only " + man.getMoney()
		  + " dollars");
		}
	}
	
	public void getJob(Job job, Man man){
		
		man.setJob(job);
		man.setMoney(man.getMoney()+job.getPayment());
	}
	
}
