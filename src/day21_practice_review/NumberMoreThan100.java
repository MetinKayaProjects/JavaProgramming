package day21_practice_review;

import java.util.Scanner;

public class NumberMoreThan100 {
	public static void main(String[] args) {
		
	/*
	 Ask user to enter 2 ints:
	 - if sum of those ints is not more than 100, then keep asking for 2 numbers
	 - once sum of those 2 numbers is more than 100 then 
	 print "Good numbers"
	 Program ends.
	 */
		
	Scanner scan = new Scanner(System.in);
	
	int sum = 0;
	do {
		System.out.println("Enter two numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		sum = num1 + num2;
	}while(sum <= 100);
	
	System.out.println("Good numbers");
	
	
//	int num1 = scan.nextInt();
//	System.out.println("Enter number 2 : ");
//	int num2 = scan.nextInt();
//	int sumOfNums = num1 + num2;
//	
//	while(sumOfNums >= 100) {
//		if(!(sumOfNums >= 100)){
//			System.out.println("Enter number 1 : ");
//			num1 = scan.nextInt();
//			System.out.println("Enter number 2 : ");
//			num2 = scan.nextInt();
//			sumOfNums = num1 + num2;
//			System.out.println(sumOfNums);
//		}System.out.println(sumOfNums);
//		return;
//	}
		
		
		
	}

}
