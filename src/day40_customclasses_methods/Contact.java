package day40_customclasses_methods;

public class Contact {
	String name;
	String phoneNumber; // tirnak icinde olursa inte gerek yok
	String email;

	
	public void name() {
		System.out.println("My name is " + name);
	}
	
	
	public void call() {

		System.out.println("Calling " + name + " .....");

	}

	public void sendMessage() {

		System.out.println("Sending message to " + phoneNumber + " |name: " + name);

	}

	public void sendEmail() {

		System.out.println("Sending email to " + email + " .....");

	}

}
