package day40_customclasses_methods;

import day09_stringequals_conditionals.Canada;

public class MyContact {
	public static void main(String[] args) {
		//create contact object
		Contact Ahmet = new Contact();
		
		Ahmet.name = "Ahmet Efe";
		Ahmet.phoneNumber = "572-987-99-76";
		Ahmet.email = "ahmetefe@gmail.com";
		
//		System.out.println("Name: " + contact1.name);
//		System.out.println("PhoneNumber: " + contact1.phoneNumber);
//		System.out.println("email: " + contact1.email);
		
		Ahmet.name();
		Ahmet.call();
		Ahmet.sendMessage();
		Ahmet.sendEmail();
		System.out.println("Hi " + Ahmet.name 
				+ " your phoneNumber is: " +Ahmet.phoneNumber 
				+ " and your email account is " + Ahmet.email);
		
		System.out.println("---- ----- ----");
		//create new pobject
		
		Contact orhan = new Contact();
		
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "876-345-333";
		orhan.email = "orhansultanov@gmail.com";
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		System.out.println();
		
		System.out.println("Name: " + orhan.name);
		System.out.println("PhoneNumber: " + orhan.phoneNumber);
		System.out.println("email: " + orhan.email);
		
		
		
	}

}
