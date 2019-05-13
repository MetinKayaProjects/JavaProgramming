package day08_casting_conditionals;

import java.util.Scanner;

public class PhoneNum {
	
	 public static void main(String[] args) {
			
		 System.out.println("Enter the area code: ");
			
		 Scanner input = new Scanner(System.in);
			
			int areCode = input.nextInt();
			
			System.out.println("Enter the local number: ");
			int localNumber = input.nextInt(); 
			//long localNumber = input.nextLong(); //boyle de yazabilirdik....
			
			
			String phoneNumber = "Calling number " + "(" + areCode +")" +"-" +localNumber;
			
			System.out.println(phoneNumber);
		
		
		
		//Write a program that asks user to input int values: areaCode and localNumber.

		//-Using concatenation put together in this format and assign to String phoneNumber  variable:

		//-(222)-3334444

		//-Write a print statement that displays (use phoneNumber variable ): 
		//Calling number (222)-3334444
		
		
		
	}

}
