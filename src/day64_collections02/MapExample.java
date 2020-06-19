package day64_collections02;
import java.util.*;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<String, Double> items = new HashMap<>();
		
		items.put("Apples", 3.50);
		items.put("Flowers", 123.00);
		items.put("egges", 49.0);
		items.put("Bananas", 45.09);
		items.put("Milk", 49.0);
		
		System.out.println(items.size());
		
		System.out.println("Price of Bananas: " + items.get("Bananas"));
		
		System.out.println(items.toString());  //{Apples=3.5, Bananas=45.09, Flowers=123.0, egges=49.0, Milk=49.0}
		System.out.println(items.isEmpty());  //false
		
		items.remove("Milk");
		System.out.println(items.toString());
	
		
		System.out.println("Apples is there? " + items.containsKey("Apples"));  //Apples is there? true
		System.out.println("Milk is there? " + items.containsKey("Milk"));    //Milk is there? false
		
		items.replace("Bananas", 45.09, 1.00);
		
		System.out.println("Price of Bananas: " + items.get("Bananas"));
		
		System.out.println(items.replace("Bananas", items.get("Bananas"), 3.99));
		
		System.out.println(items.toString());  //{Apples=3.5, Bananas=1.0, Flowers=123.0, egges=49.0}
		
		System.out.println("all keys: " + items.keySet()); //all keys: [Apples, Bananas, Flowers, egges]
		
		System.out.println("all values: " + items.values()); //all values: [3.5, 3.99, 123.0, 49.0]
		
		System.out.println("\n.......................\n");
		
		System.out.println("Items and prices:");
		
		for (String eachItem : items.keySet()) {
			System.out.println(eachItem + ": " + items.get(eachItem));
		}
	}

}
