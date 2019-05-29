package day28_multid_arrays;

import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[] args) {

		/*
		 Create a String variables sentence and assign value 
		 -find out and print numbers of words 
		 -reverse the sentence and assign to new String called reversed 
		 -print the reversed
		 */

	String str = "you are very interesting person";
	
	String[] strArr = str.split(" ");
	
	
	System.out.println("Number of words: " + strArr.length); 
	System.out.println("Before: " + Arrays.toString(strArr));//Before: [you, are, very, interesting, person]
	
	String reverse= "";
	for (int i = strArr.length-1; i >= 0; i--) {
		//System.out.print(strArr[i]+ " ");
		reverse += strArr[i] + " ";
		}
		System.out.println("After reverse: " + reverse.trim());//After reverse: person interesting very are you
	
	}

}
