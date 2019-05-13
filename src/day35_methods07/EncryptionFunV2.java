package day35_methods07;

public class EncryptionFunV2 {
	public static void main(String[] args) {
		System.out.println(encryptChar('z')); // a
		System.out.println(encryptChar('m')); // n

		String normal = "sunday";
		String encrypted = encryptWord(normal);// normal: sunday
		System.out.println("normal: " + normal + "\n" + "encrypted: " + encrypted);// encrypted: hfmwzb
		System.out.println();
		
		System.out.println(encryptSentence("Java is fun")); //qzez rh ufm
		System.out.println(encryptSentence("I love Java"));  //r olev qzez
	}
	/*
	 * encryptChar return type: char param: char takes a char and returns encrupted
	 * version encryptChar('b') ==> 'y'
	 */
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
		// return encrypted.charAt( alphabet.indexOf(ch) );
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}

	/*
	 * encryptWord return type: String param: String take a string and returns
	 * encrypted version for the whole word
	 */

	public static String encryptWord(String word) {
		String cyphered = ""; // key
		for (int i = 0; i < word.length(); i++) {
			cyphered += encryptChar(word.charAt(i)); // encryptChar yukaridaki method
		}
		return cyphered;
	}

	/*
	 * encryptSentence return type: String param: String sentence Split the sentence
	 * by space and call encryptWord and return encrypted sentence
	 */
	public static String encryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += encryptWord(word) + " ";  //bu metodu yukarida olusturduk: encryptWord(String word)
		}
		return retValue.trim();
	}

}
