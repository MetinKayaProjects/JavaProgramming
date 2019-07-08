package day62_exceptions01_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int num = scan.nextInt();
			System.out.println("you entered " + num);
			System.out.println(num/0);
			
		} catch (InputMismatchException | ArithmeticException e) { //catch (RuntimeException e) this works
			System.out.println("Invalid number, variable type...");
			main(null);
		}finally {  //In finally block, I normally clean up code that closes any open files, 
//			any open database connections etc.
			scan.close();
			System.out.println("Finally!!");
		}

	}

}
