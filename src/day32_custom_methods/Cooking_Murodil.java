package day32_custom_methods;

public class Cooking_Murodil {
	public static void main(String[] args) {
		makePancakes();
		makePasta();
		makePancakes();
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
	}
	
	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~"+dish.toUpperCase()+" IS READY!~~");
	}
	
	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~ DELICIOUS PASTA IS READY~~");
	}
	
	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ ENJOY YOUR DELICIOUS PANCAKES ~~");
	}
	
	public static void add(String ing) {
		System.out.println("Add " + ing);
	}
	
	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}
	
	public static void fry(int minutes) {
		System.out.println("Fry for " + minutes + " minutes");
	}
	
	public static void boil(int minutes) {
		System.out.println("Boil it for " + minutes + " minutes");
	}

}
