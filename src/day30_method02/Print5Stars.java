package day30_method02;

import java.util.Scanner;

public class Print5Stars {
	public static void main(String[] args) {
	
		print5Stars();

							//		print print5Stars 100 times						//you can code here as well!
							//		for (int i = 1; i <= 100; i++) {
							//			System.out.println(i + "   * * * * *");
							//		}
		
		introduce();
		introduce();
		
		
	}

	
	public static void print5Stars() {
		//1. Name: print5Stars	--> "*****"
		
		System.out.println("* * * * *");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "    * * * * *");   
		}
		
	}
	
	public static void introduce() {
		System.out.println();
		//method name : introduce()
		//params/args : nothing
		//return type : void
		//it will ask a name and say "Nice to meet you name"
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name: ");
		String name = scan.nextLine();
		System.out.println("Nice to meet you " + name);
		
	}
	
}
