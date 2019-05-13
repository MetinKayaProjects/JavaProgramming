package day28_multid_arrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		
		//read all data and assign to array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		//"FastFoodRestaurants.csv")) ---> converted to toArray(new String[0]);
		
		System.out.println("Data size: " + data.length);  //Data size: 10001 (rows)
	
		//print first row (first restaurant:
		System.out.println("First line: "+ data[0]);  //address,city,name,postalCode,province,websites
		System.out.println("First restaurant: " + data[1]);
		
		//last restaurant
		System.out.println("Last restaurant in the list: " + data[data.length-1]);
		
		//print each Restaurant information in separate line
		int counter = 1;
		for (String restaurants : data) {           //for each  (enhanced for) method   
			System.out.println("#" +counter + "=>" + restaurants);
			counter++;
		}
		
		//print all restaurant information in state of Virginia. Also count it
		int counterVA = 1;
		for(String restInVa : data) {
			if(restInVa.contains(",VA,")) {
				
				System.out.println("# "+ counterVA + "-> Restaurants in VA: " + restInVa);
			counterVA++;
			}
		}System.out.println("The number of VA restaurants: " + (counterVA-1));  //cunki counter++ en son toplama 1 ekliyor
		
		
		//print the restaurant names in VA along with city name, exp Subway - Herndon
	
//		address			city			name		postalCode		province		websites
//		resArr[0]	  resArr[1]	     resArr[2]		resArr[3]		resArr[4]		resArr[5]
		for(String res : data) {
			if(res.contains(",VA,")) {
				String [] resArr = res.split(",");
				
				System.out.println(resArr[2] + " - " + resArr[1]);
								
			}
		}
		
		
		
	}

}
