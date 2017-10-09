package polygonCompare;

public class Country implements Comparable<Country> {

	private String name;
	private int area;
	private int population;
	private String continent;
	
		
	public Country(String name, int area, int population, String continent) {
		super();
		this.name = name;
		this.area = area;
		this.population = population;
		this.continent = continent;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
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
		Country other = (Country) obj;
		if (area != other.area)
			return false;
		if (continent == null) {
			if (other.continent != null)
				return false;
		} else if (!continent.equals(other.continent))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", area=" + area + ", population=" + population + ", continent=" + continent
				+ "]";
	}


	@Override
	public int compareTo(Country c) {
		
		return continent.compareTo(c.getContinent());
	}

	
	
}
