package leconInconnu;

public class Person <T, O extends Number> {

	private T name;
	private O age;
	
	
	
	public Person(T name, O age) {
		super();
		this.name = name;
		this.age = age;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public O getAge() {
		return age;
	}
	public void setAge(O age) {
		this.age = age;
	}
	
	public void addPerson(){
		
		
	}
	
}
