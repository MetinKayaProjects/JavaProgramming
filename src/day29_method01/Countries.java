package day29_method01;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {
		/*
		create 2 countriesArray
		
		USA	Washington DC
		Canada		Ottawa
		Mexico		Mexico city
		Brasil		Brasilia
		Peru		Lima
		Argentina	Boanes Aeros
		Bolivia		La Paz
		Macedonia	Scopia
		Kazakhstan	Nursultan
		 */
		String[][] countriesArray = {	{"USA","Washington DC"},    //0
										{"Canada", 	"Ottawa"},		//1
										{"Mexico","Mexico city"},	//2
										{"Brasil","Brasilia"},		//3
										{"Peru", "Lima"},			//4
										{"Argentina", "Boanes Aeros"},//5
										{"Bolivia","La Paz"},			//6
										{"Macedonia","Scopia"},			//7
										{"Kazakhstann","Nursultan"}	};	//8
		
		//String[][] countriesArray = new String[9][2];
		//    		  countriesArray [0][0] ==> USA
		
		// print USA w/ capital:
		
		System.out.println(countriesArray[0][0] + " " + countriesArray[0][1]); //USA Washington DC
		
//		"Kazakhstann","Nursultan"
		
		System.out.println(countriesArray[8][0] + " " + countriesArray[8][1]);  //Kazakhstann Nursultan
		
		System.out.println(Arrays.deepToString(countriesArray));
//		[[USA, Washington DC], [Canada, Ottawa], [Mexico, Mexico city], [Brasil, Brasilia], [Peru, Lima], [Argentina, Boanes Aeros], [Bolivia, La Paz], [Macedonia, Scopia], [Kazakhstann, Nursultan]]
		
		
		//only countries in same line separeated by |
	
		System.out.println("*** only countries in same line separeated by | ***");
		for(int i = 0; i < countriesArray.length; i++) {
		System.out.print(countriesArray[i][0] + " | ");
//		USA | Canada | Mexico | Brasil | Peru | Argentina | Bolivia | Macedonia | Kazakhstann | 
		
		}
		System.out.println();
		
		
		for(String[] country : countriesArray) {
			System.out.print(country[0] + " | ");
//			USA | Canada | Mexico | Brasil | Peru | Argentina | Bolivia | Macedonia | Kazakhstann | 
			
		}
		
		System.out.println();
		//only capital cities in same line separeated by /
		System.out.println(" *** only capital cities in same line separeated by / ***");
		
		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][1] + " / ");
//			Washington DC / Ottawa / Mexico city / Brasilia / Lima / Boanes Aeros / La Paz / Scopia / Nursultan / 
		}
		
		System.out.println();
		for(String[] capital : countriesArray) {
			System.out.print(capital[1] + " / ");
//			Washington DC / Ottawa / Mexico city / Brasilia / Lima / Boanes Aeros / La Paz / Scopia / Nursultan / 
		}

		
		System.out.println("\n*** NEW TASK *** ");
		//get all the capitals and add to capitals[] array
		//declare cities array and size needs to match countries Array size 
		
		String[] capitals = new String[countriesArray.length];
		System.out.println(Arrays.toString(capitals));  //[null, null, null, null, null, null, null, null, null]
														// since we didint assign it
		for (int i = 0; i < countriesArray.length; i++) {
			capitals [i] = countriesArray[i][1];
		
		}
		System.out.print(Arrays.toString(capitals));
//		[Washington DC, Ottawa, Mexico city, Brasilia, Lima, Boanes Aeros, La Paz, Scopia, Nursultan]
		
		System.out.println();
		System.out.println("\n*** Country == Capital city ***");
		//look for Bolivia in the countriesArray and test if capital city is "La Paz"
		
		for (int i = 0; i < countriesArray.length; i++) {
			if (countriesArray[i][0].equals("Bolivia")) {
				//System.out.println(countriesArray[i][1]);
				if(countriesArray[i][1].equals("La Paz")) {
					System.out.println("Bolivia Test is PASSED");
				}else {
					System.out.println("Bolivia Test is FAILED");
				}
				break;  //exit the loop.... after finding Bolivia stop to check the rest.
			}
		}
		
		
		
	}

}
