package day20_forLoops;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		
				//Multiplication table 
		System.out.println("\n****   Multiplication table ****\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		//******* check if it is valid (num should be between 1-10. if it is not valid then return.
		if(num < 1 || num > 10) {
			System.out.println("ERROR: Invalid inputs. Numbers should be between 1 and 10");
			//return;  //stop execution here
			System.exit(0);  //more powerful method
		}
		
		for(int i = 1; i <= 10; ++i) {
			System.out.println(num + " x " + i + " = " + (num * i));
			
		}
		
		
		//for loop toprint multiplication table
		
	}

}
