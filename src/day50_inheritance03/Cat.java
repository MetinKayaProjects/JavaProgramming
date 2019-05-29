package day50_inheritance03;

public class Cat extends Animal{
	
	public void speak() {
		System.out.println("Cat is saying Miyavv");
	}
	public void move(int steps) {
		
		System.out.println("Overrriding method");
		System.out.println("Cat is moving " + steps + " steps");
	}

}
