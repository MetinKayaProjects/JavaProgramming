package day64_collections02;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {
	public static void main(String[] args) {
		
		Map<String, String> dataMap = new HashMap<String, String>();
		
		dataMap.put("url", "qa.vytrack.com");
		dataMap.put("username", "user156");
		dataMap.put("browser", "chrome");
		dataMap.put("driver", "Alex");
		dataMap.put("salaesmanager", "Orhan");
		
		
		//keySet -> returns set with all keys in the map
		//values -> returns list with all the values in the map
		
		for(String key : dataMap.keySet()) {
			System.out.print(key + " | ");
		}
		
		System.out.println();
		
		for(String value : dataMap.values()) {
			System.out.print(value + " | ");
		}
		
		System.out.println();
		System.out.println();
		
		
		for(String key : dataMap.keySet()) {
			
				System.out.println(key + ":  " + dataMap.get(key));
				
		}
	}

}
