package day23_array_Vasyl;

public class PrintNumbersWithLoops_2 {
	public static void main(String[] args) {
		
		//outer loop will repeat printing of letters as many times as want
				//in this case we are gonna 3 times
				//so we are running inner loop 3 times
		//if index is even, print from z to a
		//if index is odd, print from a to z
				for(int i = 1; i <= 3; i++) {
					if(i%2==0) {
						for(char letter = 'z'; letter >= 'a'; letter--) {
							System.out.print(letter);
						}
						}else {
							for(char letter = 'a'; letter <= 'z'; letter++) {
								System.out.print(letter);
							}
					
					}
					System.out.println();	
					System.out.println("***********");
					
						
				}
					
			
		
	}

}
