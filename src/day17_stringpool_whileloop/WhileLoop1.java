package day17_stringpool_whileloop;

public class WhileLoop1 {
	public static void main(String[] args) {
		
		int n1 = 100;
		int n2 = 140;
		
		while(n2 > n1) {
			System.out.println("N2, "+ n2 + " is greater that N1, " + n1);
			n1 = n1 + 10;
		}
			System.out.println("E N D");
			
			// n1 = n1 + 10; //olmazsa sonsuza kadar devame eder. infinite loop
			
	}

}
