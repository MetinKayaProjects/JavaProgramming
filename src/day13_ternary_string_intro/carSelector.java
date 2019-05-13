package day13_ternary_string_intro;

import java.util.Scanner;


public class carSelector {
	public static void main(String[] args) {
		
		System.out.println("Which type of car you are interested in? Please enter its number:");
		System.out.println("1)American\n2)Japanese\n3)German\n4)Italian\n5)Korean");
				
		Scanner scan = new Scanner(System.in);
		int carType = scan.nextInt();  //1 to 5
		double averagePrice = 0.0;
		String carOptions = null;
		String carOrigin = null;
		
		switch(carType) {
			case 1:
				averagePrice = 33000;
				carOrigin = "American";
				carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
				break;
			case 2:
				averagePrice = 32000;
				carOrigin = "Japanese";
				carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
				break;
			case 3:
				averagePrice = 55000;
				carOrigin = "German";
				carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
				break;
			case 4:
				averagePrice = 85000;
				carOrigin = "Italian";
				carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
				break;
			case 5:
				averagePrice = 25000;
				carOrigin = "Korean";
				carOptions = "Kia, Hyundai, Daewoo";
				break;
			default:
				System.out.println("Car type not available");
		return;
		}
		System.out.println("You selected " + carOrigin + " car and your options are " + carOptions + ".");
		System.out.println("Average Price: " + averagePrice);
		
		//"You selected American car and your options are Ford, Dodge, Tesla, Chevrolet, Lincoln."
		//"Average Price: 33000"
	}

}
