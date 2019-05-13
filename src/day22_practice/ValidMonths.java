package day22_practice;

import java.time.Month;
import java.util.Scanner;

public class ValidMonths {
	public static void main(String[] args) {
		/*
		 * valid months: 1 2 3 4 5 6 7 8 9 10 11 12 
		 * Enter month: 1 
		 * Enter month: 5 
		 * Enter month: 15 Invalid month
		 */
		int month;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter month:");
			month = scan.nextInt();

		} while (month >= 1 && month <= 12);
		System.out.println("invalid month");



	}

}
