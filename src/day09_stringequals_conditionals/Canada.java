package day09_stringequals_conditionals;

import java.util.Scanner;


public class Canada {
	
	public static void main(String[] args) {
		
		/* ask user " What is the capital of Canada"
		and using scanner assign the value to capital variable.
		
		Check the answer is correct.
		If correct>> "Your answer is correct"
		
		If is not correct >> "Your answer is incorrect! Value is not capital of Canada
		*/
		
		String capitalCity, capitalCityReal;
		System.out.println("What is the capital of Canada");
		Scanner keyboard = new Scanner(System.in);
		capitalCity = keyboard.next();
		
		capitalCityReal = "Ottowa";
		
			
		//if(capitalCity.equals(capitalCityReal)) {      //     Dikkat == ile tanimlarsan hata verebilir.
			if(capitalCity.equalsIgnoreCase("Ottowa")) {  // bu sekilde de tanimlayabilirdik.
			System.out.println("Your answer is correct");
		}else {
			System.out.println("Your answer is incorrect! "+ capitalCity+ " is not capital of Canada");
		}
		
		
	}

}
