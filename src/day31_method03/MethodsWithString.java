package day31_method03;

import java.util.Arrays;


public class MethodsWithString {
	public static void main(String[] args) {
		
		countWords("Java is fun");
		countWords("this is method with strings");
		
		googleSearchREsults("About 121,000,000 results (0.75 seconds)");
		
		String resultsStr = "About 16,600,000 results (0.73 seconds)";
		googleSearchREsults(resultsStr);
	}
	
	/*
	 1. name : countWords
	 	return : void
	 	params/args : String sentence
	 	
	 	countWords("Java is fun");
	 	Print:
	 	"Words in this sentence [Java, is, fun]"
	 	"Number of words: 3"
	 */

	public static void countWords(String sentence) {
		
		String[] strArr = sentence.split(" ");
		System.out.println("Words in this sentence: " +Arrays.toString(strArr));
		
		System.out.println("Number of words in this sentence: " +strArr.length);
		
		System.out.println();
		
	}
	
//	
// 2. Methods : googleSearchREsults
//	  Return type : void
//	  params : 1 String
	
//	"About 121,000,000 results (0.75 seconds)"
//	"Results count: 121000000"
//	"Time in seconds: 0.75"
	public static void googleSearchREsults(String str2) {
		
		String[] str2Arr = str2.split(" ");
		
		System.out.println("Number of words in this str2 Array: " + str2Arr.length);
		
		System.out.println(Arrays.toString(str2Arr));
		System.out.println("Results count: " +str2Arr[1].replace(",", ""));
		System.out.println("Time in seconds: " + str2Arr[3].substring(1));
		
		System.out.println();
		
	}
	
	
	
}
