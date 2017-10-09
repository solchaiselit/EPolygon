package thread;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 10; i>=0; i --){
			
			System.out.print(i+ " ");
		}
		
	}
	
	

}
