package day30_method02;

import java.util.Random;
import java.util.Scanner;

import day17_stringpool_whileloop.WhileLoop1;



public class MyNumbers {
	public static void main(String[] args) {
		
		showMe5Numbers();	
		showMe5Numbers();
		
		doPush10Ups();
		
		rangePrint();
		
	}
	
	/*	Method name : showMe5Numbers
	return Type : void
	params      : no
	prints 5 random numbers 0, 1000
	in same line separated by comma
	Ex:
	showMe5Numbers(); 345, 234, 566, 2, 23		
*/	
	
	public static void showMe5Numbers() {
	
		for (int i = 1; i <= 5; i++) {
			Random input = new Random();
			int nums = input.nextInt(1001);   //1000 is also included. 1001 is not included
			System.out.print(i+ ".num: " + nums + " ");
		}
		System.out.println();
	}
	
	public static void doPush10Ups() {
		/*
		 name		: doPush10Ups
		 return type : void
		 params		: no	
		 Print  Pushup-1
		 		Pushup-2
		 		Pushup-3
		 		Pushup-4
		 		....
		 		Pushup-10
		 		Time to rest
		 */
		//System.out.println("Pushup " + i);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pushup - " + i);
		}
		System.out.println("\nTime to rest");
		System.out.println();
	}
	/*
	 *method name	: rangePrint
	 *return type 	: void
	 *params/arg	: no
	 *Using a scanner ask 2 integers
	 *you need to print to all numbers between those 2 numbers
	 *Ex: 
	 -5
	 -8
	 Print: 5 6 7 8
	 -10
	 -6
	 Print : 10 9 8 7 6 
	 -40
	 -40
	 Print: 40
	 */

	public static void rangePrint() {
		System.out.println("---- New Task: rangePrint----");
		System.out.println("Enter first number: ");
		Scanner n = new Scanner(System.in);
		int num1 = n.nextInt();
		System.out.println("Enter second number: ");
		int num2 = n.nextInt();
		
		if (num1 > num2) {
			for (int i = num1; i >= num2; i--) {
				System.out.print(i + " ");
			}
		}else if(num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.print(num1 + " ");
		}
		System.out.println();
	}
	
	
}
