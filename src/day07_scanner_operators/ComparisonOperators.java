package day07_scanner_operators;

public class ComparisonOperators {
	public static void main(String[] args) {
		
		//== equals
		
		System.out.println(5 == 5); //true yazdirir.
		System.out.println(50 == 5);//false yazdirir
		
		System.out.println("==========================");
		
		int searchCount = 5000;
		System.out.println(searchCount == 5000); //true
		System.out.println(searchCount != 5000); //false   != not equal  demek.
		
		System.out.println("==========================");
		
		int expectedCount = 5010;
		System.out.println(searchCount = 5010); //5010 yazdirir
		System.out.println(searchCount == 5010); //true yazdirir
		
		int speedLimit = 55;
		int currentSpeed = 75;
		
		System.out.println(currentSpeed == speedLimit); //false
		
		System.out.println("==========================");
		
		boolean atLimit = currentSpeed == speedLimit; // her defasinda yazmamak icin boolean olarark tanimladik.
		
		System.out.println("At speed limit: " + atLimit);//false. 
		
		boolean overLimit = currentSpeed > speedLimit; //75>55 true
		System.out.println("Over speed limit: " + overLimit);//true
		
		boolean underLimit = currentSpeed < speedLimit; //75<55   false
		System.out.println("Under speed limit : " +underLimit);//false
		
		System.out.println("==========================");
		double balance = 150.0;
		boolean broke = balance <= 0.0; //150.0<=0.0 false
		System.out.println("Broke : " + broke); //false
		
		System.out.println("==========================");
		
		double transaction = 155.5;
		broke = (balance - transaction)<0; //150.0-155.5=-5.5<0 true
		System.out.println("Will make broke/negative? " +broke);
		System.out.println("Balance: " +balance);
		System.out.println("Transaction: " + transaction);
		
		
		
		
		
	}
	
	
	
	

}
