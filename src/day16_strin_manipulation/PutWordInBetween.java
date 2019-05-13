package day16_strin_manipulation;



public class PutWordInBetween {
	public static void main(String[] args) {
		
		String chars = "<<>>";
		String word = "java";
		
		String result = chars.substring(0,2) + word + chars.substring(2);
		
		System.out.println(result);
		
		String chars2 = "{{}}";
		String word2 = "Automation";
		

		String result2= chars2.substring(0,2) + word2 + chars.substring(2);
		System.out.println(result2);
		
	}

}
