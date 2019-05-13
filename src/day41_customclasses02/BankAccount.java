package day41_customclasses02;

import java.util.*;

public class BankAccount {

	double balance; // default 0
	String accountHolder;
	int accountNumber;

	public void deposit(double amount) {
		System.out.println("\n----------------");
		System.out.println("depositing $ " + amount + " to " + " accountNumber: " + accountNumber);
		balance += amount;
		System.out.println("balance: " + balance);
	}

	public void withdraw(double amount) {
		System.out.println("\n----------------");
		System.out.println("withdrawing $ " + amount + " from " + " accountNumber: " + accountNumber);
		balance = balance - amount; // balance -= amount;
		System.out.println("balance : " + balance);
		if (balance < 0) {
			balance -= 35;
		}
		System.out.println("balance: " + balance);
	}

	public void showBalance() {
		System.out.println("\n=====Balance=======");
		System.out.println("accountHolder: " + accountHolder);
		System.out.println("accountNumber: " + accountNumber);
		System.out.println("balance $: " + balance);

		System.out.println("========");
	}

	public void charge(double price, String item) {
		System.out.println("\n----------------");
		if (balance >= price) {
			System.out.println("buying " + item + " and for $" + price + " from " + " accountNumber: " + accountNumber);
			balance -= price;
		} else {
			System.out.println("insufficient funds to purchase from " + " accountNumber: " + accountNumber);
		}
	}

}
