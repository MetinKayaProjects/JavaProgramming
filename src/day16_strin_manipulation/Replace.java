package day16_strin_manipulation;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type word(s):");   //she looks sad today
		
		String words = scan.nextLine();
		//words = words.replace("a", "y");
		System.out.println(words.replace("a", "y"));   //   she looks syd todyy
		
		System.out.println(words.replace("sad", "happy"));  //she looks happy today
		
		System.out.println(words.replace(" ", "|"));   //she|looks|sad|today
	}
	

}
