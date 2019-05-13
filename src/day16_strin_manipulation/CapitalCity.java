package day16_strin_manipulation;

public class CapitalCity {
	public static void main(String[] args) {
		String str = "Moskow is a capital of Russia";
		//Baku, Azerbaijan
		
		str = str.replace("Moskow" , "Baku");
		
		System.out.println(str);//Baku is a capital of Russia
		
		str = str.replace("Russia", "Azerbaijan");
		
		System.out.println(str); // Baku is a capital of Azerbaijan
		
		
		
		
		//2nd way
		str = str.replace("Moskow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		
		
		String email = "metinkaya@gmail.com";
		String company = "capitalone";
		
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
		
	}

}
