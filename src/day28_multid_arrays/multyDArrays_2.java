package day28_multid_arrays;

import java.util.Arrays;

public class multyDArrays_2 {
	public static void main(String[] args) {

//					populations
//	states 	row0 > 100, 500, 1234, 5434
//		    row1 > 54544, 23432, 2432, 3211
//		    row2 > 432, 43, 345, 543
		
		
		int[][] nums = new int[3][4];  
		
		nums[0][0] = 1001;
		nums[0][1] = 5002;
		nums[0][2] = 1234;
		nums[0][3] = 5434;
		
		nums[1][0] = 54544;
		nums[1][1] = 23432;
		nums[1][2] = 2432;
		nums[1][3] = 32211;
		
		nums[2][0] = 4321;
		nums[2][1] = 4311;
		nums[2][2] = 3452;
		nums[2][3] = 5431;
		
		System.out.println("Length of the nums (rows): " + nums.length); //Length of the nums: 3
		
		System.out.println("We have " + nums.length + " arrays: " + Arrays.deepToString(nums));
//		[[1001, 5002, 1234, 5434], [54544, 23432, 2432, 32211], [4321, 4311, 3452, 5431]]
		
		System.out.println("Nums 0: " + Arrays.toString(nums[0]));
		
		System.out.println(nums[0][0]);//1001
		System.out.println(nums[0][1]);//5002
		System.out.println(nums[0][2]);//1234
		System.out.println(nums[0][3]);//5434
		
		
		System.out.println("****************");
		int[][] scores = {{3, 5, 10}, {6, 4, 2, 11}};  //2 arrays
		System.out.println("Days played/Number of arrays: " + scores.length);
		//Days played/Number of arrays: 2
		
//		int[][] scores = {
//						  {3, 5, 10}, 
//						  {6, 4, 2, 11}
//						  };
		
		System.out.println("Number of values in 1: " +scores[0].length);  //Number of values in 1: 3
		System.out.println("Number of values in 1: " +scores[1].length);  //Number of values in 1: 4
		
		System.out.println("**** *** *** *** *** *** **** ***");
		int[][] values = new int[4][]; // you can skip the second one (the length of the values)
		
		values[0] = new int[]{34, 32, 43};
		values[1] = new int[]{32, 23, 45, 67, 889, 1, 2, 678};
		
		values[2] = new int[2];   //{55,88}
			values[2][0] = 55;
			values[2][1] = 88;
		
		values[3] = new int[] {5, 3, 23, 34, 56};
		
		//or the same declaration in the below:
//		int [][] values = {{34, 32, 43}, 
//							   {32, 23, 45, 67, 889, 1, 2, 678},
//							   {55,88},
//							   {5, 3, 23, 34, 56}};
		
		System.out.println("the length of the values (number of rows): " + values.length );
//		the length of the values (number of rows): 4

		System.out.println("the length of the first array (first rows): " + values[0].length );
//		the length of the first values (first rows): 3
		System.out.println("the length of the second array (second rows): " + values[1].length );
//		the length of the second values (second rows): 8
		System.out.println("the length of the third array (third rows): " + values[2].length );
//		the length of the third array (third rows): 2
		System.out.println("the length of the fourth array (fourth rows): " + values[3].length );
//		the length of the fourth array (fourth rows): 5
		
		System.out.println(Arrays.deepToString(values));
//		[[34, 32, 43], [32, 23, 45, 67, 889, 1, 2, 678], [55, 88], [5, 3, 23, 34, 56]]
		
		
		
	}

}
