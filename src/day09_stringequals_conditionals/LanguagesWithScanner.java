package day09_stringequals_conditionals;

import java.util.Scanner;

public class LanguagesWithScanner {
	public static void main(String[] args) {
		
				
		System.out.println("Please enter an option between 1 and 6: ");
		
		Scanner keyboard = new Scanner(System.in);
		int option = keyboard.nextInt();
		/*
		 * 1 => English
		 * 2 => Spanish
		 * 3 => French
		 * 4 => Turkish
		 * 5 => Russian
		 * 6 => Greek
		 */
		if(option == 1) {
			System.out.println("Hello!");
		}else if(option == 2) {
			System.out.println("Hola!");
		}else if(option == 3) {
			System.out.println("Bonjour!");
		}else if(option == 4) {
			System.out.println("Merhaba!");
		}else if(option == 5) {
			System.out.println("Privet!");
		}else if(option == 6) {
			System.out.println("Yiasou!");
		}
		
		
		/*
		 * 
		 * if(option == 1) {
			System.out.println("Hello!");
		}
		
		if(option == 2) {
			System.out.println("Hola!");
		}
		
		if(option == 3) {
			System.out.println("Bonjour!");
		}
		
		if(option == 4) {
			System.out.println("Merhaba!");
		}
		 */
		
		
		
		
	}

}
