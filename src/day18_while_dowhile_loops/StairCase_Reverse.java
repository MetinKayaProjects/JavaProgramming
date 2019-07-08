package day18_while_dowhile_loops;

public class StairCase_Reverse {
	public static void main(String[] args) {
		
	/*
	 **********
	 ********* 
	 ******** 
	 ******* 
	 ****** 
	 ***** 
	 ****
	 **
	 * 
	 */
		
	String stairs = "**********";    
	int num = 10;
	
	while(num > 0) {
		System.out.println(stairs);
		stairs = stairs.substring(0,stairs.length()-1);
		num --;
	}
	
//	int idx = 0;
//		System.out.println(stairs.length());
//	for (int i = 10; i > 0; i--) {
//		System.out.println(stairs.substring(0,(stairs.length()-1-idx)));
//		idx++;
//	}
		
		
		
		
	
	}

}
