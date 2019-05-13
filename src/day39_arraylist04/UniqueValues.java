package day39_arraylist04;

import java.util.*;

public class UniqueValues {
	public static void main(String[] args) {
//		get unique values from arraylist

		List<Integer> nums = new ArrayList<Integer>();
//		List<int[]> nums = new ArrayList<>(); is also possible

		nums.add(10);
		nums.add(10);
		nums.add(7);
		nums.add(8);
		nums.add(8);
		nums.add(3);
		nums.add(4);
		nums.add(8);

		System.out.println("nums: " + nums); // [10, 10, 7, 8, 8, 3, 4, 8]

		System.out.println();

//		"find Non-Dublicate unique values. if there 2 AA >> A
		System.out.println("1st method: find Non-Dublicate unique values");

		List<Integer> unique1 = new ArrayList<Integer>();

		for (Integer num : nums) {
//			assign num to unique1 if it is not there
			if (!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println("unique1: " + unique1.toString()); // [10, 7, 8, 3, 4]

		System.out.println();

		System.out.println("find unique (appearing once) values:");
//		find unique (appearing once) values:

		List<Integer> unique2 = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			for (int j = 0; j < nums.size(); j++) {
				if (nums.get(i) == nums.get(j)) {
					count++;
				}

			}
			if (count == 1) {
				unique2.add(nums.get(i));
			}

		}
		System.out.println(unique2);

	}

}
