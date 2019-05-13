package day18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPincode_2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int secretPincode = 4321;
		
		// give only 3 attempts
		//if attemps reaches more that 3 print "Card blocked"
		
		int myPincode = 0;
		int attempts = 0;
		
		while(myPincode != secretPincode && attempts <= 3){
			System.out.println("Enter the pincode: ");
			myPincode = scan.nextInt();
			attempts++;
			
			if(attempts == 3 && myPincode != secretPincode) {
				System.out.println("You entered incorrect code 3 times. Card is blocked!");
				return; //stop
			}
		}
		System.out.println("Access is  granted. That is correct, go on");
		
		
		
		
	}

}
