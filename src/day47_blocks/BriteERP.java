package day47_blocks;

import java.time.LocalDate;

public class BriteERP {

	static {  //aoutomatially run at first
		System.out.println("Launch Browser");
		System.out.println("Navigate to: " + TestData.url);
	}

	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}

	public static void enterPAssword() {
		System.out.println("enter password: " + TestData.password);
	}
	public static void verifyLogin() {
		System.out.println("Expected name: " + TestData.username);
		System.out.println("Actual name displayed: Victoriia Lugovska");
		System.out.println("Login successful - " + LocalDate.now());  //comes from LocalDate.now() class
		
		
	}
}
