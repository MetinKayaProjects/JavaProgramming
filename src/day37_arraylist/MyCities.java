package day37_arraylist;

import java.lang.reflect.Array;
import java.util.*;

import day16_strin_manipulation.IsEmpty;

public class MyCities {
	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");

//		print each city using for each loop separated by space

		for (String city : cities) {
			System.out.print(city + " "); // Barnaul Dushanbe Sterling Baku Tashkent
		}

		System.out.println();

//		print each city using for loop separated by space
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " "); // Barnaul Dushanbe Sterling Baku Tashkent
		}

		System.out.println();
//		remove Baku
		cities.remove("Baku");
		System.out.println(cities); // [Barnaul, Dushanbe, Sterling, Tashkent]

		int idxOfTashkent = cities.indexOf("Tashkent");
		System.out.println("idxOfTashkent: " + idxOfTashkent);
		System.out.println("idxOfTashkent: " + cities.indexOf("Tashkent"));// 3

		System.out.println();

//		isEmpty
		System.out.println("isEmpty method:");

		System.out.println(cities.isEmpty()); // false

		cities.add(0, "Bishkek"); // 0'a Bishkek ekle

		System.out.println(cities.toString()); // [Bishkek, Barnaul, Dushanbe, Sterling, Tashkent]

		cities.add(3, "Ankara");
		System.out.println(cities);// [Bishkek, Barnaul, Dushanbe, Ankara, Sterling, Tashkent]

		cities.add("Izmir"); // index belirtmezsen sona ekler
		System.out.println(cities.toString()); // [Bishkek, Barnaul, Dushanbe, Ankara, Sterling, Tashkent, Izmir]

//		set(index, value)
		cities.set(2, "Seul"); // 2'deki Dushanbe'yi Seul ile degistir
		System.out.println(cities);// [Bishkek, Barnaul, Seul, Ankara, Sterling, Tashkent, Izmir]

		cities.set(4, "Bursa");
		System.out.println(cities); // [Bishkek, Barnaul, Seul, Ankara, Bursa, Tashkent, Izmir]

		cities.set(cities.indexOf("Seul"), "Mardin"); // Seul replaced w Mardin: [Bishkek, Barnaul, Mardin, Ankara,
														// Bursa, Tashkent, Izmir]
		System.out.println(cities);

		int idx = cities.indexOf("Barnaul");
		System.out.println(idx); // 1

		cities.set(idx, "Adana");
		System.out.println(cities); // [Bishkek, Adana, Seul, Ankara, Bursa, Tashkent, Izmir]

		cities.remove(idx + 2); // 1+2=3 >> remove Ankara
		System.out.println(cities.toString());// [Bishkek, Adana, Seul, Bursa, Tashkent, Izmir]

//		cities.get(0); //1 >> Bishkek
//		System.out.println(cities + "=====");

		cities.clear(); // hepsini sil
		System.out.println(cities.isEmpty()); // true
		System.out.println(cities); // []

		cities.add("Ankara");
		cities.add("Istanbul");

		System.out.println(cities); // [Ankara, Istanbul]

		cities.clear();
		boolean emptyList = cities.isEmpty();
		System.out.println(emptyList); // true

	}

}
