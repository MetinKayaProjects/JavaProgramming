package day18_while_dowhile_loops;

import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[] args) {
		
		int dollars = 0;
        while(dollars != 5) {
            System.out.println("Give me 5 dollars.");
            Scanner scan = new Scanner(System.in);
            dollars = scan.nextInt();
            
        }
        System.out.println("Thank you for 5 dollars");
		
		
	}
	
	

}
