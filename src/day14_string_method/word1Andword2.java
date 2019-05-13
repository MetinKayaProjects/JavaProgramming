package day14_string_method;

import java.util.Scanner;

public class word1Andword2 {
	public static void main(String[] args) {
		String word1, word2;
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter word1:");
		word1 = scan.next();
		
		System.out.println("Enter word2:");
		word2 = scan.next();
		
		if(word1.length() > word2.length()) {
			System.out.println(word1 + " is longer than " + word2);
		}else if(word2.length() > word1.length()){
			System.out.println(word2 + " is longer than " + word1);
		}else {
			System.out.println(word1 +" and "+ word2 +" are same length");
		}
		
				
	}

}
