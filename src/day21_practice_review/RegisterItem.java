package day21_practice_review;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class RegisterItem {
	public static void main(String[] args) {
		
/*Create a program called Register.It will ask user how many items he purchased.
Then based on that number it will ask item name and price that many times.
You need to gather all items in one String variable items separated by comma
And calculate sum of each item price into variable totalPrice.
Then print out items and total price.

Example:
How many items are you purchasing?
2
What is item 1?
Gloves
How much is Gloves?
10.44
What is item 2?
Hat
How much is Hat?
13
----------
Your items: Gloves, Hat
Your total Price: $23.44  */
		
		int numberOfItems = 0;
		double price = 0;
		double totalPrice = 0;
		String nameOfItems = "";
		String itemList = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items are you purchasing? ");
		numberOfItems = scan.nextInt();
		
	for(int i = 1; i <= numberOfItems; i++) {
		System.out.println("What is item " + i + "?");
		nameOfItems = scan.next();
		itemList += nameOfItems + ", ";
		System.out.println("How much is " + nameOfItems + "?");
		price = scan.nextDouble();
		totalPrice +=price;
	
//		if(itemList.endsWith(", ")) {   ////to get rid of the last comma and space ", " 
//			itemList = itemList.substring(0, itemList.length()-2);
//		}
		
		
	}
	//System.out.println("Your items: " + itemList);
	System.out.println("Your items: " + itemList.substring(0, itemList.length()-2)); // , and space >> 2 char
	System.out.println("Your totall price: " + totalPrice);
		
		
	}

}
