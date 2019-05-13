package day13_ternary_string_intro;

public class MoreTernary {
	public static void main(String[] args) {
		
		String quality = "good";
		int rating = (quality.equals("good")) ? 100 : 0; 
		
		
		System.out.println("Raating: " +rating); //Raating: 100 yazdirir
		
		int PMhour = 6;
		// Rush hour during evening: 4 - 7
		boolean rushHour;
		rushHour = (PMhour >= 4  && PMhour <= 7) ? true : false;
		
		System.out.println(PMhour + " is rush hour? --" + rushHour); // true verir. cunki 6 girdik
		
		
		//2nd way
		String result = PMhour + " is rush hour? --" + rushHour;
		System.out.println(result);
		
		//3rd way
		result = PMhour + " is rush hour? " + rushHour;
		result = (rushHour == true) ? "yes" : "no";
		//System.out.println(PMhour + " is rush hour? --" + rushHour);
		System.out.println(result); //yes. cunki yukaruda 6 girmistik 
		
		int AMHour = 11; // 6-9
		String amRushHour = (AMHour >= 6 && AMHour <= 9) ? "Yes" : "No";
		
		System.out.println(AMHour + " is rush hour? --" + amRushHour);
	}

}
