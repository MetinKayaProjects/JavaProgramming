package day09_stringequals_conditionals;

import java.util.Scanner;

public class Citizens_033 {
	
	public static void main(String[] args) {
		
		int seniorCitizens, nonSeniorCitizens, age;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens = input.nextInt();
		nonSeniorCitizens = input.nextInt();
		
		System.out.println("What is new citizen's age?");
		age = input.nextInt();
		
		if(age >= 65) {
			System.out.println("Senior Citizen");
			seniorCitizens = ++seniorCitizens;
			
			
		}else {
			System.out.println("Non-Senior Citizen");
			nonSeniorCitizens = ++nonSeniorCitizens;
					
		}
	
		System.out.println("New seniorCitizens count "+seniorCitizens);
		System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
		
		
		
		
	
	}
	

}
