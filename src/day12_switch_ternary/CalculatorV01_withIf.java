package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01_withIf {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number1: ");
	double num1 = input.nextDouble();
	
	System.out.println("Enter number2: ");
	double num2 = input.nextDouble();
	
	double result =0.0; //ilk basta hic bir deger verilmemisse 0 atamakta yarar var.. 
							//Assign 0 to prevent compile errors. due to not having invalid value.
	 
	System.out.println("Select operators: +, -, *, / %");
	String operators = input.next();
	
	//if(operators!= "+" || "-" || "*" || "/" || "%")) {
	//	System.out.println("Invalid operators " + operators);
	//}
	
	if(operators.equals("+")) {
		result = num1 + num2;
	}else if(operators.equals("-") && num1 >= num2) {
		result = num1 - num2;
	}else if (operators.equals("-") && num2 >= num1) {
		result = num2 - num1;
	}else if(operators.equals("*")) {
		result = num1 * num2;
	}else if(operators.equals("/")) {
		result = num1/num2;
	}else if(operators.equals("%")) {
		result = num1 % num2;
	}else {
		System.out.println("Invalid operator selected : " + operators);
		return;  // stop execution. Do not execute. STOP HERE
	}
		
	System.out.println("Result: " + result);	//                               10/3=3.333333333
	//System.out.println("Result: " + Math.round(result));//boyle yazarsak sonucu yuvarlar. 10/3=3
	}

}
