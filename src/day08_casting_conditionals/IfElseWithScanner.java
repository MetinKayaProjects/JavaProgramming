package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		
		//passingPercentage = 65;
		//yourScorePercentage = take from scanner
		//check if you passed or failed
		
		int passingPercentage = 65;
		System.out.println( "Passing Percentage is " + passingPercentage);
		System.out.println("What is your score? ");
		Scanner scan = new Scanner(System.in);
		//Scanner yourScorePercentage = new Scanner(System.in);
		int yourScorePercentage = scan.nextInt();
		System.out.println("Your score: " + yourScorePercentage);
		
		if(yourScorePercentage >= passingPercentage) {
			
			System.out.println("You have passed!");
		}else {
			System.out.println("You have failed!");
		}
		
		
		
	}

}
