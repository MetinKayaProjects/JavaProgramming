package day55_abstraction_4;

public class Bike extends Vehicle {

//	public Bike(int wheels, double price, String type->"Bycle", String powerSource->"only a person")
	public Bike(int wheels, double price) {
		super(wheels, price, "Bycle", "only a person");
		// TODO Auto-generated constructor stub
	}

	
//	from abstract method--> public abstract void move();
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cycling...");
	}

}
