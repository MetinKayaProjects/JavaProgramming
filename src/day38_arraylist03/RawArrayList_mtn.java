package day38_arraylist03;
import java.util.*;


public class RawArrayList_mtn {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();  //we didint use type list at the left side!
		list.add("Saturday");  //Add string
		list.add("Java day");
		list.add(1000);  //add int
		list.add(234.4);  //add double
		list.add(true);
		list.add(false);
		
		
		System.out.println(list);  ////automatically call toString()
		System.out.println(list.toString());  //[Saturday, Java day, 1000, 234.4, true, false]
		String allValues = list.toString();
		System.out.println(allValues);
		
		System.out.println();
		
		list.get(0);// bunu yaziririsin ama toLowerCase ... yapamazsin. bunnn icin string'e cevirmen gerekir
		System.out.println(list.get(0).toString().toUpperCase());
		//or
		String str = list.get(1).toString().toUpperCase();
		//str.toUpperCase();
		System.out.println(str);
		//Integer i = list.get(3);
		System.out.println(list.get(3));
		System.out.println(list.set(0, "Monday"));
		System.out.println(list.set(4, "pazar"));
		System.out.println(list.remove(3));
		System.out.println(list.toString());
		list.clear();
		System.out.println(list.toString()); //[]
		System.out.println(list.isEmpty());//true
		
		
	}
	
	
	

}
