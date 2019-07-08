package day62_exceptions01;

public class TryCatchFinally {
	public static void main(String[] args) {
		String str = "selenium";
		
		
		try {
			System.out.println(str.length());//8
			System.out.println(str.charAt(49)); //ERROR. skip this line
		} catch (Exception e) {
			System.out.println("Enter correct index");
			e.printStackTrace();
			System.out.println("Message: " + e.getMessage());
			//return; //finally still works. Normally after return code stops and get out from main method. 
			System.exit(0); //bu varsa finally calismaz...
		}finally {
			System.out.println("Finally block");  //finally always run whenever codes are true or wrong
		}
		
		System.out.println("If there is return key above this line does not work");
	}
//finally 2 durumda calismaz:
//	1. JVM crash
//	2. System.exit(0); kullanilirsa...
}
