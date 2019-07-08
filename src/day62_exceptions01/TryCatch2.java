package day62_exceptions01;

public class TryCatch2 {
	public static void main(String[] args) {
		try {
			int[] nums = {34, 6,34,12};
			
			System.out.println(nums[0]);//34
//			System.out.println(nums{0])  //compile errror since nums{0] is not correct syntax 
			System.out.println(nums[6]);//E R R O R in this line....

			System.out.println("Some code after array");
		} catch (Exception e) {
			System.out.println("There is an error, wrong index");
		}
		
		System.out.println("After exception...");
		
		System.out.println("***************");
		
		try {
			int j = 100;
			int n = j / 0; //error  ..running stops here...
			
			System.out.println(n);//java.lang.ArithmeticException: / by zero
		} catch (ArithmeticException e) {
			System.out.println("nums cannot divide by zero");
			e.printStackTrace();//print out what the error is:
			
//			java.lang.ArithmeticException: / by zero
//			at day62_exceptions01.TryCatch2.main(TryCatch2.java:23)   ----> error is at line 23!!!
			
			e.getMessage();// bu da ayni bilgiler getirir....
		}
		
		System.out.println("After try&catch");
		
	}

}
