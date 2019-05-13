package day11_logical_nestefif;

import java.util.Scanner;

public class LogInTests {
	public static void main(String[] args) {
	
		/*using Scanner ask for 
		String username;
		String password;
		
		String validUserName = "cybertec@mail.com";
		String validPassword = "WoodenSpoon123";
		
		Conditions:
		1) username = validUserName				  2) username != validUserName
		   password = password						 password != password
		   print "Login Successful, Welcome"		 print "Invalid Username and Invalid Password"
		   
				   
		3) username  == validUserName			 4) username != validUserName
		   password != password						password  == password
		   print "Invalid Password" 				print "Invalid Username"
		   
		*/
		
		String username;
		String password;
		
		String validUserName = "cybertec@mail.com";
		String validPassword = "WoodenSpoon123";
		
		System.out.println("Enter Username: ");
		
		Scanner input = new Scanner(System.in);
		username = input.next();
		
		System.out.print("Enter Password: ");
		password = input.next();
		
		
		if(username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) { //codition 1
			System.out.println("Login Successful, Welcome");
		}else if(!username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) { // cond 2
			System.out.println("Invalid Username and Invalid Password");
		}else if(username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) { //cond3
			System.out.println("Invalid Password");
		}else if (!username.equalsIgnoreCase(validUserName) && password.equals(validPassword)){ //cond4
			System.out.println("Invalid Username");
		}
		
		
		
	}
}
