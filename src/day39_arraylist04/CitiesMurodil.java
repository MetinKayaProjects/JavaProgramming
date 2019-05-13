package day39_arraylist04;
import java.util.*;
public class CitiesMurodil {
	public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();    
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
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
        
        //1) FOR EACH: Print each city in same line separated by |
        for(String city : cities) {
        		System.out.print(city + " | ");
        }
        	System.out.println();
        	
        	//2) FOR LOOP: Print each city in same line separated by |
        	for(int i = 0; i < cities.size(); i++) {
        		System.out.print(cities.get(i) + " | ");
        	}
        System.out.println();
        	
        //3) ToString. Print each City all uppercase
        System.out.println(cities.toString().toUpperCase());
        System.out.println(cities);
        
        //4) Make each city all uppercase
        String paris = cities.get(0).toUpperCase();
        cities.set(0, paris);
        System.out.println(cities.get(0));
        
        cities.set(1, cities.get(1).toUpperCase());
        
        for(int j = 0; j < cities.size(); j++) {
        		String city = cities.get(j).toUpperCase();
        		cities.set(j, city);
        }
        
        System.out.println(cities.toString());
        
        
        
        	
        
	}

}
