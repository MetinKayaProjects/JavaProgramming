package day57_interfaces_2;

public interface Pet {
	public static final boolean FRIENDLY = true; //yazmasak da public static final  otomatik olarak eklenir

	public abstract void keepAsPet();
	//void keepAsPet();  /bu kadar yazsak da olurdu; gerisini java otomatik ekler
//	public abstract void play();
	//default method:
	public default void play() { //bunu Pet'e ekleyince, Pet'i extend eden tum classlar kullanmak zorunda
		System.out.println("playing hide-seek with pet");
	}
	
	//let's add static method. static methods are not inherited to other classes
	public static void feed(String food) {
		System.out.println("Feeding a pet with " + food);
	}
	
	
}
