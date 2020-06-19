package day64_collections01;

import java.util.*;


public class SortedSetTest {
	public static void main(String[] args) {
		
		SortedSet<Integer> sList = new TreeSet<Integer>();
		
		List<Integer> myList = new ArrayList<>();
		
		myList.addAll(Arrays.asList(40, 11, 3, 3, 76, 99, 5, 11));
		
		System.out.println("myList: " + myList);
		
		myList.sort(null);
		System.out.println("sorted myList: " + myList);
		
		sList = new TreeSet<Integer>(myList);
		System.out.println("sList: " + sList);
		
		System.out.println("sList.first(): " + sList.first()  +"   "  + "sList.last():" + sList.last());
		
		System.out.println(sList.subSet(11, 76));
		System.out.println(sList.headSet(40));
		System.out.println(sList.tailSet(40 ));
		
	}

}
