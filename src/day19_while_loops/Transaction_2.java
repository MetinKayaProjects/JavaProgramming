package day19_while_loops;

import java.util.Scanner;

public class Transaction_2 {
	public static void main(String[] args) {
		/*
		 1. it needs to keep track of transactions track count
		 2. if any transaction is about to make balance negative or 0, it needs to print a warning
		 3. after every time, we make tranasction, program should display remaining balance
		 4. "Successful transaction count: " + 3
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance: ");
		double balance = scan.nextDouble();
		
		
		int count = 0;
		while(balance > 0) {
			count ++;
			System.out.println("What is transaction #" + count+ " amount");
			double transaction = scan.nextDouble();
			
			if(transaction > balance) {
				System.out.println("Be careful, this transaction makes your balance negative"); //2
				
				System.out.println("Do you wanna go on: Yes | No");
				String answer = scan.next();
				
				if(answer.equalsIgnoreCase("yes")) {
					System.out.println("What is transaction amount #" + count+ " amount");
				}else {
					System.out.println("Please try with less amount than your available balance: " + balance);
					return;
				}
				
			}
			
			balance -= transaction;  //balance = balance - transaction;
			System.out.println("Your balance is now " + balance); //1
			
			
	
		}
		System.out.println("you have insufficient fund for more transaction, your balance is " + balance);
		
		
	
		//GIB'ten Murodil'in codingine bak...
		
		
		
		
		
	}

}
