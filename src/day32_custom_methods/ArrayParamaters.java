package day32_custom_methods;

import java.util.Arrays;

public class ArrayParamaters {
	public static void main(String[] args) {
		
		int[] myArray = {44, 22, 66, 11};  //int[] nums = myArray
		printArray(myArray);  //myArray is same with nums >> printArray(int[]nums)
		
		printArray(new int[] {3, 4, 9, 98});
		
		int[] myNums = {2,3,11,234,0};
		printArray(myNums);        // in this case nums = myNums
		
		System.out.println();
		
		int[] nums1 = {44, 22, 66, 11};
		int[] nums2 = {2,3,11,234,0, 4, 9, 98};
		print2Arrays(nums1, nums2);
		System.out.println();
		
		print2ArraysV2(nums1, nums2);
	}
	
	/* 
	 * Method: printArray
	 * returnType: void
	 * param: int[] nums
	 * print values of the nums array
	 */
	
	
	public static void printArray(int[]nums) {
		for(int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	/*
	 * Method name: print2Arrays
	 * return: void
	 * paramaters: 2 int[]
	 * it prints the larger array followed by smaller array
	 */
	public static void print2Arrays(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			System.out.println("nums1: " + Arrays.toString(nums1));
			System.out.println("nums2: " + Arrays.toString(nums2));
			System.out.println("nums1 is larger than nums2");
			
		}else if(nums1.length == nums2.length){
			System.out.println("nums1 and nums2 are equal");
		}else {
			
			System.out.println("nums1: " + Arrays.toString(nums1));
			System.out.println("nums2: " + Arrays.toString(nums2));
			System.out.println("nums2 is larger than nums1");
		}
	}
	//version 2 : we will call printArray method
	public static void print2ArraysV2(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
			
			printArray(nums1);
			printArray(nums2);
		//	System.out.println("nums1 is larger than nums2");
			
		}else if(nums1.length == nums2.length){
			System.out.println("nums1 and nums2 are equal");
		}else {
			
			printArray(nums2);
			printArray(nums1);
		}
	}
	

}
