package day23_array_Vasyl;

import java.util.Scanner;

import javax.imageio.stream.ImageInputStream;

public class PrimeNumbers {
	public static void main(String[] args) {
		/*
		 Write a program that will verify if number is prime.
		 Prime number is a whole number greater than 1 and 
		 cannot be made by multiplying other whole numbers except for itself.
		 */
		System.out.println("enter a number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + " is not a prime");
				return;
			}

		}System.out.println(num + " is a prime number");
		
		
		
		
	}
	

}
