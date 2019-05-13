package day31_method03;

public class CalculatorFromScanner {
	public static void main(String[] args) {

//		call methods:

		add(2, 4);
		subtract(2, 4);
		multiply(2, 4);
		divide(2, 0);
		remainder(2, 4);

	}

//	add, substract, multiply, divide, remainder
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result : " + result);
	}

	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Result : " + result);
	}

	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Result : " + result);
	}

	public static void divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Cannot divide by zero");
			return;
		}
		double result = num1 / num2;
		System.out.println("Result : " + result);
	}

	public static void remainder(double num1, double num2) {

		double result = num1 % num2;
		System.out.println("Result : " + result);

	}

}
