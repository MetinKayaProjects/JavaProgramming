package day18_while_dowhile_loops;

public class Alphabet_3 {
	public static void main(String[] args) {
		
		String letters = "";      // important!!! String!!!
		letters = letters + 'A';
		System.out.println(letters);
		
		letters = letters + 'B';
		System.out.println(letters);
		
		letters = letters + 'C';
		System.out.println(letters);
		
		letters = letters + 'D';
		System.out.println(letters);
		
		letters = letters + 'E';
		System.out.println(letters);
		
		
		System.out.println("------------------------------");
		
		char myLetter = 'A';
		while(myLetter <= 'Z') {
			letters = letters + myLetter;  //letters yukaridan ABCDE + A >> ABCDEA diye gidecek
			System.out.println(letters) ;
			myLetter++;
			
		}
	}

}
