package day62_exceptions01;

public class ExceptionInCatchBlock {
	public static void main(String[] args) {
		
		String str = "10";  //Code A  j is removed
		
		try {
			int n = Integer.parseInt(str);//Code B    NumberFormatException  skip to catch
			System.out.println(n);        //Code C
		} catch (NumberFormatException e) {
			System.out.println(str.charAt(1));  //D   corrected. instead of 10 we declare 1. iy works
			System.out.println("HEllo from the Catch block");  //E
			
		}finally {
			System.out.println("Hello from finally block");  //F
		}
		
		System.out.println("Bye Bye"); //this doesn't work and gives error message
		
	}

	/*
	 * 	10							//A
		Hello from finally block	//finally block'a atlar. cunki catch'in ici de yanlis... str'de 10 index'i yok
		Bye Bye						//try&catch'in disi
	 */
	
}
