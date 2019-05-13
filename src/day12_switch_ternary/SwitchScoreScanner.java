 package day12_switch_ternary;

import java.util.Scanner;

public class SwitchScoreScanner {
	public static void main(String[] args) {
	
		System.out.println("Enter a number between 1 and 3: ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch(score) {
			case 1: // if(score == 1){
				System.out.println("Score is 1");
				break; // exit switch statement
			case 2:
				System.out.println("Score is 2");
				break;
			case 3:
				System.out.println("Score is 3");
				break;
			default:
				System.out.println("You entered invalid number");
				break; // this is not mandatory. 
		}
	}

}
