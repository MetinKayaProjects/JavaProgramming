package day50_inheritance03;

public class AdminUser extends SlackUser {  //child class that extends mother class

	public AdminUser(String name) {
		super(name);
	}

	public void sendAMessage(String message) {
		// System.out.println("@Channel");
		System.out.println(getName() + " is sending a message <" + message + ">");
		// name is private in the SlackUser class, so we can anly call it by getName()
	}

}
