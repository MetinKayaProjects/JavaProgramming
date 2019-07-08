package day63_exceptions02;

public class TryWithFinally {
	public static void main(String[] args) {
		
		try {
			System.out.println("In try block");
			System.out.println(10/0);  //Error
		} finally {
			System.out.println("In finally");
		} 
			
		System.out.println("After try finally");
	}

}
