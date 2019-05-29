package day46_static_keyword;

public class Restaurant {
	public static void main(String[] args) {
		
		Dinner Mom =new Dinner();
		
		Dinner kid = new Dinner();
		
		Dinner Dad = new Dinner();
		
		System.out.println("Total Slices " + Dinner.pizzaSlices);//8
		
		Dad.takeASlice();
		System.out.println("Total Slices " + Dinner.pizzaSlices);//7
		Mom.takeASlice();
		kid.takeASlice();
		
		System.out.println("Total Slices " + Dinner.pizzaSlices);//5
		System.out.println("Total Slices: " + Dad.pizzaSlices);//5
		
		kid.takeASlice(3);
		Dad.takeASlice(1);
		Mom.takeASlice();

		System.out.println("Total Slices " + Mom.pizzaSlices);//0
		System.out.println("Total Slices " + Dinner.pizzaSlices);//0
		
	}

}
