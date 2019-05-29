package day44_encapsulate_constructor;

public class Email {
	private String message;
	//add a constructor
	public Email(String message) {
		System.out.println("Sending email with message: "+ message);
		this.message = message;
		
	}

}
