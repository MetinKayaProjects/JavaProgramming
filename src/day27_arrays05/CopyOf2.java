package day27_arrays05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyOf2 {
	public static void main(String[] args) {
		//copy all values from the array and add two more spaces
	
		
		int[] nums1 = {34, 56, 23, 1, 55};
		int[] nums2 = Arrays.copyOf(nums1, nums1.length+2);
		System.out.println(Arrays.toString(nums2)); //[34, 56, 23, 1, 55, 0, 0]
		int[] nums3 = Arrays.copyOfRange(nums1, 1, 3);
		System.out.println(Arrays.toString(nums3));  //56, 23   //index[1,3) =>> nums1[1] and nums1[2]
		
		System.out.println(Arrays.toString(nums2));  //[34, 56, 23, 1, 55, 0, 0]
		nums3 = Arrays.copyOf(nums1, nums1.length-2);  
		System.out.println(Arrays.toString(nums3));		//[34, 56, 23]
		
		int[] brandNew = {34, 23, 54, 23};
		System.out.println("brandnew before: " + Arrays.toString(brandNew));  //brandnew before: [34, 23, 54, 23]
		System.out.println("Length before: " + brandNew.length);   //Length before: 4
		
		brandNew = Arrays.copyOf(brandNew, brandNew.length+5);
		
		System.out.println("brendnew after: " + Arrays.toString(brandNew)); //brendnew after: [34, 23, 54, 23, 0, 0, 0, 0, 0]
		System.out.println("Length after: " + brandNew.length);  //Length after: 9
		
	}
	
	
	
	
	

}
