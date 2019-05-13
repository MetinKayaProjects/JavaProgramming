package day23_array_Vasyl;

public class DivisibleBy5 {
	public static void main(String[] args) {
		/*
loop through the numbers from 1 till 50
print each number in the same line
if number is divisible by 20, then exit the loop
if number is divisible by 5 (n%5==0), skip it

		 */
		
		
		for(int num = 1; num <= 50; num++) {
			
			if(num % 20 == 0) {   //exit the loop at 20
				break;
			}
			if(num %5 == 0) {
				continue;  //skip 5 and its multipliers; 5,10,15,20...
			}
			
			System.out.print(num + ",");  //1,2,3,4,6,7,8,9,11,12,13,14,16,17,18,19,
		}
		
		
		
		
	}

}
