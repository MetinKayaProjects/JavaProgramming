package day23_array_Vasyl;

import java.util.Scanner;

public class BruteForce1 {
	public static void main(String[] args) {
		
		//after 5 attempts username or password is still incorrect brake the program
		
		String expectedUserName = "admin";
		String expectedPassword = "admin123";
		String userName = "";
		String password = "";
		int attempts = 5;
		Scanner input = new Scanner(System.in);
		
		do {
			if(attempts ==0) {
				System.out.println("Yo have exceeded number of attempts");
				System.out.println("This user has been deactivated");
				return;
			}
			attempts--;
			System.out.println("Please enter username: ");
			userName = input.next();
			
			if(!userName.equals(expectedUserName)) {
				System.out.println("Wrong username");
				System.out.println("Attempts left:" + attempts);
				continue;
			}
			System.out.println("Please enter password: ");
			password = input.next();
			if(!password.equals(expectedPassword)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left:" + attempts);
				continue;
			}
			
		} while (!userName.equals(expectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login successful!");
	
		
	}

}
