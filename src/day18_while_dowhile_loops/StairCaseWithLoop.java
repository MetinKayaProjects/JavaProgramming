package day18_while_dowhile_loops;

public class StairCaseWithLoop {
	public static void main(String[] args) {
		
		/*
		 
		 * 
		 ** 
		 ***
		 **** 
		 ***** 
		 ******
		 */
		
		String stairs = "*";
		
		//1st way with a counter
		
		int num = 1;
		while(num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		
		System.out.println("\n\n  2nd way checking length***************");
		
		stairs = "*";
		
		while(stairs.length() <= 10 ) {
			System.out.println(stairs);
			stairs += "*"; 
		}
		
		
		
	}

}
