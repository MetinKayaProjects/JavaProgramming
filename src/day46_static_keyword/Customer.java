package day46_static_keyword;

public class Customer {
	
	private String name;  //instance variables. cannot be shared, private
	private String email;
	
	static int count;  //static yazinca sanki int constructorlarda da tanimlaniyor.
	
	//getter and setter:
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
//	toString:
	
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	
	//constructor -1 no args name : "undefined    email: "undifined"
	
	public Customer() {
		this.name = "undefined";  //in this method since we have no args we can assign name and email without this
		this.email = "undefined";
		count++;
//		name = name;
//		email = email;
		
//		setName(name);     //this is also welcome
//		setEmail(email);
	}
	
	
	//constructor-2   2 args
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
		count++;
		
//		setName(name);       this is also welcome
//		setEmail(email);
	}
	

}
