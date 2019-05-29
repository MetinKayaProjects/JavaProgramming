package day23_array_Vasyl;

public class PrintWord {
	public static void main(String[] args) {
		
		String word = "javajavakaya";
		for (int i = 0; i <= word.length()-1; i++) {
			if(word.substring(i,i+1).equals("a")) {
			//if(word.charAt(i)==('a')) {
			continue; //skip, ignore a
			}
			System.out.println(word.substring(i, i+1));
		
		}
	
		
	}

}
