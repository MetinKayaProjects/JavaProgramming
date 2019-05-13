package day35_methods07;

import java.util.Arrays;

public class UniqueArray_VoidMethodMurodil2 {
	static public void main(String... strings) {
		int[] nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				System.out.println(temp);
			}

		}

	}

}
