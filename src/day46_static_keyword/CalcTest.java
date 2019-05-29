package day46_static_keyword;

public class CalcTest {
	public static void main(String[] args) {
		
		double result = Calculator.plus(55, 7);  //static way
		System.out.println("result: " + result);
		
		result = Calculator.minus(44, 14);  //static way
		System.out.println("result: " + result);
		
		//Class way:
		Calculator c = new Calculator();
		System.out.println(c.multiply(4, 2));
		
		//Static way:
		System.out.println(Calculator.multiply(4, 2));
		
		int i = Integer.parseInt("33");
		System.out.println( Character.isDigit('5') );
		System.out.println("hi");
		
		
	}
	
	

}
