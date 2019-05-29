package day31_method03;

import java.util.Arrays;

public class MethodsWithString_Murodil {
	public static void main(String[] args) {
		countWords("java is fun");
		countWords("this is method with strings");
		
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
//		[About, 121,000,000, results, (0.75, seconds)]
		
		String resultsStr = "About 16,600,000 results (0.73 seconds)";
		googleSearchResults(resultsStr);
		
	}
	/*
	  name: countWords
      return: void
      params/args: String sentence
      countWords("Java is fun");
      "Words in this sentence [Java, is, fun]"
      "Number of words: 3"
	 */
	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Words in this sentence "+ Arrays.toString(words));
		System.out.println("Number of words: " + words.length);
		
		System.out.println();
	}
	
	//   googleSearchResults("About 121,000,000 results (0.75 seconds)");
	public static void googleSearchResults(String result) {
		//split by space into array
		String[] words = result.split(" ");
		System.out.println(Arrays.deepToString(words));//[About, 121,000,000, results, (0.75, seconds)]
		String count   = words[1].replace("," , "");
		String seconds = words[3].replace("(" ,  "");
		
		System.out.println("Results count: " + count);
		System.out.println("Time in seconds: " + seconds);	
	}

}
