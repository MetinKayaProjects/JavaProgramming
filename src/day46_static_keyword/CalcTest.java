package day46_static_keyword;

public class CalcTest {
	public static void main(String[] args) {
		//we can access static variable using a classname, or object
		
		//by class name: Classname.staticMethod
		//public static double plus(double num1, double num2)  // can be called
		//public double plus(double num1, double num2)  //cannot be called by a static method, since this is not static method!
		double result = Calculator.plus(55, 7);  //static way
		System.out.println("result: " + result);
		
		result = Calculator.minus(44, 14);  //static way
		System.out.println("result: " + result);
		
		//2nd way is Class way: you can call by creating an object as well
		Calculator c = new Calculator();  //object
		System.out.println(c.multiply(4, 2));
		
		//Static way:
		System.out.println(Calculator.multiply(4, 2));
		
		int i = Integer.parseInt("33");
		System.out.println( Character.isDigit('5') );
		System.out.println("hi");
		
		
	}
	
	

}
