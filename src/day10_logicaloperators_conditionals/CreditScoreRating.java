package day10_logicaloperators_conditionals;

import java.util.Scanner;

public class CreditScoreRating {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score: ");
		int creditScore = scan.nextInt();
		
		//Excellent when score is 750 - 850 (range)
		
		if (creditScore >= 750 && creditScore <= 850) {  // and ile &&
			System.out.println("Your credit score is Excellent");
			
		}else if (creditScore >= 700 && creditScore <= 749) {  // and ile &&
			System.out.println("Your credit score is Good");
		
		
		}else if (creditScore >= 650 && creditScore <= 699) {  // and ile &&
			System.out.println("Your credit score is Fair");
		
		}else if (creditScore >= 550 && creditScore <= 649) {  // and ile &&
			System.out.println("Your credit score is Poor");
		
		}else if (creditScore >= 0 && creditScore <= 549) {  // and ile &&
		System.out.println("Your credit score is Bad");
		
		}else {
		System.out.println("Invalid score");
		
	}
}
}
