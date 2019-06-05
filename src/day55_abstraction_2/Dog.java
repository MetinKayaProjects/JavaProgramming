package day55_abstraction_2;

public class Dog extends Mammal {
	
	
	
	@Override
	public void speak() {
		System.out.println("How how");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog " + getName() + " eat");
		
	}

	@Override
	public void produceAMilk() {
		// TODO Auto-generated method stub
		
	}

}
