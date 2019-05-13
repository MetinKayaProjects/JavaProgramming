package day31_method03;

public class AuthenticationFromScanner {
	public static void main(String[] args) {
		
		login("mentoring@cybertekschool.com", "mentor001");
	
		
		
	}
	/*
	 Name : Login
	 Return type : void
	 2 String args/params : username, passsword
	 Inside the method:
	 	validusername = "mentoring@cybertekschool.com"
	 	validpassword = "mentor001"
	 	
	 if username and password match, print"Login successful.Welcome to Okta"
	 if not: "Sign in failed!" 
	 */
	
	public static void login(String userName, String password) {
		String validUsername1 = "mentoring@cybertekschool.com";
		String validpassword = "mentor001";
		if (userName.equalsIgnoreCase(validUsername1) && password.equalsIgnoreCase(validpassword)) {
			System.out.println("Login successful.Welcome to Okta");
		}else {
			System.out.println("Sign in failed!");
		}
		
		
		
	}
	
	

}
