package lecon_10;

public class Pie implements Comparable<Pie> {

	private String name;
	private int price;
	public Pie(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
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
		Pie other = (Pie) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pie [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Pie inPie) {
		// TODO Auto-generated method stub
		if(this.price > inPie.getPrice()){
			return 1;
		}else if(this.price < inPie.getPrice()){
			return -1;
		}else{
			return name.compareTo(inPie.getName());
		}
		
//		return this.price - inPie.getPrice();
		
//		return name.compareTo(inPie.getName());
	
	}
	
	
	
	
}
