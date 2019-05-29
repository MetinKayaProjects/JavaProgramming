package day50_inheritance03;

public class SlackChannel {
	public static void main(String[] args) {
		SlackUser su = new SlackUser("Nadir");
		AdminUser au = new AdminUser("Florian");

		su.sendAMessage("This Thursday, topic is Jira");
		au.sendAMessage("Thank you");

	}

}
