package day34_methods06;

import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;

public class VarArgs {
	public static void main(String[] args) {
		
		printWords("red", "grey", "yellow", "blue", "black"); //5 values
		System.out.println();
		printWords("red"); // one values
		printWords(); //empty. so the array is empty
		
		System.out.println();
		String[] myPet = {"cat", "horse","dog"};
		printWords(myPet);
		System.out.println(Arrays.toString(myPet));
		
		System.out.println();
		System.out.println(sum(10,20,30,40,50) );//150
		
		int sum = sum(10,20,30);
		System.out.println(sum);  //60
		
		System.out.println("----");
		int budget = 200;
		sum(10, 45, 110, 30,35);
		
		if (budget >= sum(10, 45, 110, 30,35)) {
			System.out.println("Within budget");
		}else {
			System.out.println("budget has broken, call your husband:)");
		}
		
		System.out.println();
		int total = sum(23, 45, 54);
		System.out.println(total);
		
		System.out.println();
		
//		cook(String name, String...ings )
		cook("Melemen", "Egges", "Tomatoes", "butter" );
		
//		shoppingList(int totalPrice, String... items)
		shoppingList(200, "Rice", "Book", "Apple", "Shoes");
	}
	
	public static void printWords(String... words) {
//		handle it like an ARRAY
		for(String w : words) {
		System.out.println(w);
		
		}
		
	}
//	sum(10,20,30) ==> 60
//	sum(20,30) ==> 50
	public static int sum(int... nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n;  //sum = sum + n;
		}
		return sum;
	}
	
	public static void cook(String name, String...ings) {
		System.out.print("Food: " + name);
		System.out.println(Arrays.toString(ings));
		
	}
	
	public static void shoppingList(int totalPrice, String... items) {
		System.out.print("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
		
	}
	

}
