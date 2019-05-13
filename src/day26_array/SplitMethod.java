package day26_array;

import java.util.Arrays;

public class SplitMethod {
	public static void main(String[] args) {
		
		String words = "java,kava,html,selenium";
		
		
		String[] wordsArray = words.split(",");
		System.out.println(wordsArray);  //bu sekilde yazmaz: [Ljava.lang.String;@7852e922
		System.out.println(Arrays.toString(wordsArray));  //[java, kava, html, selenium]
		
		System.out.println("count: " + wordsArray.length);//4
		System.out.println(wordsArray[0]);  //java 
		
		
		
		for(String myWord : wordsArray) {
			System.out.print(myWord + " ");//java kava html selenium 
		}
		
		System.out.println();
		
		String diceResult = "1 - 20 of 1,461 positions";
		//using split method print 1,461
		String[] diceArray = diceResult.split(" ");
		System.out.println(Arrays.deepToString(diceArray));//[1, -, 20, of, 1,461, positions]
		System.out.println("Search result total: " + diceArray[4]);//Search result total: 1,461
		
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0].trim());//1 - 20
		System.out.println(diceArray2[1].trim());//1,461 positions
		
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] Isplit = sentence.split("I");
		
//		System.out.println(Arrays.toString(allWords));
//		System.out.println(Arrays.toString(happySplit));
//		System.out.println(Arrays.toString(Isplit));
		
		System.out.println("****");
		// or:
		
		for(String a : allWords) {
			System.out.print(a + " | ");
		}
		System.out.println();
		
		System.out.println("****");
		for(String b : happySplit) {
			System.out.print(b + " | ");
		}
		System.out.println();
		System.out.println("****");
		for(String c : Isplit) {
			System.out.println(c + " | ");
		}
		System.out.println();
        //0123  
		String word = "java";
		char[] charsArray = word.toCharArray();

		for(char ch : charsArray) {
			System.out.print(ch + " ");
		}
		
		
	}

}
