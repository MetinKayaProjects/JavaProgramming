package day14_string_method;



public class CharAt {
	public static void main(String[] args) {
		
		String word = "Comp uter";
		
		// print all characters one by one
		System.out.println(word.charAt(0));  //C
		System.out.println(word.charAt(1));  //o
		System.out.println(word.charAt(2));  //m
		System.out.println(word.charAt(3));  //p
		System.out.println(word.charAt(4));  //
		System.out.println(word.charAt(5));  //u
		System.out.println(word.charAt(6));  //t
		System.out.println(word.charAt(7));  //e
		System.out.println(word.charAt(8));  //r
		
	
		System.out.println("====================\n                        ");
		//String word2 and check if first character is 'J'
		
		
		String word2 = "Java";
		if(word2.charAt(0)== 'J') {                 //j char oldugundan "" icinde gosterilemez   '' olmali
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
		
		//String word3 that consist of 5 characters
		// Check if first and last characters are same,
		//true==> "First and last match"
		//false==> "First and last different"
		
		String word3 = "civic";
		
		char first = word3.charAt(0);
		//char last = word3.charAt(4);              // bu da olurdu.
		char last = word3.charAt(word3.length()-1);   
		
		
		if(first == last) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last different");
		}
		
		/*if(word3.charAt(0)==word3.charAt(4)) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last different");
		}
		*/	 
	
		// String word4=> always print the last character 
		//no matter the length
		
		String word4 = "Automation";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last char of "+ word4 + " is " + lastChar); //Last char of Automation is n
		
		
	System.out.println("====================");
		//Comp uter
		System.out.print(word.charAt(0));
		System.out.print(word.charAt(1));
		System.out.print(word.charAt(2));
		System.out.print(word.charAt(3));
		System.out.print(word.charAt(4));
		System.out.print(word.charAt(5));
		System.out.print(word.charAt(6));
		System.out.print(word.charAt(7));
		System.out.println(word.charAt(8));
		
	}

}
