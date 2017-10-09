package reflection;

import java.util.List;

public class Factory {

	private String name;
	private List<Auto> autos;
	public Factory(String name, List<Auto> autos) {
		super();
		this.name = name;
		this.autos = autos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Auto> getAutos() {
		return autos;
	}
	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
	
	
}
