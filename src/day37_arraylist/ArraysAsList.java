package day37_arraylist;

import java.util.*;

import day13_ternary_string_intro.carSelector;

public class ArraysAsList {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		cars.add("Honda"); // etc add more values
		cars.add("Audi");
		cars.add("Mercedes");
		cars.add("Tesla");
		System.out.println(cars);
		System.out.println(cars.toString());

		// declare and add values in single statement
		// Arrays class
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		// nums.add(100); will not work
		// nums.add("100"); will not work
		// System.out.println(nums.toString());

		// create arraylist prices
		// assign 10 values using Arrays.asList method
		List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 1230.50);

		System.out.println(prices);
		// calculate sum of all prices
		double sum = 0;
		for (double price : prices) {
			sum += price;
		}
		System.out.println("Sum: " + sum);

		double sum2 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("sum2: " + sum2);

		// create new List<Double> called expensive
		// add prices that are more than 100 from prices list
		List<Double> expensive = new ArrayList<>();

		for (double price : prices) {
			if (price > 100.0) {
				expensive.add(price);
			}
		}

		System.out.println("Expensive: " + expensive.toString());

		System.out.println("\nList method");
		List<Double> prices2 = new ArrayList<Double>();
		prices2.add(12.4);
		prices2.add(5.3);
		prices2.add(500.0);
		prices2.add(1230.5);

		System.out.println("prices2: " + prices2);
		System.out.println();
		// calculate sum of all prices by for each
		double sumList = 0.0;
		for (Double p2 : prices2) {
			sumList += p2;
		}
		System.out.println("sumList-forEach: " + sumList);

		System.out.println();

		// calculate sum of all prices by for loop
		double sumList2 = 0;
		for (int i = 0; i < prices2.size(); i++) {
			sumList2 += prices2.get(i);
		}
		System.out.println("sumList-forLoop: " + sumList2);
	}
}
