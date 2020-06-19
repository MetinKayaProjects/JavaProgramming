package day16_strin_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;

public class TheLongestWord {

	public static void main(String[] args) {
		
		String str = "A poor man helped a rich woman carrying her heavy goods to home from a long distance";
                
		System.out.println(theLongest2(str));
		
	}
	public static String theLongest(String str) {
		String[] strArr = str.split(" ");
		
		String longestWord = "";
		int maxLength = 0;
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length()>maxLength) {
				longestWord = strArr[i];
				maxLength = strArr[i].length();
			}
		}
		
		return  maxLength+" and " + "\"" +longestWord +"\""; 
	}
	
	public static Map<String, Integer> theLongest2(String str) {
		String[] strArr = str.split(" ");
		
		Map<String, Integer> longestWords =  new HashMap<>();
		int maxLength = 0;
		
		
		
		
		for (int i = 0; i < strArr.length; i++) {
			
			for (int j = 0; j < strArr.length; j++) {
				
				if (strArr[i].length()>= strArr[j].length()) {
					longestWords.put(strArr[i], strArr[i].length());
//					maxLength = strArr[i].length();
										
				}
			}
			
		}
		
	
		
		return  longestWords; 

	}
}


