package day33_methods05;

import com.sun.net.httpserver.Authenticator.Result;

public class Calculator {
	
//	1) Method addVoid    (without return)
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum : " + sum);
	}
//	2)method add    (return)
	public static int add(int num1, int num2) {
		int sum =num1 + num2;
		
		return sum;
	}
//	method: multiply with return value
	public static int multiply(int num1, int num2) {
		int multiply = num1 * num2;
		
		return multiply;
	}
	
//	method: minus with return value
	public static int minus(int num1, int num2) {
		int minus = num1 - num2;
		
		return minus;
	}
//	method: divide with return value
	public static double divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("ERROR: Cannot / by 0");
			return 0;
		}else {
			double result = num1 / num2;
			return result;
		}
	}
	
	public static void main(String[] args) {
		addVoid(2, 5);
		addVoid(12, 5);
		
		int result = add(10, 20);
		System.out.println("Result: " + result);
		result = add(5, 7);
		System.out.println("Result-2: " + result);
		System.out.println("Result-2: " + add(50, 100));
		
		result= multiply(2, 5);
		System.out.println("Multiply Result: " + result);
		System.out.println("Multiply Result-2: " + multiply(5, 5));
		
		int minus = minus(8, 3);
		System.out.println("Minus-1: " + minus);
		System.out.println("Minus-2: " + minus(9, 15));
		System.out.println();
		
		double divide = divide(12.0, 3.2);
		System.out.println("Divide-1: " + divide);
		System.out.println("Divide-2: " + divide(24.0, 2));
		System.out.println("Divide-3: " + divide(12.2, 0));
	}

	
	
	
	
	

}
