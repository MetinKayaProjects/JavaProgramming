package day37_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day24_array_Vasyl.Cities;

public class Shopping {
	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
//		List<String> shoppingList = new ArrayList<>();  //this is also same. and can be used
//		List<String> shoppinList = Arrays.asList("apple", "lemon", "book", "cherry", "bread", "pen"); // is also same
				
		shoppingList.add("apple");
		shoppingList.add("lemon");
		shoppingList.add("book");
		shoppingList.add("cherry");
		shoppingList.add("bread");
		shoppingList.add("pen");
		
		System.out.println("shoppingList.size: "+ shoppingList.size()); //6
		
		int count = shoppingList.size();
		System.out.println("shoppingList.size: "+ count); //6
		System.out.println();
		
//		print everything in single line:
		System.out.println(shoppingList.toString()); //[apple, lemon, book, cherry, bread, pen]
		
//		print first and laast item:
		System.out.println(shoppingList.get(0) +"  |  "+  shoppingList.get(shoppingList.size()-1));//apple  |  pen
		System.out.println(shoppingList.get(0) +"  |  "+  shoppingList.get(count-1));//apple  |  pen
		
		shoppingList.remove(0); //remove item in index 0 >> apple
		System.out.println(shoppingList.toString());//[lemon, book, cherry, bread, pen]
		shoppingList.remove("pen");
		System.out.println(shoppingList);//[lemon, book, cherry, bread]
		System.out.println(shoppingList.get(0)); //lemon
		
		
//		watch out: in the for each loop you cannot remove nothing
//		for each loop it can be only read
		for(String item : shoppingList) {
			System.out.print(item + " "); //lemon book cherry bread 
		}
		
		System.out.println();
		
//		remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList);  //[]
		System.out.println(shoppingList.toString());  //[]
		

	
		
		
	}

}
