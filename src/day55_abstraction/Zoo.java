package day55_abstraction;

public class Zoo {
	public static void main(String[] args) {
//	Animal animal = new Animal(); //doesnt work cannot instantiate the type Animal

		Cat fluffy = new Cat();
		fluffy.speak(); // myavvv
		fluffy.eat();  //null eat
		fluffy.setName("fish"); 
		fluffy.eat();	//Cat fish eat
		

		Dog lassy = new Dog();
		lassy.speak(); // How how
		
		lassy.setName("bons");
		lassy.getName();
		lassy.eat();  //Dog bons eat
		
		
	}
}
