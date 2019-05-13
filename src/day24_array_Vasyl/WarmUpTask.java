package day24_array_Vasyl;

public class WarmUpTask {
	public static void main(String[] args) {
		/* Write a loop that displays all possible combinations of two letters where
		 the letters 'a', or 'b', or'c', or 'd' or 'e'.
		 The combinations should be displayed in ascending alphabatical order:		
		 aa
		 ab
		 ac
		 ad
		 ae
		 ba
		 bb
		 bc
		 ... 
		 ee
		 	 */
		
		for(char letter = 'a'; letter <= 'e'; letter++ ) {
			for(char letter2 = 'a'; letter2<= 'e'; letter2++) {
				System.out.println(""+ letter + letter2);
//				System.out.print(letter);
//				System.out.println(letter2);
			}
		}
		
		System.out.println("\n---- method 2 -----");
		
		for(char letter = 'a'; letter <= 'e'; letter++ ) {
			for(char letter2 = 'a'; letter2<= 'e'; letter2++) {
				String letterString = Character.toString(letter);  // convert char letter to String 
				String letter2String = Character.toString(letter2);// convert char letter2 to String
				System.out.println(letterString + letter2String);
				
//				
			}
		}
		
		
		
	}

}
