package day64_collections02;

import java.util.*;


public class SortedMapTest {
	public static void main(String[] args) {
		
//		Map
		Map<String, Integer> mapList = new HashMap<>();
		mapList.put("Adam", 90);
		mapList.put("John", 92);
		mapList.put("Mary", 100);
		mapList.put("Jill", 70);
		mapList.put("Zack", 52);
		mapList.put("Dave", 93); 
		
		System.out.println(mapList);
		
//		SortedMap
		SortedMap<String, Integer> sMap = new TreeMap<>(mapList);
		
		System.out.println(sMap);
		
		System.out.println(sMap.firstKey());
		System.out.println(sMap.lastKey());
		System.out.println(sMap.get("Zack"));
		System.out.println(sMap.toString());
		System.out.println(sMap.size());
		
		System.out.println(sMap.keySet());
		
		System.out.println(sMap.entrySet());
		SortedMap<String, Integer> tailview = sMap.tailMap("John");
		System.out.println(tailview);
		
		 
		
	}

}
