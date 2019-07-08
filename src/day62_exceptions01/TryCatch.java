package day62_exceptions01;

public class TryCatch {
	public static void main(String[] args) {
		
		try {
		String str = "Java";
		System.out.println(str.charAt(0));//J
		System.out.println(str.charAt(5));//error: Exception happens...
		
//		Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
//		at java.lang.String.charAt(String.java:658)
//		at day62_exceptions01.TryCatch.main(TryCatch.java:9)
		
		System.out.println(str.charAt(1));//this line doesn't work since Exeption error above
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception happened in try block and was caught");
		}
		
		System.out.println("After Try&Catch block");
		
		System.out.println("----------------");
		
		try {
			String str2 = "Java is fun";
			System.out.println(str2.charAt(0));//J
			System.out.println(str2.charAt(5));//
			System.out.println(str2.charAt(1));//
			
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception happened in try block and was caught");
			}
			
			System.out.println("After Try&Catch block");
			
			System.out.println("----------------");
			
			try {
				String str3 = "Java is fun";
				System.out.println(str3.charAt(30));//Exception error
				System.out.println(str3.charAt(5));//
				System.out.println(str3.charAt(1));//
				
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("Exception happened in try block and was caught"); //this runs
				}
				
				System.out.println("After Try&Catch block");//this runs
		
	}

}
