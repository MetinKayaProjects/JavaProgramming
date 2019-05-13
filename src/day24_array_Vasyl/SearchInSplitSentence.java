package day24_array_Vasyl;

public class SearchInSplitSentence {
	public static void main(String[] args) {
		String sentence = "Java is a general-purpose computer-programming language"
				+ " that is concurrent, class-based, object-oriented, "
				+ " and specifically designed to have as few implementation " 
				+ " dependencies as possible. ";

		String[] words = sentence.split(" "); //space gordugu yerde ayirir. sentence is converted to words array.
		
		int counter = 0;
		for (String str : words) {
			System.out.println(str);
			if (str.equals("language")) {
				break;
			} else {
				counter++;
			}

		}
		System.out.println();
		System.out.println("Position of language is: " +counter ); //Position of language is: 4
		
		//Java is a general-purpose computer-programming language
		// 0   1  2            3                             4
//		System.out.println(); // combined sentences...
//		System.out.println(words[0]); //Java
		
		
		
		
	}

}
