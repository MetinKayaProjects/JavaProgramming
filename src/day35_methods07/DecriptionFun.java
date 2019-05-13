package day35_methods07;

public class DecriptionFun {
	public static void main(String[] args) {
		System.out.println(decryptSentence("r olev qzez")); //i love java
		System.out.println(decryptSentence("qzez rh ufm"));  //java is fun
		System.out.println(decryptSentence("dv ziv hgfwvmgh lu xbyvigvp hxsllo")); //we are students of cybertek school
		System.out.println(decryptSentence("szev z tllw wzb"));  //have a good day
		System.out.println(decryptSentence("ovgh tl slnv"));  //lets go home
		System.out.println(decryptWord("nrihslw"));   //mirshod
		System.out.println(decryptSentence("dllwvm hkllm"));  //wooden spoon
		
	}
	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		int i = encrypted.indexOf(ch);
		char ret =  alphabet.charAt(i);
		return ret;
	}

	public static String decryptWord(String word) {
		String converted = "";
		for (int i = 0; i < word.length(); i++) {
			converted += decryptChar(word.charAt(i));
		}
		return converted;		
	}

	public static String decryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += decryptWord(word)+" ";
		}
		return retValue.trim();
	}
	

}
