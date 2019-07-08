package day57_interfaces_2;

public class Dog implements Pet, Callable {

	@Override
	public void respond() {
		System.out.println("Dog is responding how how");
		
	}

	@Override
	public void keepAsPet() {
		System.out.println("Dog is keepng in the house or outside");
		
	}

}
