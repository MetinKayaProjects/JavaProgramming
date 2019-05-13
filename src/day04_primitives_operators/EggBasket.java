package day04_primitives_operators;

public class EggBasket {
public static void main(String[] args) {
	//declare variable called numberOfBaskets, eggsPerBasket, totalEggs
	//there are 10 baskets, there are 6 eggs in each basket
	//calculate the totalEggs
	//Print: If you have 6 eggs per basket and 10 baskets, then the total number of eggs is 60.
	
	
	int numberOfBaskets, eggsPerBasket, totalEggs;
		numberOfBaskets=10;
		eggsPerBasket=6;
	
	totalEggs=numberOfBaskets * eggsPerBasket;
	
	System.out.print("If you have " + eggsPerBasket + " eggs per basket and ");
	System.out.print(numberOfBaskets + " baskets, then ");
	System.out.println("the total number of eggs is " + totalEggs + ".");
	
	// second way
	
	System.out.print("If you have " + eggsPerBasket + " eggs per basket and " + numberOfBaskets + 
			" baskets, then the total number of eggs is " + totalEggs + ".");
	
	

}
	
	
	
}
