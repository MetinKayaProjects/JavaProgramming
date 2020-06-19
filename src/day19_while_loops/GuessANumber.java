package day19_while_loops;

import java.util.Random;
import java.util.Scanner;



public class GuessANumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int secretNumber = random.nextInt(101);  // disaridan bizim de bilmedigimiz bir numarayi girer
		int guessNumber;
		int number;
		int index = 0;
		
		do {
			System.out.println("Guess a number between 1-100 in order to guess the secret number: ");
			guessNumber = scan.nextInt();
			number = guessNumber - secretNumber;
			index++;
			if(index < 10) {
				if(number > 0) {
					System.out.println("Guessed number is larger than secret number, please try again: ");
				
				}else if(number < 0){
					System.out.println("Guessed number is less than secret number, please try again");
				
				}
				
				
			}else {
				System.out.println("You tried more than" +  index + " times. Sorry you have no more chance!");
			}		
				
		}while(number != 0);
		
		System.out.println("Congragulations! You have found the secret number! You have found this after " + index + " time(s)" );
		
		
	}

}
