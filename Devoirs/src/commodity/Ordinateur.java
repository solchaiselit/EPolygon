 package commodity;

public class Ordinateur implements Comparable<Ordinateur> {

	private String brand;
	private int price;
	
	public Ordinateur(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
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
		Ordinateur other = (Ordinateur) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ordinateur [brand=" + brand + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Ordinateur o) {
		// TODO Auto-generated method stub
		if(this.price>o.price){
			return 1;
		}
		else if(this.price<o.price){
			return -1;
		}
		else
		{
		return this.brand.compareTo(o.getBrand());
		}
	}
	
	
	
}
