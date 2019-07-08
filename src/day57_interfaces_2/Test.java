package day57_interfaces_2;

public class Test {
	public static void main(String[] args) {
		
		
		Cat cat = new Cat();
		cat.play();
		cat.keepAsPet();
//		cat.feed  //is static method. Objec ile degil; Ancak class ismi ile cagrilir
		Pet.feed("dry food");//static method can be called by className.methodName
		//Feeding a pet with dry food
		System.out.println(Pet.FRIENDLY);//true
		
	}

}
