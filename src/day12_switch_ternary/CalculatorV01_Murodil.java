package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01_Murodil {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Get numbers
		System.out.println("Enter first number:");
		double num1 = input.nextDouble();
		//Get operator
				
		System.out.println("Enter second number:");
		double num2 = input.nextDouble();
		
		System.out.println("Select Operator: +, - , *, /, % ");
		String operator = input.next();
		
		double result = 0.0;//assign 0.0 to prevent compile errors. due to not having any value
		//perform calculation and display result
		if(operator.equals("+")) {
			result = num1 + num2;
		}else if(operator.equals("-")) {
			result = num1 - num2;
		}else if(operator.equals("*")) {
			result = num1 * num2;
		}else if(operator.equals("/")) {
			result = num1 / num2;
		}else if(operator.equals("%")) {
			result = num1 % num2;
		}else {
			System.out.println("Invalid operator selected: " + operator );
			return; //Do not execute the remaining code. STOP HERE
		}
				
		System.out.println("Result: " + result );
	}
	

}
