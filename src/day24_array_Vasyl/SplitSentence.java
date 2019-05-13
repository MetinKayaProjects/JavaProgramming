package day24_array_Vasyl;

public class SplitSentence {
	public static void main(String[] args) {

		String sentence = "Java is a general-purpose computer-programming language"
				+ "that is concurrent, class-based, object-oriented, "
				+ " and specifically designed to have as few implementation " 
				+ " dependencies as possible. ";

	//	String[] words = sentence.split(" "); //bosluk gordugu yerde ayirir
		String[] words = sentence.split(", "); //virgul gordugu yerde ayirir
		for (String str : words) {
			System.out.println(str);
		}
//		System.out.println(); // combined sentences...
//		System.out.println(words[0]); //Java

	}

}
