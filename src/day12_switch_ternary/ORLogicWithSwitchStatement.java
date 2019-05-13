package day12_switch_ternary;

import java.util.Scanner;

public class ORLogicWithSwitchStatement {
	public static void main(String[] args) {
		
		System.out.println("What is the grade: ");
		Scanner scan = new Scanner(System.in);
		char grade = scan.next().charAt(0);
		// A,  B, C -> pass    D, E -> fail,   others-> invalid grade
		
		switch(grade) {
			case 'A':
			case 'B':
			case 'C':
				System.out.println("Pass");
				break;
			case 'D':
			case 'E':
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid grade");
		}
		
		/* String is also an alternative;
		
		String grade = scan.next();
		switch(grade) {
			case "A":
			case "B":
			case "C":
				System.out.println("Pass");
				break;
			case "D":
			case "E":
				System.out.println("Fail");
				break;
			default:
				System.out.println("Invalid grade");
		}
		*/
		
	}

}
