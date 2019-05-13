package day24_array_Vasyl;

public class Cities {
	public static void main(String[] args) {
		
		String[] cities = {"Washington D.C.", "Kiev", "Annandale", 
							"Moscow", "Istanbul", "Baku", "Miami", "Silver Spring", "McLean"}; 
						//// size of the array is [9]; 
		
		System.out.println(cities.length); //9
		
		System.out.println("******************");
		
		//TASK: print all cities that start with M
		String citiesStartsWithM = "";
		for(int i=0; i<cities.length; i++) {
			if(cities[i].startsWith("M")) {
				//System.out.println(cities[i]);
				citiesStartsWithM += cities[i] + ", ";
			}
		}
		citiesStartsWithM = citiesStartsWithM.substring(0, citiesStartsWithM.length()-2);
		System.out.println("Cities starts with M: " + citiesStartsWithM);
		
		
		System.out.println("*******new method for same result");
		
		for(String city: cities) {
			if(city.startsWith("M")) {
			System.out.println(city);
			}
		}
		
	}

}
