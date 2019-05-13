package day40_customclasses_methods;

import java.util.*;

public class WamUpListMk {

	/*
	 * Method name: countOccurance 
	 * Return: int 
	 * params: ArrayList<String>, String word
	 */
	public static int countOccurance(ArrayList<String> list, String word) {

		int counter = 0;
		for (String l : list) {
			if (l.equalsIgnoreCase(word)) {
				counter++;
			}

		}
		return counter;

	}
//this portion may be also in the above.
	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Ankara");
		myList.add("Ankara");
		myList.add("Bursa");
		myList.add("Bursa");
		myList.add("Ankara");
		myList.add("Izmir");
		myList.add("Bursa");
		myList.add("Bursa");
		myList.add("Izmir");
		
		System.out.println(myList); //[Ankara, Ankara, Bursa, Bursa, Ankara, Izmir, Bursa, Bursa, Izmir]
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a city name: ");
		String wordX = scan.nextLine();  //you can assign any other name instead of word...
		
		int count = countOccurance(myList, wordX); //countOccurance(ArrayList<String> list, String word)
		System.out.println(wordX + ", " + count + " times occures");

	}

}
