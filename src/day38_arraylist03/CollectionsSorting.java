package day38_arraylist03;
import java.util.*;

public class CollectionsSorting {
	public static void main(String[] args) {
		List<Integer> numsList = new ArrayList<Integer>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(1000);
		numsList.add(3);
		
		
		System.out.println(numsList);
		Collections.sort(numsList);
		System.out.println(numsList);
		
		List<String> strList = new ArrayList<String>();
		strList.add("Fuat");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabbat");
		strList.add("Ali");
		strList.add("Zeynep");
		
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		
		
		System.out.println();
		
//		MAX, MIN
		
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		
		System.out.println("maxNum: " + maxNum);
		System.out.println("minNum: " + minNum);
		
		String maxName = Collections.max(strList);
		String minName = Collections.min(strList);
		
		System.out.println("maxName: " + maxName);
		System.out.println("minName: " + minName);
		
		System.out.println();
		
		Collections.shuffle(strList);  //returns the list randomly
		System.out.println(strList);
		
	}

}
