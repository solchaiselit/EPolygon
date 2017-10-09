package nestedClass;

public class OuterClass {

	private String name;
	
	public class MemberClass{
		
		public void memberClassMethod(){
			
			name = "some";
			System.out.println("in member class");
		}
	}
	
	
	public MemberClass createMemberClass(){
		
		return new MemberClass();
	}
	
	public Object createMemberClassMethod(){
		
		class LocalClass{
			
			public void localClassMethod(){
				System.out.println("in local class");
			}
		}
		return new LocalClass();
	}
	
	public Object createAnonymousClass(){
		
		return new Object(){
			
		};
		
	}
	
}
