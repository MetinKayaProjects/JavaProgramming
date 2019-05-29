package day52_inheritance05_01;

public class FinalMethods {

	public final void method1() {
		System.out.println("Final Method 1");
	}



//class Sub extends FinalMethods {
//	public final void method1() {
//		System.out.println("Overrride method 1"); // doesnt work since mother method is final
//	}
public static void staticMethod(String word) {
	System.out.println("staticMethod");
}
	
	public void method1(String str) {
		System.out.println("Overloading is possible fir final method" + str);
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
