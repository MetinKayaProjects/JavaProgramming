package day23_array_Vasyl;

import java.util.Scanner;

public class Break_2 {
	public static void main(String[] args) {
		
			//let's write a program that will calculate a sum of 6 numbers
			//if numbers is less or equals to 0, ignore this.
			//we need to ask user to provide a number
			
			
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			int num = 0;
			for (int i = 1; i <= 6; i++) {
				System.out.println("Enter a number " + i + ": " );
				num = scan.nextInt();
				if(num <= 0) {
					break;
				}
				sum +=num;
				
			}System.out.println("total sum: " + sum);
	}

}
