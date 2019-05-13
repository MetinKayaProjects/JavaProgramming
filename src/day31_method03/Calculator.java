package day31_method03;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

//		call methods:

		add(2, 4);
		add(10, 20, 30);

		subtract(2, 4);

		multiply(2, 4);

		divide(2, 0);
		divide(9, -2);

		remainder(2, 4);
		remainder(4, 4);

		System.out.println();
//		using scanner pass two number and operator
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+', '-', '*', '/', '%' ");
		String operators = scan.next();

//		using switch statement, call the matching method to perfotm calculation
		switch (operators) {
		case ("+"):
			add(n1, n2);
			break;
		case ("-"):
			subtract(n1, n2);
			break;
		case ("*"):
			multiply(n1, n2);
			break;
		case ("/"):
			divide(n1, n2);
			break;
		case ("%"):
			remainder(n1, n2);
			break;

		default:
			System.out.println("Invalid operator");
			break;
		}

	}

//	add, substract, multiply, divide, remainder
	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Result : " + result);
	}

	public static void add(double num1, double num2, double num3) {
		double result = num1 + num2 + num3;
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
		} else {
			double result = num1 / num2;
			System.out.println("Result : " + result);
		}
	}

	public static void remainder(double num1, double num2) {

		double result = num1 % num2;
		System.out.println("Result : " + result);

	}

}
