package day60_polymorphism_04_AppleDevice;

public class Mac extends AppleDevice{
	
	public String model = "Mac Computer";
	
	@Override
	public void use() {
		System.out.println("Mac | Computer | Code | Read book | Email");
	}
	
	public void code() {
		System.out.println("Coding Java with Mac");
	}
	
}