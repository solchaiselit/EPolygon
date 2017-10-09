package except;

public class Methods {

	int a;
	int b;
	
	public Methods(int a, int b)  {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		
		
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int add(){
		
		int sum = a+b;
		return sum;
	}
	
    public int subtract(){
		
		int diff = a-b;
		return diff;
	}
    
    public int multiply(){
    	
    	int product = a*b;
    	return product;
    }

	public double divide(){
		double c = (double) a;
		double v = (double) b;
				
		double ratio = c/v;
		return ratio;
	}
			
	
	
	
	

	
}
