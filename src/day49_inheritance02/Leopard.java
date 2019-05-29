package day49_inheritance02;

public class Leopard extends Animal {
	
	
	public Leopard() {
		
		super();//call parents class no-args constructor
		System.out.println("Leopard no-arg constructior");
		setType("Leopard");
	}
	public Leopard(String type) {
//		setType(type);
		super(type); //call animalstring type
		System.out.println("Leopard one arg constructor");
	}

}
