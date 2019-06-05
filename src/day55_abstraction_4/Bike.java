package day55_abstraction_4;

public class Bike  extends Vehicle{

	public Bike(int wheels, double price) {
		super(wheels, price, "Bycle", "only a person");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cycling...");
	}
	

}
