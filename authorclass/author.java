package assignment;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	
	//Constructor
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
				
	}
	
	//we can change only email
	public boolean setEmail(String theEmail){
		if(theEmail.length()==0){
			return false;
		}
		email=theEmail;
		return true;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public char getGender(){
		return gender;
	}
	
    
    public String toString(){
		return (name+" ("+gender+") " +"at " +email);
	}

}