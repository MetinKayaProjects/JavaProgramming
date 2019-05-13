package day19_while_loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		//Palindrome: adam, madam, civic, racecar, anna, bob etc.
		
		/*
		 String word = "anna"
		 check that the word is Palindrome
		 */
		//1st way : reverse it and assign it different string. And compare if it matchs
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write down a word to check if it is a Plindrome word: ");
		String word = scan.next();
		String reversed = "";
		
		// loop through word in reverse order and
		//concetanate each character to reverse string
		
    	//compare of word and reversed are equal
	
		int idx = word.length()-1;
		while(idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx --;
			
			
		}
		
		if(reversed.equalsIgnoreCase(word)) {
			
			System.out.println("Yes, the reversed of " + "\""+ word +"\" " + " is match, so this a Palindrome word");
		}else {
			System.out.println("Unfortunately, \""+ word +"\" " +" is not a Palindrome word");
		}
		
	}

}
