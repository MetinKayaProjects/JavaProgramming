package day34_methods06;

import java.util.Arrays;

public class VarArgs_Morodil {
	public static void main(String... a) {  //(String[] args)
		printWords("red", "blue", "yellow"); // 3 values
		printWords("grey"); // one value
		printWords(); // empty. so array will be empty array. 
		
		System.out.println(sum(3, 5 , 10));
		System.out.println(sum(87564, 545, 879844, 55,33232,54545432,2344,2345,533,1234,523));
		int budget = 200;
		if(sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		
		int total = sum(234, 43, 567,12,34,5);
		System.out.println("total: " + total);
		
		cook("Burrito Bowl", "Rice", "Beans", "Meat", "Sour Cream", "Cheese", "Salsa", "Hot sauce");
		cook("Avocado Toast" , "Avocado", "Sunny Side eggs", "Wheat bread");
		shoppingList(1000, "Avocado Toast", "Swatch watch watch Watch", "Shoes", "Jacket");
	}
	
	public static void printWords(String... words) {
		//handle it like an ARRAY
		for(String w :  words) {
			System.out.println(w);
		}
	}
	/*
	 * sum(10,30,40); ==> 80
	 * sum(30,40); ==> 70
	 */
	public static int sum(int... nums) {  //(int[] nums)
		int sum = 0;
		for(int n : nums) {
			sum += n;//sum = sum + n
		}
		return sum;
	}
	
	public static void cook(String name, String... ings) {
		System.out.print("Food: [" + name + "]=> ings: ");
		System.out.println(Arrays.toString(ings));
	}
//   shoppingList(1000, "Avocado Toast", "Swatch watch watch Watch", "Shoes", "Jacket");	
	public static void shoppingList (int totalPrice, String... items ) {
		System.out.print("Total cost: $" + totalPrice + ", Items: ");
		System.out.println(Arrays.toString(items));
	}

}
