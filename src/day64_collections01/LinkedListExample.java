package day64_collections01;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(50);
		list.add(77);
		
		System.out.println(list.toString());//[50, 77]
		System.out.println(list.get(0)); //50
		System.out.println(list.get(1)); //77
		
		//LinkedList
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(11);
		list2.add(33);
		list2.add(99);
		
		System.out.println(list2.toString());//[11, 33, 99]
		System.out.println(list2.get(0)); //11
		
		System.out.println(list2.getFirst()); //11
		System.out.println(list2.getLast()); //00
		
		list2.addFirst(1);
		list2.addLast(111);
		
		System.out.println(list2.toString());//[1, 11, 33, 99, 111]
		
		list2.addFirst(3);
		list2.addFirst(5);
		System.out.println(list2.toString());//[5, 3, 1, 11, 33, 99, 111]
		
		list2.addAll(list); //[5, 3, 1, 11, 33, 99, 111]  +  50, 77]
		System.out.println(list2);//[5, 3, 1, 11, 33, 99, 111, 50, 77]
		
		list2.add(77);
		System.out.println(list2.toString());//[5, 3, 1, 11, 33, 99, 111, 50, 77, 77]  allows dublication... 77 and 77
		
		
		
		
		
	}

}
