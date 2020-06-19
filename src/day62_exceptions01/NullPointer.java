package day62_exceptions01;

public class NullPointer {
	
	static String name;  //null   bu durumda catch blok calisir
//	static String name="Alex";  // bu durumda try calisir ve ALI yazdirir
	
	public static void main(String[] args) {
		try {
			System.out.println(name.toUpperCase()); //NullPointerException error, since variable is not initiated.
		} catch (NullPointerException e) {
			System.out.println("NullPointerException happened");
			
			System.out.println("Here is the mnessage: " + e.getMessage());//null
			
			System.out.println("Here is the mnessage: "); 
			e.printStackTrace();
		}
		
		
	}

}
