package day44_encapsulate_constructor;

public class Outlook {
	
	public static void main(String[] args) {
		
		//Email email = new Email(); //not compile
		//Email email = new Email(123); //not compile
		Email email = new Email("Hello; how is it going?");
		
	}

}
