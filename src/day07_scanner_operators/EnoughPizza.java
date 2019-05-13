package day07_scanner_operators;

public class EnoughPizza {
	
	public static void main(String[] args) {
		
		//slices in pizza -> 8
		//slices per student -> 2
		
		int pizzaCount = 30;
		int studentCount = 145;
		
		boolean isEnoughPizza = (pizzaCount * 8)/145 >= 2;
		
		System.out.println("Is the pizza enough? " + isEnoughPizza);

		System.out.println("======================================");

		pizzaCount = 30;
		studentCount = 15;
		isEnoughPizza = (pizzaCount * 8)/15 >= 2;
		
		System.out.println("Is the pizza enough? " +isEnoughPizza);//true
		
		
		
		
		
		
	}

}
