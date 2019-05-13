package day20_forLoops;

import java.util.Scanner;

public class Neighboors {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter word");
		String word = scan.next();
		/*
		 * if character and next one are same print:
		 exp: aabcdd 
		 Beep - a
		 Beep - d
		 */
		
		for(int i = 0; i < word.length()-1; i++) {
			if(word.charAt(i)==word.charAt(i + 1)) {
				System.out.println("Beep - " + word.charAt(i));
			}
		}
		
		
	}

}
