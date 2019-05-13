package day19_while_loops;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {
		/*
		 you have a balance
		 and assign a value to the balance using scanner.
		 
		 What is transaction amount?
		 transaction.
		 
		 we keep doing transactions until we run out of balance.
		 100
		 30
		 40
		 
		 you have insufficient fund, your balance is -10
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance: ");
		double balance = scan.nextDouble();
		
		
		
		while(balance > 0) {
			
			System.out.println("What is transaction amount: ");
			double transaction = scan.nextDouble();
			
			balance -= transaction;  //balance = balance - transaction;
			System.out.println("Your balance is now " + balance);
	
		}
		System.out.println("you have insufficient fund for more transaction, your balance is " + balance);
		
		
		/*
		 1. it needs to keep track of transactions track count
		 2. if any transaction is about to make nmake balance negative or 0, it needs to print a warning
		 3. after every time, we make tranasaction, program should display remaining balance
		 4. "Succesful transaction count: " + 3
		 */
		
		
		
		
		
	}

}
