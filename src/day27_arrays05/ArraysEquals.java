package day27_arrays05;

import java.util.Arrays;

public class ArraysEquals {
	public static void main(String[] args) {
		
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};
		
		Arrays.equals(nums1, nums2);
		System.out.println(Arrays.equals(nums1, nums2)); // true
		
		if (Arrays.equals(nums1, nums2)) {
			System.out.println("They are same");
		}else {
			System.out.println("Tehere are mismatched numbers in the arrays");
		}
		
		String[] strArr1 = {"one","two","three"};
		String[] strArr2 = {"one","two","three"};
 		
		System.out.println(Arrays.equals(strArr1, strArr2)); //true
		
		boolean match = Arrays.equals(strArr1, strArr2);
		System.out.println("are those match: " + match); //Match ?: true
		
		
	}

}
