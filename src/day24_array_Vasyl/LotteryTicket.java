package day24_array_Vasyl;

import java.util.Arrays;


public class LotteryTicket {
	public static void main(String[] args) {
		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		System.out.println(Arrays.toString(lotteryNumbers)); //[12, 45, 3, 62, 42, 90]
		
//		for(int ln : lotteryNumbers) {
//			System.out.print(ln+", "); //12, 45, 3, 62, 42, 90, 
//		}
		
		System.out.println();
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers)); //[3, 12, 42, 45, 62, 90]
		
//		binary search works only with sorted array
		int index = Arrays.binarySearch(lotteryNumbers, 90);
		System.out.println("If there is, Position of 90: " + index); //5
		
//		if value doesnt exist 
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);
		System.out.print("Position: " + index2); //-2 ; negative since 5 is not exist!
		if(index2 < 0) {
			System.out.println("; This means, unfortunately, the number is not withind the "+Arrays.toString(lotteryNumbers));
		}
	}

}
