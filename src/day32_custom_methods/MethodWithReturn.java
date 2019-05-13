package day32_custom_methods;

public class MethodWithReturn {
	public static void main(String[] args) {
		
		//giveMe10$();  //this doesnt compile
		
		System.out.println(giveMe10$());
		
		int i = giveMe10$();
		System.out.println("i: " + i);
		
		System.out.println(giveMeYourName());
		String  myName = giveMeYourName();
		System.out.println(myName);
		
		System.out.println("****");
		System.out.println(giveMeYourNameV2());
		String myName2 = "mk";
		System.out.println(myName2);
		
	}
	
	
	
	/*
	 * this method returns int value...
	 */
	public static int giveMe10$() {
		System.out.println("returning 10 from method");
		return 10;
	}
	
	/*
	 * Method: giveMeYourName
	 * returnType: String
	 * Declare name variable and assign your name 
	 * then return it. Call in main method
	 */
	public static String giveMeYourName() {
//		System.out.println("Name is : ");
		return "Metin";
	}
	
	//second version:
	public static String giveMeYourNameV2() {
		String name2 = "Kaya";
		return name2;
	}

}
