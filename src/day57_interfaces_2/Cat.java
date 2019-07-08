package day57_interfaces_2;

public class Cat implements Pet, Callable {

	@Override
	public void respond() {
		System.out.println("Cat is responding myavv");
		
	}

	@Override
	public void keepAsPet() {
		System.out.println("Cat is kept in the home");
		
	}

}
