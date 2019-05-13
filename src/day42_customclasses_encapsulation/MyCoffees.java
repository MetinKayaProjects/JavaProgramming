package day42_customclasses_encapsulation;

public class MyCoffees {
	public static void main(String[] args) {
		
		Coffee coffee1 = new Coffee();
		coffee1.name = "Iced CARAMEL MACCHIATO";
		coffee1.size = "Grande";
		coffee1.price = 4.75;
		coffee1.calories = 250;
		
		coffee1.getCoffeeInfo(); //to print it out
		
		System.out.println();
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("JAVA CHIP");
		coffee2.size = "VENTI";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeeInfo(); //to print it out
		
		System.out.println();
		
		Coffee coffee3 = new Coffee();
//		coffee3.name = "ICED COFFEE";
		coffee3.setName("ICED COFFEE");
		coffee3.setSize("TALL");
		coffee3.setPrice(2.45);
		coffee3.setCalories(60);
		
		coffee3.getCoffeeInfo();  //to print it out
		
		System.out.println("coffee3.name: " + coffee3.name);
		
		System.out.println();
		
		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeInfo("CAPPUCHINO", "Grande", 3.95, 40);
		//		coffee4.setName("CAPPUCHINO");
		//		coffee4.setSize("Grande");
		//		coffee4.setPrice(3.95);
		//		coffee4.setCalories(40);
		
		coffee4.getCoffeeInfo();
		
			
	}
	
}
