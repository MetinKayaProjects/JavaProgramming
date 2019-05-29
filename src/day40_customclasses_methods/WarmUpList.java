package day40_customclasses_methods;
import java.util.*;
public class WarmUpList {
	 public static void main(String[] args) {
	        ArrayList<String> myList = new ArrayList<>();
	        myList.add("Moon");
	        myList.add("Sun");
	        myList.add("Mars");
	        myList.add("Saturn");
	        myList.add("Venus");
	        myList.add("Earth");
	        myList.add("Sun");
	        myList.add("Pluto");
	        myList.add("Mercury");
	        myList.add("Neptune");
	        myList.add("Sun");
	        
	        String targetWord = "Pluto";
	        int count = countOccurences(myList, targetWord);
	        if(count == 3) {
	            System.out.println("Unit test PASS: Count is 3.");
	        }else {
	            System.out.println("Unit Test FAIL: Count is " + count);
	            System.out.println("Expected: 3 " + targetWord + " in the " + myList);
	            System.out.println("Result: " + count);
	        }
	        
	    }
	                                     //[aa, aa, bb, jj, yy]           aa
	    public static int countOccurences(ArrayList<String> list, String word) {
	        int count = 0;
	        for(String str : list) {
	            if(str.equals(word)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	}
