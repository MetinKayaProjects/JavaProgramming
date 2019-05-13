package day06_operators2;

import java.util.Scanner;

public class PlateMumbers {
	
	public static void main(String[] args) {
		
		String city;
		int plateNumber;
		
		
		Scanner cityname = new Scanner(System.in);
		System.out.println("What is the name of your city? ");
		city = cityname.next();
		
		System.out.println("What is the plate number? ");
		Scanner plateno = new Scanner(System.in);
		plateNumber = plateno.nextInt();
		if (plateNumber!=34) {
			System.out.println("The plate you have entered is not correct! Please try again.");
			return;
		}
		
		System.out.println("Your city is " +city + " and the plate number is " + plateNumber);
		
	}

}
