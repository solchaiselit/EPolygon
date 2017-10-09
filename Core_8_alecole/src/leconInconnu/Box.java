package leconInconnu;

public class Box <T extends Number>{

	private T sum;

	public Box(T sum) {
		super();
		this.sum = sum;
	}

	public T getSum() {
		return sum;
	}

	public void setSum(T sum) {
		this.sum = sum;
	}
	
	
	
}
