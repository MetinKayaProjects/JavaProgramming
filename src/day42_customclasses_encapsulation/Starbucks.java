package day42_customclasses_encapsulation;
import java.util.*;
public class Starbucks {
	
	public static void main(String[] args) {
		  //declare an array that can store 2 Coffee objects
		//declare coffeeArray that can store 2 coffee objects
			Coffee[] coffeeArray = new Coffee[2];
		// create coffee object and assign to index 0
			coffeeArray[0] = new Coffee();
		//access coffee object in index 0 and set data
			coffeeArray[0].setCoffeeInfo("expresso", "Tall", 2.55, 7);  // =>> Shoes Classinda> public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal)
		//access coffee object in index 0 and call method getCoffeeInfo(
	        coffeeArray[0].getCoffeeInfo();
	    // create a single object first     
	        Coffee latte = new Coffee();
	    // assign data
	        latte.setCoffeeInfo("Latte", "grande", 3.85, 190);
	    // assign the latte object to index 1 to array
	        coffeeArray[1] = latte;
	    //print data from object in index 1
	        coffeeArray[1].getCoffeeInfo();
	      //  latte.getCoffeeInfo();
	        
		}

	}
