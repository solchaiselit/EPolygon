package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		
		
//		Factory factory = new Factory("gmc", Arrays.asList(
//				new Auto("mazda", new Engine(100)), 
//				new Auto("lada", new Engine(3)),
//				new Auto("suzuki", new Engine(130)), 
//				new Auto("jeep cherokee", new Engine(550)),
//				new Auto("bmw", new Engine(300))));
//		
//		int maxPower = 0;
//		int minPower = factory.getAutos().get(0).getEngine().getPower();
//		Auto minAuto =factory.getAutos().get(0);
//		Auto maxAuto =factory.getAutos().get(0);
//		
//		
//		
//		for(Auto a: factory.getAutos()){
//			
//			if(a.getEngine().getPower() > maxPower){
//				
//				maxPower = a.getEngine().getPower();
//				maxAuto = a;
//			}
//			if(a.getEngine().getPower() < minPower){
//				minPower = a.getEngine().getPower();
//			    minAuto = a;
//			}
//			
//		}
//		
//		int temp1 = maxPower;
//		int temp2 = minPower;
//		
//		Auto tempAuto1;
//		Auto tempAuto2;
//		
//		for(Auto r: factory.getAutos()){
//			
//			if(r.equals(minAuto))
//				r.getEngine().setPower(maxPower);
//			
//			if(r.equals(maxAuto))
//				r.getEngine().setPower(minPower);
//			
//				
//		}
//		
//		System.out.println(factory.getAutos().toString());
//		

		Person person = new Person("antonio", 32, "banderas", 70);
		
		Class ref = person.getClass();
		
		System.out.println(ref.getSuperclass().getSimpleName() +"\n");
		
		System.out.println();
		
		Field[] fields = ref.getDeclaredFields();
				
		System.out.println("FIELDS: "  +"\n");
				for (Field field: fields){
					
					System.out.println(field.getType());
				}
				
		Method [] methods = ref.getDeclaredMethods();
		
		System.out.println("METHODS:" +"\n");
	
		for(Method method: methods){
			
			System.out.println(method.getName());
		}
		
		Constructor [] constructors = ref.getDeclaredConstructors();
		
		System.out.println("CONSTRUCTORS:" +"\n");
		
		for(Constructor c: constructors){
			
			System.out.println(c);
		}
		
		Class [] classes = ref.getInterfaces();
		
		System.out.println("CLASSES:"  +"\n");
		
		for (Class c: classes) {
	        System.out.println(c);
		}
		
		Person newPerson = (Person) ref.newInstance();
		
		System.out.println(newPerson);
		System.out.println(person);
		
		Field field = ref.getDeclaredField("name");
		
		field.setAccessible(true);
		
		field.set(person, "petro");
		
		field.setAccessible(false);
		
		System.out.println(person);
		
	}

}
