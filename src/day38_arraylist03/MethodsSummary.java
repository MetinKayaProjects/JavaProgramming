package day38_arraylist03;

import java.util.*;

public class MethodsSummary {
	public static void main(String[] args) {

	List<String> list1 = new ArrayList<String>();
	list1.add("red");
	list1.add("Blue");
	list1.add("white");
	list1.add("grey");
	list1.add("black");
//	add method with index: "yelow will be replaced index 0"
	list1.add(0, "yellow");
	
//	toString method to print all values in same line
	
	System.out.println(list1.toString());
	
//	size method: return value from index
	System.out.println("Number of elements: " + list1.size());
	
//	get method: return value at the index
	
	System.out.println("index 3 : "+list1.get(3));
	System.out.println("index 0 : " + list1.get(0));
	
//	remove using index: removes element at the index
	list1.remove(0); //removes yellow
	System.out.println(list1.toString());
	
//	remove using value/element. removes element at first occurence
	list1.remove("blue");
	System.out.println(list1.toString());
	
//	set(index, value) replace certain index with new value
	list1.set(0, "orange");  // red will be replaced by orange
	System.out.println(list1.toString());
	
//	indexOf(value): returns index of value in the list
	System.out.println("grey: " + list1.indexOf("grey"));  //3
	System.out.println("green: " + list1.indexOf("green"));  //-1
	
//	isEmpty() returns true if list Empty. size == 0
	
	System.out.println("isEmpty: " + list1.isEmpty());
	System.out.println("isEmpty: " + (list1.size() == 0));
	
//	contains(elem) ==> returns true if value is present in the list
	System.out.println("White in the list: " + list1.contains("white"));
	System.out.println();
	
	List<String> list2 = new ArrayList<String>();
//	ADDALL => adds all values from one list into another
	list2.addAll(list1);
	System.out.println("List2: "+list2);
	
	System.out.println();
	
//	CONTAINSALL. check if the list has all values of another lis
	System.out.println("containsAll: "+ list2.containsAll(list1));
			
//	EQUALS(list) check if 2 lists are equal
	System.out.println("equals: "+ list1.equals(list2));
	
	System.out.println();
	
	
	list2.add("pink");
//	REMOVE(list) : removes all matching values from your list that are in other list
	System.out.println("list1: "+list1.toString());
	System.out.println("list2: "+list2.toString());
	list2.removeAll(list1);
	System.out.println(list2.toString());//[pink]
	
//	ADALL(index, list) adds a new list values starting from given index
	list1.addAll(2, list2);
	System.out.println("list1 after adding list1.addAll(2, list2): " +  list1.toString());
	//[orange, Blue, pink, white, grey, black]   >== pink'i index 2'ye yerlestirdi
	list2.addAll(list1);
	System.out.println(list2.toString());//[pink, orange, Blue, pink, white, grey, black]
	list2.add(3, "apple");
	System.out.println(list2.toString());//pink, orange, Blue, apple, pink, white, grey, black]
	
	System.out.println();
	

	//CLEAR. cleares a list, removes all values
			list1.clear();
			list2.clear();
			System.out.println("both empty? -" + (list1.isEmpty() && list2.isEmpty())); //both empty? -true
	}

}
