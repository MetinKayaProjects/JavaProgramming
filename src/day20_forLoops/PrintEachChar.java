package day20_forLoops;



public class PrintEachChar {
	public static void main(String[] args) {
		String word = "CybertekSchool";
		
		System.out.println("\n----using for loop, print each char one by one---\n");
		//using for loop, print each char one by one
		
		for(int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
		}

		System.out.println("\n\n---using for loop, print only vowel (a,e,o,i,u)---\n");
		//using for loop, print only vowel (a,e,o,i,u)
		
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(letter == 'a' || letter == 'e' || letter == 'o' ||
			   letter == 'i' || letter == 'u'	) {
				System.out.print("Vovels: " + letter + " in line : " + "[" + i + "]; \n");
			}
		}		
		
		System.out.println("\n---using for loop, print only consonants---\n");
		//using for loop, print only consonants
		
		for(int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if( !(letter == 'a' || letter == 'e' || letter == 'o' ||
			   letter == 'i' || letter == 'u') ) {
				System.out.print("Consonants: " + letter + " in line : " + "[" + i + "]; \n");
			}
		}
	}
}

	