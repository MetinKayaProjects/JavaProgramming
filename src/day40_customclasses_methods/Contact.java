package day40_customclasses_methods;

public class Contact {
	//instance variables (which are declared in the class but outside of the any method:
	String name;
	String phoneNumber; // tirnak icinde olursa int degil String
	String email;

	/*
	 * behaviour | instance methods:
			call
			sendMessage
			sendEmail

	 */
	public void name() {
		System.out.println("My name is " + name);
	}
	
	
	public void call() {

		System.out.println("Calling " + name + " by the phoneNumber: " + phoneNumber +" .....");

	}

	public void sendMessage() {

		System.out.println("Sending message to " + phoneNumber + " |name: " + name);

	}

	public void sendEmail() {

		System.out.println("Sending email to " + email + " .....");

	}


	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	

}
