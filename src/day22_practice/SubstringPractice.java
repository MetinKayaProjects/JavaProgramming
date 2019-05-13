package day22_practice;

public class SubstringPractice {
	public static void main(String[] args) {
		String word = "java";
		// System.out.println(word.substring(0,2));

		// print each character in seperate line using substring, no loop needed!

		System.out.println(word.substring(0, 1));
		System.out.println(word.substring(1, 2));
		System.out.println(word.substring(2, 3));
		System.out.println(word.substring(3, 4)); // or only (3) is also possible;
		
		System.out.println("\n******** 2 nd way**********\n");
		
		int i = 0;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++;
		System.out.println(word.substring(i, i + 1));
		i++; 

		System.out.println("\n******** 3rd way**********\n");

		for (int x = 0; x <= word.length()-1; x++) {
			String letter = word.substring(x, x + 1);
			System.out.println(letter);
		}
		
		System.out.println("\n******** REVERSE **********\n");
		//print letter in reverse
		for (int j = word.length()-1; j >=0; j--) {
			String letter2 = word.substring(j, j+1);
			System.out.println(letter2);
			
		}
		System.out.println("\n******** new task **********\n");
		
		int start = 1;
		int end = 5;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start, end));
		System.out.println(word2.substring(3, 4)); //t
		System.out.println(word2.substring(word2.length()-1)); // s        last character of word2
		
	}

}
