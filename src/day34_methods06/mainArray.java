package day34_methods06;

import java.util.Arrays;

public class mainArray {
	public static void main(String[] args) {

		System.out.println(CountArray.getArray()); // called fromCountArray class. but this not work: [I@7852e922
		System.out.println(Arrays.toString(CountArray.getArray()));// [45, 43, 11, 545, 1000]

//		how can we store an array in another class (store return value into new array)
		int[] nums = CountArray.getArray(); // getArray array type, so nums should be also array type
		System.out.println(Arrays.toString(nums));// [45, 43, 11, 545, 1000]

	}


}
