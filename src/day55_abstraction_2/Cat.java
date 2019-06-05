package day55_abstraction_2;

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
