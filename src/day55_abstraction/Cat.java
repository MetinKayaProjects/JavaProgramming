package day55_abstraction;

public class Cat extends Animal {

	@Override
	public void speak() {
			System.out.println("myavvv");	
	}

	@Override
	public void eat() {
		System.out.println("Cat " + getName() + " eat");
		
	}

	
}
