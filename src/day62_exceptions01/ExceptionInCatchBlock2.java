package day62_exceptions01;

public class ExceptionInCatchBlock2 {
	public static void main(String[] args) {
		
		String str = "10";  //Code A
		
		try {
			int n = Integer.parseInt(str);//Code B    it works
			System.out.println(n);        //Code C
		} catch (NumberFormatException e) {
			System.out.println(str.charAt(10));  //D   ERROR, since this index is invalid  //skip to finally
			System.out.println("HEllo from the Catch block");  //E
			
		}finally {
			System.out.println("Hello from finally block");  //F
		}
		
		System.out.println("Bye Bye"); //this doesn't work and gives error message
		
	}

}
