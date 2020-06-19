package day04_primitives_operators;

public class CitiesTogether {
	
	public static void main(String[] args) { //bu satir, main yazinca kisayolda cikiyor
		
		//Declare 3 String variables
		//city1
		//city2
		//city2
		// assign values: 
		//Tashkent
		//Kyiv
		//Moskow
		
		//Print:
		//From Tashkent to Kyiv is $500
		//From Moskow to Tashkent is $550
		//I have been to Tashkent, Moskow, Kyiv
		
		String city1="Tashkent";
		String city2="Kyiv";
		String city3="Moskow";
		
		
		System.out.println("From "+city1+ " to "+city2 + " is $500,");
		System.out.println("From "+city3+ " to "+city1 + " is $550,");
		System.out.println("I have been to " +city1+ ", "+city3 + ", " +city2 + ".");
		
		System.out.println("============================ ");//araya bos bir satir koymak icin
		
		//ayni lineda yazmak icin:
		System.out.print("From "+city1+ " to "+city2 + " is $500, ");
		System.out.print("From "+city3+ " to "+city1 + " is $550, ");
		System.out.println("I have been to " +city1+ ", "+city3 + ", " +city2 + ".");
		
		System.out.println("============================ ");//araya bos bir satir koymak icin
		
		String app = "Slack"; //buraya "WhatsUp" yazarsak Print: WhatsUp cikar
		//We use <Slack> for messaging with Classmates.
		System.out.println("We use " +app+ " for messaging with Classmates.");
		
		String app1 = "Skype and Slack";
		System.out.println("We use " +app1+ " for messaging with Classmates.");
		System.out.println("We use " +"\""+ app1+ "\"" + " for messaging with Classmates.");
		

	}
}
