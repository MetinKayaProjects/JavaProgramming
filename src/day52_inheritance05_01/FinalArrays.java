package day52_inheritance05_01;

import java.util.ArrayList;
import java.util.Arrays;

import javax.lang.model.type.DeclaredType;

public class FinalArrays {
	public static void main(String[] args) {

		final int[] TEAMS = { 11, 11 };
		System.out.println("Team1: " + TEAMS[0]);
		System.out.println("Team2: " + TEAMS[1]);

		TEAMS[0] = 10;
		TEAMS[1] = 9;

		System.out.println("Team1: " + TEAMS[0]);
		System.out.println("Team2: " + TEAMS[1]);

//	TEAMS = new int[3];  doesnt compile
//	TEAMS = new int[] {11,4,7};  doent compile

		// value can change but arrays can not be chamged if it is final arrays as like
		// <final int[] finalNums = new int[] {33,4,455,66};>

		int[] nums = new int[] { 33, 4, 455, 66 };
		System.out.println(Arrays.toString(nums));

		nums = new int[] { 3, 4, 3, 66 };
		System.out.println(Arrays.toString(nums));

		final int[] finalNums = new int[] { 33, 4, 455, 66 };
		System.out.println(Arrays.toString(finalNums));

		finalNums[0] = 4; // you can change in values, but not the arrays, since we made arrays final.
		System.out.println(Arrays.toString(finalNums));

//	finalNums = new int[] {99,44,54};  doesn't work. since this is final

		final double[] PRICES = new double[3];  // declared final
		PRICES[0] = 85.5;  //value can be changed
		PRICES[1] = 3.5;
		PRICES[2] = 45.3;
		System.out.println(Arrays.toString(PRICES));
		PRICES[1] = 555.7;
		System.out.println(Arrays.toString(PRICES));

//	    PRICES = new double[3];  doesnt work since we cannot create new PRICES, since it was declared as of final<final double[] PRICES = new double[3];>

	
		
		
	}

}
