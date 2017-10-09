package paging;

public class Comodity {
	 private String name;
	    private int price;
	    private int weight;

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        Comodity comodity = (Comodity) o;

	        if (price != comodity.price) return false;
	        if (weight != comodity.weight) return false;
	        return !(name != null ? !name.equals(comodity.name) : comodity.name != null);

	    }

	    @Override
	    public int hashCode() {
	        int result = name != null ? name.hashCode() : 0;
	        result = 31 * result + price;
	        result = 31 * result + weight;
	        return result;
	    }

	    @Override

	    public String toString() {
	        final StringBuffer sb = new StringBuffer("{");
	        sb.append("name='").append(name).append('\'');
	        sb.append(", price=").append(price);
	        sb.append(", weight=").append(weight);
	        sb.append('}');
	        return sb.toString();
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public int getWeight() {
	        return weight;
	    }

	    public void setWeight(int weight) {
	        this.weight = weight;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Comodity(String name, int price, int weight) {

	        this.name = name;
	        this.price = price;
	        this.weight = weight;
	    }
}
