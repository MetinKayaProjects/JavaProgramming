package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {

		System.out.println("What is the voting age in this country? ");
		Scanner input1 = new Scanner(System.in);
		//System.out.println("What is the voting age in this country? "); //buraya da yazabilirsin.
		int votingAge = input1.nextInt();
		System.out.println("Voting age in this country is " + votingAge + ".");

		Scanner input2 = new Scanner(System.in);
		System.out.println("What is your age?");
		int yourAge = input2.nextInt();
		
		int needTime = votingAge - yourAge;
		int moreYear = yourAge - votingAge;
		
		if (yourAge >= votingAge) {
			System.out.println("You have been eligible to vote for " + moreYear + " years.");
		} else {
			System.out.print("You are too little to vote. ");
			System.out.println("You have to wait " + needTime + " more years.");
		}

	}
}
