package day56_abstraction_02_2;

import day56_abstraction_02.Chrome;

public class TestPhone {
	public static void main(String[] args) {

//	Phone ph = new Phone(); //// Phone is an abstract class. We cannot create any object in the abstract class!
//	Mobile mb = new Mobile(); // Mobile is an abstract class. We cannot create any object in the abstract class!

	Nokia nokia = new Nokia("Vodafone"); //Nokia is not an abstracted class. We can create objects in it.
//	Chrome c = new Chrome(null, 0);
	
	nokia.text("Welcome...");
	nokia.takePicture();
	nokia.call();
	System.out.println(nokia.hasTouchScreen());
	nokia.providerName = "Verizone";
	System.out.println("providerName has changed with: " + nokia.providerName);
	
}
	
}
