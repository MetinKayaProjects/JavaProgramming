package day06_operators2;

import java.awt.geom.Area;
import java.util.Scanner;

public class ScannerNameAndAge {
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		System.out.println("How old are you : ");
		
		int age = x.nextInt();
		System.out.println("You are "+ age + " years old.");
		
		System.out.println();//bos bir satir birakmak icin
		
		Scanner y = new Scanner(System.in);
		System.out.println("What is your name : ");
		
		String fullName = y.nextLine(); //next yerine nextLine dersen takip eden satiri da alir.
		System.out.println("Your name is " +fullName+ " and " + "you are " +age+ " years old.");
	
		
		
		
		
		
	}

}
