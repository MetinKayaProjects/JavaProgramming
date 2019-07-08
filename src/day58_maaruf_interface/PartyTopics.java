package day58_maaruf_interface;

public class PartyTopics {
	
	public void discuss(Person person) {
		System.out.println("this guys is: "+ person.getOccupation());
		System.out.println("annually this person makes: "+ person.getIncome());
		System.out.println("makes money by: "+ person.getWork());
	}
}