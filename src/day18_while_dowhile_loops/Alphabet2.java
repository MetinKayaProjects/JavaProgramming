package day18_while_dowhile_loops;

public class Alphabet2 {
	public static void main(String[] args) {
		
		System.out.print("\n\n ****** Alphabet: *********\n\n ");
		char letter = 'a';
		
		while(letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
		}
		
		
		System.out.print("\n\n ****** Capital char: *********\n\n ");
		char capital = 'A';
		while(capital <= 'Z') {
			System.out.print(capital + " ");
			capital++;
		}
		System.out.print("\n\n **********  print lowercase in reverse: *********** \n\n");
		
		char reverse = 'z';
		while(reverse >= 'a') {
			System.out.print(reverse + " ");
			reverse--;
		}
		
	}

}
