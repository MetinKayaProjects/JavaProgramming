package day63_exceptions02;

public class CustomExceptionTest {
	public static void main(String[] args) throws NeedSomeCoffeeException {
		
		double balance = 200;
		double transcation = 210;
		
		if (transcation > balance) {
			throw new InsufficientFundsException("Balance is toolow");
		}else {
			System.out.println("Purchase is successfull.");
			balance -= transcation;
		}
		
		
		throw new NeedSomeCoffeeException("getting sleepy"); //bunun compile olmasi icin 2 yol var> handle and throw keyword
	
	
	}

}
