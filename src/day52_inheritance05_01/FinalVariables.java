package day52_inheritance05_01;

public class FinalVariables {
//	main class icerisnde degil de ayri bir class icerisndekiki variable: instance var
//	buradaki final variable'a burada assign yaparsan calisir
//	burada declare yapmayip constructor'da ya da init'de de yaapbilirisin
	
	
//	final int MAX_RANGE;  //>> if we don't assign it it doesn't work
	public final int MAX_RANGE = 310;  //instance variable
	public final int MODEL_3_MAX_SPEED;//burada assign etmedik ama constructoreda assign ettik. bu olur.
	public final int MODEL_X_PASSSANGER;
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "CyberTek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "admin@gmail.com";
//		COMPANY_NAME = "BankOfAmerica";  //  public class FinalVariables()'da daha once declare edildigi icin (final) degistitirlemez
	}
	
	public FinalVariables() {
		MODEL_3_MAX_SPEED = 160;  //declare in the class and assign in the constructor
		
	}
	{
		MODEL_X_PASSSANGER=5;
	}
	public FinalVariables(int max) {
		MODEL_3_MAX_SPEED = max;  //declare in the class and assign in the constructor
		
	}
	
	
	public static void main(String[] args) {
		
		final int MAX_PASSANGERS_COUNT = 5;  //final variable generally written UpperCase. 
//		final variables cannot be changed after assigned it
//		MAX_PASSANGERS_COUNT = 6;  >> not compile because of the final.
		
//		Math.PI;  not compile
		
		final double PI = 3.14159;
		
		System.out.println(MAX_PASSANGERS_COUNT);
		
		final int SSN;
		SSN = 444444444; // can be assigned only one time since this is final variable
		
//		SSN = 333333333;  //this is not possible...
		
		
		FinalVariables finalVars = new FinalVariables();
		System.out.println(MAX_PASSANGERS_COUNT);
//		System.out.println(MAX_RANGE);  //doesnt work since it is declare in 
		System.out.println(finalVars.MAX_RANGE);
		System.out.println(finalVars.MAX_RANGE);
		System.out.println(finalVars.JAN);
		System.out.println(finalVars.MODEL_3_MAX_SPEED);
		System.out.println(finalVars.MODEL_3_MAX_SPEED);
		System.out.println(Integer.MAX_VALUE); //bunun class'i Integer
		
		System.out.println("Company name: " +COMPANY_NAME); // in the same class
		System.out.println("Company name: " + FinalVariables.COMPANY_NAME);
		System.out.println("admin: " + ADMIN_USERNAME);
		System.out.println("admin: " + FinalVariables.ADMIN_USERNAME);
	}

}
