package day56_abstraction_02_2;

public class Nokia extends Mobile {

	// Nokia extends Mobile, Mobile also extends Phone. So Nokia takes abstract
	// methods both Mobile and Phone class
	@Override
	public void text(String message) { // this is fr >public abstract class Mobile extends Phone
		// TODO Auto-generated method stub
		System.out.println("Nokia sending msg: " + message);
	}

	@Override
	public void takePicture() { //// this is fr >public abstract class Mobile extends Phone
		// TODO Auto-generated method stub
		System.out.println("Nokia is taking pictures");
	}

	@Override
	public void call() { // this is from > public abstract class Phone
		// TODO Auto-generated method stub
		System.out.println("Nokia is calling");
	}

	// constructor
	public Nokia(String providerName) {
		super(providerName);
//		System.out.println("(Nokia)provider comapny: " + this.providerName);
	}

	@Override
	public boolean hasTouchScreen() {
		super.hasTouchScreen(); // when calling a method use super. but iot call a construction use super()
		System.out.println("Nokia has also touchScreen...");
		return true;
	}
	
	static {
		System.out.println("Nokia is the LEGEND BRAND in the market");
	}

}
