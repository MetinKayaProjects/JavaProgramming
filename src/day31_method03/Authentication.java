package day31_method03;

import java.util.Scanner;

public class Authentication {
	public static void main(String[] args) {
		
		login(null, null);
	
		
		
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
		String validUsername = "mentoring@cybertekschool.com";
		String validpassword = "mentor001";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username: ");
		userName = scan.next();
		System.out.println("Enter password: ");
		password = scan.next();
		if (userName.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validpassword)) {
			System.out.println("Login successful.Welcome to Okta");
		}else {
			System.out.println("Sign in failed!");
		}
		
		
		
	}
	
	

}
