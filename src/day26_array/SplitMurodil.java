package day26_array;

import java.util.Arrays;

public class SplitMurodil {
	public static void main(String[] args) {
															
		String words = "java,kava,html,selenium";		   //				0		1		2		  3			index
		String[] wordsArray=words.split(",");             // wordsArray={"java", "kava", "html", "selenium"};
		System.out.println("Count: " + wordsArray.length);//4				1		2		3		  4			length
		System.out.println(wordsArray[0]);  //java
		
		System.out.println(Arrays.toString(wordsArray));  //[java, kava, html, selenium]
		
		for(String word : wordsArray ) {
			System.out.println(word);   // java
		}								// kava
										// html
										// selenium
		
		
		String diceResult = "1 - 20 of 1,461 positions";
		//using split method, print 1,461
		String[] diceArray = diceResult.split(" ");							   //			  0  1  2   3    4         5        : index
		System.out.println("After split: " + Arrays.toString(diceArray));     //After split: [1, -, 20, of, 1,461, positions]
		System.out.println("Search result total: " + diceArray[4]); //1,461   //			  1  2  3   4    5         6        : length
		
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());
		
		System.out.println("\n***** **** ******\n");
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");
		
		System.out.println("\nAFTER ALLWORDS : ");
		for(String w : allWords) {
			System.out.println(w);
		}
		
		System.out.println("\nAFTER HAPPY SPLIT : ");
		
		for(String w : happySplit) {
			System.out.println(w);
		}
		System.out.println("\nAFTER ISPLIT : ");
		
		for(String w : ISplit) {
			System.out.println(w);
		}
		
		System.out.println(" ............");
		             //0123  
		String word = "java";
		char[] charsArray = word.toCharArray();

		for(char ch : charsArray) {
			System.out.println(ch);
		}
		//System.out.print(Arrays.toString(charsArray));
		
	}

}
