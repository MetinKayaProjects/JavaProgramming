package day31_method03;

import java.util.Scanner;

public class VoidMethods {
	public static void main(String[] args) {
			
		countUp(8);
		countUp(-2);
		
		countDown(8);
		countDown(0);
		
		int n = 9;
		countDown(n);
		countDown(4);
		countDown(-2);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num to countUp: ");
		int inputNum = scan.nextInt();
		countUp(inputNum);
		
		countDown(inputNum);
	
		System.out.println();
		
		drive("Audi", 60);
		drive("Honda", 70);
	}

	/*
	1) name: countUp
	   return type: void
	   param: int
	   it prints from 1 to the value of the param
	   countUp(5);
	   1 2 3 4 5

	   param value less than 1 then
	   print "invalid input"

	2) name countDown
	   return type: void
	   param: int
	   it prints from param value till 1
	   countDown(5);
	   5 4 3 2 1

       param value less than 1 then
	   print "invalid input"       */
	
	public static void countUp (int num) {
	
		
		if (num < 1) {
			System.out.println("invalid input");
		}else {
			for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			}
		}	System.out.println();
	}

	public static void countDown(int num) {
		if (num < 1) {
			System.out.println("invalid input");
		}else {
			for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
			}
			
		}System.out.println();
	}	
	
	/*
	 Method name : drive
	 return type : void
	 params/args : String car, int speed
	 print : "Audi" is driving 60 mph
	 */
	public static void drive(String car, int speed) {
		
		System.out.println(car + " is driving " + speed + " mph");
		
		
	}
	
	
}
