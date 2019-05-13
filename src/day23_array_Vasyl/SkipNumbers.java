package day23_array_Vasyl;

public class SkipNumbers {
	public static void main(String[] args) {
		
		//print numbers from 1 to 20, and skip numbers that are the range from 5 to 10;
		
		for (int i = 1; i <= 20; i++) {
			
			if(i >= 5 && i <= 10) {
				continue; // skip or ignore the numbers 5,6,7,8,9,10
				
			}System.out.print(i+" ");  //1 2 3 4 11 12 13 14 15 16 17 18 19 20 
		}
		
		
		
	}

}
