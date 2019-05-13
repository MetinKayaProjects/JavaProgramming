package day12_switch_ternary;

import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {
		
		/*
		 sunny-> "Go to Park"
		 		"Code Java"
		 hot -- "Go swimming"
		 		"Code Java"
		 windy--"Fly a kite"
		 		"Code Java"
		 rainy--"Go shopping"
		 		"Code Java"
		 snow-- "Chain your tyres"
		 		"Go skiing"
		 		"Code Java"
		 Default:
		 	"Code Java in any other weather"
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How  is the weather today?");
		
		String weather = scan.next().toLowerCase(); // girilen kelimeyi lower case cevirir
								//  .toUpperCase();    hepsini Upper Case cevirir
		
		switch(weather) {
			case "sunny":
				System.out.println("Go to Park\nCode Java");
			 //	System.out.println("Code Java");
			 	break;
			case "hot":
				System.out.println("Go swimming\nCode Java or sleep");
			 	System.out.println("Code Java");
			 	break;
			case "windy":
				System.out.println("Fly a kite");
			 	System.out.println("Code Java");
			 	break;
			case "rainy":
				System.out.println("Go shopping");
			 	System.out.println("Code Java");
			 	break;
			case "snow":
				System.out.println("Chain your tyres");
				System.out.println("Go skiing");
			 	System.out.println("Code Java");
			 	break;
			default:
				 	System.out.println("Code Java in any other weather");
				 	break;
				
		}
		System.out.println("************End of the program***************");
		
	}

}
