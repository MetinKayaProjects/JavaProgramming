package day62_exceptions01;

public class ExceptionInCatchBlock3 {
	public static void main(String[] args) {
		
		String str = "10j";  //Code A  //ERROR   j is still there. this can not be converted to int
		
		try {
			int n = Integer.parseInt(str);//Code B    NumberFormatException  skip to catch
			System.out.println(n);        //Code C
		} catch (NumberFormatException e) {
			System.out.println(str.charAt(0));  //1   
			System.out.println("HEllo from the Catch block");  //E
			
		}finally {
			System.out.println("Hello from finally block");  //F
		}
		
		System.out.println("Bye Bye"); //this doesn't work and gives error message
		
	}

}
