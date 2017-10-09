package User;

public class User {

	private String userName;
	private String password;
	
	
	public User(){
		
	};
	
	
	public User(String userName, String password){
		
		super();
		this.userName = userName;
		this.password = password;
		
	}
	
	public void setUserName(String userName){
		
		if(!userName.equals("cul")){
			System.out.println("That's a bad name");
		}else
		 this.userName = userName;
				
	}
	
	public String getUserName(){
		
		return userName;
	}
	
	public void setPassword(String password){
		
		if(this.userName.equals(null)){
			
		}else
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	
	@Override
	public String toString(){
		return("The username is " +userName + ", and the password is " +password);
	}
	
	
}
