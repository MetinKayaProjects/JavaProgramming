package day62_exceptions01_1;

import java.io.File;
import java.util.Scanner;
//CHECKED EXCEPTION EXAMPLE. OFFICE HOURS SPECIAL!!!

public class ReadFile {
	public static void main(String[] args){ // throws Throwable
		File file = new File("products.txt"); //products.txt is in project level
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);//read the file into scanner object
			while(scanner.hasNextLine()) { //loop as long as there are lines of value
				System.out.println(scanner.nextLine()); //read the value of current line and switch to next line
			}
		}catch(Throwable t) {
			System.out.println("File not found!!!");
			t.printStackTrace(); //print exception stacktrace
		}finally {
			try { //handle possible nullpointer exception
				scanner.close();
			}catch(NullPointerException e) {
				System.out.println("NullPointer is caught in finally block!");
			}
		}
		
		System.out.println("END OF PROGRAM. BYE");
	}
}