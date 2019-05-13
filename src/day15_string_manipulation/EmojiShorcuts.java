package day15_string_manipulation;

import java.util.Scanner;

public class EmojiShorcuts {
	public static void main(String[] args) {
		
		
		//String emoji = ":)";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an emoji as like :) , :( ,  :/ ,   :p ,   ;) , ;0 ,  (: ,  ): ");
		String emoji = input.next();
		
		
		if(emoji.length() != 2) {
			System.out.println("invalid emoji");
			return;
		}
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		
		if(first == ':'  ) {
			
			if(second == ')') {
			System.out.println("smile");
			
			}else if(second == '(') {
				System.out.println("sad");
			}else if(second == '/') {
				System.out.println("upset");
			}else if(second == 'p') {
				System.out.println("playful");
				return;
			}
		}
		
		if(first == ';'  ) {
			if(second == '0') {
				System.out.println("surprised");
			}else if(second == ')' ) {
				System.out.println("wink");
			}
		}
			
		
		if(first == '('  ) {
			if(second == '/') {
				System.out.println("upset");
				return;
			}
		}
	
		
	}

}
