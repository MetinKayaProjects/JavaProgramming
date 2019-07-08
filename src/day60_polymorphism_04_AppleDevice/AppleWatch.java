package day60_polymorphism_04_AppleDevice;

public class AppleWatch extends AppleDevice{
	
	public double weight = 50;
	
	@Override
	public void use() {
		System.out.println("AppleWatch | Sports | Check Time | Call | Text");
	}
	
	public void wear() {
		System.out.println("Wearing Hermes AppleWatch");
	}
	
}