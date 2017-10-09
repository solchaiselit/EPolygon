package exceptions2;

public class Method {

	int a;
	int b;
	public Method(int a, int b) {
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
	
	public void add(){
		
		System.out.println(a+b);
	}
	
	public void divide (){
		
		float c = (float) a;
		float d = (float) b;		
		
		System.out.println(c/d);
	}
	
}
