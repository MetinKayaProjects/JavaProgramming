package day23_array_Vasyl;

import java.util.Scanner;

import day14_string_method.word1Andword2;


public class SixWords {
	public static void main(String[] args) {
		
		/*
		 *Write a program that will take from user 4 words
		 *concat words with a comma
		 *if words equals to java
		 *skip this word
		 *print summary at the end of the program
		 */
		
		Scanner scan = new Scanner(System.in);
		String summary = "";
		
		for (int i = 1; i <= 4; i++) {
			System.out.println("Enter a word " + i + ": ");
			
			String word = scan.next();
			if(word.equals("java")) {
				continue;  //skip or ignore "java" and go ahead
				
			}summary += word + ", ";
			
		}
//		if(summary == "") {
//			summary = "";
//		}
		//System.out.println("Summary: " + summary.substring(0, summary.length()-2));
		System.out.println("Summary: " + (summary.length() > 1 ? summary.substring(0, summary.length() - 2) : "no words!"));
		
		
	}

}
