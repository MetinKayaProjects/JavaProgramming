package day19_while_loops;

public class PrintLetters {
	public static void main(String[] args) {
		
		String word = "Amazon";
//					   012345  index
//					   123456  count
		//print each character one by one in seperate lines
		
		
		System.out.println("\n ******** 1st way ************\n");
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		
		
		System.out.println("\n ******** 2nd way ************\n");
			
		int indx = 0;
		
		while(indx < word.length()) {
			
			System.out.println(word.charAt(indx));
			indx ++;
			
		}
		
		
		
		
		
		
	}

}
