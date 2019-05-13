package day19_while_loops;


public class PrintLetters_Reverse {
	public static void main(String[] args) {
		
		String word = "Amazon";
//		   012345  index
//		   123456  count
//print each character in reverse order... >> nozamA
		
		int idx = word.length()-1;
		while(idx >= 0) {
			System.out.print(word.charAt(idx));
			idx --;
		}
			
	
	}

}
