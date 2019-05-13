package day39_arraylist04;

import java.util.ArrayList;
import java.util.List;

public class Cities {
	public static void main(String[] args) {

//		creat a city list

		List<String> cities = new ArrayList<String>();
		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");

		System.out.println(cities.toString());
		System.out.println();
		System.out.println(cities.size()); // 15
		System.out.println();
//		1. FOR EACH: Print each city in same line separated by |
		System.out.println("1. FOR EACH: Print each city in same line separated by | ");
		for (String city : cities) {
			System.out.print(city + " | ");
		}

		System.out.println();

//		2. FOR LOOP:
		System.out.println("\n2. FOR LOOP: ");

		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i).toUpperCase() + " | ");
		}

		System.out.println();

//		3.toString. Print each city all uppercase
		System.out.println("\n3.toString. Print each city all uppercase\n");
		cities.toString().toUpperCase();
		System.out.println("3: " + cities.toString().toUpperCase());

//		4.MAke each city all uppercase
		System.out.println("\n4.MAke each city all uppercase");
		System.out.println("Exmp: paris");
		String paris = cities.get(0).toUpperCase();
		cities.set(0, paris);
		System.out.println("paris converted to : " + cities.get(0));
		cities.set(1, cities.get(0).toUpperCase());
		
		for (int i = 0; i < cities.size(); i++) {
			cities.set(i, cities.get(i).toUpperCase());
		}
		System.out.println("4: " + cities);

		System.out.println();

		System.out.println("find the longest city:");
//		find the longest city:
		String longestCity = cities.get(0);
		for (String city : cities) {
			if (city.length() > longestCity.length()) {
				longestCity = city;
			}
		}
		System.out.println("longestCity: " + longestCity);

		

		System.out.println();
		System.out.println("find the shortest city");
		String shortestCity = cities.get(0);
		for (String city : cities) {
			if (city.length() < shortestCity.length()) {
				shortestCity = city;
			}
		}
		System.out.println("shortestCity: " + shortestCity);
		
		System.out.println();
		
		ArrayList<String> citiesMoreThan6 = new ArrayList<String>();
//		assign all cities that have more than 6 chars to this arrayList
		for(String ct6 : cities) {
			if (ct6.length() > 6) {
				citiesMoreThan6.add(ct6);
				
			}
		}System.out.println("citiesMoreThan6Chars: "+ citiesMoreThan6.toString());
		

	}

}
