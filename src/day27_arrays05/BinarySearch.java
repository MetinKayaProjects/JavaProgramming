package day27_arrays05;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		
		int[] nums = {4, 6, 7, 10, 55};
		System.out.println(Arrays.binarySearch(nums, 7));//2
		System.out.println(Arrays.binarySearch(nums, 55));//4
		System.out.println(Arrays.binarySearch(nums, 5)); //-2 if it is, it should be after 4
//															index is 1. To find this add 1. - means it is not there
		
		int i=Arrays.binarySearch(nums, 55);
		System.out.println(i);     //4
		
		int[] nums2 = {40, 6, 17, 10, 55};
		Arrays.sort(nums2);//6, 10, 17, 40, 55
		System.out.println(Arrays.binarySearch(nums2, 40));//3
		//Arrays.binarySearch(a, fromIndex, toIndex, key)
		//Arrays.sort(a, fromIndex, toIndex, c); //comparator
	
		System.out.println();
		
//		Print by forEach Loop
		for(int n : nums2) {
			System.out.print(n + " ");  //6 10 17 40 55 
		}
		
		System.out.println();
		
//		Print by for loop:
		for (int j = 0; j < nums2.length; j++) {
			System.out.print(nums2[j] + " ");   //6 10 17 40 55
		}
		
		
		System.out.println();
		
		
//		Print by Array.toString:  
		System.out.println(Arrays.toString(nums2)); //[6, 10, 17, 40, 55]
	}

}
