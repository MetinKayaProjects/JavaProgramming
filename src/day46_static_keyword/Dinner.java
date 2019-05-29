package day46_static_keyword;

public class Dinner {
	
	public static int pizzaSlices =8;  //this is static!
	
	public void takeASlice() {
		pizzaSlices--;
	}
	public void takeASlice(int count) {
		pizzaSlices -= count;
	}

}
