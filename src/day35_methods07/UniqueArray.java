package day35_methods07;

import java.util.Arrays;

public class UniqueArray {
	public static void main(String[] args) {

		/*
		 * declare array nums and assign values {7,4,1,4,1,5,9,9,3} code to find unique
		 * values: nested loop if condition counter
		 */
		int[] nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };
		System.out.println(Arrays.toString(nums)); // [7, 4, 1, 4, 1, 5, 9, 9, 3]

		int[] unique = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					count++;
					break;
				}

			}
			if (count == 0) {
				unique[i] = nums[i];
			}
		}
		System.out.println(Arrays.toString(unique));
		
		int uniqueSize = 0;
		for (int j = 0; j < unique.length; j++) {
			if (unique[j] != 0) {
				uniqueSize++;

			}
		}
		System.out.println(uniqueSize);
		
		int m = 0;
		int[] uniqeUnique = new int[uniqueSize];
		for (int k = 0; k < unique.length; k++) {
			if (unique[k] != 0) {
				uniqeUnique[m] = unique[k];
				m++;
			}
		}System.out.println(Arrays.toString(uniqeUnique));
	}

}
