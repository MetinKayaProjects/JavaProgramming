package day15_string_manipulation;

public class SubString {
	public static void main(String[] args) {
		
		String sentence = "Java String manipulation is fun";
		System.out.println(sentence.substring(0,4));	//Java
		
		//print String
		
		System.out.println(sentence.substring(5,11)); //String
		System.out.println(sentence.substring(7,11)); // ring
		int length = sentence.length();
		System.out.println(length); //31
		System.out.println(sentence.substring(2, length)); //va String manipulation is fun
	}

}
