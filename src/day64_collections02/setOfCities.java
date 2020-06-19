package day64_collections02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class setOfCities {
	public static void main(String[] args) {
		
		City c1 = new City("Istanbul");
		City c2 = new City("Istanbul");
		City c3 = new City("Istanbul");
		City c4 = new City("Izmir");
		
		
		Set<City> cities = new HashSet<City>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		
		for (City city : cities) {
			System.out.print(city + " | ");
		}
		
		System.out.println();
		
		System.out.println(cities.size());  //2   (Istanbul and Izmir)
		System.out.println(c1.hashCode());  //773781793
		System.out.println(c2.hashCode());  // "
		System.out.println(c3.hashCode());  // "
		System.out.println(c4.hashCode());  // 71159684
		
		System.out.println(c1.equals(c2));  //true
		System.out.println(c2.equals(c3));  //true
		System.out.println(c1.equals(c4));  //false
		
	}

}
