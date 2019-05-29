package day50_inheritance03;

public class TestAnimalsOverriding {
	public static void main(String[] args) {

		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();

		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
System.out.println();
		
		an.move(10);;
		cat.move(15);
		dog.move(33);
		duck.move(222);
		
//		
//		this is overriding method.. hepsinde var. ayni name and ayni parameters, same return type
//		public void speak() {
//			System.out.println("Duck is saying wakwakwak");
//		}
	}

}
