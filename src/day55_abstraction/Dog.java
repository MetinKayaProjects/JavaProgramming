package day55_abstraction;

public class Dog extends Animal {
	
	
	
	@Override
	public void speak() {
		System.out.println("How how");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog " + getName() + " eat");
		
	}

	

}
