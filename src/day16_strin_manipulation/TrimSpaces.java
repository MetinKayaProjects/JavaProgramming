package day16_strin_manipulation;

public class TrimSpaces {
	public static void main(String[] args) {
		
		String word1 = " String methods ";
		System.out.println(word1);  // bosluk var.    Word2 before trim:   Three spaces here
		
		System.out.println(word1.trim());// cumlenin basindaki ve sonundaki bosluklari siler
										//  Word2 after trim:Three spaces here
		
		String word2 = "   Three spaces here";
		System.out.println("Word2 before trim:" + word2);
		word2 = word2.trim();
		System.out.println("Word2 after trim:" + word2);
		//System.out.println((word2.trim()));
		
		
	}

}
