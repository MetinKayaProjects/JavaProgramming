package day23_array_Vasyl;

public class FiveRowsLetters {
	public static void main(String[] args) {
		
		//outer loop will repeat printing of letters as many times as want
		//in this case we are gonna 3 times
		//so we are running inner loop 3 times
		for(int i = 1; i <= 3; i++) {
			//write a for loop that will print letter from a to z
			System.out.print("Line  "+ i + "  : ");
			for(char letter = 'a'; letter <= 'z'; letter++) {
			System.out.print(letter);
		}
			System.out.println("\n**************************************");   //   \n: to jump to next line 
			
		}
	}

}
