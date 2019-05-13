package day25_arrays03_murodil;

import java.util.Arrays;

public class Shopping {
	public static void main(String[] args) {

		String[] products = { "Timberland", "Shirt", "Watch", "Bag", "Socks" }; // 5 products
		double[] prices = { 120.0, 5.99, 150.5, 3000.5, 6.99 }; // prices of these products
		int[] itemsId = { 12345, 12346, 12347, 12348, 12349 };// item number of these products

//		Print count of products:
		System.out.println("Products count: " + products.length); // 5

		// check if products, prices and itemsId have same count

		if (products.length == prices.length && products.length == itemsId.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong in this list");
			return;
		}

		System.out.println();

//		loop through products and print each one in separate line
		for (String p : products) {
			System.out.println(p);
		}

		System.out.println();
//		prices --> for loop
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
//		or
		System.out.println("=====  or  ======");
		for (double pr : prices) {
			System.out.println(pr);
		}

		System.out.println();
//		print last itemId
		System.out.println(itemsId[itemsId.length - 1]);

		System.out.println();

//		itemId --> Print this on reverse order
		for (int j = itemsId.length - 1; j > 0; j--) {
			System.out.println(itemsId[j]);
		}
		System.out.println();
		
//		sort itemId from smaller to greater
		System.out.println("sort itemId from smaller to greater:");
		Arrays.sort(itemsId);
		for(int i : itemsId) {
		System.out.println(i);	
		}
		
		System.out.println("*****YOUR SHOPPING RECEIPT*****");
//		print a report  with total list
//		Item1: 12345 - Timberland - price
//		...
//		Total price: 
		double totalPrice = 0.0;
		for (int k = 0; k < products.length; k++) { // k=0 since index should start from 0.
			System.out.println("Item" + (k + 1) + ": " + itemsId[k] + " - " + products[k] + " - $" + prices[k]);
			totalPrice += prices[k];
		}
		System.out.println("Total Price: $" + totalPrice);

		System.out.println("**** **** **** **** ****");

//		find the most expensive item in your lift and print it as a report
//		loop and find. Do not use arrays class
//		120.0, 5.99, 150.5, 3000.5, 6.99
		int maxIndex = 0;
		double maxPrice = prices[0];
		for (int m = 0; m < prices.length; m++) {
			if (prices[m] > maxPrice) {
				maxPrice = prices[m];
				maxIndex = m;
			}
		}
		System.out.println("The most expensive item is (idno:" + itemsId[maxIndex] + ") - " + products[maxIndex]
				+ " - $" + maxPrice);

		int minIndex = 0;
		double minPrice = prices[0];
		for (int z = 0; z < prices.length; z++) {
			if (prices[z] < minPrice) {
				minPrice = prices[z];
				minIndex = z;
			}

		}
		System.out.println(
				"The cheapest item is (idno:" + itemsId[minIndex] + ") - " + products[minIndex] + " - $" + minPrice);

	}
}
