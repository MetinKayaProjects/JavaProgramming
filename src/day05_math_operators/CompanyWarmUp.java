package day05_math_operators;

import javax.xml.ws.AsyncHandler;

public class CompanyWarmUp {
	
	private static final String Boolean = null;

	public static void main(String[] args) {
		//declare variables :
		//companyName
		//address
		//numberOfEmployees
		//revenue
		//isTechCompany
		
		//assign values:
		//"Facebook"
		//"Silicon Valley, CA"
		//10000
		//4 000 000
		//yes
		
		//Print statements and describe each value
		//Company name is Facebook
		//address is...
		//Number of employees is
		
		String companyName="Facebook";
		String address="Silicon Valley, CA";
		int numberOfEmployees=1000;
		long revenue=4000000474L; //geliri integerdan buyuk olabilecegi icin long olarak tanamladik
		boolean isTechCompany=true;
		
		System.out.println("Company name is " + companyName + ". Its adresss is "+address + 
				". The number of employees is " + numberOfEmployees + ".");
		System.out.println("The annual revenue is " + revenue);
		System.out.println("- Is the company Technology Company?");
		System.out.println("- The answer is = " + isTechCompany);
				
		System.out.println("- The answer is = " + "\"" + isTechCompany + "\"");
		
		// Degiskene birden fazla data atama.... // bunu ilk defa goruyouruz
		String aboutCompany = "Company " + companyName + " is located in " + address + 
		".\nThe number of empleyees is " + numberOfEmployees + " work for it."; //\n new line'a atar.
		
		
		
		System.out.println(aboutCompany);
		
		int num1=10;
		int num2=20;
		System.out.println("num1"+"num2"); //num1num2
		System.out.println(num1+""+num2); //1020
		
	}
	

}
