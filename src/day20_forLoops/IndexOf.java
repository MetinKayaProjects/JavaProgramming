package day20_forLoops;

public class IndexOf {
	public static void main(String[] args) {
		String word = "amazon";
		char letter = 'z';
		//System.out.println(word.indexOf('z'));  //3
		
		int index = -1;   //we are assuming it is not found. Remember if it is not fount the value is -1.
		
		//using for loop - look for the letter
		//if it is a match assign value to index
		// exit for Loop
		//print value of index
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i)== letter) {
				index = i;
				break;
				
			}
		}
		System.out.println("Match index of letter " + letter + ": "+ index); //3  >> z charAt(3)'te... k'yi arasaydik sonyc -1 olacakti
		
		
		
		
		
	}

}
