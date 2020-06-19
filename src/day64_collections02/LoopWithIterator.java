package day64_collections02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LoopWithIterator {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(50); nums.add(100); nums.add(10213); nums.add(150); 
		nums.add(200); nums.add(300); nums.add(3453); nums.add(9876);
		
		
		//Create Iterator Object
		
		Iterator<Integer> it = nums.iterator();
		
		
		// Call hashNext, next methods  // hasNext returns true
		//    							next() returns the value
		
		System.err.println("it.hasNext() -> " + it.hasNext());  //it.hasNext() -> true   //this is for the first one  (50)
		
		System.out.println("it.next() -> " + it.next());  //it.next() -> 50
		System.out.println("it.next() -> " + it.next());  //it.next() -> 100
		System.out.println("it.next() -> " + it.next());  //it.next() -> 10213
		
		
		//use a while loop
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");   //150 | 200 | 300 | 3453 | 9876 | 
		}
		
		System.out.println();
		
		Iterator<Integer> it2 = nums.iterator();
		//When using Iterotor to loop though a collection,
		//we can use remove objects while looping
		
		while(it2.hasNext()) {
			int val = it2.next();
			if (val > 100) {
				it2.remove();
			}
		}
		System.out.println(nums.toString());
	
		for (int num : nums) {
			if (num > 200) {
				nums.remove(new Integer(num));
			}
			System.out.print(num + " | ");
		}
		System.out.println();
		
		List<String> cities = new ArrayList<String>();
		cities.add("Ankara");
		cities.add("Bursa");
		cities.add("Istanbul");
		cities.add("Izmir");
		
		for (String city : cities) {
			if (city.equals("Ankara")) {
				cities.remove(city);
			}System.out.println(city.toString());   //Iterator dosn't allow to remove... Its difference from forEach loop
		}
		
		
		
	}

}
