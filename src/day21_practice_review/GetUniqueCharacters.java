package day21_practice_review;

import java.util.Scanner;

public class GetUniqueCharacters {
	public static void main(String[] args) {
	
	/* Given a String word, print out unique characters from the word.
	 * Examples:
	 word = "wooden spoon"
	 		woden sp
	 word2 = "java"
	 		 jav
	 word3 = "aabbccdeeffffg"
	 		 abcdefg
	 */
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = keyboard.nextLine();
		String unique = "";
		
		//char ch = word.charAt(0);
		//System.out.println(unique.contains("" + ch));
		
		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			String letterString = Character.toString(letter); //char is converted to String
			if(!unique.contains(letterString)){
			unique +=letterString;
			}
//			if(!unique.contains("" + word.charAt(i))) {   //"" + word.charAt(i) >>> char'i string'e cevirmek icin: "" 
//				unique += word.charAt(i);  //unique = unique + ch;
								
//			}
			
		}System.out.println("Unique: " + unique);
		
	}

}
