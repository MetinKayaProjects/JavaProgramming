package day60_polymorphism_04_AppleDevice;

public class Iphone extends AppleDevice{

	@Override
	public void use() {
		System.out.println("Iphone | CAlling | Read Book | Listening");
		
	}
	public void call() {
		System.out.println("Calling with Iphone");
	}

}
